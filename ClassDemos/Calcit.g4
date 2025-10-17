/**
 * Define a grammar called Calcit
 * This version will also support semantic analysis (directly in ANTLR)
 *  This version also generates Java code to execute the program
 *  Ultimately, we want to modify so it generates ASSEMBLY-LEVEL code directly.
 *  But this approach is a little simpler.
 **/
grammar Calcit;

// -------- Parser Members: global state for simple semantic checks --------
@header { import java.util.*; import java.io.*; }

@members {
  /** Symbol type */
  class Symbol {
    String id;
    boolean hasBeenUsed;  // Has the id been used yet

    Symbol(String id, boolean hasBeenUsed) { this.id = id; this.hasBeenUsed = hasBeenUsed; }
    Symbol(String id) { this.id = id; this.hasBeenUsed = false; }
  }

  /** Symbol table */
  class SymbolTable {
    Map<String, Symbol> table = new HashMap<>();
  }
  SymbolTable mainTable = new SymbolTable();

  /** Collected diagnostics we’ll print at the end. */
  List<String> diagnostics = new ArrayList<>();

  /** If we’re currently parsing an assignment, the LHS name lives here. */
  String pendingLHS = null;

  /** Was the LHS already assigned before this assignment? */
  boolean lhsExistedBefore = false;

  /** Helper to record an error with source coordinates. */
  void error(Token t, String msg) {
    diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
  }

  int printDiagnostics() {
      int numErrors = 0;  // No errors detected
      // After parsing the whole file: report unused variables and print errors.
      mainTable.table.forEach((id, symbol) -> { if (!symbol.hasBeenUsed) { System.out.println("warning: variable '" + symbol.id +"' assigned but never used");}});

      // for (String v : assigned) {
      //   if (!used.contains(v)) {
      //     System.err.println("warning: variable '" + v + "' assigned but never used");
      //   }
      // }
      for (String d : diagnostics) {
        numErrors++;
        System.err.println("error: " + d);
      }

      return numErrors;
  }

  /** Code generation material */
  StringBuilder sb = new StringBuilder(); // Stores the generated program!

  void emit(String s) { sb.append(s); }   // Short-hand for adding to the program

  // Emit the preamble material for our program
  void openProgram() {
    emit("import java.util.*;\n");
    emit("public class CalcitProgram {\n");
    emit("  public static void main(String[] args) throws Exception {\n");
    emit("    Scanner in = new Scanner(System.in);\n");
  }

  // Emit the postamble material for our program
  void closeProgram() {
    emit("  }\n");
    emit("}\n");
  }

  // Declare LHS if first-time assignment; otherwise plain assignment.
  void generateAssign(boolean declare, String name, String rhsJavaCode) {
    emit("    " + (declare ? "double " : " ") + name + " = " + rhsJavaCode + ";\n");
  }

  // Write the generated Java to file.
  void writeFile() {
    try (PrintWriter pw = new PrintWriter("CalcitProgram.java", "UTF-8")) {
      pw.print(sb.toString());
    } catch (Exception e) {
      System.err.println("error: failed to write CalcitProgram.java: " + e.getMessage());
    }
  }
}

// ------- The Grammar! -----------
program
  : { openProgram(); }         // preamble
    statement* EOF
    {
      int numErrors = printDiagnostics();
      if (numErrors == 0) {
        // Successful, so write out the generated code
        closeProgram();
        writeFile();
      } else {
        System.err.println(numErrors + " errors detected. Code not generated.");
        System.exit(1);  // Error code
      }
    }
  ;

statement 
  : assignStatement 
  | printStatement 
  ;

assignStatement 
  : IDENT 
    {
      // We're entering an assignment: record LHS and whether it existed before.
      pendingLHS = $IDENT.getText();
      lhsExistedBefore = mainTable.table.containsKey(pendingLHS);
    }
    '=' rhs
    {
      // Successful RHS parse: consider variable now assigned.
      if (lhsExistedBefore) {
        // Just a new assignment to an existing variable
        generateAssign(false, pendingLHS, $rhs.code);
      } else {
        // A new variable is being "declared"
        Symbol newId = new Symbol(pendingLHS);
        mainTable.table.put(newId.id, newId);
        generateAssign(true, newId.id, $rhs.code);
      }

      // Clear LHS context.
      pendingLHS = null;
    }
  ;
    
rhs returns [String code]
  : expr { $code = $expr.code; }
  | KW_READINT { $code = "in.nextInt()"; }
  ;

printStatement 
  : KW_PRINT '(' expr ')' 
    {
      emit("    System.out.println(" + $expr.code  + ");\n");
    }
;

expr returns [boolean hasKnownValue, float value, String code]
  : a=term
    {
      $hasKnownValue = $a.hasKnownValue;
      $value = $a.value;
      $code = $a.code;
    }
    (op=('+'|'-') b=term
    {
      if ($hasKnownValue && $b.hasKnownValue) {
        if ($op.getText().equals("+")) {
          $value = $value + $b.value;
        } else {
          $value = $value - $b.value;
        }
        $code = ""+$value;  // Just use the value as the "code"
      } else {
        $hasKnownValue = false;
        $code = "(" + $code + $op.getText() + $b.code + ")";  // (...) used for preserving precedence rules
      }
    }
    )*
  ;

term returns [boolean hasKnownValue, float value, String code]
  : a=factor 
    {
      $hasKnownValue = $a.hasKnownValue;
      $value = $a.value;
      $code = $a.code;
    }
  (op=('*'|'/') b=factor
    {
        // First check for division by zero when b has value 0 (and /).
        if ($b.hasKnownValue && $op.getText().equals("/") && $b.value == 0) {
          error($op, "explicit division by zero detected");
          $hasKnownValue = false;  // Error anyway so stopping there
          $code = "Error";
        } else if ($hasKnownValue && $b.hasKnownValue) {
          if ($op.getText().equals("*")) {
            $value = $value * $b.value;
          } else {
            $value = $value / $b.value;
          }
          $code = ""+$value;  // Just use the value as the "code"
        } else {
          $hasKnownValue = false;
          $code = "(" + $code + $op.getText() + $b.code + ")";  // (...) used for preserving precedence rules
        }
      }
    )*
  ;

factor returns [boolean hasKnownValue, float value, String code]
  : INT 
      { $hasKnownValue = true; $value = Integer.parseInt($INT.getText()); $code = ""+$value; }
  | IDENT 
      {
        // Look up the identifier and check that it has been assigned before (essentially, declared!)
        String id = $IDENT.getText();
        Symbol currentSymbol = mainTable.table.get(id);
        if (currentSymbol == null) {
          // Variable used before declaration error
          if (pendingLHS != null && !lhsExistedBefore && id.equals(pendingLHS)) {
            error($IDENT, "self-reference on first assignment of '" + pendingLHS + "'");
          } else {
            error($IDENT, "use of variable '" + id + "' before assignment");
          }
        } else {
          currentSymbol.hasBeenUsed = true;  // This symbol can now be marked as used.
        }
        $hasKnownValue = false;
        $code = id;
      }
  | '(' expr ')' 
      { 
        if ($expr.hasKnownValue) {
          $hasKnownValue = true;
          $value = $expr.value;
          $code = "" + $value;
        } else {
          $hasKnownValue = false;
          $code = "(" + $expr.code + ")";
        }
      }
  ;

// ------- The Lexer! -----------
// Lexer move to the end

// Keywords
KW_READINT : 'readInteger';
KW_PRINT : 'print';

// Other tokens
INT : ('0'|[1-9][0-9]*);     // integers - can't have negative numbers and can't start with 0 (except 0 itself)
IDENT : [A-Za-z_][A-Za-z0-9_]*;  // Alphanumeric (and underscore) but can't start with digit
COMMENT_LINE : '#'~[\n\r]* -> skip; // skip comments
WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
