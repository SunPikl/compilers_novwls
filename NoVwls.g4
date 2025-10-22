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

        //function
        boolean isFunction = false; //if DNT is a function
        List<Identifier> parameters = new ArrayList<>();
    }

    //Symbol Table
    class SymbolTable {
        Map<String, Identifier> table = new HashMap<>();
    }
    SymbolTable mainTable = new SymbolTable();

    //Scope handler
    Stack<SymbolTable> scopeStack = new Stack<>();
    
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
program : {scopeStack.push(mainTable);}
        (stmt)* EOF
        { printDiagnostics();}
        ; 

stmt : blockStmt | assignStmt | printStmt | compareStmt | functStmt | loopStmt | breakStmt | functCall SCOLN | comment;

blockStmt : '{'
    {
        scopeStack.push(new SymbolTable());
    } 
(stmt)* '}'
    {
        scopeStack.pop();
    }
    ;

assignStmt : (dt=dataType)? DNT    
    {
        currLHS = $DNT.getText();
        //preexistingLHS = mainTable.table.containsKey(currLHS);
        preexistingLHS = scopeStack.peek().table.containsKey(currLHS);

    }
    SSGN rhs SCOLN   {
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;

        //if new var
        if(!preexistingLHS){ 
            if($dt == null){  // FIXED: Check if dt is null, not dt.type
                error($DNT, "data type not specified for '" + currLHS + "'");
                newId.type = "null";
            } else {
                newId.type = $dt.type; 
            }
        } else {
                //System.out.println($dt.type + " and " + $expr.type);
            if(!($expr.type.equals($dt.type))){
                //System.out.println("DEBUG issue with type match for " + currLHS + " where " + $dt.type + " not " + $expr.type);
                error($DNT, "type mismatch for " + currLHS );
                error = true;
            } 
        }

        if(!error){
            newId.value = $expr.value;
            newId.content = $expr.content;
            newId.hasKnown = $expr.hasKnownValue;
            newId.hasBeenUsed = false;
            //mainTable.table.put(newId.id, newId);
            scopeStack.peek().table.put(newId.id, newId);
        } else {
            // newId.value = $expr.value;
            // newId.content = $expr.content;
            newId.hasKnown = false;
            newId.hasBeenUsed = false;
            //mainTable.table.put(newId.id, newId);
            scopeStack.peek().table.put(newId.id, newId);
        }

        

        // Clear LHS 
        currLHS = null;
        }
    | KW_SCN_NTGR
        {
            try{
                int input = scan.nextInt();
                $hasKnownValue = true;
                $value = input;
                $type = "nt";
                $isArray = false;
                $is2DArray = false;
            } catch(Exception e){
                error(null, "input was not an integer");
                $hasKnownValue = false;
            }
        }
    | KW_SCN_FLT
        {
            try{
                float input = scan.nextFloat();
                $hasKnownValue = true;
                $value = input;
                $type = "flt";
                $isArray = false;
                $is2DArray = false;
            } catch(Exception e){
                error(null, "input was not a float");
                $hasKnownValue = false;
            }
        }
    | KW_SCN_STRNG
        {
            String input = scan.nextLine();
            $hasKnownValue = true;
            $content = "\"" + input + "\"";
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
        }
    | KW_SCN_CHR
        {
            String input = scan.next();
            input = String.valueOf(input.charAt(0));
            $hasKnownValue = true;
            $content = "\'" + input + "\'";
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
        };

arrayLiteral returns [boolean hasKnownValue, String type, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues]:
    L_CRLYB first=arrayElement 
    { 
        $hasKnownValue = true;
        $type = $first.elementType + "[]";
        $isArray = true;
        $is2DArray = false;
        $arrayValues = new ArrayList<>();
        $arrayValues.add($first.elementValue);
    }
    (CMM next=arrayElement 
    {
        if ($next.hasKnownValue) {
            $arrayValues.add($next.elementValue);
        }
    })* R_CRLYB
    | L_CRLYB firstRow=arrayLiteral 
    { 
        $hasKnownValue = true;
        $type = $firstRow.type;
        $isArray = false;
        $is2DArray = true;
        $array2DValues = new ArrayList<>();
        $array2DValues.add(new ArrayList<>($firstRow.arrayValues));
    }
    (CMM nextRow=arrayLiteral 
    {
        $array2DValues.add(new ArrayList<>($nextRow.arrayValues));
    })* R_CRLYB;

arrayElement returns [boolean hasKnownValue, Object elementValue, String elementType]:
    expr
    {
        $hasKnownValue = $expr.hasKnownValue;
        $elementType = $expr.type;
        if ($expr.type.equals("nt")) {
            $elementValue = (int)$expr.value;
        } else if ($expr.type.equals("flt")) {
            $elementValue = $expr.value;
        } else if ($expr.type.equals("bl")) {
            $elementValue = $expr.value == 1.0f;
        } else if ($expr.type.equals("strng") || $expr.type.equals("chr")) {
            $elementValue = $expr.content;
        } else {
            $elementValue = $expr.value;
        }
    };

printStmt : KW_PRNT '(' first=printExpr (CMM more=printExpr)* ')' SCOLN { System.out.print("\n"); } ;

printExpr : expr 
    { 
        if($expr.type == null){
            System.err.println("Error: cannot print null types");
        } else if(($expr.type.equals("strng") || $expr.type.equals("chr")) && $expr.content != null){
            String printStr = $expr.content;
            printStr = printStr.substring(1, printStr.length() - 1);
            System.out.print(printStr);
        } else if ($expr.isArray) {
            System.out.print("[");
            if ($expr.arrayValues != null) {
                for (int i = 0; i < $expr.arrayValues.size(); i++) {
                    if (i > 0) System.out.print(", ");
                    Object element = $expr.arrayValues.get(i);
                    if (element instanceof Integer) {
                        System.out.print((Integer)element);
                    } else if (element instanceof Float) {
                        System.out.print((Float)element);
                    } else if (element instanceof Boolean) {
                        System.out.print((Boolean)element ? "true" : "false");
                    } else if (element instanceof String) {
                        String str = (String)element;
                        if (str.startsWith("\"") && str.endsWith("\"")) {
                            System.out.print(str.substring(1, str.length() - 1));
                        } else if (str.startsWith("'") && str.endsWith("'")) {
                            System.out.print(str.substring(1, str.length() - 1));
                        } else {
                            System.out.print(str);
                        }
                    } else {
                        System.out.print(element);
                    }
                }
            }
            System.out.print("]");
        } else if ($expr.is2DArray) {
            System.out.print("[");
            if ($expr.array2DValues != null) {
                for (int i = 0; i < $expr.array2DValues.size(); i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print("[");
                    List<Object> row = $expr.array2DValues.get(i);
                    for (int j = 0; j < row.size(); j++) {
                        if (j > 0) System.out.print(", ");
                        Object element = row.get(j);
                        if (element instanceof Integer) {
                            System.out.print((Integer)element);
                        } else if (element instanceof Float) {
                            System.out.print((Float)element);
                        } else if (element instanceof Boolean) {
                            System.out.print((Boolean)element ? "true" : "false");
                        } else if (element instanceof String) {
                            String str = (String)element;
                            if (str.startsWith("\"") && str.endsWith("\"")) {
                                System.out.print(str.substring(1, str.length() - 1));
                            } else if (str.startsWith("'") && str.endsWith("'")) {
                                System.out.print(str.substring(1, str.length() - 1));
                            } else {
                                System.out.print(str);
                            }
                        } else {
                            System.out.print(element);
                        }
                    }
                    System.out.print("]");
                }
            }
            System.out.print("]");
        } else {
            if($expr.type.equals("flt")){
                System.out.print($expr.value);
            } else if($expr.type.equals("bl")){
                System.out.print($expr.value == 1.0f ? "true" : "false");
            } else {
                int printval = (int)(Math.abs($expr.value));
                System.out.print(printval);
            }
        }
    };

compareStmt : KW_F '(' a=comparison ')' blockStmt elseC? ; 

functStmt : KW_FNCTN d=dataType a=DNT 
    {
        //add to function table
        Identifier function = new Identifier();
        function.id = $a.getText();
        function.type = $d.type;
        function.isFunction = true;
        function.hasBeenUsed = false;
        function.hasKnown = true;
        
        //store funct
        scopeStack.peek().table.put(function.id, function);

        //System.out.println("DEBUG: DNT " + $a.getText() + " is " + scopeStack.peek().table.get($a.getText()).id);

    }
    '(' (dt=dataType b=DNT 
    {
        //store arg
        Identifier firstP = new Identifier();
        firstP.type = $dt.type;
        firstP.id = $b.getText();
        firstP.hasKnown = false;
        firstP.hasBeenUsed = false;

        //add to list
        scopeStack.peek().table.get($a.getText()).parameters.add(firstP);
    }
    (CMM dt2=dataType c=DNT
    {
        //store arg
        Identifier nextP = new Identifier();
        nextP.type = $dt2.type;
        nextP.id = $c.getText();
        nextP.hasKnown = false;
        nextP.hasBeenUsed = false;

        //add to list
        scopeStack.peek().table.get($a.getText()).parameters.add(nextP);
    }
    )*)? ')' '{'
    {
        
        //copy of funct's values for scope
        Identifier tempFunct = scopeStack.peek().table.get($a.getText());

        //add to LL, add to scope

        //start scope
        scopeStack.push(new SymbolTable());

        //add funct details to scope
        scopeStack.peek().table.put(tempFunct.id, tempFunct);

        //add items to scope
        if(function.parameters.size() > 0){
            Identifier currId;;
            for(int curr = 0; curr < function.parameters.size()-1; curr++){
                currId = function.parameters.get(curr);
                scopeStack.peek().table.put(currId.id, currId);
            }
        }
        
        
    }
 stmt* KW_RTN factor SCOLN '}'
    {
        //System.out.println("DEBUG: type of funct:" + $d.type + " type of factor:" + $factor.type);
        
        //attach funct value 
        if(!($d.type.equals($factor.type))){
            //is not returning same data type
            error($factor.start, "Type incompatability between function (" + $d.type + ") and return value (" + $factor.type +")");
        } else {
            if(($factor.type.equals("strng") || $factor.type.equals("chr"))){
                scopeStack.peek().table.get($a.getText()).content = $factor.content;
            } else {
                scopeStack.peek().table.get($a.getText()).value = $factor.value;
            }
            
        }

        //end scope
        scopeStack.pop();
        System.out.println("scope deleted");

        //clear list
        //scopeStack.peek().table.get($a.getText()).parameters = new ArrayList<>();
    } ; 

//~~~~~~~~~~~~~~~~~~~ Loop Statements ~~~~~~~~~~~~~~~~~~
loopStmt : whileLoop | forLoop | doWhileLoop | breakStmt;

// While loop
whileLoop : KW_WHL 
    L_PRNTH comparison R_PRNTH 
    blockStmt
    ;

// For loop - FIXED structure
forLoop : KW_FR 
    L_PRNTH 
        (assignStmt | SCOLN)    // initialization
        comparison SCOLN         // condition  
        (forLoopInc SCOLN)?      // increment
    R_PRNTH 
    blockStmt
    ;

// Do-While loop  
doWhileLoop : KW_D 
    blockStmt
    KW_WHL L_PRNTH comparison R_PRNTH SCOLN
    ;

// Break statement
breakStmt : KW_BRK SCOLN;


comment :  CMMNT_LN | CMMNT_BLCK ; 

elseC : (KW_LS blockStmt) | KW_LS blockStmt elseC; 

// For loop increment options
forLoopInc : 
    DNT SSGN additiveExpr     // x = x + 1
    | DNT INC                 // x++
    | DNT DCR                 // x--
    ;

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
            System.err.println("Input was not an integer.");
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
    };

factor returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues]: 
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
        { 
            $hasKnownValue = true; 
            $type = "bl";
            if($BL.getText().equals("true")){
                $value = 1; //set true
            } else if($BL.getText().equals("false")){
                $value = 0; //set false
            } else {
                $value = Integer.parseInt($BL.getText());  //autosets to 0 or 1
            }
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

            //Identifier currentId = mainTable.table.get(id);
            Identifier currentId = null;
            for(int i = 0; i < scopeStack.size();i++){
                currentId = scopeStack.get(scopeStack.size()-1-i).table.get(id);
                if(currentId != null){
                    break;
                }
            }
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
                $content = $expr.content;
                $type = $expr.type;
            } else $hasKnownValue = false;
        }
    | functCall
    {
         if ($functCall.hasKnownValue) {
            $hasKnownValue = true;
            $value = $functCall.value;
            $type = $functCall.type;
            $content = $functCall.content;
        } else $hasKnownValue = false;
    }
    ; 

functCall returns [boolean hasKnownValue, String type, float value, String content]: 
    DNT '('
    {
        //check if DNT is in function
        String id = $DNT.getText();
        used.add(id);

        Identifier currentId = null;
        for(int i = 0; i < scopeStack.size();i++){
            currentId = scopeStack.get(scopeStack.size()-1-i).table.get(id);
            if(currentId != null){
                break;
            }
        }
        
        //check if the DNT function name is unique
        if (currentId == null) {
            // function does not exist
            error($DNT, "Function '" + $DNT.getText() + "' does not exist.");
        } else {
            // function exists
            currentId.hasBeenUsed = true;
            $hasKnownValue = currentId.hasKnown;
            
        }

        //init check for amount params 
        int paramCount = 0;
    }
    (factor 
    {
        //test if params
        if((currentId !=null) && (currentId.parameters.size() > 0)){
            Identifier inputPar = scopeStack.peek().table.get(currentId.id).parameters.get(0);
            
            //check param
            if($factor.type.equals(inputPar.type)){
                //System.out.println("DEBUG: parameter success");
                
            } else {
                error($factor.start, "The input parameter input type '" + $factor.type +"' is not the same as parameter type '" + inputPar.type + "'");
            }
        } else {
            error($DNT, "There are no parameters for function '" + $DNT.getText() + "'");
        }

        paramCount ++; //inc param count
        
    }
    (CMM factor
    {
        if((currentId !=null) && (currentId.parameters.size() > paramCount)){
            Identifier inputPar = scopeStack.peek().table.get(currentId.id).parameters.get(paramCount);
            //check param
            if($factor.type.equals(inputPar.type)){
                //System.out.println("DEBUG: parameter success");
            } else {
                error($factor.start, "The input parameter input type '" + $factor.type +"' is not the same as parameter type '" + inputPar.type + "'");
            }
        } else {
            error($DNT, "There are no additional parameters for function '" + $DNT.getText() + "'");
        }

        paramCount ++;

    }
    )*)? ')'
    {
        if(paramCount < currentId.parameters.size()){
            error($DNT, "Function is missing parameters.");
        } else if (paramCount > currentId.parameters.size()){
            error($DNT, "Function has excessive parameters.");
        }

        //sets value, should be whatever is returned into the function DNT
        $value = currentId.value;
        $type = currentId.type;
        $content = currentId.content;
        $hasKnownValue = currentId.hasKnown;

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