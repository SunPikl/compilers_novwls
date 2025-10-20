// Define a grammar called !Vwls
grammar NoVwls;

//~~~~~~~~~~~~~~~~~~~ Helper Functions ~~~~~~~~~~~~~~~~~~
@header { import java.util.*; }

@members {
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
        
        List<Object> arrayValues = new ArrayList<>();
        List<List<Object>> array2DValues = new ArrayList<>();
        boolean isArray = false;
        boolean is2DArray = false;
    }

    //Symbol Table
    class SymbolTable {
        Map<String, Identifier> table = new HashMap<>();
    }
    SymbolTable mainTable = new SymbolTable();
    Stack<SymbolTable> scopeStack = new Stack<>();
    
    //Variables Assigned Once
    Set<String> assigned = new HashSet<>();
    Set<String> used = new HashSet<>();
    List<String> diagnostics = new ArrayList<>();
    String currLHS = null;
    boolean preexistingLHS = false;
    Scanner scan = new Scanner(System.in);

    void error(Token t, String msg) {
        diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
    }

    void printDiagnostics() {
        for (String v : assigned) {
            if (!used.contains(v)) {
                System.err.println("warning: variable '" + v + "' assigned but never used");
            }
        }
        for (String d : diagnostics) {
            System.err.println("error: " + d);
        }
    }
}

//~~~~~~~~~~~~~~~~~~~ Lexer ~~~~~~~~~~~~~~~~~~
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

NT : ('0'|('-'?)[1-9][0-9]*) ;
KW_NT : 'nt';
FLT : ('-'?) ( ('0' | '0.0') |  ('0' '.' [0-9]* [1-9] | [1-9][0-9]* ('.'?) [0-9]* ))  ;
KW_FLT : 'flt';
BL : ('0'|'1'|'false'|'true') ;
KW_BL : 'bl';
CHR : ('\'')([a-zA-Z0-9])('\'') ;
KW_CHR : 'chr' ;
STRNG : ('"') (~('"'|'\\'))* ('"') ;
KW_STRNG : 'strng' ;
KW_VD : 'vd' ;
KW_RRY : 'rry';

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
L_SQBR : '[' ;
R_SQBR : ']' ;

WS : [ \t\r\n]+ -> skip ;
CMMNT_LN : '//'~[\n\r]* -> skip ;
CMMNT_BLCK : '/*' .*? '*/' -> skip ;
DNT : [a-zA-Z][a-zA-Z0-9_]* ;

//~~~~~~~~~~~~~~~~~~~ EBNF Grammar ~~~~~~~~~~~~~~~~~~
program : {scopeStack.push(mainTable);} (stmt)* EOF { printDiagnostics(); } ; 

stmt : blockStmt | assignStmt | printStmt | compareStmt | functStmt | loopStmt | functCall SCOLN | comment; 

blockStmt : '{' { scopeStack.push(new SymbolTable()); } (stmt)* '}' { scopeStack.pop(); } ;

assignStmt : (dt=dataType)? DNT 
    {
        currLHS = $DNT.getText();
        preexistingLHS = scopeStack.peek().table.containsKey(currLHS);
    }
    SSGN rhs SCOLN
    {
        assigned.add(currLHS);
        Identifier newId = new Identifier();
        newId.id = currLHS;

        if(!preexistingLHS){ 
            if($dt.type == null){
                error($DNT, "data type not specified for '" + currLHS + "'");
                newId.type = "null";
            } else {
                newId.type = $dt.type; 
            }
        } else {
            newId.type = scopeStack.peek().table.get(currLHS).type;
        }

        boolean errorFlag = false;
        if(!errorFlag && $rhs.hasKnownValue){
            newId.value = $rhs.value;
            newId.content = $rhs.content;
            newId.hasKnown = true;
            newId.isArray = $rhs.isArray;
            newId.is2DArray = $rhs.is2DArray;
            newId.arrayValues = $rhs.arrayValues;
            newId.array2DValues = $rhs.array2DValues;
        } else {
            newId.hasKnown = false;
        }
        
        newId.hasBeenUsed = false;
        scopeStack.peek().table.put(newId.id, newId);
        currLHS = null;
    };

rhs returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues]:
      expr 
        {
            $hasKnownValue = $expr.hasKnownValue;
            $type = $expr.type;
            $value = $expr.value;
            $content = $expr.content;
            $isArray = $expr.isArray;
            $is2DArray = $expr.is2DArray;
            $arrayValues = $expr.arrayValues;
            $array2DValues = $expr.array2DValues;
        }
    | arrayLiteral
        {
            $hasKnownValue = $arrayLiteral.hasKnownValue;
            $type = $arrayLiteral.type;
            $isArray = $arrayLiteral.isArray;
            $is2DArray = $arrayLiteral.is2DArray;
            $arrayValues = $arrayLiteral.arrayValues;
            $array2DValues = $arrayLiteral.array2DValues;
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

compareStmt : KW_F '(' comparison ')' blockStmt elseC? ; 

functStmt : KW_FNCTN d=dataType a=DNT 
    {
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
            Identifier currId;
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

loopStmt : while | for | doWhile; 
while : KW_WHL '(' comparison ')' blockStmt ;  
for : KW_FR '(' assignStmt comparison SCOLN forLoopInc ')' blockStmt ; 
doWhile : KW_D blockStmt KW_WHL '(' comparison ')' ; 
comment :  CMMNT_LN | CMMNT_BLCK ; 
elseC : (KW_LS blockStmt) | KW_LS blockStmt elseC; 

forLoopInc : DNT SSGN additiveExpr | DNT'++' | DNT'--' ;

expr returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues]: 
        a=factor 
        {
            if ($a.hasKnownValue) {
                $hasKnownValue = true;
                $value = $a.value;
                $content = $a.content;
                $type = $a.type;
                $isArray = $a.isArray;
                $is2DArray = $a.is2DArray;
                $arrayValues = $a.arrayValues;
                $array2DValues = $a.array2DValues;
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
                $isArray = false;
                $is2DArray = false;
            } else {
                $hasKnownValue = false;
            } 
        }
    | c=additiveExpr
        {
            if ($c.hasKnownValue) {
                $hasKnownValue = true;
                $value = $c.value;
                $type = $c.type;
                $isArray = false;
                $is2DArray = false;
            } else {
                $hasKnownValue = false;
            }
        };

comparison returns [boolean hasKnownValue, float value] : 
    a=comparisonExpr
    {
        if(!($a.type.equals("bl"))){
            System.err.println("Comparison must return boolean");
        } else {
            $hasKnownValue = true;
            $value = $a.value;
        }
    };

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
    b=additiveExpr  
    {  
        if ($b.hasKnownValue) {  
            String opType = $op.getText(); 
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
            $type = "bl";
        } else {
            $hasKnownValue = false;
        }
    })*;

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
            if ($a.type.equals("flt") || $b.type.equals("flt")) {
                $type = "flt";
            } else {
                $type = "nt";
            }
        } else {
            $hasKnownValue = false;
        }
    })*;

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
            if ($a.type.equals("flt") || $b.type.equals("flt")) {
                $type = "flt";
            } else {
                $type = "nt";
            }
        } else {
            $hasKnownValue = false;
        }
    })*; 

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
            $isArray = false;
            $is2DArray = false;
        }
    | FLT 
        {   $hasKnownValue = true; 
            $value = Float.parseFloat($FLT.getText()); 
            $type = "flt";
            $isArray = false;
            $is2DArray = false;
        }
    | BL 
        { 
            $hasKnownValue = true; 
            $type = "bl";
            $isArray = false;
            $is2DArray = false;
            if($BL.getText().equals("true")){
                $value = 1;
            } else if($BL.getText().equals("false")){
                $value = 0;
            } else {
                $value = Integer.parseInt($BL.getText());
            }
        }
    | CHR
        {   $hasKnownValue = true; 
            $content = $CHR.getText();
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
        }
    | STRNG 
        {   $hasKnownValue = true; 
            $content = $STRNG.getText();
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
        }
    | DNT
        {
            String id = $DNT.getText();
            used.add(id);
            Identifier currentId = null;
            for(int i = scopeStack.size()-1; i >= 0; i--){
                currentId = scopeStack.get(i).table.get(id);
                if(currentId != null) break;
            }
            if (currentId == null) {
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
                $content = currentId.content;
                $isArray = currentId.isArray;
                $is2DArray = currentId.is2DArray;
                $arrayValues = currentId.arrayValues;
                $array2DValues = currentId.array2DValues;
            }
        }
    | arrayAccess
        {
            $hasKnownValue = $arrayAccess.hasKnownValue;
            $type = $arrayAccess.type;
            $value = $arrayAccess.value;
            $content = $arrayAccess.content;
            $isArray = false;
            $is2DArray = false;
        }
    | '(' expr ')'
        { 
            if ($expr.hasKnownValue) {
                $hasKnownValue = true;
                $value = $expr.value;
                $content = $expr.content;
                $type = $expr.type;
                $isArray = $expr.isArray;
                $is2DArray = $expr.is2DArray;
                $arrayValues = $expr.arrayValues;
                $array2DValues = $expr.array2DValues;
            } else $hasKnownValue = false;
        }
    | functCall
    {
         if ($functCall.hasKnownValue) {
            $hasKnownValue = true;
            $value = $functCall.value;
            $type = $functCall.type;
            $content = $functCall.content;
            $isArray = false;
            $is2DArray = false;
        } else $hasKnownValue = false;
    };

arrayAccess returns [boolean hasKnownValue, String type, float value, String content]:
    DNT L_SQBR index=expr R_SQBR
    {
        String id = $DNT.getText();
        used.add(id);
        Identifier currentId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currentId = scopeStack.get(i).table.get(id);
            if(currentId != null) break;
        }
        
        if (currentId == null) {
            error($DNT, "array '" + id + "' not found");
            $hasKnownValue = false;
            $type = "null";
        } else if (!currentId.isArray && !currentId.type.endsWith("[]")) {
            error($DNT, "'" + id + "' is not an array");
            $hasKnownValue = false;
            $type = "null";
        } else if ($index.hasKnownValue && currentId.arrayValues != null) {
            int idx = (int)$index.value;
            if (idx >= 0 && idx < currentId.arrayValues.size()) {
                Object element = currentId.arrayValues.get(idx);
                if (element instanceof Integer) {
                    $value = (Integer)element;
                    $type = "nt";
                    $hasKnownValue = true;
                } else if (element instanceof Float) {
                    $value = (Float)element;
                    $type = "flt";
                    $hasKnownValue = true;
                } else if (element instanceof Boolean) {
                    $value = (Boolean)element ? 1.0f : 0.0f;
                    $type = "bl";
                    $hasKnownValue = true;
                } else if (element instanceof String) {
                    $content = (String)element;
                    $type = element.toString().startsWith("'") ? "chr" : "strng";
                    $hasKnownValue = true;
                } else {
                    $hasKnownValue = false;
                }
            } else {
                error($DNT, "array index out of bounds");
                $hasKnownValue = false;
            }
        } else {
            $hasKnownValue = false;
            $type = currentId.type.replace("[]", "");
        }
    };

functCall returns [boolean hasKnownValue, String type, float value, String content]: 
    DNT '('
    {
        String id = $DNT.getText();
        used.add(id);
        Identifier currentId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currentId = scopeStack.get(i).table.get(id);
            if(currentId != null) break;
        }
        if (currentId == null) {
            error($DNT, "Function '" + $DNT.getText() + "' does not exist.");
        } else {
            currentId.hasBeenUsed = true;
            $hasKnownValue = currentId.hasKnown;
            
        }

        //check if factor matches type set in function
        //assign if so, error if not

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
    a=primitiveDT { $type = $a.type; }
    | arrayDT { $type = $arrayDT.type; };

primitiveDT returns [String type]: 
    KW_NT { $type = "nt"; }
    | KW_STRNG { $type = "strng"; }
    | KW_FLT { $type = "flt"; }
    | KW_BL { $type = "bl"; }
    | KW_CHR { $type = "chr"; };

arrayDT returns [String type]: 
    primitiveDT L_SQBR R_SQBR { $type = $primitiveDT.type + "[]"; }
    | primitiveDT L_SQBR R_SQBR L_SQBR R_SQBR { $type = $primitiveDT.type + "[][]"; };