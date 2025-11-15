// Define a grammar called !Vwls
grammar NoVwls;

//~~~~~~~~~~~~~~~~~~~ Helper Functions ~~~~~~~~~~~~~~~~~~
@header { import java.util.*; import java.io.*;}

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
        boolean isImplemented = false; //if function has been defined
        List<Identifier> parameters = new ArrayList<>();
        StringBuilder storeFunct = new StringBuilder();
        
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

    public String mapType(String noVwlsType) {
        // Check for array notation and remove it temporarily
        boolean isArray = noVwlsType.endsWith("[]");
        String baseType = isArray ? noVwlsType.substring(0, noVwlsType.length() - 2) : noVwlsType; 
        String javaType;
        
        switch (baseType) {
            case "nt": return isArray ? "int[]" : "int";
            case "flt": return isArray ? "float[]" : "float"; 
            case "strng": return isArray ? "String[]" : "String";
            case "chr": return isArray ? "char[]" : "char";
            case "bl": return isArray ? "boolean[]" : "boolean";
            default: return noVwlsType; // Return original if not a known type
        }
    }

    public String mapDefaultValue(String javaType) {
        switch (javaType) {
            case "int": return "0";
            case "float": return "0.0f";
            case "char": return "'\\u0000'";
            case "boolean": return "false";
            case "String": return "null"; // Object types can be null
            default: return "null"; // For arrays or other objects
        }
    }
    
    //errors
    void error(Token t, String msg) {
        diagnostics.add("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
    }

    int printDiagnostics() {
        int numErrors = 0;
        for (String v : assigned) {
            if (!used.contains(v)) {
                System.err.println("warning: variable '" + v + "' assigned but never used");
            }
        }
        for (String d : diagnostics) {
            numErrors++;
            System.err.println("error: " + d);
        }

        return numErrors;
    }

    //code gen
    StringBuilder sb = new StringBuilder(); // Stores the generated program
    Identifier writeTo = null;
    void emit(String s, Identifier funct) { // Short-hand for adding to the program
        if(funct == null){
            sb.append(s);  
        } else {
            funct.storeFunct.append(s);
        }
    }    

    // Emit the preamble material for our program
    void openProgram() {
        emit("import java.util.*;\n", null);
        emit("public class NoVwlsProgram {\n", null);
        emit("  public static void main(String[] args) throws Exception {\n", null);
        emit("    Scanner in = new Scanner(System.in);\n", null);
    }

    // Emit the postamble material for our program
    void closeProgram() {
        emit(" in.close();\n", null);
        emit("  }\n", null);

        //export functions **dont forget to check function definition **
        for (Identifier object : mainTable.table.values()) {
        
            if(object.isFunction){
                // type - Use mapType 
                String type = mapType(object.type); 
                
                //establish function and parameters
                emit("public static " + type + " " + object.id + "( " , null);
                
                if(object.parameters != null){
                    for(int p = 0; p < object.parameters.size(); p++){
                        Identifier parameter = object.parameters.get(p);

                        // type - Use mapType 
                        String ptype = mapType(parameter.type); 
                        
                        emit( ptype + " " + parameter.id, null);
                        if((p+1) != object.parameters.size()){
                            emit( ", ", null);
                        }
                    }
                }
                emit(" ) { \n", null);

                //open scanner
                emit(" Scanner in = new Scanner(System.in);\n", null);

                //emit content
                emit(object.storeFunct.toString(), null);

                //finish
                emit("}\n", null);
            }
        }

        emit("}\n", null);
    }

    void generateAssign(boolean declare, String name, String rhsJavaCode, String type) {
        String javaType = mapType(type);
        
        String declarationPrefix = declare ? javaType + " " : " ";
        
        emit("    " + declarationPrefix + name + " = " + rhsJavaCode + ";\n", writeTo);
    }

    // Write the generated Java to file.
    void writeFile() {
        try (PrintWriter pw = new PrintWriter("NoVwlsProgram.java", "UTF-8")) {
            pw.print(sb.toString());
        } catch (Exception e) {
            System.err.println("error: failed to write NoVwlsProgram.java: " + e.getMessage());
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
LSSTHNREQL : '<=' ;
GRTRTHNREQL : '>=' ;
EQL : '==' ;
NTEQL : '!=' ;
SCOLN : ';';
CMM : ',' ;
L_SQBR : '[' ;
R_SQBR : ']' ;
INC : '++';
DCR : '--';
CMMNT_LN : '//'~[\n\r]* -> skip ;
CMMNT_BLCK : '/*' .*? '*/' -> skip ;
DNT : [a-zA-Z][a-zA-Z0-9_]* ;
WS : [ \t\r\n]+ -> skip ;

//~~~~~~~~~~~~~~~~~~~ EBNF Grammar ~~~~~~~~~~~~~~~~~~
program : 
    {
        scopeStack.push(mainTable);
        openProgram();
    } 
    (stmt)* EOF 
    { 
        printDiagnostics(); 
        int numErrors = printDiagnostics();
        if (numErrors == 0) {
            // Successful, so write out the generated code
            closeProgram();
            writeFile();
        } else {
            System.err.println(numErrors + " errors detected. Code not generated.");
            System.exit(1);  // Error code
        }
    } ; 

stmt : blockStmt | assignStmt | declareStmt | arrayAssignStmt | printStmt | compareStmt | functStmt | loopStmt | breakStmt | functCall SCOLN | functDefine | comment | arrayDeclWithSize;

blockStmt : '{' { scopeStack.push(new SymbolTable()); } (stmt)* '}' { scopeStack.pop(); } ;

arrayDeclWithSize : 
    dt=primitiveDT id=DNT L_SQBR size=additiveExpr R_SQBR SCOLN 
    {
        // Symbol Table Registration
        Identifier arrayId = new Identifier();
        arrayId.id = $id.getText();
        arrayId.type = $dt.type + "[]"; // e.g., "nt[]"
        arrayId.isArray = true;
        assigned.add($id.getText());
        scopeStack.peek().table.put(arrayId.id, arrayId);
        
        // Code Generation: int[] arr = new int[size];
        String javaType = mapType($dt.type); 
        String arrayType = javaType + "[]"; 
        emit("    " + arrayType + " " + $id.getText() + " = new " + javaType + "[" + $size.code + "];\n", writeTo);
    }
;

declareStmt : dt=dataType id=DNT SCOLN 
    {
        String javaType = mapType($dt.type);
        
        String defaultValue = mapDefaultValue(javaType);
        
        emit("    " + javaType + " " + $id.getText() + " = " + defaultValue + ";\n", writeTo);

        Identifier newId = new Identifier();
        newId.id = $id.getText();
        newId.type = $dt.type; // Use the NoVwls type
        scopeStack.peek().table.put(newId.id, newId);
    }
    ;

assignStmt : (dt=dataType)? DNT    
    {
        //taking in id, find if it exists
        currLHS = $DNT.getText();

        Identifier currId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            preexistingLHS = scopeStack.get(i).table.containsKey(currLHS);
            if(preexistingLHS != false){
                currId = scopeStack.get(i).table.get(currLHS);
                break;
            }
        }
        //preexistingLHS = scopeStack.peek().table.containsKey(currLHS);

    }
    SSGN rhs {
        //make id
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
            newId.type = currId.type;
        }

        boolean errorFlag = false;
        if(preexistingLHS){
            // System.out.println("DEBUG: current type is " + $rhs.type);
            // System.out.println("The current DNT's type is " + mainTable.table.get(currLHS).type);

            //type check 
            if(!($rhs.type.equals(currId.type))){
                error($DNT, "type mismatch for " + currLHS + "'");
                errorFlag = true;
            }
        } else {
            System.out.println($dt.type + " and " + $rhs.type);
            try {
                if(!($rhs.type.equals($dt.type))){
                    //System.out.println("DEBUG issue with type match for " + currLHS + " where " + $dt.type + " not " + $rhs.type);
                    error($DNT, "type mismatch for " + currLHS );
                    errorFlag = true;
                } 
            } catch (Exception e){
                error($DNT," cannot access a nonexistant value");
                errorFlag = true;
            }
        }
        if(!errorFlag){
            newId.value = $rhs.value;
            newId.content = $rhs.content;
            newId.hasKnown = $rhs.hasKnownValue;
            newId.isArray = $rhs.isArray;
            newId.is2DArray = $rhs.is2DArray;
            newId.arrayValues = $rhs.arrayValues;
            newId.array2DValues = $rhs.array2DValues;

        } 
        
        if (preexistingLHS) {
                // Just a new assignment to an existing variable
                generateAssign(false, currLHS, $rhs.code, $rhs.type);
            } else {
                // A new variable is being "declared"
                //Identifier newId = new Identifier(currLHS);
                mainTable.table.put(newId.id, newId);
                generateAssign(true, newId.id, $rhs.code, $rhs.type);
            }

        newId.hasBeenUsed = false;
        scopeStack.peek().table.put(newId.id, newId);
        currLHS = null;
    } SCOLN ;

rhs returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, String code]:
      e = expr
        {$hasKnownValue = $e.hasKnownValue;   
            $type = $e.type;                     
            $value = $e.value;                   
            $content = $e.content;              
            $isArray = $e.isArray;               
            $is2DArray = $e.is2DArray;           
            $arrayValues = $e.arrayValues;     
            $array2DValues = $e.array2DValues; 
            $code = $e.code;
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
                $code = "in.nextInt()";
                //int input = scan.nextInt();
                $hasKnownValue = false;
                //$value = input;
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
                $code = "in.nextFloat()";
                float input = 0.0f;
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
            $code = "in.nextLine()";
            //String input = scan.nextLine();
            $hasKnownValue = true;
            //$content = "\"" + input + "\"";
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
        }
    | KW_SCN_CHR
        {
            $code = "in.next().charAt(0)";
            //input = String.valueOf(input.charAt(0));
            $hasKnownValue = true;
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
        };
arrayAssignStmt : lhs=arrayAccess SSGN rightExpr=rhs SCOLN { 
    
    Identifier currId = null;
    for(int i = scopeStack.size()-1; i >= 0; i--){
        currId = scopeStack.get(i).table.get($lhs.arrayName); 
        if(currId != null) break;
    } 

    if (currId == null) {
        // FIX: Use $lhs.arrayCtx for the context of the error
        error($lhs.arrayCtx, "Array '" + $lhs.arrayName + "' used before declaration.");
    } else if (!currId.isArray) {
        error($lhs.arrayCtx, "'" + $lhs.arrayName + "' is not an array.");
    }

    if(currId != null && currId.isArray) {
        // Code Generation
        emit("    " + $lhs.arrayName + "[" + $lhs.indexCode + "] = " + $rightExpr.code + ";\n", writeTo);
    }
}
;

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

printStmt : KW_PRNT '(' first=printExpr 
    {
        emit("    System.out.print(String.valueOf(" + $first.code  + "));\n", writeTo);
    }
    (CMM more=printExpr
    {
        emit("    System.out.print(String.valueOf(" + $more.code  + "));\n", writeTo);
    }
    
    )* ')' SCOLN 
    { 
        emit("    System.out.println(" + ");\n", writeTo);
    } ;

printExpr returns[String code]: expr 
    { 
        //emit("    System.out.print(" + $expr.code  + ");\n", writeTo);
        $code = $expr.code;

        if($expr.type == null){
            System.err.println("Error: cannot print null types");
        } else if(($expr.type.equals("strng") || $expr.type.equals("chr")) && $expr.content != null){
            String printStr = $expr.content;
            printStr = printStr.substring(1, printStr.length() - 1);
            //System.out.print("DEBUG" + printStr);
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
                //System.out.print("DEBUG" + $expr.value);
            } else if($expr.type.equals("bl")){
                //System.out.print("DEBUG" + ($expr.value == 1.0f ? "true" : "false"));
            } else {
                int printval = (int)(Math.abs($expr.value));
                //System.out.print("DEBUG" + printval);
            }
        }
    };

compareStmt : KW_F '(' comparison ')'
    {
        // if($comparison.value > 0){ //if true
        //     emit("if (true) {\n");
        // } else { //if false
        //     emit("if (false) {\n");
        // }
         emit("if (" + $comparison.code + ") {\n", writeTo);
        
    }
     blockStmt 
    {
        emit("}\n", writeTo);
    }
    (KW_LS
    {
        emit("else {\n", writeTo);
    }
        blockStmt 
    {
        emit("}\n", writeTo);
    }
    )* 
    ; 

functStmt : KW_FNCTN d=dataType a=DNT 
    {
        Identifier function = new Identifier();
        function.id = $a.getText();
        function.type = $d.type;
        function.isFunction = true;
        function.isImplemented = true;
        function.hasBeenUsed = false;
        function.hasKnown = true;
        
        Identifier currentId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currentId = scopeStack.get(i).table.get($a.getText());
            if(currentId != null) break;
        }
        if(currentId != null && currentId.isImplemented){
            error($a , "function '" + $a.getText() + "' is already defined");
        } else if(currentId != null && !currentId.isImplemented){
            //check to make sure everything matches
            if(currentId.type != function.type){
                error($a , "function '" + $a.getText() + "' definition does not match declaration");
            } else if (currentId.isFunction != function.isFunction){
                error($a , "function '" + $a.getText() + "' definition does not match declaration");
            }
        }
        

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
        
        // ADD THIS FIX: Check if the parameter is an array
        if ($dt.type.endsWith("[]")) {
            firstP.isArray = true;
        }
        if ($dt.type.endsWith("[][]")) {
            firstP.is2DArray = true;
        }

        //add to list
        function.parameters.add(firstP);

        //check if non implemented funct has same parameters
        if(currentId != null && !currentId.isImplemented){
            if(currentId.parameters.size() > 0){
                //check dt and parameter name
                if(!currentId.parameters.get(0).type.equals(firstP.type)){
                    error($b , "function '" + $a.getText() + "' parameter type does not match declaration");
                } else if(!currentId.parameters.get(0).id.equals(firstP.id)){
                    error($b , "function '" + $a.getText() + "' parameter ID does not match declaration");
                }
            }
        }
    }
    (CMM dt2=dataType c=DNT
    {
        //store arg
        Identifier nextP = new Identifier();
        nextP.type = $dt2.type;
        nextP.id = $c.getText();
        nextP.hasKnown = false;
        nextP.hasBeenUsed = false;

        // ADD THIS FIX: Check if the parameter is an array
        if ($dt2.type.endsWith("[]")) {
            nextP.isArray = true;
        }
        if ($dt2.type.endsWith("[][]")) {
            nextP.is2DArray = true;
        }

        //add to list
        function.parameters.add(nextP);
    }
    )*)? ')' '{'
    {
        //System.out.println("DEBUG: defining function " + function.id);
        //check parameters
        if(currentId != null && !currentId.isImplemented){
            System.out.println("Here");
            if(currentId.parameters.size() != function.parameters.size()){
                error($a , "function '" + $a.getText() + "' parameter count does not match declaration");
            }
            System.out.println("Here 2");
            for(int p = 0; p < function.parameters.size(); p++){
                Identifier paramCheck = currentId.parameters.get(p);
                Identifier paramFunct = function.parameters.get(p);
                if(!paramCheck.type.equals(paramFunct.type)){
                    error($a , "function '" + $a.getText() + "' parameter type does not match declaration");
                } else if(!paramCheck.id.equals(paramFunct.id)){
                    error($a , "function '" + $a.getText() + "' parameter ID does not match declaration");
                }
            }
            System.out.println("Here 3");
        }

        //store funct
        if(currentId != null && !currentId.isImplemented){
            function = currentId;
        } else {  
            scopeStack.peek().table.put(function.id, function);
            mainTable.table.put(function.id, function);
        }

        //change string builder
        writeTo = function;
        
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
            for(int curr = 0; curr < function.parameters.size(); curr++){
                currId = function.parameters.get(curr);
                scopeStack.peek().table.put(currId.id, currId);
            }
        }
        
        
    }
    stmt* KW_RTN factor SCOLN '}'
    {
        //System.out.println("DEBUG: type of funct:" + $d.type + " type of factor:" + $factor.type);
        String returnVal = "String ";
        
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
            emit(" in.close();\n", writeTo);
            emit("return " + $factor.code + "; \n", writeTo);  
        }

        //end scope
        scopeStack.pop();
        
        //reset string builder 
        writeTo = null;

        //clear list
        //scopeStack.peek().table.get($a.getText()).parameters = new ArrayList<>();
    } ; 

//~~~~~~~~~~~~~~~~~~~ Loop Statements ~~~~~~~~~~~~~~~~~~
loopStmt : whileLoop | forLoop | doWhileLoop | breakStmt;

// While loop
whileLoop : KW_WHL 
    L_PRNTH 
    {
        emit("while(", writeTo);
    }
    comparison
    {
        //replace with string of comparison
        //if($comparison.value > 0){ //if true
        //    emit("true", writeTo);
        //} else {
        //    emit("false", writeTo);
        //}
        emit($comparison.code, writeTo);
    }
     R_PRNTH 
     {
        emit("){", writeTo);
     }
    blockStmt
        {emit("}", writeTo);}
    ;

// For loop - FIXED structure
forLoop : KW_FR 
    L_PRNTH
    {
        emit("for(", writeTo);
    } 
        (assignStmt | SCOLN)    // initialization
        comparison SCOLN         // condition 
        {
            emit($comparison.code + ";", writeTo);
        } 
        (forLoopInc)?      // increment
    R_PRNTH {emit("){", writeTo);}
    blockStmt {emit("}", writeTo);}
    ;

// Do-While loop  
doWhileLoop : KW_D {emit("do{\n", writeTo);}
    blockStmt
    KW_WHL L_PRNTH comparison R_PRNTH SCOLN {emit("}while("+ $comparison.code + ");\n", writeTo);}
    ;

// Break statement
breakStmt : KW_BRK SCOLN 
    {
        emit("break;", writeTo);
    }
    ;


comment :  CMMNT_LN | CMMNT_BLCK ; 
elseC : KW_LS blockStmt; 

// For loop increment options
forLoopInc : 
    assignStmt     // x = x + 1
    | DNT INC  {emit($DNT.getText()+"++", writeTo);}              // x++
    | DNT DCR  {emit($DNT.getText()+"--", writeTo);}             // x--
    ;

expr returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, String code]: 
        a=factor 
        {
            $hasKnownValue = $a.hasKnownValue;
            $value = $a.value;
            $content = $a.content;
            $type = $a.type;
            $isArray = $a.isArray;
            $is2DArray = $a.is2DArray;
            $arrayValues = $a.arrayValues;
            $array2DValues = $a.array2DValues;
            $code = $a.code;
            
        }
    | b=comparisonExpr
        {
            $hasKnownValue = $b.hasKnownValue;
            $value = $b.value;
            $type = $b.type;
            $isArray = false;
            $is2DArray = false;
            $code = $b.code;
        };

comparison returns [boolean hasKnownValue, float value, String code] : 
    a=comparisonExpr
    {
        if(!($a.type.equals("bl"))){
            System.err.println("Comparison must return boolean");
        } else {
            $hasKnownValue = true;
            $value = $a.value;
            $code = $a.code;
        }
    };

comparisonExpr returns [boolean hasKnownValue, String type, float value, String code] : 
    a=additiveExpr   
    {  
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code; 
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
            $code = "(" + $code + $op.getText() + $b.code + ")"; 
        } else {
            $hasKnownValue = false;
            $type = "bl";
            $code = "(" + $code + $op.getText() + $b.code + ")";  
        }
    })*;

additiveExpr returns [boolean hasKnownValue, String type, float value, String code] : 
    a=multiplicativeExpr
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code;
    }
    (op=(PLS | MNS) b=multiplicativeExpr
    {
        if ($hasKnownValue && $b.hasKnownValue) {
            if ($op.getText().equals("+")) {
                $value = $value + $b.value;
            } else {
                $value = $value - $b.value;
            }
            if ("flt".equals($a.type) || "flt".equals($b.type)) {
                $type = "flt";
                $code = "" + $value;
            } else {
                $type = "nt";
                $code = "" + (int)$value;
            }
        } else {
            $hasKnownValue = false;
            if ("flt".equals($a.type) || "flt".equals($b.type)) {
                $type = "flt";
            } else {
                $type = "nt";
            }
            $code = "(" + $code + $op.getText() + $b.code + ")"; 
        }
    })*;

multiplicativeExpr returns [boolean hasKnownValue, String type, float value, String code]: 
    a=unaryExpr 
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code;
    }
    ( op=( TMS | DVD | MOD) b=unaryExpr 
    {
        if ($b.hasKnownValue && $op.getText().equals("/") && $b.value == 0) {
            error($op, "division by zero");
            $hasKnownValue = false; 
            $code = "Error";
        } else if ($hasKnownValue && $b.hasKnownValue) {
            if ($op.getText().equals("*")) {
                $value = $value * $b.value;
            } else if ($op.getText().equals("%")){
                $value = $value % $b.value;
            } else {
                $value = $value / $b.value;
            }
            if ("flt".equals($a.type) || "flt".equals($b.type)) {
                $type = "flt";
                $code = "" + $value;
            } else {
                $type = "nt";
                $code = "" + (int)$value;
            }
        } else {
            $hasKnownValue = false;
            // FIX 4: Safe string comparison
            if ("flt".equals($a.type) || "flt".equals($b.type)) {
                $type = "flt";
            } else {
                $type = "nt";
            }
            $code = "(" + $code + $op.getText() + $b.code + ")"; 
        }
    })*;

unaryExpr returns [boolean hasKnownValue, String type, float value, String code]: 
    ('+' | '-' | '!')? a=factor 
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code;
    };

factor returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, String code]: 
      NT 
        {   $hasKnownValue = true; 
            $value = Integer.parseInt($NT.getText()); 
            $type = "nt";
            $isArray = false;
            $is2DArray = false;
            $code = ""+(int)$value;
        }
    | FLT 
        {   $hasKnownValue = true; 
            $value = Float.parseFloat($FLT.getText()); 
            $type = "flt";
            $isArray = false;
            $is2DArray = false;
            $code = $FLT.getText() + "f";
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
            $code = ""+(int)$value;
        }
    | CHR
        {   $hasKnownValue = true; 
            $content = $CHR.getText();
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
            $code = ""+$content;
        }
    | STRNG 
        {   $hasKnownValue = true; 
            $content = $STRNG.getText();
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
            $code = ""+$content;
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
                $hasKnownValue = false;
                $value = currentId.value;
                $type = currentId.type;
                $content = currentId.content;
                $isArray = currentId.isArray;
                $is2DArray = currentId.is2DArray;
                $arrayValues = currentId.arrayValues;
                $array2DValues = currentId.array2DValues;
            }
            $code = id;
        }
    | arrayAccess
        {
            $hasKnownValue = $arrayAccess.hasKnownValue;
            $type = $arrayAccess.type;
            $value = $arrayAccess.value;
            $content = $arrayAccess.content;
            $isArray = false;
            $is2DArray = false;
            $code = $arrayAccess.code;
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
                if($expr.type.equals("strng") || $expr.type.equals("chr")){
                    $code = "" + $content;
                } else $code = "" + $value;
            } else {
                $hasKnownValue = false;
                $code = "(" + $expr.code + ")";
            }
        }
    ;

functCall returns [boolean hasKnownValue, String type, float value, String content, String code]: 
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
            // Report the error
            error($DNT, "Function '" + $DNT.getText() + "' does not exist.");
            currentId = new Identifier();
            currentId.id = id;
            currentId.type = "null";            // safe default type
            currentId.value = 0.0f;
            currentId.content = null;
            currentId.parameters = new ArrayList<Identifier>();
            currentId.hasKnown = false;
            currentId.isFunction = false;
            currentId.isArray = false;
            currentId.is2DArray = false;
        } else {
            currentId.hasBeenUsed = true;
            // leave currentId as-is (real function entry)
        }

        // initialize return fields so downstream code never sees nulls
        $hasKnownValue = currentId.hasKnown;
        $type = currentId.type != null ? currentId.type : "null";
        $value = currentId.value;
        $content = currentId.content;
        emit(id + "(", writeTo);
        $code = id + "(";

        // init param counter
        int paramCount = 0;
    }
    ( p=expr // Allows expressions like 'mid + 1'
      {
        // If there are no parameters expected, report it
        if (currentId.parameters == null || currentId.parameters.size() == 0) {
            error($DNT, "There are no parameters for function '" + $DNT.getText() + "'");
        } else {
            // check first parameter
            if (paramCount < currentId.parameters.size()) {
                Identifier inputPar = currentId.parameters.get(paramCount);
                if ($p.type.equals(inputPar.type)) {
                    // assign passed-in values to the parameter slot
                    inputPar.value = $p.value;
                    inputPar.content = $p.content;
                    inputPar.type = $p.type;
                    inputPar.hasKnown = $p.hasKnownValue;
                    inputPar.isArray = $p.isArray;
                    inputPar.is2DArray = $p.is2DArray;
                    if ($p.isArray) inputPar.arrayValues = $p.arrayValues;
                    if ($p.is2DArray) inputPar.array2DValues = $p.array2DValues;

                    // emit correct formatting
                    if (currentId.parameters.size() > 1) {
                        emit($p.code + ", ", writeTo);
                        $code += $p.code + " ,";
                    } else {
                        emit($p.code , writeTo);
                        $code += $p.code;
                    }
                } else {
                    error($p.start, "The input parameter type '" + $p.type + "' is not the same as parameter type '" + inputPar.type + "'");
                }
            } else {
                error($DNT, "There are no parameters for function '" + $DNT.getText() + "'");
            }
        }
        paramCount ++;
      }
      ( ',' p=expr // Allows subsequent expressions
        {
            if (paramCount < currentId.parameters.size()) {
                Identifier inputPar = currentId.parameters.get(paramCount);
                if ($p.type.equals(inputPar.type)) {
                    inputPar.value = $p.value;
                    inputPar.content = $p.content;
                    inputPar.type = $p.type;
                    inputPar.hasKnown = $p.hasKnownValue;
                    inputPar.isArray = $p.isArray;
                    inputPar.is2DArray = $p.is2DArray;
                    if ($p.isArray) inputPar.arrayValues = $p.arrayValues;
                    if ($p.is2DArray) inputPar.array2DValues = $p.array2DValues;
                } else {
                    error($p.start, "The input parameter type '" + $p.type + "' is not the same as parameter type '" + inputPar.type + "'");
                }
            } else {
                error($DNT, "There are no additional parameters for function '" + $DNT.getText() + "'");
            }

            paramCount ++;
            if (paramCount < currentId.parameters.size()) {
                emit($p.code + ", ", writeTo);
                $code += $p.code + " ,";
            } else {
                emit($p.code , writeTo);
                $code += $p.code;
            }
        }
      )*
    )? ')'
    {
        
        if (paramCount < currentId.parameters.size()){
            error($DNT, "Function is missing parameters.");
        } else if (paramCount > currentId.parameters.size()){
            error($DNT, "Function has excessive parameters.");
        }

        // set return values from the function entry (dummy or real)
        $value = currentId.value;
        $type = currentId.type != null ? currentId.type : "null";
        $content = currentId.content;
        $hasKnownValue = currentId.hasKnown;
        $code += ")";
        emit(");\n", writeTo);
    }
    ;
functDefine: KW_FNCTN d=dataType a=DNT 
    {
        Identifier function = new Identifier();
        function.id = $a.getText();
        function.type = $d.type;
        function.isFunction = true;
        function.isImplemented = false;
        function.hasBeenUsed = false;
        function.hasKnown = true;
        
        Identifier currentId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currentId = scopeStack.get(i).table.get($a.getText());
            if(currentId != null) break;
        }
        if(currentId != null){
            error($a , "function '" + $a.getText() + "' is already defined");
        }
        
        //store funct
        scopeStack.peek().table.put(function.id, function);
        mainTable.table.put(function.id, function);

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

        
        if ($dt.type.endsWith("[]")) {
            firstP.isArray = true;
        }
        if ($dt.type.endsWith("[][]")) {
            firstP.is2DArray = true;
        }
        
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

       
        if ($dt2.type.endsWith("[]")) {
            nextP.isArray = true;
        }
        if ($dt2.type.endsWith("[][]")) {
            nextP.is2DArray = true;
        }

        //add to list
        scopeStack.peek().table.get($a.getText()).parameters.add(nextP);
    }
    )*)? ')' 
    SCOLN;

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
arrayAccess returns [
    boolean hasKnownValue,
    String type,
    float value,
    String content,
    boolean isArray,
    boolean is2DArray,
    List<Object> arrayValues,
    List<List<Object>> array2DValues,
    String code,
    String arrayName,
    Token arrayCtx,
    String indexCode
]:
    id=DNT L_SQBR e1=expr R_SQBR                 // 1D (e1 is the index)
    {
        // Set context fields
        $arrayName = $id.getText();
        $arrayCtx = $id; // FIXED: Removed illegal .start property
        $indexCode = $e1.code;
        used.add($arrayName);
        
        Identifier currId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currId = scopeStack.get(i).table.get($arrayName);
            if(currId != null) break;
        }

       
        if (currId == null) {
            error($id, "Array '" + $arrayName + "' used before declaration.");
            $type = "null"; // Default safe type
        } else if (!currId.isArray) {
            error($id, "'" + $arrayName + "' is not a 1D array.");
            $type = "null"; // Default safe type
        } else {
            $type = currId.type.substring(0, currId.type.length() - 2); 
        }
        
        // Code Generation
        $code = $arrayName + "[" + $e1.code + "]";
        $hasKnownValue = false;
    }
| id=DNT L_SQBR e2=expr R_SQBR L_SQBR e3=expr R_SQBR    // 2D (e2, e3 are indices)
    {
        // Set context fields
        $arrayName = $id.getText();
        $arrayCtx = $id; // FIXED: Removed illegal .start property
        $indexCode = $e2.code + "][" + $e3.code; // Not strictly indexCode, but for internal use
        used.add($arrayName);
        
        Identifier currId = null;
        for(int i = scopeStack.size()-1; i >= 0; i--){
            currId = scopeStack.get(i).table.get($arrayName);
            if(currId != null) break;
        }

        if (currId == null) {
            error($id, "Array '" + $arrayName + "' used before declaration.");
            $type = "null"; 
        } else if (!currId.is2DArray) {
            error($id, "'" + $arrayName + "' is not a 2D array.");
            $type = "null"; 
        } else {
            $type = currId.type.substring(0, currId.type.length() - 4); 
        }
        
        $code = $arrayName + "[" + $e2.code + "][" + $e3.code + "]";
        $hasKnownValue = false;
    }
;