// Define a grammar called !Vwls
grammar NoVwls;


//~~~~~~~~~~~~~~~~~~~ Helper Functions ~~~~~~~~~~~~~~~~~~
@header { import java.util.*; }

@members {
    //  Data Strucutes
    // Identifier type 
    class Identifier {
        String id;
        float value;  // The value 
        String content; //if string, the value
        String type;  //type
        boolean hasKnown; // Is  value known or not
        boolean hasBeenUsed;  // Has id been used 
    }

    //Symbol Table
    class SymbolTable {
        Map<String, Identifier> table = new HashMap<>();
    }
    SymbolTable mainTable = new SymbolTable();

    //Variables Assigned Once
    Set<String> assigned = new HashSet<>();

    //Variables in an Expression/Print
    Set<String> used = new HashSet<>();

    //Diagnostics/errors
    List<String> diagnostics = new ArrayList<>();

    //error record
    void error(Token t, String msg) {
        diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
    }

    //print diagnostics
    void printDiagnostics() {
    // After parsing the whole file: report unused variables and print errors.
    for (String v : assigned) {
        if (!used.contains(v)) {
            System.err.println("warning: variable '" + v + "' assigned but never used");
        }
     }
    for (String d : diagnostics) {
        System.err.println("error: " + d);
    }
  }

    //   Variables
    //parsing LHS for assignment
    String currLHS = null;

    //was LHS assinged before
    boolean preexistingLHS = false;
}

//~~~~~~~~~~~~~~~~~~~ Lexer ~~~~~~~~~~~~~~~~~~
// Keywords
KW_PRNT : 'prnt';
KW_SCN_NTGR : 'scnNT';
KW_SCN_FLT : 'scnFLT';
KW_SCN_STRNG : 'scnSTRNG';
KW_SCN_CHR : 'scnCHR';
KW_SCN_BL : 'scnBL';
KW_FNCTN : 'Fnctn';
KW_F : 'f';
KW_LS : 'ls' ;
KW_FR : 'fr';
KW_WHL : 'whl';
KW_D : 'd';
KW_RTN : 'rtn' ;
KW_BRK : 'brk' ;

// Data Types
NT : ('0'|('-'?)[1-9][0-9]*) ;  //int
KW_NT : 'nt';
FLT : ('-'?) ( ('0' | '0.0') |  ('0' '.' [0-9]* [1-9] | [1-9][0-9]* ('.'?) [0-9]* ))  ;     //float
KW_FLT : 'flt';
BL : ('0'|'1'|'false'|'true') ;     //bool
KW_BL : 'bl';
CHR : ('\'')([a-zA-Z0-9])('\'') ;
KW_CHR : 'chr' ;
STRNG : ('"') (~('"'|'\\'))* ('"') ;
KW_STRNG : 'strng' ;
KW_VD : 'vd' ;
KW_RRY : 'rry';

// Symbols
L_PRNTH : '(' ;
R_PRNTH : ')' ;
L_CRLYB : '{' ;
R_CRLYB : '}' ;
SSGN : '=' ;
PLS : '+' ;
MNS : '-' ;
DVD : '/' ; 
TMS : '*' ;
MOD : '%' ;
LSSTHN : '<' ;
GRTRTHN : '>' ;
LSSTHNREQL : '=<' ;
GRTRTHNREQL : '=>' ;
EQL : '==' ;
NTEQL : '!=' ;
SCOLN : ';';
CMM : ',' ;

//Other Tokens
WS : [ \t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
CMMNT_LN : '//'~[\n\r]* -> skip ;  // skips comment line
CMMNT_BLCK : '/*' .*? '*/' -> skip ; //skips comment block
DNT : [a-zA-Z][a-zA-Z0-9_]* ;    // match lower-case identifiers


//~~~~~~~~~~~~~~~~~~~ EBNF Grammar ~~~~~~~~~~~~~~~~~~
program : (stmt)* EOF
        { printDiagnostics();}
        ; 

stmt : assignStmt | printStmt | compareStmt | functStmt | loopStmt | comment; 

assignStmt : (dt=dataType)? 
    DNT 
    {
        currLHS = $DNT.getText();
        preexistingLHS = mainTable.table.containsKey(currLHS);

    }
    SSGN ( expr 
    {
        // var assigned
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;

        //type check
        if(!preexistingLHS){ //if new identity, double check data type given AND matches
            // if(dt == null){
            //     //error
            // }
            
        }
        newId.value = $expr.value;
        newId.content = $expr.content;
        newId.hasKnown = $expr.hasKnownValue;
        newId.hasBeenUsed = false;
        mainTable.table.put(newId.id, newId);

        // Clear LHS 
        currLHS = null;
        }
    | KW_SCN_NTGR 
    {
        // // Successful RHS parse: consider variable now assigned.
        // assigned.add(currLHS);
        // Identifier newId = new Identifier();
        // newId.id = currLHS;
        // newId.value = 0;
        // newId.hasKnown = false;
        // newId.hasBeenUsed = false;
        // mainTable.table.put(newId.id, newId);
        // // Clear LHS context.
        // currLHS = null;
    }
    | KW_SCN_STRNG 
    | KW_SCN_FLT 
    | KW_SCN_CHR 
    | KW_SCN_BL
    ) SCOLN; 

printStmt : KW_PRNT '(' print=expr varC* ')' SCOLN
            { 
            if($print.content != null){
                String printStr = $print.content;
                //printStr = printStr.substring(1);
                printStr = printStr.substring(1, printStr.length() - 1);
               System.out.println(printStr);
            } else {
                System.out.println($print.value);
            }

            }
            ; 

varC : CMM factor ; 

compareStmt : KW_F '(' comparison ')' '{' stmt R_CRLYB elseC? ; 

functStmt : KW_FNCTN dataType DNT '(' argC ')' '{' stmt* KW_RTN factor SCOLN '}' ; 

loopStmt : while | for | doWhile; 

while : KW_WHL '(' comparison ')' '{' stmt* '}' ;  

for : KW_FR '(' assignStmt comparison SCOLN forLoopInc ')' '{' stmt* '}' ; 

doWhile : KW_D '{' stmt* '}' KW_WHL '(' comparison ')' ; 

comment :  CMMNT_LN | CMMNT_BLCK ; 

elseC : (KW_LS '{' stmt '}') | KW_LS '{' stmt '}'elseC; 

argC : dataType DNT | (factor DNT argC) | argC CMM argC ; 

forLoopInc : DNT SSGN additiveExpr | DNT'++' | DNT'--' ;

expr returns [boolean hasKnownValue, String type, float value, String content]: 
        a=factor 
            {
                if ($a.hasKnownValue) {
                    $hasKnownValue = true;
                    $value = $a.value;
                    $content = $a.content;
                    $type = $a.type;
                } else {
                    $hasKnownValue = false;
                } 
            }
        | b=comparisonExpr
            {
                if ($b.hasKnownValue) {
                    $hasKnownValue = true;
                    $value = $b.value;
                } else {
                    $hasKnownValue = false;
                } 
            }
        ; 

comparison : additiveExpr comparer additiveExpr;

comparisonExpr returns [boolean hasKnownValue, String type, float value] : 
    a=additiveExpr   
    {  
        if ($a.hasKnownValue) {  
            $hasKnownValue = true; 
            $value = $a.value; 
            $type = $a.type;
        } else $hasKnownValue = false;  
    }  

    (op = (LSSTHN | GRTRTHN | LSSTHNREQL | GRTRTHNREQL | EQL | NTEQL) 
    { 
        String opType = $op.getText(); 
    } 

    b=additiveExpr  
    {  
        if ($b.hasKnownValue) {  
            $hasKnownValue = true;  
        } else $hasKnownValue = false;  

        if (opType.equals(">") && $a.value > $b.value) {  
            $value = 1;  
        } else if (opType.equals("<") && $a.value < $b.value) {  
            $value = 1;  
        } else if (opType.equals("==") && $a.value == $b.value) {  
            $value = 1;  
        } else if (opType.equals("<=") && $a.value <= $b.value) {  
            $value = 1;  
        } else if (opType.equals(">=") && $a.value >= $b.value) {  
            $value = 1;  
        } else if (opType.equals("!=") && $a.value != $b.value) {  
            $value = 1;  
        } else $value = 0;  

    }  
    )* 
    ;

additiveExpr returns [boolean hasKnownValue, String type, float value] : 
    a=multiplicativeExpr 
    {
        if ($a.hasKnownValue) {
            $hasKnownValue = true;
            $value = $a.value;
            $type = $a.type;
        } else $hasKnownValue = false;
    }
    (op=(PLS | MNS) b=multiplicativeExpr
    {
        if ($hasKnownValue && $b.hasKnownValue) {
            if ($op.getText().equals("+")) {
                $value = $value + $b.value;
            } else {
                $value = $value - $b.value;
            }
        } else {
            $hasKnownValue = false;
        }

        
    }
    )* 
    ;

multiplicativeExpr returns [boolean hasKnownValue, String type, float value]: 
    a=unaryExpr 
    {
        if ($a.hasKnownValue) {
            $hasKnownValue = true;
            $value = $a.value;
            $type = $a.type;
        } else $hasKnownValue = false;
    }
    ( op=( TMS | DVD | MOD) b=unaryExpr 
    {
        // Test if divide by 0
        if ($b.hasKnownValue && $op.getText().equals("/") && $b.value == 0) {
            error($op, "division by zero");
            $hasKnownValue = false;  
        } else if ($hasKnownValue && $b.hasKnownValue) {
            if ($op.getText().equals("*")) {
                $value = $value * $b.value;
            } else if ($op.getText().equals("%")){
                $value = $value % $b.value;
            } else {
                $value = $value / $b.value;
            }
        } else {
            $hasKnownValue = false;
        }
    }
    )* 
    ; 

unaryExpr returns [boolean hasKnownValue, String type, float value]: 
    ('+' | '-' | '!')? a=factor 
    {
        if ($a.hasKnownValue) {
            $hasKnownValue = true;
            $value = $a.value;
            $type = $a.type;
        } else $hasKnownValue = false;
    }
    ;

comparer : LSSTHN | GRTRTHN | LSSTHNREQL | GRTRTHNREQL | EQL | NTEQL; 

factor returns [boolean hasKnownValue, String type, float value, String content]: 
      NT 
        {   $hasKnownValue = true; 
            $value = Integer.parseInt($NT.getText()); 
            $type = "nt";
        }
    | FLT 
        {   $hasKnownValue = true; 
            $value = Float.parseFloat($FLT.getText()); 
            $type = "flt";
        }
    | BL 
        // { $hasKnownValue = true; 
        //   if(BL.getText().equals("true")){
        //     $value = 1; //set true
        //   } else if(BL.getText().equals("false")){
        //     $value = 0; //set false
        //   } else {
        //     $value = Integer.parseInt($BL.getText());  //autosets to 0 or 1
        //   }
        // }
    | STRNG 
        {   $hasKnownValue = true; 
            $content = $STRNG.getText();
            $type = "strng";
        }
    | DNT
        {
            String id = $DNT.getText();
            used.add(id);

            Identifier currentId = mainTable.table.get(id);
            if (currentId == null) {
                // Variable used before declaration error
                if (currLHS != null && !preexistingLHS && id.equals(currLHS)) {
                    error($DNT, "self-reference on first assignment of '" + currLHS + "'");
                } else {
                    error($DNT, "use of variable '" + id + "' before assignment");
                }
                $hasKnownValue = false;
                $type = "null";
            } else {
                currentId.hasBeenUsed = true;
                $hasKnownValue = currentId.hasKnown;
                $value = currentId.value;
                $type = currentId.type;
            }
        }
    | array 
    | DNT '[' factor ']'
    | '(' expr ')'
        { 
            if ($expr.hasKnownValue) {
                $hasKnownValue = true;
                $value = $expr.value;
            } else $hasKnownValue = false;
        }
    ; 

dataType returns [String type]:  
    a=primitiveDT 
    {
        $type = $a.type;
    }
    | arrayDT; 

primitiveDT returns [String type]: 
    KW_NT 
    {
        $type = "nt";
    }
    | KW_STRNG 
    {
        $type = "strng";
    }
    | KW_FLT 
    {
        $type = "flt";
    }
    | KW_BL
    {
        $type = "bl";
    }
    | KW_CHR 
    {
        $type = "chr";
    }
    ;

arrayDT : primitiveDT KW_RRY '[' NT ']';

array : '{' factor (',' factor)* '}' ;