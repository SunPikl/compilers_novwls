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

     //Code Block Management for Loops/Conditionals
    Stack<StringBuilder> codeBlockStack = new Stack<>();
    int labelCounter = 0;

    // Method to start a new code block
    StringBuilder startCodeBlock() {
        StringBuilder block = new StringBuilder();
        codeBlockStack.push(block);
        return block;
    }

    // Method to end a code block and get its contents
    String endCodeBlock() {
        if (!codeBlockStack.isEmpty()) {
            return codeBlockStack.pop().toString();
        }
        return "";
    }

    // Method to get current code block
    StringBuilder getCurrentBlock() {
        if (!codeBlockStack.isEmpty()) {
            return codeBlockStack.peek();
        }
        return text_sb; // Default to main text segment
    }

    // Generate unique labels
    String generateLabel(String prefix) {
        return prefix + "_" + (labelCounter++);
    }

    void emitLabel(StringBuilder sb, String label) {
        emit(sb, label + ":", true);
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

    //***code gen***
    //registers
    //register trackers
    int nextIntRegister = 1;
    int nextFloatRegister = 1;
    int nextTotRegister = 1;

    String getNewRegister(String type) {
        String ret;
        // if (type.equals("nt")) ret = "" + nextIntRegister++;
        // else ret = "" + nextFloatRegister++;
        ret = "" + nextTotRegister;

        // if(nextIntRegister > 7 || nextFloatRegister > 7){
        //     System.err.println("error: ran out of registers");
        //     System.exit(1);
        // } else if(nextTotRegister > 7) {
        //     System.err.println("error: ran out of registers");
        //     System.exit(1);
        // }
        nextTotRegister++;

        return ret;
    }

    // Reset registers at the start of a new expression
    void resetRegisters() {
        nextIntRegister = 1;
        nextFloatRegister = 1;
        nextTotRegister = 1;
    }

    //code storage
    StringBuilder text_sb = new StringBuilder(); // Stores text segment
    Identifier writeTo = null;
    StringBuilder data_sb = new StringBuilder(); //data segment
    int data_count = 0;

    void emit(StringBuilder sb, String s, boolean newLine) { 
        sb.append(s);
        if (newLine) { sb.append("\n"); }
    }
    void emit(StringBuilder sb, String s) { emit(sb, s, true); }
    void data_emit(String s) { emit(data_sb, s); }
    void text_emit(String s) { emit(text_sb, s); } 

    //make file 
    final String ASSEMBLY_FILE = "code.s";

    final String CONST_PREFIX = "VAL";
    final String ID_PREFIX = "IDX";
    
    // Emit the preamble material for our program
    void openProgram() {
    data_emit("# =================================");
    data_emit("# Auto-generated code. Do not edit.");
    data_emit("# =================================");
    data_emit("    .data");

    text_emit("    .text");
    text_emit("main: ");
  }

    // Emit the postamble material for our program
    void closeProgram() {
        text_emit("end:");
        text_emit("    li    a0, 0");
        text_emit("    li    a7, 93");
        text_emit("    ecall");

        //export functions **dont forget to check function definition **
        for (Identifier object : mainTable.table.values()) {
        
            if(object.isFunction){
                // type - Use mapType 
                String type = mapType(object.type); 
                
                //establish function and parameters
                //emit("public static " + type + " " + object.id + "( " , null);
                
                if(object.parameters != null){
                    for(int p = 0; p < object.parameters.size(); p++){
                        Identifier parameter = object.parameters.get(p);

                        // type - Use mapType 
                        String ptype = mapType(parameter.type); 
                        
                        //emit( ptype + " " + parameter.id, null);
                        if((p+1) != object.parameters.size()){
                            //emit( ", ", null);
                        }
                    }
                }
                //emit(" ) { \n", null);

                //open scanner
                //emit(" Scanner in = new Scanner(System.in);\n", null);

                //emit content
                //emit(object.storeFunct.toString(), null);

                //finish
                //emit("}\n", null);
            }
        }

    }

    //send values
    String addDoubleValue(double x) {
        String label = CONST_PREFIX+data_count;
        data_count++;
        data_emit(label + ":    .double " + x);
        return label;
    }

    String addIntValue(int x) {
        String label = CONST_PREFIX+data_count;
        data_count++;
        data_emit(label + ":    .word " + x);
        return label;
    }

    String addStringValue(String x) {
        String label = CONST_PREFIX+data_count;
        data_count++;
        data_emit(label + ":    .asciz \"" + x + "\"");
        return label;
    }

    String addBoolValue(int x) {
        String label = CONST_PREFIX+data_count;
        data_count++;
        data_emit(label + ":    .byte " + x);
        return label;
    }

    String addCharValue(char x) {
        String label = CONST_PREFIX+data_count;
        data_count++;
        data_emit(label + ":    .byte " + x);
        return label;
    }

    void addSymbolsToData(SymbolTable table) {
        table.table.forEach((id, symbol) -> {  { 
            String label = ID_PREFIX + id;
            try{
                if(symbol.type.equals("nt")){
                    data_emit(label + ":    .word 0");
                    return;
                } else if(symbol.type.equals("flt")){
                    data_emit(label + ":    .double 0.0");
                    return;
                } else if(symbol.type.equals("strng")){
                    data_emit(label + ":    .asciz \"\""); 
                    return;
                } else if(symbol.type.equals("chr")){
                    data_emit(label + ":    .byte 0");
                    return;
                } else if(symbol.type.equals("bl")){
                    data_emit(label + ":    .byte 0");
                    return;
                }
            } catch (Exception e){
                error(null, "unknown type for symbol '" + id + "' in data segment");
            }
            
        }});
    }

    //loading values to register
    StringBuilder generateDoubleConstant(String register, double value) {
        StringBuilder code = new StringBuilder();
        String label = addDoubleValue(value);
        emit(code, "    # Loading constant " + value + " into register " + register); 
        emit(code, "    la " + "t0," + label); 
        emit(code, "    fld " + register + ", 0(t0)");
        emit(code, "    ");
        return code;
    }

    StringBuilder generateIntConstant(String register, int value) {
        StringBuilder code = new StringBuilder();
        String label = addIntValue(value);
        emit(code, "    # Loading constant " + value + " into register " + register); 
        emit(code, "    la " + "t0," + label); 
        emit(code, "    lw " + register + ", 0(t0)");
        emit(code, "    ");
        return code;
    }

    StringBuilder generateStringConstant(String register, String value) {
        StringBuilder code = new StringBuilder();
        String label = addStringValue(value);
        emit(code, "    # Loading constant " + value + " into register " + register); 
        emit(code, "    la " + "a0," + label); 
        emit(code, "    ");
        return code;
    }

    StringBuilder generateCharConstant(String register, char value) {
        StringBuilder code = new StringBuilder();
        String label = addCharValue(value);
        emit(code, "    # Loading constant " + value + " into register " + register); 
        emit(code, "    la " + "t0," + label); 
        emit(code, "    lw " + register + ", 0(t0)");
        emit(code, "    ");
        return code;
    }

    StringBuilder generateBoolConstant(String register, int value) {
        StringBuilder code = new StringBuilder();
        String label = addBoolValue(value);
        emit(code, "    # Loading constant " + value + " into register " + register); 
        emit(code, "    la " + "t0," + label); 
        emit(code, "    lw " + register + ", 0(t0)");
        emit(code, "    ");
        return code;
    }

    StringBuilder generateLoadId(String register, String id) {
        StringBuilder code = new StringBuilder();
        String label = ID_PREFIX + id;
        emit(code, "    # Loading id " + id + " into register " + register); 
        emit(code, "    la " + "t0," + label); 
        if(register.startsWith("f")) {
            emit(code, "    fld " + register + ", 0(t0)");
        } else {
            emit(code, "    lw " + register + ", 0(t0)");
        }
        emit(code, "    ");
        System.out.println("DEBUG: load id " + id + " into register " + register);
        return code;
    }

    //generate assignments
    void generateAssign(String name, StringBuilder rhsJavaCode, String register) {
        // tempRegister is either t0 or t1 (if t0 is taken)
        String tempRegister = register.equals("t0") ? "t1" : "t0";

        emit(rhsJavaCode, "    # Assigning to variable " + name);
        emit(rhsJavaCode, "    la " + tempRegister + "," + ID_PREFIX+name);
        if(register.startsWith("f")) {
            emit(rhsJavaCode, "    fsd " + register + ", 0(" + tempRegister + ")");
        } else {
            emit(rhsJavaCode, "    sw " + register + ", 0(" + tempRegister + ")");
        }
        emit(rhsJavaCode, "    ");
        System.out.println("DEBUG: assign to " + name + " from register " + register);
    }

    //generate to read
    void generateReadDouble(StringBuilder code, String register) {
        emit(code, "    li    a7, 7");  // a7=7 is for reading doubles
        emit(code, "    ecall");        // invoke the system call
        if (!register.equals("fa0")) {
            // Transfer the results over to register from fa0.
            //    e.g. fmv.d fa1, fa0   fa1 = fa0
            emit(code, "    fmv.d " + register + ",fa0");
        }
    }

    void generateReadInt(StringBuilder code, String register) {
        emit(code, "    li    a7, 5");  // a7=5 is for reading floats
        emit(code, "    ecall");        // invoke the system call
        if (!register.equals("a0")) {
            // Transfer the results over to register from ft0.
            emit(code, "    fmv.d " + register + ",a0");
        }
    }

    void generateReadString(StringBuilder code, String register) {
        emit(code, "    li    a7, 8");  // a7=8 is for reading strings
        emit(code, "    ecall");        // invoke the system call
        if (!register.equals("a0")) {
            // Transfer the results over to register from a0.
            emit(code, "    fmv.d " + register + ",a0");
        }
    }

    void generateReadChar(StringBuilder code, String register) {
        emit(code, "    li    a7, 12");  // a7=12 is for reading chars
        emit(code, "    ecall");        // invoke the system call
        if (!register.equals("a0")) {
            // Transfer the results over to register from a0.
            emit(code, "    fmv.d " + register + ",a0");
        }
    }


    //generate to print
    void generatePrintDouble(StringBuilder code, String register) {
        if (!register.equals("fa0")) {
            // Need to transfer the value in register to fa0
            //    e.g. fmv.d fa0, fa1   fa0 = fa1
            emit(code, "    fmv.d fa0," + register);
        }
        emit(code, "    # Emitting print double"); 
        emit(code, "    li    a7, 3");  // a7=3 is for printing doubles
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
        emit(code, "    li    a7, 11"); // a7=11 is for printing a character
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    ");
    }

    void generatePrintInt(StringBuilder code, String register) {
        if (!register.equals("a0")) {
            // Need to transfer the value in register to fa0
            //    e.g. fmv.d fa0, fa1   fa0 = fa1
            emit(code, "    fmv.d a0," + register);
        }
        emit(code, "    # Emitting print int"); 
        emit(code, "    li    a7, 1");  // a7=1 is for printing doubles
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
        emit(code, "    li    a7, 11"); // a7=11 is for printing a character
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    ");
    }

    void generatePrintString(StringBuilder code, String register) {
        if (!register.equals("a0")) {
            // Need to transfer the value in register to fa0
            //    e.g. fmv.d fa0, fa1   fa0 = fa1
            emit(code, "    fmv.d a0," + register);
        }
        emit(code, "    # Emitting print string"); 
        emit(code, "    li    a7, 4");  // a7=4 is for printing strings
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
        emit(code, "    li    a7, 11"); // a7=11 is for printing a character
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    ");
    }

    void generatePrintBool(StringBuilder code, String register) {
        if (!register.equals("a0")) {
            // Need to transfer the value in register to fa0
            //    e.g. fmv.d fa0, fa1   fa0 = fa1
            emit(code, "    fmv.d a0," + register);
        }
        System.out.println("printing bool");
        emit(code, "    # Emitting print bool"); 
        emit(code, "    li    a7, 1");  // a7=5 is for printing bool values
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
        emit(code, "    li    a7, 11"); // a7=11 is for printing a character
        emit(code, "    ecall");        // invoke the system call
        emit(code, "    ");
    }

    /// Write the generated Java to file.
    void writeFile() {
        try (PrintWriter pw = new PrintWriter(ASSEMBLY_FILE, "UTF-8")) {
            pw.print(data_sb.toString());
            pw.print(text_sb.toString());
        } catch (Exception e) {
            System.err.println("error: failed to write to " + ASSEMBLY_FILE + ": " + e.getMessage());
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
    (stmt
    {
        // Append the generated code from each statement
        if ($stmt.code != null) {
            text_sb.append($stmt.code.toString());
        }
    }
    )*EOF 
    { 
        printDiagnostics(); 
        int numErrors = printDiagnostics();
        if (numErrors == 0) {
            // Successful, so write out the generated code
            closeProgram();
            addSymbolsToData(mainTable);
            writeFile();
        } else {
            System.err.println(numErrors + " errors detected. Code not generated.");
            System.exit(1);  // Error code
        }
    } ; 

stmt returns [StringBuilder code] : 
    blockStmt { $code = new StringBuilder(); }
    | assignStmt  { $code = $assignStmt.code; }
    | declareStmt 
    | arrayAssignStmt 
    | printStmt { $code = $printStmt.code; }
    | compareStmt { $code = $compareStmt.code; }
    | functStmt 
    | loopStmt { $code = $loopStmt.code; }
    | breakStmt 
    | functCall SCOLN 
    | functDefine 
    | comment 
    | arrayDeclWithSize;

blockStmt : '{' { scopeStack.push(new SymbolTable()); } (stmt)* '}' { scopeStack.pop(); } ;

arrayDeclWithSize : 
    dt=primitiveDT id=DNT L_SQBR size=additiveExpr["fa0"] R_SQBR SCOLN 
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
        //emit("    " + arrayType + " " + $id.getText() + " = new " + javaType + "[" + $size.code + "];\n", writeTo);
    }
;

declareStmt : dt=dataType id=DNT SCOLN 
    {
        String javaType = mapType($dt.type);
        
        String defaultValue = mapDefaultValue(javaType);
        
        //emit("    " + javaType + " " + $id.getText() + " = " + defaultValue + ";\n", writeTo);

        Identifier newId = new Identifier();
        newId.id = $id.getText();
        newId.type = $dt.type; // Use the NoVwls type
        scopeStack.peek().table.put(newId.id, newId);
    }
    ;

assignStmt returns [StringBuilder code]: 
    (dt=dataType)? DNT    
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

        //assign register
        String register = "fa0"; //default
        if(preexistingLHS){
            if(currId.type.equals("nt")){
                register = "a0";
            } else if(currId.type.equals("flt")){
                register = "fa0";
            } else if(currId.type.equals("strng")){
                register = "a0";
            } else if(currId.type.equals("chr")){
                register = "a0";
            } else if(currId.type.equals("bl")){
                register = "a0";
            }
        } else {
            try {
                if($dt.type.equals("nt")){
                    register = "a0";
                } else if($dt.type.equals("flt")){
                    register = "fa0";
                } else if($dt.type.equals("strng")){
                    register = "a0";
                } else if($dt.type.equals("chr")){
                    register = "a0";
                } else if($dt.type.equals("bl")){
                    register = "a0";
                }
            } catch (Exception e){
                error($DNT, "data type not specified for '" + currLHS + "'");
            }
        }

    }
    SSGN rhs [register] {
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
                //System.out.println("HERE " + $rhs.type);
                if(($rhs.type.equals("nt") && currId.type.equals("bl")) && ($rhs.value == 0 || $rhs.value == 1 )){
                    //valid
                } else {
                    error($DNT, "type mismatch for " + currLHS + "'");
                    errorFlag = true;
                }
            }
        } else {
            //System.out.println($dt.type + " and " + $rhs.type);
            try {
                if(!($rhs.type.equals($dt.type))){
                    //System.out.println("HERE 2 " + $rhs.type);
                    if(($rhs.type.equals("nt") && $dt.type.equals("bl")) && ($rhs.value == 0 || $rhs.value == 1 )){
                        //valid
                    } else {
                        //System.out.println("DEBUG issue with type match for " + currLHS + " where " + $dt.type + " not " + $rhs.type);
                        error($DNT, "type mismatch for " + currLHS );
                        errorFlag = true;
                    }
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
            generateAssign(currLHS, $rhs.code, $rhs.finReg);
        } else {
            // A new variable is being "declared"
            //Identifier newId = new Identifier(currLHS);
            mainTable.table.put(newId.id, newId);
            generateAssign(newId.id, $rhs.code, $rhs.finReg);
        }

        $code = $rhs.code;

        newId.hasBeenUsed = false;
        scopeStack.peek().table.put(newId.id, newId);
        currLHS = null;
    } SCOLN ;

rhs [String register] returns [StringBuilder code, boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, String codes, String finReg]:
      e = expr[$register]
        {$hasKnownValue = $e.hasKnownValue;   
            $type = $e.type;                     
            $value = $e.value;                   
            $content = $e.content;              
            $isArray = $e.isArray;               
            $is2DArray = $e.is2DArray;           
            $arrayValues = $e.arrayValues;     
            $array2DValues = $e.array2DValues; 
            $code = $e.code;
            $finReg = $e.finReg;

            if ($type.equals("flt")) {
                //$code = "(float)(" + $code + ")";
            }

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
                $code = new StringBuilder();
                $finReg = register;
                generateReadInt($code, register);
                $hasKnownValue = false;
                $value = 0;
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
                //$code = "in.nextFloat()";
                $finReg = register;
                $code = new StringBuilder();
                generateReadDouble($code, register);
                float input = 0.0f;
                $hasKnownValue = false;
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
            //$code = "in.nextLine()";
            $finReg = register;
            $code = new StringBuilder();
            generateReadString($code, register);
            //String input = scan.nextLine();
            $hasKnownValue = false;
            //$content = "\"" + input + "\"";
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
        }
    | KW_SCN_CHR
        {
            //$code = "in.next().charAt(0)";
            $finReg = register;
            $code = new StringBuilder();
            generateReadChar($code, register);
            $hasKnownValue = true;
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
        };
arrayAssignStmt : lhs=arrayAccess SSGN rightExpr=rhs["fa0"] SCOLN { 
    
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
        //emit("    " + $lhs.arrayName + "[" + $lhs.indexCode + "] = " + $rightExpr.code + ";\n", writeTo);
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
    expr["fa0"]
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

printStmt returns [StringBuilder code]: 
    { 
        String register = "unk"; 
    }
    KW_PRNT '(' first=printExpr [register]
    {
        //emit("    System.out.print(String.valueOf(" + $first.code  + "));\n", writeTo);
        $code = $first.code;  // Start with the code for the expression
        if($first.type.equals("nt")){
            generatePrintInt($code, "a0");
        } else if($first.type.equals("flt")){
            generatePrintDouble($code, "fa0");
        } else if($first.type.equals("strng")){
            generatePrintString($code, "a0");
        } else if($first.type.equals("chr")){
            generatePrintString($code, "a0");
        } else if($first.type.equals("bl")){
            generatePrintBool($code, "a0");
        }
    }
    (CMM more=printExpr[register]
    {
        $code = $more.code;  // Start with the code for the expression
        if($first.type.equals("nt")){
            generatePrintInt($code, "a0");
        } else if($first.type.equals("flt")){
            generatePrintDouble($code, "fa0");
        } else if($first.type.equals("strng")){
            generatePrintString($code, "a0");
        } else if($first.type.equals("chr")){
            generatePrintString($code, "a0");
        } else if($first.type.equals("bl")){
            generatePrintBool($code, "a0");
        }
        
        //emit("    System.out.print(String.valueOf(" + $more.code  + "));\n", writeTo);
    }
    
    )* ')' SCOLN 
    { 

        //emit("    System.out.println(" + ");\n", writeTo);
    } ;

printExpr [String register] returns [StringBuilder code, String type]: 
    expr [register]
    { 
        //emit("    System.out.print(" + $expr.code  + ");\n", writeTo);
        $code = $expr.code;
        $type = $expr.type;

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

compareStmt returns [StringBuilder code] : 
        KW_F '(' comp=comparison["a0"] ')'
        {
            String ifTrue = generateLabel("if_true");
            String ifEnd = generateLabel("if_end");
            
            // Start new code block for if statement
            StringBuilder ifCode = startCodeBlock();
            
            // Append comparison code
            ifCode.append($comp.code.toString());
            
            // Branch if false (0) to end (skip then block)
            emit(ifCode, "    beqz a0, " + ifEnd, true);
            emit(ifCode, ifTrue + ":", true);
        }
        thenBlock=blockStmt
        {
            StringBuilder currentBlock = getCurrentBlock();
        }
        (KW_LS
        {
            // Else clause exists
            String elseLabel = generateLabel("else");
            StringBuilder currentBlock = getCurrentBlock();
            
            // Jump to end of if (skip else)
            emit(currentBlock, "    j " + ifEnd, true);
            emit(currentBlock, elseLabel + ":", true);
        }
        elseBlock=blockStmt 
        {
            // End of else block
            StringBuilder currentBlock = getCurrentBlock();
            emit(currentBlock, ifEnd + ":", true);
            
            // End the code block and get the result
            $code = new StringBuilder(endCodeBlock());
        }
        )?
        {
            // Handle case with no else clause
            if ($code == null) {
                StringBuilder currentBlock = getCurrentBlock();
                emit(currentBlock, ifEnd + ":", true);
                
                // End the code block and get the result
                $code = new StringBuilder(endCodeBlock());
            }
        }
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
    stmt* KW_RTN factor["fa0"] SCOLN '}'
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
            //emit(" in.close();\n", writeTo);
            //emit("return " + $factor.code + "; \n", writeTo);  
        }

        //end scope
        scopeStack.pop();
        
        //reset string builder 
        writeTo = null;

        //clear list
        //scopeStack.peek().table.get($a.getText()).parameters = new ArrayList<>();
    } ; 

//Loop Statements
loopStmt returns [StringBuilder code] : 
    whl=whileLoop { $code = $whl.code; }
    | fr=forLoop { $code = $fr.code; }
    | dwhl=doWhileLoop { $code = $dwhl.code; }
    | brk=breakStmt { $code = $brk.code; };

//While loop - FIXED structure
whileLoop returns [StringBuilder code] : 
    KW_WHL 
    L_PRNTH 
    {
        String loopStart = generateLabel("while_start");
        String loopEnd = generateLabel("while_end");
        
        // Start a new code block for the loop
        StringBuilder loopCode = startCodeBlock();
        
        // Emit loop start label
        emit(loopCode, loopStart + ":", true);
        emit(loopCode, "    # While loop condition", true);
    }
    comp=comparison["a0"]
    {
        // Get the comparison code
        StringBuilder currentBlock = getCurrentBlock();
        currentBlock.append($comp.code.toString());
        
        // Branch if false (0) to end
        emit(currentBlock, "    beqz a0, " + loopEnd, true);
    }
    R_PRNTH 
    body=blockStmt
    {
        // Get the loop code block
        StringBuilder loopCode = getCurrentBlock();
        
        // Add jump back to start
        emit(loopCode, "    j " + loopStart, true);
        emit(loopCode, loopEnd + ":", true);
        emit(loopCode, "    # End while loop", true);
        
        // End the code block and get the result
        $code = new StringBuilder(endCodeBlock());
    }
    ;

// For loop - FIXED structure
forLoop returns [StringBuilder code] : 
    KW_FR 
    L_PRNTH
    {
        String loopStart = generateLabel("for_start");
        String loopCond = generateLabel("for_cond");
        String loopEnd = generateLabel("for_end");
        String loopIncr = generateLabel("for_incr");
        
        // Start a new code block for the for loop
        StringBuilder forCode = startCodeBlock();
    } 
    (init=assignStmt | SCOLN)    // initialization
    {
        StringBuilder currentBlock = getCurrentBlock();
        if ($init.code != null) {
            currentBlock.append($init.code.toString());
        }
        emit(currentBlock, "    j " + loopCond, true);
        emit(currentBlock, loopStart + ":", true);
        emit(currentBlock, "    # For loop body", true);
    }
    body=blockStmt
    {
        StringBuilder currentBlock = getCurrentBlock();
        emit(currentBlock, loopIncr + ":", true);
        emit(currentBlock, "    # Loop increment", true);
    }
    (incr=forLoopInc)?      // increment
    {
        StringBuilder currentBlock = getCurrentBlock();
        if ($incr.code != null) {
            currentBlock.append($incr.code.toString());
        }
        emit(currentBlock, "    # Jump to condition", true);
    }
    R_PRNTH 
    {
        StringBuilder currentBlock = getCurrentBlock();
        emit(currentBlock, loopCond + ":", true);
    }
    comp=comparison["a0"] SCOLN         // condition 
    {
        StringBuilder currentBlock = getCurrentBlock();
        currentBlock.append($comp.code.toString());
        emit(currentBlock, "    bnez a0, " + loopStart, true);
        emit(currentBlock, "    j " + loopEnd, true);
        emit(currentBlock, "    # Condition check done", true);
    }
    {
        StringBuilder currentBlock = getCurrentBlock();
        emit(currentBlock, loopEnd + ":", true);
        emit(currentBlock, "    # End for loop", true);
        
        // End the code block and get the result
        $code = new StringBuilder(endCodeBlock());
    }
    ;

// Do-While loop  
doWhileLoop returns [StringBuilder code] : 
    KW_D 
    {
        String loopStart = generateLabel("do_while_start");
        String loopEnd = generateLabel("do_while_end");
        
        // Start a new code block
        StringBuilder doWhileCode = startCodeBlock();
        
        emit(getCurrentBlock(), loopStart + ":", true);
        emit(getCurrentBlock(), "    # Do-while loop body", true);
    }
    body=blockStmt
    KW_WHL L_PRNTH comp=comparison["a0"] R_PRNTH SCOLN 
    {
        StringBuilder currentBlock = getCurrentBlock();
        currentBlock.append($comp.code.toString());
        
        // Check condition - if true (non-zero), loop back
        emit(currentBlock, "    bnez a0, " + loopStart, true);
        emit(currentBlock, loopEnd + ":", true);
        emit(currentBlock, "    # End do-while loop", true);
        
        // End the code block and get the result
        $code = new StringBuilder(endCodeBlock());
    }
    ;

// Break statement
breakStmt returns [StringBuilder code] : 
    KW_BRK SCOLN 
    {
        // TODO: Need to track which loop we're breaking from
        // For now, just generate a comment
        StringBuilder breakCode = new StringBuilder();
        emit(breakCode, "    # break statement - not yet implemented", true);
        $code = breakCode;
    }
    ;

comment :  CMMNT_LN | CMMNT_BLCK ; 
elseC : KW_LS blockStmt; 

// For loop increment options
forLoopInc returns [StringBuilder code] : 
    inc=assignStmt     // x = x + 1
    { 
        $code = $inc.code;
    }
    | DNT INC  // x++
    {
        // Generate x++ in RISC-V
        StringBuilder incCode = new StringBuilder();
        emit(incCode, "    # Increment " + $DNT.getText() + "++", true);
        
        // Load variable
        emit(incCode, "    la t0, IDX" + $DNT.getText(), true);
        emit(incCode, "    lw t1, 0(t0)", true);
        emit(incCode, "    addi t1, t1, 1", true);
        emit(incCode, "    sw t1, 0(t0)", true);
        
        $code = incCode;
    }
    | DNT DCR  // x--
    {
        // Generate x-- in RISC-V
        StringBuilder incCode = new StringBuilder();
        emit(incCode, "    # Decrement " + $DNT.getText() + "--", true);
        
        // Load variable
        emit(incCode, "    la t0, IDX" + $DNT.getText(), true);
        emit(incCode, "    lw t1, 0(t0)", true);
        emit(incCode, "    addi t1, t1, -1", true);
        emit(incCode, "    sw t1, 0(t0)", true);
        
        $code = incCode;
    }
    ;

expr[String register] returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, StringBuilder code, String finReg]: 
        a=factor [$register]
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
            $finReg = $a.finReg;
            
        }
    | b=comparisonExpr[$register]
        {
            $hasKnownValue = $b.hasKnownValue;
            $value = $b.value;
            $type = $b.type;
            $isArray = false;
            $is2DArray = false;
            $code = $b.code;
            $finReg = $b.finReg;
        };

comparison [String register] returns [boolean hasKnownValue, float value, StringBuilder code, String finReg] : 
    a=comparisonExpr [$register]
    {
        // comparisonExpr should put result (0 or 1) in $a.finReg
        // Copy to a0 for branching if needed
        $code = $a.code;
        
        if (!$a.finReg.equals("a0")) {
            // Move result to a0 for consistency
            $code.append("    mv a0, " + $a.finReg + "\n");
            $finReg = "a0";
        } else {
            $finReg = "a0";
        }
        
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
    };

comparisonExpr[String register] returns [boolean hasKnownValue, String type, float value, StringBuilder code, String finReg] : 
    a=additiveExpr[$register] 
    {  
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code; 
        $finReg = $a.finReg;
        //String nextRegister = ($register.equals("ft0")) ? "ft1" : "ft0";

    }  
    (op = (LSSTHN | GRTRTHN | LSSTHNREQL | GRTRTHNREQL | EQL | NTEQL) 
    {
        //assign new reg w every new op
        String nextRegister = getNewRegister($type);
        System.out.println((nextTotRegister) + " register");
    }
    b=additiveExpr [nextRegister]
    {  
        $code.append($b.code);

        //if ($b.hasKnownValue) {  
            String opType = $op.getText(); 
            if (opType.equals("<")) {  
                $value =  ($value < $b.value) ? 1 : 0; 

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    flt.d " + $finReg + ", ft1," + $b.finReg); // put back into int register
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    flt.d " + $b.finReg + ", " + $finReg + ", ft1"); // add float
                    $finReg  = $b.finReg; //update to int register
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    slt " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    flt.d " + diffReg + ", " + $finReg + ", " + $b.finReg );
                    $finReg = diffReg;
                }

                //emit($code, "    bgt " + $register + "," + $register + "," + nextRegister);
            } else if (opType.equals(">")) {  
                $value =  ($value > $b.value) ? 1 : 0;

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    flt.d " + $finReg + ", " + $b.finReg + ", ft1"); // put back into int register
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    flt.d " + $b.finReg + ", ft1, " + $finReg); // add float
                    $finReg  = $b.finReg; 
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    slt " + $finReg + ", " + $b.finReg + ", " + $finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    flt.d " + diffReg + ", " + $b.finReg + ", " + $finReg );
                    $finReg = diffReg;
                }

                //emit($code, "    blt " + $register + "," + $register + "," + nextRegister);
            } else if (opType.equals("==")) {  
                $value =  ($value == $b.value) ? 1 : 0;

                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    feq.d " + $finReg + ", ft1," + $b.finReg); // put back into int register
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    feq.d " + $b.finReg + ", " + $finReg + ", ft1"); // add float
                    $finReg  = $b.finReg; //update to int register
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    xor  t0, " + $finReg + ", " + $b.finReg );
                    emit($code, "    slti " + $finReg +", t0, 1");
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    feq.d " + diffReg + ", " + $finReg + ", " + $b.finReg );
                    $finReg = diffReg;
                }

                //emit($code, "    beq " + $register + "," + $register + "," + nextRegister);
            } else if (opType.equals("<=")) {  
                $value =  ($value <= $b.value) ? 1 : 0;

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    fle.d " + $finReg + ", ft1," + $b.finReg); // put back into int register
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    fle.d " + $b.finReg + ", " + $finReg + ", ft1"); // add float
                    $finReg  = $b.finReg; //update to int register
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    slt t1, " + $b.finReg + ", " + $finReg ); //a > b
                    emit($code, "    xori " + $finReg + ", t1, 1"); //invert so a <= b
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    fle.d " + diffReg + ", " + $finReg + ", " + $b.finReg );
                    $finReg = diffReg;
                }

                //emit($code, "    ble " + $register + "," + $register + "," + nextRegister);
            } else if (opType.equals(">=") ) {  
                $value =  ($value >= $b.value) ? 1 : 0;

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    fle.d " + $finReg + ", " + $b.finReg + ", ft1"); // put back into int register
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    fle.d " + $b.finReg + ", ft1, " + $finReg); // add float
                    $finReg  = $b.finReg; 
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    slt t1, " + $finReg + ", " + $b.finReg ); //a < b
                    emit($code, "    xori " + $finReg + ", t1, 1"); //invert so a >= b
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    fle.d " + diffReg + ", " + $b.finReg + ", " + $finReg );
                    $finReg = diffReg;
                }

                //emit($code, "    bge " + $register + "," + $register + "," + nextRegister);
            } else if (opType.equals("!=") ) {  
                $value =  ($value != $b.value) ? 1 : 0;

                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    feq.d " + $finReg + ", ft1," + $b.finReg); // put back into int register
                    emit($code, "    xori " + $finReg + ", " + $finReg + ", 1");
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    feq.d " + $b.finReg + ", " + $finReg + ", ft1"); // add float
                    emit($code, "    xori " + $b.finReg + ", " + $b.finReg + ", 1");
                    $finReg  = $b.finReg; //update to int register
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    xor  t0, " + $finReg + ", " + $b.finReg );
                    emit($code, "    slti " + $finReg +", t0, 1");
                    emit($code, "    xori " + $finReg + ", " + $finReg + ", 1");
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    String diffReg = getNewRegister("nt");
                    emit($code, "    feq.d " + diffReg + ", " + $finReg + ", " + $b.finReg );
                    emit($code, "    xori " + diffReg + ", " + diffReg + ", 1");
                    $finReg = diffReg;
                }

                //emit($code, "    bne " + $register + "," + $register + "," + nextRegister); 
            } else $value = 0;  
            $type = "bl";

            //$code = "(" + $a.code + $op.getText() + $b.code + ")"; 
        // } else {
        //     $hasKnownValue = false;
        //     $type = "bl";
        //     //$code = "(" + $a.code + $op.getText() + $b.code + ")";  
        // }
    })*;

additiveExpr[String register] returns [boolean hasKnownValue, String type, float value, StringBuilder code, String finReg] : 
    a=multiplicativeExpr [$register]
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code;
        $finReg = $a.finReg;
        //String nextRegister = getNewRegister($type);
    }
    (op=(PLS | MNS)
    {
        //assign new reg w every new op
        String nextRegister = getNewRegister($type);
        System.out.println((nextTotRegister) + " register");
    }
     b=multiplicativeExpr [nextRegister]
    {
        $code.append($b.code);
        //if ($hasKnownValue && $b.hasKnownValue) {
            if ($op.getText().equals("+")) {
                $value = $value + $b.value;
                
                // if($b.type.equals("flt") && $a.type.){
                //     $finReg = "fa" + nextRegister;
                // } else {
                //     $finReg = "a" + nextRegister;
                // }

                //System.out.println("type " + $type);

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    System.out.println("adding " + $a.value + " and " + $b.value);
                    emit($code, "    fcvt.d.w ft1, " +  $finReg);   // promote int
                    emit($code, "    fadd.d " + $b.finReg + ", " + $b.finReg + ", ft1"); // add float
                    $finReg = $b.finReg;
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w ft1, " + $b.finReg);   // promote int
                    emit($code, "    fadd.d " + $finReg + ", " + $finReg + ", ft1"); // add float
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    add " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    emit($code, "    fadd.d " + $finReg + ", " + $finReg + ", " + $b.finReg );
                }


            } else {
                $value = $value - $b.value;
                
                //System.out.println("type " + $type);

                //emit based on type 
                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    System.out.println("adding " + $a.value + " and " + $b.value);
                    emit($code, "    fcvt.d.w f0, " +  $finReg);   // promote int
                    emit($code, "    fsub.d " + $b.finReg + ", f0, " + $b.finReg); // add float
                    $finReg = $b.finReg;
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w f0, " + $b.finReg);   // promote int
                    emit($code, "    fsub.d " + $finReg + ", " + $finReg + ", f0"); // add float
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    sub " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    emit($code, "    fsub.d " + $finReg + ", " + $finReg + ", " + $b.finReg );
                }

                //emit($code, "    fsub.d " + $register + "," + $register + "," + nextRegister);
            }

            if ($type.equals("flt") || $b.type.equals("flt")) {
                $type = "flt";
                //$code = "" + $value;
            } else {
                $type = "nt";
                //$code = "" + (int)$value;
            }

            nextTotRegister --;
        // } else {
        //     $hasKnownValue = false;
        //     if ("flt".equals($a.type) || "flt".equals($b.type)) {
        //         $type = "flt";
        //     } else {
        //         $type = "nt";
        //     }
        //     //$code = "(" + $a.code + $op.getText() + $b.code + ")"; 
        // }

    })*
    {
        resetRegisters();
        System.out.println(nextTotRegister + " register");
    }
    ;

multiplicativeExpr [String register] returns [boolean hasKnownValue, String type, float value, StringBuilder code, String finReg]: 
    a=unaryExpr [$register]
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $code = $a.code;
        $finReg = $a.finReg;

        //String nextRegister = getNewRegister($a.type);
        
    }
    ( op=( TMS | DVD | MOD) 
    {
        //assign new reg w every new op
        String nextRegister = getNewRegister($type);
        System.out.println((nextTotRegister) + " register");
    }
    b=unaryExpr [nextRegister]
    {
        $code.append($b.code);

        if ($b.hasKnownValue && $op.getText().equals("/") && $b.value == 0) {
            error($op, "division by zero");
            $hasKnownValue = false; 
            //$code = "Error";
        } else {

            if ($op.getText().equals("*")) {
                $value = $value * $b.value;

                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    System.out.println("multiplying " + $a.value + " and " + $b.value);
                    emit($code, "    fcvt.d.w f0, " +  $finReg);   // promote int
                    emit($code, "    fmul.d " + $b.finReg + ", f0, " + $b.finReg); // add float
                    $finReg = $b.finReg;
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w f0, " + $b.finReg);   // promote int
                    emit($code, "    fmul.d " + $finReg + ", " + $finReg + ", f0"); // add float
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    mul " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    emit($code, "    fmul.d " + $finReg + ", " + $finReg + ", " + $b.finReg );
                }

                //emit($code, "    fmul.d " + $register + "," + $register + "," + nextRegister);
            } else if ($op.getText().equals("%")){
                $value = $value % $b.value;

                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    System.out.println("mod of " + $a.value + " by " + $b.value);
                    emit($code, "    fcvt.d.w f0, " +  $finReg);   // promote int
                    emit($code, "    frem.d " + $b.finReg + ", f0, " + $b.finReg); // add float
                    $finReg = $b.finReg;
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w f0, " + $b.finReg);   // promote int
                    emit($code, "    frem.d " + $finReg + ", " + $finReg + ", f0"); // add float
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    rem " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    emit($code, "    frem.d " + $finReg + ", " + $finReg + ", " + $b.finReg );
                }
                //emit($code, "    frem.d " + $register + "," + $register + "," + nextRegister);
            } else {
                $value = $value / $b.value;

                if ($type.equals("nt") && $b.type.equals("flt")) {
                    //error($op, "type mismatch: cannot add int and float"); //temporary
                    System.out.println("dividing " + $a.value + " by " + $b.value);
                    emit($code, "    fcvt.d.w f0, " +  $finReg);   // promote int
                    emit($code, "    fdiv.d " + $b.finReg + ", f0, " + $b.finReg); // add float
                    $finReg = $b.finReg;
                } else if ($type.equals("flt") && $b.type.equals("nt")) {
                    //error($op, "type mismatch: cannot add float and int"); //temporary
                    emit($code, "    fcvt.d.w f0, " + $b.finReg);   // promote int
                    emit($code, "    fdiv.d " + $finReg + ", " + $finReg + ", f0"); // add float
                } else if ($type.equals("nt") && $b.type.equals("nt")) {
                    emit($code, "    div " + $finReg + ", " + $finReg + ", " + $b.finReg );
                } else if ($type.equals("flt") && $b.type.equals("flt")) {
                    emit($code, "    fdiv.d " + $finReg + ", " + $finReg + ", " + $b.finReg );
                }
                //emit($code, "    fdiv.d " + $register + "," + $register + "," + nextRegister);
            }
        } 

        //System.out.println(nextTotRegister + " register " + $op.getText());

        if ("flt".equals($a.type) || "flt".equals($b.type)) {
            $type = "flt";
            //$code = "" + $value;
        } else {
            $type = "nt";
            //$code = "" + (int)$value;
        }
        nextTotRegister --;
    })*
    {
        //resetRegisters();
        System.out.println(nextTotRegister + " register");
    }
    ;

unaryExpr [String register] returns [boolean hasKnownValue, String type, float value, StringBuilder code, String finReg]: 
     op=('+' | '-' | '!')? a=factor [$register] 
    {
        $hasKnownValue = $a.hasKnownValue;
        $value = $a.value;
        $type = $a.type;
        $finReg = $a.finReg;

        try {
        if($op.getText().equals("-")){
            $value = -$a.value;
            emit($code, "    neg " + $a.finReg + "," + $a.finReg);
        }
        } catch (Exception e) {
            // No unary operator present
        }

        $code = $a.code;
    }; 

factor [String register] returns [boolean hasKnownValue, String type, float value, String content, boolean isArray, boolean is2DArray, List<Object> arrayValues, List<List<Object>> array2DValues, StringBuilder code, String finReg]: 
      NT 
        {   $hasKnownValue = true; 
            $value = Integer.parseInt($NT.getText()); 
            $type = "nt";
            $isArray = false;
            $is2DArray = false;
            //code = ""+(int)$value;
            int val = Integer.parseInt($NT.getText());

            if($register.equals("unk")){
                $register = "a0"; //default register
            } else if ($register.equals("ft0")){
                $register = "a0"; //default float register
            } else if ($register.equals("ft1")){
                $register = "a0"; //default float register
            } else if ($register.equals("fa0")){
                $register = "a0"; //default float register
            } else if ($register.equals("fa1")){
                $register = "a0"; //default float register
            } else if ($register.equals("1") || $register.equals("2") || $register.equals("3") || $register.equals("4") || $register.equals("5") || $register.equals("6") || $register.equals("7")){
                $register = "a" + $register; //default register
            }

            $finReg = $register;

            $code = generateIntConstant($finReg, val);

        }
    | FLT 
        {   $hasKnownValue = true; 
            $value = Float.parseFloat($FLT.getText()); 
            $type = "flt";
            $isArray = false;
            $is2DArray = false;
            //code = $FLT.getText() + "f";
            double val = Double.parseDouble($FLT.getText());

            if($register.equals("unk")){
                $register = "fa0"; //default register
            } else if ($register.equals("a0")){
                $register = "fa0"; //default float register
            } else if ($register.equals("a1")){
                $register = "fa0"; //default float register
            } else if ($register.equals("1") || $register.equals("2") || $register.equals("3") || $register.equals("4") || $register.equals("5") || $register.equals("6") || $register.equals("7")){
                $register = "fa" + $register; //default register
            }

            $finReg = $register;

            $code = generateDoubleConstant($finReg, val);
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
            //$code = ""+(int)$value;
            int val = Integer.parseInt($BL.getText());

            if($register.equals("unk")){
                $register = "a0"; //default register
            }

            $finReg = $register;
            $code = generateBoolConstant($finReg, (int) $value);
        }
    | CHR
        {   $hasKnownValue = true; 
            $content = $CHR.getText();
            $type = "chr";
            $isArray = false;
            $is2DArray = false;
            //$code = ""+$content;
            char val = $content.charAt(1); // Extract the character between the single quotes

            if($register.equals("unk")){
                $register = "a0"; //default register
            }

            $finReg = $register;
            $code = generateCharConstant($finReg, val);
        }
    | STRNG 
        {   $hasKnownValue = true; 
            $content = $STRNG.getText();
            $type = "strng";
            $isArray = false;
            $is2DArray = false;
            //$code = ""+$content;
            String val = $content.substring(1, $content.length() - 1); // Remove the surrounding double quotes

            if($register.equals("unk")){
                $register = "a0"; //default register
            }

            $finReg = $register;
            $code = generateStringConstant($finReg, val);
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

            if($register.equals("unk")){
                if($type.equals("flt")){
                    $register = "fa0"; //default float register
                } else {
                    $register = "a0"; //default register
                }
            } else if ($register.equals("ft0")){
                if($type.equals("flt")){
                    $register = "fa0"; //default float register
                } else {
                    $register = "a0"; //default register
                }
            } else if ($register.equals("ft1")){
                if($type.equals("flt")){
                    $register = "fa1"; //default float register
                } else {
                    $register = "a0"; //default register
                }
            } else if ($register.equals("fa0")){
                if(!$type.equals("flt")){
                    $register = "a0"; //default register
                }
            } else if ($register.equals("fa1")){
                if(!$type.equals("flt")){
                    $register = "a0"; //default register
                }
            } else if ($register.equals("a0")){
                if($type.equals("flt")){
                    $register = "fa0"; //default float register
                }
            } else if ($register.equals("a1")){
                if($type.equals("flt")){
                    $register = "fa0"; //default float register
                }
            } else if ($register.equals("1") || $register.equals("2") || $register.equals("3") || $register.equals("4") || $register.equals("5") || $register.equals("6") || $register.equals("7")){
                if($type.equals("flt")){
                    $register = "fa" + $register; //default float register
                } else {
                    $register = "a" + $register; //default register
                }
            }

            $finReg = $register;
            $code = generateLoadId($finReg, id);
        }
    | arrayAccess
        {
            $hasKnownValue = $arrayAccess.hasKnownValue;
            $type = $arrayAccess.type;
            $value = $arrayAccess.value;
            $content = $arrayAccess.content;
            $isArray = false;
            $is2DArray = false;
            //$code = $arrayAccess.code;
        }
    | '(' expr[$register] ')'
        { 
            $hasKnownValue = $expr.hasKnownValue;
            $value = $expr.value;
            $content = $expr.content;
            $type = $expr.type;
            $isArray = $expr.isArray;
            $is2DArray = $expr.is2DArray;
            $arrayValues = $expr.arrayValues;
            $array2DValues = $expr.array2DValues;
            $code = $expr.code ;
            $finReg = $expr.finReg;
        }
    | functCall
        {
            $hasKnownValue = $functCall.hasKnownValue;
            $value = $functCall.value;
            $type = $functCall.type;
            $content = $functCall.content;
            $isArray = false;
            $is2DArray = false;
            // if($functCall.type.equals("strng") || $functCall.type.equals("chr")){
            //     $code = "" + $content;
            // } else $code = "" + $value;
            //$code = $functCall.code;
            
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
       // $type = currentId.type != null ? currentId.type : "null";
        $value = currentId.value;
        $content = currentId.content;
        
        //$code = id + "(";

        // init param counter
        int paramCount = 0;
    }
    ( p=expr["fa0"] // Allows expressions like 'mid + 1'
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

                    //$code += $p.code;

                } else {
                    error($p.start, "The input parameter type '" + $p.type + "' is not the same as parameter type '" + inputPar.type + "'");
                }
            } else {
                error($DNT, "Too many parameters for function '" + $DNT.getText() + "'");
            }
        }
        paramCount ++;
      }
      ( ',' p=expr["fa0"] // Allows subsequent expressions
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
                error($DNT, "Too many parameters for function '" + $DNT.getText() + "'");
            }

            paramCount ++;
            
            $code += ", " + $p.code;
        }
      )*
    )? ')'
    {
        
        if (paramCount < currentId.parameters.size()){
            error($DNT, "Function is missing parameters.");
        } else if (paramCount > currentId.parameters.size()){
            // Error is handled in the loops above, but keep for defensive coding.
        }

        // set return values from the function entry (dummy or real)
        $value = currentId.value;
        $type = currentId.type != null ? currentId.type : "null";
        $content = currentId.content;
        $hasKnownValue = currentId.hasKnown;
        
        $code += ")";
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
    id=DNT L_SQBR e1=expr["fa0"] R_SQBR                 // 1D (e1 is the index)
    {
        // Set context fields
        $arrayName = $id.getText();
        $arrayCtx = $id; // FIXED: Removed illegal .start property
        //$indexCode = $e1.code;
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
| id=DNT L_SQBR e2=expr["fa0"] R_SQBR L_SQBR e3=expr["fa0"] R_SQBR    // 2D (e2, e3 are indices)
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