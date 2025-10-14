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

    Scanner scan = new Scanner(System.in);
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

stmt : blockStmt | assignStmt | printStmt | compareStmt | functStmt | loopStmt | comment; 

blockStmt : '{'
    {
        //create new scope

        //
    } 
(stmt)* '}'
    {
        //end new scope
    }
    ;

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

        //if new var
        if(!preexistingLHS){ 
            //double check data type given AND matches
            if($dt.type == null){
                error($DNT, "data type is '" + $dt.type + "'");
            }

            //set type
            newId.type = $dt.type; 
        }

        if(preexistingLHS){
            // System.out.println("DEBUG: current type is " + $expr.type);
            // System.out.println("The current DNT's type is " + mainTable.table.get(currLHS).type);

            //type check 
            if(!($expr.type.equals(mainTable.table.get(currLHS).type))){
                error($DNT, "type mismatch for " + currLHS + "'");
            }
        } else {
                //System.out.println($dt.type + " and " + $expr.type);
            if(!($expr.type.equals($dt.type))){
                System.out.println("DEBUG issue with type match for " + currLHS + " where " + $dt.type + " not " + $expr.type);
                error($DNT, "type mismatch for " + currLHS );
            } 
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
        //new ID


        //input
        try{
            int input = scan.nextInt();
            if (scan.hasNextLine()) { //if scan.nextInt causes issues
                scan.nextLine();  
            }  
            
             

        } catch(InputMismatchException e){

        }
        

        // Successful RHS parse: consider variable now assigned.
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;
        newId.value = input;
        newId.type = "nt";
        newId.hasKnown = true;
        newId.hasBeenUsed = false;
        mainTable.table.put(newId.id, newId);

        //System.out.println(newId.id + " is " + newId.type + " with value " + newId.value);
        // Clear LHS context.
        currLHS = null;
    }
    | KW_SCN_STRNG 
    {
        //input
        String input = scan.nextLine();

        // Successful RHS parse: consider variable now assigned.
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;
        newId.content = "\"" + input + "\""; //put in string format
        newId.type = "strng";
        newId.hasKnown = true;
        newId.hasBeenUsed = false;
        mainTable.table.put(newId.id, newId);

        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
        // Clear LHS context.
        currLHS = null;
    }
    | KW_SCN_FLT 
    {
        //input
        float input = scan.nextFloat();

        // Successful RHS parse: consider variable now assigned.
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;
        newId.value = input;
        newId.type = "flt";
        newId.hasKnown = true;
        newId.hasBeenUsed = false;
        mainTable.table.put(newId.id, newId);

        //System.out.println(newId.id + " is " + newId.type + " with value " + newId.value);
        // Clear LHS context.
        currLHS = null;
    }
    | KW_SCN_CHR 
    {
        //input 
        String input = scan.next();
        input = String.valueOf(input.charAt(0));
        //System.out.println("input " + input);

        // Successful RHS parse: consider variable now assigned.
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;
        newId.content = "\'" + input + "\'"; //put in string format
        newId.type = "chr";
        newId.hasKnown = true;
        newId.hasBeenUsed = false;
        mainTable.table.put(newId.id, newId);

        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
        // Clear LHS context.
        currLHS = null;
    }
    | KW_SCN_BL
    ) SCOLN; 

printStmt : KW_PRNT '(' print=expr 
            { 
            if(($print.type.equals("strng") || $print.type.equals("chr")) && $print.content != null){
                String printStr = $print.content;
                //printStr = printStr.substring(1);
                printStr = printStr.substring(1, printStr.length() - 1);
               System.out.print(printStr);
            } else {

                //System.out.println("DEBUG: the type is " + $print.type);

                if($print.type.equals("flt")){ //if float, just give value (already in float form)
                    System.out.print($print.value);
                } else {  //if bool or 
                    int printval = (int)(Math.abs($print.value));
                    System.out.print(printval);
                }
                
            }

            }
            (more=varC
            { 
            if(($more.type.equals("strng") || $more.type.equals("chr")) && $more.content != null){
                String printStr = $more.content;
                //System.out.println("precut " + printStr);
                //printStr = printStr.substring(1);
                printStr = printStr.substring(1, printStr.length() - 1);
               System.out.print(printStr);
            } else {

                //System.out.println("DEBUG: the type is " + $more.type);

                if($more.type.equals("flt")){ //if float, just give value (already in float form)
                    System.out.print($more.value);
                } else {  //if bool or 
                    int printval = (int)(Math.abs($more.value));
                    System.out.print(printval);
                }
                
            }

            }
            )* 
            {
                System.out.print("\n");
            }
            ')' SCOLN
            
            ; 

varC returns [boolean hasKnownValue, String type, float value, String content]: 
            CMM expr 
            {
                if ($expr.hasKnownValue) {
                    $hasKnownValue = true;
                    $value = $expr.value;
                    $content = $expr.content;
                    $type = $expr.type;
                } else {
                    $hasKnownValue = false;
                } 
            }
            ; 

compareStmt : KW_F '(' comparison ')' blockStmt elseC? ; 

functStmt : KW_FNCTN dataType DNT '(' argC ')' '{' stmt* KW_RTN factor SCOLN '}' ; 

loopStmt : while | for | doWhile; 

while : KW_WHL '(' comparison ')' '{' stmt* '}' ;  

for : KW_FR '(' assignStmt comparison SCOLN forLoopInc ')' '{' stmt* '}' ; 

doWhile : KW_D '{' stmt* '}' KW_WHL '(' comparison ')' ; 

comment :  CMMNT_LN | CMMNT_BLCK ; 

elseC : (KW_LS blockStmt) | KW_LS blockStmt elseC; 

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
                    $type = $b.type;
                } else {
                    $hasKnownValue = false;
                } 
            }
        ; 

comparison returns [boolean hasKnownValue, float value] : 
    a=comparisonExpr
    {
        //check if comparison gives a bool (thus comparing values)
        if(!($a.type.equals("bl"))){
            error($a.type, "this sequence does not produce a boolean '" );
        } else {
            $hasKnownValue = true;
            $value = $a.value;
        }
    }
    ;

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
        
        //set to bool type
        $type = "bl";

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

            //check if a or b are floats, change to float
            if ($a.type.equals("flt") || $b.type.equals("flt")) {
                $type = "flt";
            } else {
                $type = "nt";
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


            //check if a or b are floats, change to float
            if ($a.type.equals("flt") || $b.type.equals("flt")) {
                $type = "flt";
            } else {
                $type = "nt";
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

            //type check
            try {
                $value = Integer.parseInt($NT.getText()); 
            } catch (Exception e) {
                error($NT, "the following value is not an int '" + $NT.getText() + "'");
            }

            
            $type = "nt";
        }
    | FLT 
        {   $hasKnownValue = true; 
            $value = Float.parseFloat($FLT.getText()); 
            $type = "flt";
        }
    | BL 
        { 
            // $hasKnownValue = true; 
            // $type = "bl";
            // if(BL.getText().equals("true")){
            //     $value = 1; //set true
            // } else if(BL.getText().equals("false")){
            //     $value = 0; //set false
            // } else {
            //     $value = Integer.parseInt($BL.getText());  //autosets to 0 or 1
            // }
        }
    | CHR
        {   $hasKnownValue = true; 
            $content = $CHR.getText();
            $type = "chr";
        }
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
                //System.out.println("DEBUG: Here type assigned to DNT " + currentId.type); //checking variable assign
                currentId.hasBeenUsed = true;
                $hasKnownValue = currentId.hasKnown;
                $value = currentId.value;
                $type = currentId.type;
                $content = currentId.content;
            }
        }
    | array 
    | DNT '[' factor ']'
    | '(' expr ')'
        { 
            if ($expr.hasKnownValue) {
                $hasKnownValue = true;
                $value = $expr.value;
                $type = $expr.type;
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