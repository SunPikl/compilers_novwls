// Generated from c:/Users/Morgan/Downloads/fall_25/Compilers/compilers_novwls/NoVwls.g4 by ANTLR 4.13.1
 import java.util.*; import java.io.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NoVwlsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, KW_PRNT=2, KW_SCN_NTGR=3, KW_SCN_FLT=4, KW_SCN_STRNG=5, KW_SCN_CHR=6, 
		KW_SCN_BL=7, KW_FNCTN=8, KW_F=9, KW_LS=10, KW_FR=11, KW_WHL=12, KW_D=13, 
		KW_RTN=14, KW_BRK=15, NT=16, KW_NT=17, FLT=18, KW_FLT=19, BL=20, KW_BL=21, 
		CHR=22, KW_CHR=23, STRNG=24, KW_STRNG=25, KW_VD=26, KW_RRY=27, L_PRNTH=28, 
		R_PRNTH=29, L_CRLYB=30, R_CRLYB=31, SSGN=32, PLS=33, MNS=34, DVD=35, TMS=36, 
		MOD=37, LSSTHN=38, GRTRTHN=39, LSSTHNREQL=40, GRTRTHNREQL=41, EQL=42, 
		NTEQL=43, SCOLN=44, CMM=45, L_SQBR=46, R_SQBR=47, INC=48, DCR=49, CMMNT_LN=50, 
		CMMNT_BLCK=51, DNT=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "KW_PRNT", "KW_SCN_NTGR", "KW_SCN_FLT", "KW_SCN_STRNG", "KW_SCN_CHR", 
			"KW_SCN_BL", "KW_FNCTN", "KW_F", "KW_LS", "KW_FR", "KW_WHL", "KW_D", 
			"KW_RTN", "KW_BRK", "NT", "KW_NT", "FLT", "KW_FLT", "BL", "KW_BL", "CHR", 
			"KW_CHR", "STRNG", "KW_STRNG", "KW_VD", "KW_RRY", "L_PRNTH", "R_PRNTH", 
			"L_CRLYB", "R_CRLYB", "SSGN", "PLS", "MNS", "DVD", "TMS", "MOD", "LSSTHN", 
			"GRTRTHN", "LSSTHNREQL", "GRTRTHNREQL", "EQL", "NTEQL", "SCOLN", "CMM", 
			"L_SQBR", "R_SQBR", "INC", "DCR", "CMMNT_LN", "CMMNT_BLCK", "DNT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'prnt'", "'scnNT'", "'scnFLT'", "'scnSTRNG'", "'scnCHR'", 
			"'scnBL'", "'Fnctn'", "'f'", "'ls'", "'fr'", "'whl'", "'d'", "'rtn'", 
			"'brk'", null, "'nt'", null, "'flt'", null, "'bl'", null, "'chr'", null, 
			"'strng'", "'vd'", "'rry'", "'('", "')'", "'{'", "'}'", "'='", "'+'", 
			"'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"';'", "','", "'['", "']'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "KW_PRNT", "KW_SCN_NTGR", "KW_SCN_FLT", "KW_SCN_STRNG", "KW_SCN_CHR", 
			"KW_SCN_BL", "KW_FNCTN", "KW_F", "KW_LS", "KW_FR", "KW_WHL", "KW_D", 
			"KW_RTN", "KW_BRK", "NT", "KW_NT", "FLT", "KW_FLT", "BL", "KW_BL", "CHR", 
			"KW_CHR", "STRNG", "KW_STRNG", "KW_VD", "KW_RRY", "L_PRNTH", "R_PRNTH", 
			"L_CRLYB", "R_CRLYB", "SSGN", "PLS", "MNS", "DVD", "TMS", "MOD", "LSSTHN", 
			"GRTRTHN", "LSSTHNREQL", "GRTRTHNREQL", "EQL", "NTEQL", "SCOLN", "CMM", 
			"L_SQBR", "R_SQBR", "INC", "DCR", "CMMNT_LN", "CMMNT_BLCK", "DNT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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
	    StringBuilder function_sb = new StringBuilder();

	    void emit(StringBuilder sb, String s, boolean newLine) { 
	        sb.append(s);
	        if (newLine) { sb.append("\n"); }
	    }
	    void emit(StringBuilder sb, String s) { emit(sb, s, true); }
	    void data_emit(String s) { emit(data_sb, s); }
	    void text_emit(String s) { emit(text_sb, s); } 
	    void function_emit(String s) { emit(function_sb, s); }

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
	    data_emit("  input_buffer: .space 128 #store string to load");

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
	                //emit(" )  \n", null);

	                //open scanner
	                //emit(" Scanner in = new Scanner(System.in);\n", null);

	                //emit content
	                //emit(object.storeFunct.toString(), null);

	                //finish
	                //emit("\n", null);
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
	        data_emit(label + ":    .byte '" + x + "'");
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
	                    data_emit(label + ":    .word 0"); 
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
	        emit(code, "    la " + register + "," + label); 
	        emit(code, "    ");
	        return code;
	    }

	    StringBuilder generateCharConstant(String register, char value) {
	        StringBuilder code = new StringBuilder();
	        String label = addCharValue(value);
	        emit(code, "    # Loading constant " + value + " into register " + register); 
	        emit(code, "    la " + "t0," + label); 
	        emit(code, "    sb " + register + ", 0(t0)");
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
	            emit(code, "    mv  " + register + ",a0");
	        }
	    }

	    void generateReadString(StringBuilder code, String register) {
	        emit(code, "    la    a0, input_buffer");
	        emit(code, "    li    a1, 128");
	        emit(code, "    li    a7, 8");  // a7=8 is for reading strings
	        emit(code, "    ecall");        // invoke the system call
	        if (!register.equals("a0")) {
	            // Transfer the results over to register from a0.
	            emit(code, "    mv  " + register + ",a0");
	        }
	    }

	    void generateReadChar(StringBuilder code, String register) {
	        emit(code, "    li    a7, 11");  // a7=11 is for reading chars
	        emit(code, "    ecall");        // invoke the system call
	        if (!register.equals("a0")) {
	            // Transfer the results over to register from a0.
	            emit(code, "    mv  " + register + ",a0");
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
	        // emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
	        // emit(code, "    li    a7, 11"); // a7=11 is for printing a character
	        // emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    ");
	    }

	    void generatePrintInt(StringBuilder code, String register) {
	        if (!register.equals("a0")) {
	            // Need to transfer the value in register to fa0
	            //    e.g. fmv.d fa0, fa1   fa0 = fa1
	            emit(code, "    mv a0," + register);
	        }
	        emit(code, "    # Emitting print int"); 
	        emit(code, "    li    a7, 1");  // a7=1 is for printing doubles
	        emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
	        // emit(code, "    li    a7, 11"); // a7=11 is for printing a character
	        // emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    ");
	    }

	    void generatePrintString(StringBuilder code, String register) {
	        if(!register.equals("a0")) {
	            // Need to transfer the value in register to fa0
	            //    e.g. fmv.d fa0, fa1   fa0 = fa1
	            emit(code, "    mv a0," + register);
	        }
	        emit(code, "    # Emitting print string"); 
	        emit(code, "    li    a7, 4");  // a7=4 is for printing strings
	        emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
	        // emit(code, "    li    a7, 11"); // a7=11 is for printing a character
	        // emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    ");
	    }

	    void generatePrintChar(StringBuilder code, String register) {
	        if (!register.equals("a0")) {
	            // Need to transfer the value in register to fa0
	            //    e.g. fmv.d fa0, fa1   fa0 = fa1
	            emit(code, "    mv a0," + register);
	        }
	        emit(code, "    # Emitting print char"); 
	        emit(code, "    li    a7, 4");  // a7=4 is for printing chars
	        emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
	        // emit(code, "    li    a7, 11"); // a7=11 is for printing a character
	        // emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    ");
	    }

	    void generatePrintBool(StringBuilder code, String register) {
	        if (!register.equals("a0")) {
	            // Need to transfer the value in register to fa0
	            //    e.g. fmv.d fa0, fa1   fa0 = fa1
	            emit(code, "     mv  a0," + register);
	        }
	        System.out.println("printing bool");
	        emit(code, "    # Emitting print bool"); 
	        emit(code, "    li    a7, 1");  // a7=5 is for printing bool values
	        emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    li    a0, 10"); // ASCII 10 is \n (newline)
	        // emit(code, "    li    a7, 11"); // a7=11 is for printing a character
	        // emit(code, "    ecall");        // invoke the system call
	        // emit(code, "    ");
	    }

	    /// Write the generated Java to file.
	    void writeFile() {
	        try (PrintWriter pw = new PrintWriter(ASSEMBLY_FILE, "UTF-8")) {
	            pw.print(data_sb.toString());
	            pw.print(text_sb.toString());
	            pw.print(function_sb.toString());
	        } catch (Exception e) {
	            System.err.println("error: failed to write to " + ASSEMBLY_FILE + ": " + e.getMessage());
	        }
	    }


	public NoVwlsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NoVwls.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00005\u0171\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b4\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b8\b"+
		"\u000f\n\u000f\f\u000f\u00bb\t\u000f\u0003\u000f\u00bd\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c9\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00ce\b\u0011\n\u0011\f\u0011\u00d1"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d6\b\u0011"+
		"\n\u0011\f\u0011\u00d9\t\u0011\u0001\u0011\u0003\u0011\u00dc\b\u0011\u0001"+
		"\u0011\u0005\u0011\u00df\b\u0011\n\u0011\f\u0011\u00e2\t\u0011\u0003\u0011"+
		"\u00e4\b\u0011\u0003\u0011\u00e6\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f6\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0105\b\u0017\n\u0017\f\u0017"+
		"\u0108\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00051\u014f\b1\n1"+
		"\f1\u0152\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u015a\b"+
		"2\n2\f2\u015d\t2\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0005"+
		"3\u0166\b3\n3\f3\u0169\t3\u00014\u00044\u016c\b4\u000b4\f4\u016d\u0001"+
		"4\u00014\u0001\u015b\u00005\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5\u0001\u0000"+
		"\b\u0001\u000019\u0001\u000009\u0003\u000009AZaz\u0002\u0000\"\"\\\\\u0002"+
		"\u0000\n\n\r\r\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r"+
		"  \u0182\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O"+
		"\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000"+
		"\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000"+
		"\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000"+
		"\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0001k"+
		"\u0001\u0000\u0000\u0000\u0003m\u0001\u0000\u0000\u0000\u0005r\u0001\u0000"+
		"\u0000\u0000\u0007x\u0001\u0000\u0000\u0000\t\u007f\u0001\u0000\u0000"+
		"\u0000\u000b\u0088\u0001\u0000\u0000\u0000\r\u008f\u0001\u0000\u0000\u0000"+
		"\u000f\u0095\u0001\u0000\u0000\u0000\u0011\u009b\u0001\u0000\u0000\u0000"+
		"\u0013\u009d\u0001\u0000\u0000\u0000\u0015\u00a0\u0001\u0000\u0000\u0000"+
		"\u0017\u00a3\u0001\u0000\u0000\u0000\u0019\u00a7\u0001\u0000\u0000\u0000"+
		"\u001b\u00a9\u0001\u0000\u0000\u0000\u001d\u00ad\u0001\u0000\u0000\u0000"+
		"\u001f\u00bc\u0001\u0000\u0000\u0000!\u00be\u0001\u0000\u0000\u0000#\u00c2"+
		"\u0001\u0000\u0000\u0000%\u00e7\u0001\u0000\u0000\u0000\'\u00f5\u0001"+
		"\u0000\u0000\u0000)\u00f7\u0001\u0000\u0000\u0000+\u00fa\u0001\u0000\u0000"+
		"\u0000-\u00fe\u0001\u0000\u0000\u0000/\u0102\u0001\u0000\u0000\u00001"+
		"\u010b\u0001\u0000\u0000\u00003\u0111\u0001\u0000\u0000\u00005\u0114\u0001"+
		"\u0000\u0000\u00007\u0118\u0001\u0000\u0000\u00009\u011a\u0001\u0000\u0000"+
		"\u0000;\u011c\u0001\u0000\u0000\u0000=\u011e\u0001\u0000\u0000\u0000?"+
		"\u0120\u0001\u0000\u0000\u0000A\u0122\u0001\u0000\u0000\u0000C\u0124\u0001"+
		"\u0000\u0000\u0000E\u0126\u0001\u0000\u0000\u0000G\u0128\u0001\u0000\u0000"+
		"\u0000I\u012a\u0001\u0000\u0000\u0000K\u012c\u0001\u0000\u0000\u0000M"+
		"\u012e\u0001\u0000\u0000\u0000O\u0130\u0001\u0000\u0000\u0000Q\u0133\u0001"+
		"\u0000\u0000\u0000S\u0136\u0001\u0000\u0000\u0000U\u0139\u0001\u0000\u0000"+
		"\u0000W\u013c\u0001\u0000\u0000\u0000Y\u013e\u0001\u0000\u0000\u0000["+
		"\u0140\u0001\u0000\u0000\u0000]\u0142\u0001\u0000\u0000\u0000_\u0144\u0001"+
		"\u0000\u0000\u0000a\u0147\u0001\u0000\u0000\u0000c\u014a\u0001\u0000\u0000"+
		"\u0000e\u0155\u0001\u0000\u0000\u0000g\u0163\u0001\u0000\u0000\u0000i"+
		"\u016b\u0001\u0000\u0000\u0000kl\u0005!\u0000\u0000l\u0002\u0001\u0000"+
		"\u0000\u0000mn\u0005p\u0000\u0000no\u0005r\u0000\u0000op\u0005n\u0000"+
		"\u0000pq\u0005t\u0000\u0000q\u0004\u0001\u0000\u0000\u0000rs\u0005s\u0000"+
		"\u0000st\u0005c\u0000\u0000tu\u0005n\u0000\u0000uv\u0005N\u0000\u0000"+
		"vw\u0005T\u0000\u0000w\u0006\u0001\u0000\u0000\u0000xy\u0005s\u0000\u0000"+
		"yz\u0005c\u0000\u0000z{\u0005n\u0000\u0000{|\u0005F\u0000\u0000|}\u0005"+
		"L\u0000\u0000}~\u0005T\u0000\u0000~\b\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005s\u0000\u0000\u0080\u0081\u0005c\u0000\u0000\u0081\u0082\u0005n"+
		"\u0000\u0000\u0082\u0083\u0005S\u0000\u0000\u0083\u0084\u0005T\u0000\u0000"+
		"\u0084\u0085\u0005R\u0000\u0000\u0085\u0086\u0005N\u0000\u0000\u0086\u0087"+
		"\u0005G\u0000\u0000\u0087\n\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"s\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u008b\u0005n\u0000"+
		"\u0000\u008b\u008c\u0005C\u0000\u0000\u008c\u008d\u0005H\u0000\u0000\u008d"+
		"\u008e\u0005R\u0000\u0000\u008e\f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005s\u0000\u0000\u0090\u0091\u0005c\u0000\u0000\u0091\u0092\u0005n"+
		"\u0000\u0000\u0092\u0093\u0005B\u0000\u0000\u0093\u0094\u0005L\u0000\u0000"+
		"\u0094\u000e\u0001\u0000\u0000\u0000\u0095\u0096\u0005F\u0000\u0000\u0096"+
		"\u0097\u0005n\u0000\u0000\u0097\u0098\u0005c\u0000\u0000\u0098\u0099\u0005"+
		"t\u0000\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u0010\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005f\u0000\u0000\u009c\u0012\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005l\u0000\u0000\u009e\u009f\u0005s\u0000\u0000\u009f\u0014"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005f\u0000\u0000\u00a1\u00a2\u0005"+
		"r\u0000\u0000\u00a2\u0016\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005w\u0000"+
		"\u0000\u00a4\u00a5\u0005h\u0000\u0000\u00a5\u00a6\u0005l\u0000\u0000\u00a6"+
		"\u0018\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u001a"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005"+
		"t\u0000\u0000\u00ab\u00ac\u0005n\u0000\u0000\u00ac\u001c\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005b\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af"+
		"\u00b0\u0005k\u0000\u0000\u00b0\u001e\u0001\u0000\u0000\u0000\u00b1\u00bd"+
		"\u00050\u0000\u0000\u00b2\u00b4\u0005-\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0007\u0000\u0000\u0000\u00b6\u00b8\u0007\u0001"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b1\u0001\u0000\u0000\u0000\u00bc\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bd \u0001\u0000\u0000\u0000\u00be\u00bf\u0005n\u0000\u0000"+
		"\u00bf\u00c0\u0005t\u0000\u0000\u00c0\"\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0005-\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00e5\u0001\u0000\u0000\u0000\u00c4\u00c9"+
		"\u00050\u0000\u0000\u00c5\u00c6\u00050\u0000\u0000\u00c6\u00c7\u0005."+
		"\u0000\u0000\u00c7\u00c9\u00050\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u00050\u0000\u0000\u00cb\u00cf\u0005.\u0000\u0000\u00cc"+
		"\u00ce\u0007\u0001\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00e4\u0007\u0000\u0000\u0000\u00d3"+
		"\u00d7\u0007\u0000\u0000\u0000\u00d4\u00d6\u0007\u0001\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0005.\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00e0\u0001\u0000\u0000\u0000\u00dd\u00df"+
		"\u0007\u0001\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00ca\u0001\u0000\u0000\u0000\u00e3\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6$\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005f\u0000\u0000\u00e8\u00e9\u0005l\u0000"+
		"\u0000\u00e9\u00ea\u0005t\u0000\u0000\u00ea&\u0001\u0000\u0000\u0000\u00eb"+
		"\u00f6\u000201\u0000\u00ec\u00ed\u0005f\u0000\u0000\u00ed\u00ee\u0005"+
		"a\u0000\u0000\u00ee\u00ef\u0005l\u0000\u0000\u00ef\u00f0\u0005s\u0000"+
		"\u0000\u00f0\u00f6\u0005e\u0000\u0000\u00f1\u00f2\u0005t\u0000\u0000\u00f2"+
		"\u00f3\u0005r\u0000\u0000\u00f3\u00f4\u0005u\u0000\u0000\u00f4\u00f6\u0005"+
		"e\u0000\u0000\u00f5\u00eb\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6(\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005b\u0000\u0000\u00f8\u00f9\u0005l\u0000\u0000\u00f9"+
		"*\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\'\u0000\u0000\u00fb\u00fc"+
		"\u0007\u0002\u0000\u0000\u00fc\u00fd\u0005\'\u0000\u0000\u00fd,\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005c\u0000\u0000\u00ff\u0100\u0005h\u0000"+
		"\u0000\u0100\u0101\u0005r\u0000\u0000\u0101.\u0001\u0000\u0000\u0000\u0102"+
		"\u0106\u0005\"\u0000\u0000\u0103\u0105\b\u0003\u0000\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005\"\u0000\u0000\u010a0\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"s\u0000\u0000\u010c\u010d\u0005t\u0000\u0000\u010d\u010e\u0005r\u0000"+
		"\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005g\u0000\u0000\u0110"+
		"2\u0001\u0000\u0000\u0000\u0111\u0112\u0005v\u0000\u0000\u0112\u0113\u0005"+
		"d\u0000\u0000\u01134\u0001\u0000\u0000\u0000\u0114\u0115\u0005r\u0000"+
		"\u0000\u0115\u0116\u0005r\u0000\u0000\u0116\u0117\u0005y\u0000\u0000\u0117"+
		"6\u0001\u0000\u0000\u0000\u0118\u0119\u0005(\u0000\u0000\u01198\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005)\u0000\u0000\u011b:\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005{\u0000\u0000\u011d<\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005}\u0000\u0000\u011f>\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"=\u0000\u0000\u0121@\u0001\u0000\u0000\u0000\u0122\u0123\u0005+\u0000"+
		"\u0000\u0123B\u0001\u0000\u0000\u0000\u0124\u0125\u0005-\u0000\u0000\u0125"+
		"D\u0001\u0000\u0000\u0000\u0126\u0127\u0005/\u0000\u0000\u0127F\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005*\u0000\u0000\u0129H\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005%\u0000\u0000\u012bJ\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005<\u0000\u0000\u012dL\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		">\u0000\u0000\u012fN\u0001\u0000\u0000\u0000\u0130\u0131\u0005<\u0000"+
		"\u0000\u0131\u0132\u0005=\u0000\u0000\u0132P\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005>\u0000\u0000\u0134\u0135\u0005=\u0000\u0000\u0135R\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005=\u0000\u0000\u0137\u0138\u0005=\u0000"+
		"\u0000\u0138T\u0001\u0000\u0000\u0000\u0139\u013a\u0005!\u0000\u0000\u013a"+
		"\u013b\u0005=\u0000\u0000\u013bV\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		";\u0000\u0000\u013dX\u0001\u0000\u0000\u0000\u013e\u013f\u0005,\u0000"+
		"\u0000\u013fZ\u0001\u0000\u0000\u0000\u0140\u0141\u0005[\u0000\u0000\u0141"+
		"\\\u0001\u0000\u0000\u0000\u0142\u0143\u0005]\u0000\u0000\u0143^\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005+\u0000\u0000\u0145\u0146\u0005+\u0000"+
		"\u0000\u0146`\u0001\u0000\u0000\u0000\u0147\u0148\u0005-\u0000\u0000\u0148"+
		"\u0149\u0005-\u0000\u0000\u0149b\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"/\u0000\u0000\u014b\u014c\u0005/\u0000\u0000\u014c\u0150\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\b\u0004\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u00061\u0000\u0000\u0154"+
		"d\u0001\u0000\u0000\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u0157\u0005"+
		"*\u0000\u0000\u0157\u015b\u0001\u0000\u0000\u0000\u0158\u015a\t\u0000"+
		"\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015f\u0160\u0005/\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u00062\u0000\u0000\u0162"+
		"f\u0001\u0000\u0000\u0000\u0163\u0167\u0007\u0005\u0000\u0000\u0164\u0166"+
		"\u0007\u0006\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168h\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0007\u0007\u0000\u0000\u016b\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u00064\u0000\u0000\u0170j\u0001\u0000\u0000"+
		"\u0000\u0012\u0000\u00b3\u00b9\u00bc\u00c2\u00c8\u00cf\u00d7\u00db\u00e0"+
		"\u00e3\u00e5\u00f5\u0106\u0150\u015b\u0167\u016d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}