// Generated from c:/Users/Morgan/Downloads/fall_25/Compilers/compilers_novwls/NoVwls.g4 by ANTLR 4.13.1
 import java.util.*; import java.io.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NoVwlsParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_blockStmt = 2, RULE_arrayDeclWithSize = 3, 
		RULE_declareStmt = 4, RULE_assignStmt = 5, RULE_rhs = 6, RULE_arrayAssignStmt = 7, 
		RULE_arrayLiteral = 8, RULE_arrayElement = 9, RULE_printStmt = 10, RULE_printExpr = 11, 
		RULE_compareStmt = 12, RULE_functStmt = 13, RULE_loopStmt = 14, RULE_whileLoop = 15, 
		RULE_forLoop = 16, RULE_doWhileLoop = 17, RULE_breakStmt = 18, RULE_comment = 19, 
		RULE_elseC = 20, RULE_forLoopInc = 21, RULE_expr = 22, RULE_comparison = 23, 
		RULE_comparisonExpr = 24, RULE_additiveExpr = 25, RULE_multiplicativeExpr = 26, 
		RULE_unaryExpr = 27, RULE_factor = 28, RULE_functCall = 29, RULE_functDefine = 30, 
		RULE_dataType = 31, RULE_primitiveDT = 32, RULE_arrayDT = 33, RULE_arrayAccess = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "blockStmt", "arrayDeclWithSize", "declareStmt", "assignStmt", 
			"rhs", "arrayAssignStmt", "arrayLiteral", "arrayElement", "printStmt", 
			"printExpr", "compareStmt", "functStmt", "loopStmt", "whileLoop", "forLoop", 
			"doWhileLoop", "breakStmt", "comment", "elseC", "forLoopInc", "expr", 
			"comparison", "comparisonExpr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "factor", "functCall", "functDefine", "dataType", "primitiveDT", 
			"arrayDT", "arrayAccess"
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

	@Override
	public String getGrammarFileName() { return "NoVwls.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public NoVwlsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StmtContext stmt;
		public TerminalNode EOF() { return getToken(NoVwlsParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        scopeStack.push(mainTable);
			        openProgram();
			    
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881300466383620L) != 0)) {
				{
				{
				setState(71);
				((ProgramContext)_localctx).stmt = stmt();

				        text_sb.append(((ProgramContext)_localctx).stmt.code);
				    
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
			 
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
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StringBuilder code;
		public AssignStmtContext assignStmt;
		public PrintStmtContext printStmt;
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public ArrayAssignStmtContext arrayAssignStmt() {
			return getRuleContext(ArrayAssignStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public CompareStmtContext compareStmt() {
			return getRuleContext(CompareStmtContext.class,0);
		}
		public FunctStmtContext functStmt() {
			return getRuleContext(FunctStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public FunctCallContext functCall() {
			return getRuleContext(FunctCallContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public FunctDefineContext functDefine() {
			return getRuleContext(FunctDefineContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ArrayDeclWithSizeContext arrayDeclWithSize() {
			return getRuleContext(ArrayDeclWithSizeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				blockStmt();
				 ((StmtContext)_localctx).code =  new StringBuilder(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((StmtContext)_localctx).assignStmt = assignStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).assignStmt.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				declareStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				arrayAssignStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				((StmtContext)_localctx).printStmt = printStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).printStmt.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				compareStmt();
				 ((StmtContext)_localctx).code =  new StringBuilder(); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				functStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				loopStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				breakStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				functCall();
				setState(100);
				match(SCOLN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				functDefine();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(103);
				comment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(104);
				arrayDeclWithSize();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(L_CRLYB);
			 scopeStack.push(new SymbolTable()); 
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881300466383620L) != 0)) {
				{
				{
				setState(109);
				stmt();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(R_CRLYB);
			 scopeStack.pop(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclWithSizeContext extends ParserRuleContext {
		public PrimitiveDTContext dt;
		public Token id;
		public AdditiveExprContext size;
		public TerminalNode L_SQBR() { return getToken(NoVwlsParser.L_SQBR, 0); }
		public TerminalNode R_SQBR() { return getToken(NoVwlsParser.R_SQBR, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public PrimitiveDTContext primitiveDT() {
			return getRuleContext(PrimitiveDTContext.class,0);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ArrayDeclWithSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclWithSize; }
	}

	public final ArrayDeclWithSizeContext arrayDeclWithSize() throws RecognitionException {
		ArrayDeclWithSizeContext _localctx = new ArrayDeclWithSizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDeclWithSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((ArrayDeclWithSizeContext)_localctx).dt = primitiveDT();
			setState(119);
			((ArrayDeclWithSizeContext)_localctx).id = match(DNT);
			setState(120);
			match(L_SQBR);
			setState(121);
			((ArrayDeclWithSizeContext)_localctx).size = additiveExpr("fa0");
			setState(122);
			match(R_SQBR);
			setState(123);
			match(SCOLN);

			        // Symbol Table Registration
			        Identifier arrayId = new Identifier();
			        arrayId.id = ((ArrayDeclWithSizeContext)_localctx).id.getText();
			        arrayId.type = ((ArrayDeclWithSizeContext)_localctx).dt.type + "[]"; // e.g., "nt[]"
			        arrayId.isArray = true;
			        assigned.add(((ArrayDeclWithSizeContext)_localctx).id.getText());
			        scopeStack.peek().table.put(arrayId.id, arrayId);
			        
			        // Code Generation: int[] arr = new int[size];
			        String javaType = mapType(((ArrayDeclWithSizeContext)_localctx).dt.type); 
			        String arrayType = javaType + "[]"; 
			        //emit("    " + arrayType + " " + ((ArrayDeclWithSizeContext)_localctx).id.getText() + " = new " + javaType + "[" + ((ArrayDeclWithSizeContext)_localctx).size.code + "];\n", writeTo);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStmtContext extends ParserRuleContext {
		public DataTypeContext dt;
		public Token id;
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((DeclareStmtContext)_localctx).dt = dataType();
			setState(127);
			((DeclareStmtContext)_localctx).id = match(DNT);
			setState(128);
			match(SCOLN);

			        String javaType = mapType(((DeclareStmtContext)_localctx).dt.type);
			        
			        String defaultValue = mapDefaultValue(javaType);
			        
			        //emit("    " + javaType + " " + ((DeclareStmtContext)_localctx).id.getText() + " = " + defaultValue + ";\n", writeTo);

			        Identifier newId = new Identifier();
			        newId.id = ((DeclareStmtContext)_localctx).id.getText();
			        newId.type = ((DeclareStmtContext)_localctx).dt.type; // Use the NoVwls type
			        scopeStack.peek().table.put(newId.id, newId);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public StringBuilder code;
		public DataTypeContext dt;
		public Token DNT;
		public RhsContext rhs;
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode SSGN() { return getToken(NoVwlsParser.SSGN, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44695552L) != 0)) {
				{
				setState(131);
				((AssignStmtContext)_localctx).dt = dataType();
				}
			}

			setState(134);
			((AssignStmtContext)_localctx).DNT = match(DNT);

			        //taking in id, find if it exists
			        currLHS = ((AssignStmtContext)_localctx).DNT.getText();

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
			                if(((AssignStmtContext)_localctx).dt.type.equals("nt")){
			                    register = "a0";
			                } else if(((AssignStmtContext)_localctx).dt.type.equals("flt")){
			                    register = "fa0";
			                } else if(((AssignStmtContext)_localctx).dt.type.equals("strng")){
			                    register = "a0";
			                } else if(((AssignStmtContext)_localctx).dt.type.equals("chr")){
			                    register = "a0";
			                } else if(((AssignStmtContext)_localctx).dt.type.equals("bl")){
			                    register = "a0";
			                }
			            } catch (Exception e){
			                error(((AssignStmtContext)_localctx).DNT, "data type not specified for '" + currLHS + "'");
			            }
			        }

			    
			setState(136);
			match(SSGN);
			setState(137);
			((AssignStmtContext)_localctx).rhs = rhs(register);

			        //make id
			        assigned.add(currLHS);
			        Identifier newId = new Identifier();
			        newId.id = currLHS;

			        if(!preexistingLHS){ 
			            if(((AssignStmtContext)_localctx).dt.type == null){ 
			                error(((AssignStmtContext)_localctx).DNT, "data type not specified for '" + currLHS + "'");
			                newId.type = "null";
			            } else {
			                newId.type = ((AssignStmtContext)_localctx).dt.type; 
			            }
			        } else {
			            newId.type = currId.type;
			        }

			        boolean errorFlag = false;
			        if(preexistingLHS){
			            // System.out.println("DEBUG: current type is " + ((AssignStmtContext)_localctx).rhs.type);
			            // System.out.println("The current DNT's type is " + mainTable.table.get(currLHS).type);

			            //type check 
			            if(!(((AssignStmtContext)_localctx).rhs.type.equals(currId.type))){
			                //System.out.println("HERE " + ((AssignStmtContext)_localctx).rhs.type);
			                if((((AssignStmtContext)_localctx).rhs.type.equals("nt") && currId.type.equals("bl")) && (((AssignStmtContext)_localctx).rhs.value == 0 || ((AssignStmtContext)_localctx).rhs.value == 1 )){
			                    //valid
			                } else {
			                    error(((AssignStmtContext)_localctx).DNT, "type mismatch for " + currLHS + "'");
			                    errorFlag = true;
			                }
			            }
			        } else {
			            //System.out.println(((AssignStmtContext)_localctx).dt.type + " and " + ((AssignStmtContext)_localctx).rhs.type);
			            try {
			                if(!(((AssignStmtContext)_localctx).rhs.type.equals(((AssignStmtContext)_localctx).dt.type))){
			                    //System.out.println("HERE 2 " + ((AssignStmtContext)_localctx).rhs.type);
			                    if((((AssignStmtContext)_localctx).rhs.type.equals("nt") && ((AssignStmtContext)_localctx).dt.type.equals("bl")) && (((AssignStmtContext)_localctx).rhs.value == 0 || ((AssignStmtContext)_localctx).rhs.value == 1 )){
			                        //valid
			                    } else {
			                        //System.out.println("DEBUG issue with type match for " + currLHS + " where " + ((AssignStmtContext)_localctx).dt.type + " not " + ((AssignStmtContext)_localctx).rhs.type);
			                        error(((AssignStmtContext)_localctx).DNT, "type mismatch for " + currLHS );
			                        errorFlag = true;
			                    }
			                } 
			            } catch (Exception e){
			                error(((AssignStmtContext)_localctx).DNT," cannot access a nonexistant value");
			                errorFlag = true;
			            }
			        }
			        if(!errorFlag){
			            newId.value = ((AssignStmtContext)_localctx).rhs.value;
			            newId.content = ((AssignStmtContext)_localctx).rhs.content;
			            newId.hasKnown = ((AssignStmtContext)_localctx).rhs.hasKnownValue;
			            newId.isArray = ((AssignStmtContext)_localctx).rhs.isArray;
			            newId.is2DArray = ((AssignStmtContext)_localctx).rhs.is2DArray;
			            newId.arrayValues = ((AssignStmtContext)_localctx).rhs.arrayValues;
			            newId.array2DValues = ((AssignStmtContext)_localctx).rhs.array2DValues;

			        } 
			        
			        if (preexistingLHS) {
			            // Just a new assignment to an existing variable
			            generateAssign(currLHS, ((AssignStmtContext)_localctx).rhs.code, ((AssignStmtContext)_localctx).rhs.finReg);
			        } else {
			            // A new variable is being "declared"
			            //Identifier newId = new Identifier(currLHS);
			            mainTable.table.put(newId.id, newId);
			            generateAssign(newId.id, ((AssignStmtContext)_localctx).rhs.code, ((AssignStmtContext)_localctx).rhs.finReg);
			        }

			        ((AssignStmtContext)_localctx).code =  ((AssignStmtContext)_localctx).rhs.code;

			        newId.hasBeenUsed = false;
			        scopeStack.peek().table.put(newId.id, newId);
			        currLHS = null;
			    
			setState(139);
			match(SCOLN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RhsContext extends ParserRuleContext {
		public String register;
		public StringBuilder code;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public boolean isArray;
		public boolean is2DArray;
		public List<Object> arrayValues;
		public List<List<Object>> array2DValues;
		public String codes;
		public String finReg;
		public ExprContext e;
		public ArrayLiteralContext arrayLiteral;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode KW_SCN_NTGR() { return getToken(NoVwlsParser.KW_SCN_NTGR, 0); }
		public TerminalNode KW_SCN_FLT() { return getToken(NoVwlsParser.KW_SCN_FLT, 0); }
		public TerminalNode KW_SCN_STRNG() { return getToken(NoVwlsParser.KW_SCN_STRNG, 0); }
		public TerminalNode KW_SCN_CHR() { return getToken(NoVwlsParser.KW_SCN_CHR, 0); }
		public RhsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RhsContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
	}

	public final RhsContext rhs(String register) throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState(), register);
		enterRule(_localctx, 12, RULE_rhs);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NT:
			case FLT:
			case BL:
			case CHR:
			case STRNG:
			case L_PRNTH:
			case PLS:
			case MNS:
			case DNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((RhsContext)_localctx).e = expr(_localctx.register);
				((RhsContext)_localctx).hasKnownValue =  ((RhsContext)_localctx).e.hasKnownValue;   
				            ((RhsContext)_localctx).type =  ((RhsContext)_localctx).e.type;                     
				            ((RhsContext)_localctx).value =  ((RhsContext)_localctx).e.value;                   
				            ((RhsContext)_localctx).content =  ((RhsContext)_localctx).e.content;              
				            ((RhsContext)_localctx).isArray =  ((RhsContext)_localctx).e.isArray;               
				            ((RhsContext)_localctx).is2DArray =  ((RhsContext)_localctx).e.is2DArray;           
				            ((RhsContext)_localctx).arrayValues =  ((RhsContext)_localctx).e.arrayValues;     
				            ((RhsContext)_localctx).array2DValues =  ((RhsContext)_localctx).e.array2DValues; 
				            ((RhsContext)_localctx).code =  ((RhsContext)_localctx).e.code;
				            ((RhsContext)_localctx).finReg =  ((RhsContext)_localctx).e.finReg;

				            if (_localctx.type.equals("flt")) {
				                //((RhsContext)_localctx).code =  "(float)(" + _localctx.code + ")";
				            }

				            ((RhsContext)_localctx).code =  ((RhsContext)_localctx).e.code;
				        
				}
				break;
			case L_CRLYB:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((RhsContext)_localctx).arrayLiteral = arrayLiteral();

				            ((RhsContext)_localctx).hasKnownValue =  ((RhsContext)_localctx).arrayLiteral.hasKnownValue;
				            ((RhsContext)_localctx).type =  ((RhsContext)_localctx).arrayLiteral.type;
				            ((RhsContext)_localctx).isArray =  ((RhsContext)_localctx).arrayLiteral.isArray;
				            ((RhsContext)_localctx).is2DArray =  ((RhsContext)_localctx).arrayLiteral.is2DArray;
				            ((RhsContext)_localctx).arrayValues =  ((RhsContext)_localctx).arrayLiteral.arrayValues;
				            ((RhsContext)_localctx).array2DValues =  ((RhsContext)_localctx).arrayLiteral.array2DValues;
				        
				}
				break;
			case KW_SCN_NTGR:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(KW_SCN_NTGR);

				            try{
				                ((RhsContext)_localctx).code =  new StringBuilder();
				                ((RhsContext)_localctx).finReg =  register;
				                generateReadInt(_localctx.code, register);
				                ((RhsContext)_localctx).hasKnownValue =  false;
				                ((RhsContext)_localctx).value =  0;
				                ((RhsContext)_localctx).type =  "nt";
				                ((RhsContext)_localctx).isArray =  false;
				                ((RhsContext)_localctx).is2DArray =  false;
				            } catch(Exception e){
				                error(null, "input was not an integer");
				                ((RhsContext)_localctx).hasKnownValue =  false;
				            }
				        
				}
				break;
			case KW_SCN_FLT:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(KW_SCN_FLT);

				            try{
				                //((RhsContext)_localctx).code =  "in.nextFloat()";
				                ((RhsContext)_localctx).finReg =  register;
				                ((RhsContext)_localctx).code =  new StringBuilder();
				                generateReadDouble(_localctx.code, register);
				                float input = 0.0f;
				                ((RhsContext)_localctx).hasKnownValue =  false;
				                ((RhsContext)_localctx).value =  input;
				                ((RhsContext)_localctx).type =  "flt";
				                ((RhsContext)_localctx).isArray =  false;
				                ((RhsContext)_localctx).is2DArray =  false;
				            } catch(Exception e){
				                error(null, "input was not a float");
				                ((RhsContext)_localctx).hasKnownValue =  false;
				            }
				        
				}
				break;
			case KW_SCN_STRNG:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(KW_SCN_STRNG);

				            //((RhsContext)_localctx).code =  "in.nextLine()";
				            ((RhsContext)_localctx).finReg =  register;
				            ((RhsContext)_localctx).code =  new StringBuilder();
				            generateReadString(_localctx.code, register);
				            //String input = scan.nextLine();
				            ((RhsContext)_localctx).hasKnownValue =  false;
				            //((RhsContext)_localctx).content =  "\"" + input + "\"";
				            ((RhsContext)_localctx).type =  "strng";
				            ((RhsContext)_localctx).isArray =  false;
				            ((RhsContext)_localctx).is2DArray =  false;
				        
				}
				break;
			case KW_SCN_CHR:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(KW_SCN_CHR);

				            //((RhsContext)_localctx).code =  "in.next().charAt(0)";
				            ((RhsContext)_localctx).finReg =  register;
				            ((RhsContext)_localctx).code =  new StringBuilder();
				            generateReadChar(_localctx.code, register);
				            ((RhsContext)_localctx).hasKnownValue =  true;
				            ((RhsContext)_localctx).type =  "chr";
				            ((RhsContext)_localctx).isArray =  false;
				            ((RhsContext)_localctx).is2DArray =  false;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignStmtContext extends ParserRuleContext {
		public ArrayAccessContext lhs;
		public RhsContext rightExpr;
		public TerminalNode SSGN() { return getToken(NoVwlsParser.SSGN, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public ArrayAssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignStmt; }
	}

	public final ArrayAssignStmtContext arrayAssignStmt() throws RecognitionException {
		ArrayAssignStmtContext _localctx = new ArrayAssignStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayAssignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((ArrayAssignStmtContext)_localctx).lhs = arrayAccess();
			setState(158);
			match(SSGN);
			setState(159);
			((ArrayAssignStmtContext)_localctx).rightExpr = rhs("fa0");
			setState(160);
			match(SCOLN);
			 
			    
			    Identifier currId = null;
			    for(int i = scopeStack.size()-1; i >= 0; i--){
			        currId = scopeStack.get(i).table.get(((ArrayAssignStmtContext)_localctx).lhs.arrayName); 
			        if(currId != null) break;
			    } 

			    if (currId == null) {
			        // FIX: Use ((ArrayAssignStmtContext)_localctx).lhs.arrayCtx for the context of the error
			        error(((ArrayAssignStmtContext)_localctx).lhs.arrayCtx, "Array '" + ((ArrayAssignStmtContext)_localctx).lhs.arrayName + "' used before declaration.");
			    } else if (!currId.isArray) {
			        error(((ArrayAssignStmtContext)_localctx).lhs.arrayCtx, "'" + ((ArrayAssignStmtContext)_localctx).lhs.arrayName + "' is not an array.");
			    }

			    if(currId != null && currId.isArray) {
			        // Code Generation
			        //emit("    " + ((ArrayAssignStmtContext)_localctx).lhs.arrayName + "[" + ((ArrayAssignStmtContext)_localctx).lhs.indexCode + "] = " + ((ArrayAssignStmtContext)_localctx).rightExpr.code + ";\n", writeTo);
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public boolean isArray;
		public boolean is2DArray;
		public List<Object> arrayValues;
		public List<List<Object>> array2DValues;
		public ArrayElementContext first;
		public ArrayElementContext next;
		public ArrayLiteralContext firstRow;
		public ArrayLiteralContext nextRow;
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayLiteral);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(L_CRLYB);
				setState(164);
				((ArrayLiteralContext)_localctx).first = arrayElement();
				 
				        ((ArrayLiteralContext)_localctx).hasKnownValue =  true;
				        ((ArrayLiteralContext)_localctx).type =  ((ArrayLiteralContext)_localctx).first.elementType + "[]";
				        ((ArrayLiteralContext)_localctx).isArray =  true;
				        ((ArrayLiteralContext)_localctx).is2DArray =  false;
				        ((ArrayLiteralContext)_localctx).arrayValues =  new ArrayList<>();
				        _localctx.arrayValues.add(((ArrayLiteralContext)_localctx).first.elementValue);
				    
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(166);
					match(CMM);
					setState(167);
					((ArrayLiteralContext)_localctx).next = arrayElement();

					        if (((ArrayLiteralContext)_localctx).next.hasKnownValue) {
					            _localctx.arrayValues.add(((ArrayLiteralContext)_localctx).next.elementValue);
					        }
					    
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(R_CRLYB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(L_CRLYB);
				setState(178);
				((ArrayLiteralContext)_localctx).firstRow = arrayLiteral();
				 
				        ((ArrayLiteralContext)_localctx).hasKnownValue =  true;
				        ((ArrayLiteralContext)_localctx).type =  ((ArrayLiteralContext)_localctx).firstRow.type;
				        ((ArrayLiteralContext)_localctx).isArray =  false;
				        ((ArrayLiteralContext)_localctx).is2DArray =  true;
				        ((ArrayLiteralContext)_localctx).array2DValues =  new ArrayList<>();
				        _localctx.array2DValues.add(new ArrayList<>(((ArrayLiteralContext)_localctx).firstRow.arrayValues));
				    
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(180);
					match(CMM);
					setState(181);
					((ArrayLiteralContext)_localctx).nextRow = arrayLiteral();

					        _localctx.array2DValues.add(new ArrayList<>(((ArrayLiteralContext)_localctx).nextRow.arrayValues));
					    
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(R_CRLYB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public Object elementValue;
		public String elementType;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((ArrayElementContext)_localctx).expr = expr("fa0");

			        ((ArrayElementContext)_localctx).hasKnownValue =  ((ArrayElementContext)_localctx).expr.hasKnownValue;
			        ((ArrayElementContext)_localctx).elementType =  ((ArrayElementContext)_localctx).expr.type;
			        if (((ArrayElementContext)_localctx).expr.type.equals("nt")) {
			            ((ArrayElementContext)_localctx).elementValue =  (int)((ArrayElementContext)_localctx).expr.value;
			        } else if (((ArrayElementContext)_localctx).expr.type.equals("flt")) {
			            ((ArrayElementContext)_localctx).elementValue =  ((ArrayElementContext)_localctx).expr.value;
			        } else if (((ArrayElementContext)_localctx).expr.type.equals("bl")) {
			            ((ArrayElementContext)_localctx).elementValue =  ((ArrayElementContext)_localctx).expr.value == 1.0f;
			        } else if (((ArrayElementContext)_localctx).expr.type.equals("strng") || ((ArrayElementContext)_localctx).expr.type.equals("chr")) {
			            ((ArrayElementContext)_localctx).elementValue =  ((ArrayElementContext)_localctx).expr.content;
			        } else {
			            ((ArrayElementContext)_localctx).elementValue =  ((ArrayElementContext)_localctx).expr.value;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public StringBuilder code;
		public PrintExprContext first;
		public PrintExprContext more;
		public TerminalNode KW_PRNT() { return getToken(NoVwlsParser.KW_PRNT, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public List<PrintExprContext> printExpr() {
			return getRuleContexts(PrintExprContext.class);
		}
		public PrintExprContext printExpr(int i) {
			return getRuleContext(PrintExprContext.class,i);
		}
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			        String register = "unk"; 
			    
			setState(197);
			match(KW_PRNT);
			setState(198);
			match(L_PRNTH);
			setState(199);
			((PrintStmtContext)_localctx).first = printExpr(register);

			        //emit("    System.out.print(String.valueOf(" + ((PrintStmtContext)_localctx).first.code  + "));\n", writeTo);
			        ((PrintStmtContext)_localctx).code =  ((PrintStmtContext)_localctx).first.code;  // Start with the code for the expression
			        if(((PrintStmtContext)_localctx).first.type.equals("nt")){
			            generatePrintInt(_localctx.code, "a0");
			        } else if(((PrintStmtContext)_localctx).first.type.equals("flt")){
			            generatePrintDouble(_localctx.code, "fa0");
			        } else if(((PrintStmtContext)_localctx).first.type.equals("strng")){
			            generatePrintString(_localctx.code, "a0");
			        } else if(((PrintStmtContext)_localctx).first.type.equals("chr")){
			            generatePrintString(_localctx.code, "a0");
			        } else if(((PrintStmtContext)_localctx).first.type.equals("bl")){
			            generatePrintBool(_localctx.code, "a0");
			        }
			    
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(201);
				match(CMM);
				setState(202);
				((PrintStmtContext)_localctx).more = printExpr(register);

				        ((PrintStmtContext)_localctx).code =  ((PrintStmtContext)_localctx).more.code;  // Start with the code for the expression
				        if(((PrintStmtContext)_localctx).first.type.equals("nt")){
				            generatePrintInt(_localctx.code, "a0");
				        } else if(((PrintStmtContext)_localctx).first.type.equals("flt")){
				            generatePrintDouble(_localctx.code, "fa0");
				        } else if(((PrintStmtContext)_localctx).first.type.equals("strng")){
				            generatePrintString(_localctx.code, "a0");
				        } else if(((PrintStmtContext)_localctx).first.type.equals("chr")){
				            generatePrintString(_localctx.code, "a0");
				        } else if(((PrintStmtContext)_localctx).first.type.equals("bl")){
				            generatePrintBool(_localctx.code, "a0");
				        }
				        
				        //emit("    System.out.print(String.valueOf(" + ((PrintStmtContext)_localctx).more.code  + "));\n", writeTo);
				    
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(R_PRNTH);
			setState(211);
			match(SCOLN);
			 

			        //emit("    System.out.println(" + ");\n", writeTo);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ParserRuleContext {
		public String register;
		public StringBuilder code;
		public String type;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrintExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
	}

	public final PrintExprContext printExpr(String register) throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState(), register);
		enterRule(_localctx, 22, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((PrintExprContext)_localctx).expr = expr(register);
			 
			        //emit("    System.out.print(" + ((PrintExprContext)_localctx).expr.code  + ");\n", writeTo);
			        ((PrintExprContext)_localctx).code =  ((PrintExprContext)_localctx).expr.code;
			        ((PrintExprContext)_localctx).type =  ((PrintExprContext)_localctx).expr.type;

			        if(((PrintExprContext)_localctx).expr.type == null){
			            System.err.println("Error: cannot print null types");
			        } else if((((PrintExprContext)_localctx).expr.type.equals("strng") || ((PrintExprContext)_localctx).expr.type.equals("chr")) && ((PrintExprContext)_localctx).expr.content != null){
			            String printStr = ((PrintExprContext)_localctx).expr.content;
			            printStr = printStr.substring(1, printStr.length() - 1);
			            //System.out.print("DEBUG" + printStr);
			        } else if (((PrintExprContext)_localctx).expr.isArray) {
			            System.out.print("[");
			            if (((PrintExprContext)_localctx).expr.arrayValues != null) {
			                for (int i = 0; i < ((PrintExprContext)_localctx).expr.arrayValues.size(); i++) {
			                    if (i > 0) System.out.print(", ");
			                    Object element = ((PrintExprContext)_localctx).expr.arrayValues.get(i);
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
			        } else if (((PrintExprContext)_localctx).expr.is2DArray) {
			            System.out.print("[");
			            if (((PrintExprContext)_localctx).expr.array2DValues != null) {
			                for (int i = 0; i < ((PrintExprContext)_localctx).expr.array2DValues.size(); i++) {
			                    if (i > 0) System.out.print(", ");
			                    System.out.print("[");
			                    List<Object> row = ((PrintExprContext)_localctx).expr.array2DValues.get(i);
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
			            if(((PrintExprContext)_localctx).expr.type.equals("flt")){
			                //System.out.print("DEBUG" + ((PrintExprContext)_localctx).expr.value);
			            } else if(((PrintExprContext)_localctx).expr.type.equals("bl")){
			                //System.out.print("DEBUG" + (((PrintExprContext)_localctx).expr.value == 1.0f ? "true" : "false"));
			            } else {
			                int printval = (int)(Math.abs(((PrintExprContext)_localctx).expr.value));
			                //System.out.print("DEBUG" + printval);
			            }
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareStmtContext extends ParserRuleContext {
		public ComparisonContext comparison;
		public TerminalNode KW_F() { return getToken(NoVwlsParser.KW_F, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<TerminalNode> KW_LS() { return getTokens(NoVwlsParser.KW_LS); }
		public TerminalNode KW_LS(int i) {
			return getToken(NoVwlsParser.KW_LS, i);
		}
		public CompareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareStmt; }
	}

	public final CompareStmtContext compareStmt() throws RecognitionException {
		CompareStmtContext _localctx = new CompareStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(KW_F);
			setState(218);
			match(L_PRNTH);
			setState(219);
			((CompareStmtContext)_localctx).comparison = comparison("fa0");
			setState(220);
			match(R_PRNTH);

			        // if(((CompareStmtContext)_localctx).comparison.value > 0){ //if true
			        //     emit("if (true) {\n");
			        // } else { //if false
			        //     emit("if (false) {\n");
			        // }
			         //emit("if (" + ((CompareStmtContext)_localctx).comparison.code + ") {\n", writeTo);
			        
			    
			setState(222);
			blockStmt();

			        //emit("}\n", writeTo);
			    
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_LS) {
				{
				{
				setState(224);
				match(KW_LS);

				        //emit("else {\n", writeTo);
				    
				setState(226);
				blockStmt();

				        //emit("}\n", writeTo);
				    
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctStmtContext extends ParserRuleContext {
		public DataTypeContext d;
		public Token a;
		public DataTypeContext dt;
		public Token b;
		public DataTypeContext dt2;
		public Token c;
		public FactorContext factor;
		public TerminalNode KW_FNCTN() { return getToken(NoVwlsParser.KW_FNCTN, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public TerminalNode KW_RTN() { return getToken(NoVwlsParser.KW_RTN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> DNT() { return getTokens(NoVwlsParser.DNT); }
		public TerminalNode DNT(int i) {
			return getToken(NoVwlsParser.DNT, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public FunctStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functStmt; }
	}

	public final FunctStmtContext functStmt() throws RecognitionException {
		FunctStmtContext _localctx = new FunctStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(KW_FNCTN);
			setState(235);
			((FunctStmtContext)_localctx).d = dataType();
			setState(236);
			((FunctStmtContext)_localctx).a = match(DNT);

			        Identifier function = new Identifier();
			        function.id = ((FunctStmtContext)_localctx).a.getText();
			        function.type = ((FunctStmtContext)_localctx).d.type;
			        function.isFunction = true;
			        function.isImplemented = true;
			        function.hasBeenUsed = false;
			        function.hasKnown = true;
			        
			        Identifier currentId = null;
			        for(int i = scopeStack.size()-1; i >= 0; i--){
			            currentId = scopeStack.get(i).table.get(((FunctStmtContext)_localctx).a.getText());
			            if(currentId != null) break;
			        }
			        if(currentId != null && currentId.isImplemented){
			            error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' is already defined");
			        } else if(currentId != null && !currentId.isImplemented){
			            //check to make sure everything matches
			            if(currentId.type != function.type){
			                error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' definition does not match declaration");
			            } else if (currentId.isFunction != function.isFunction){
			                error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' definition does not match declaration");
			            }
			        }
			        

			        //System.out.println("DEBUG: DNT " + ((FunctStmtContext)_localctx).a.getText() + " is " + scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).id);
			    
			setState(238);
			match(L_PRNTH);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44695552L) != 0)) {
				{
				setState(239);
				((FunctStmtContext)_localctx).dt = dataType();
				setState(240);
				((FunctStmtContext)_localctx).b = match(DNT);

				        //store arg
				        Identifier firstP = new Identifier();
				        firstP.type = ((FunctStmtContext)_localctx).dt.type;
				        firstP.id = ((FunctStmtContext)_localctx).b.getText();
				        firstP.hasKnown = false;
				        firstP.hasBeenUsed = false;
				        
				        if (((FunctStmtContext)_localctx).dt.type.endsWith("[]")) {
				            firstP.isArray = true;
				        }
				        if (((FunctStmtContext)_localctx).dt.type.endsWith("[][]")) {
				            firstP.is2DArray = true;
				        }

				        //add to list
				        function.parameters.add(firstP);

				        //check if non implemented funct has same parameters
				        if(currentId != null && !currentId.isImplemented){
				            if(currentId.parameters.size() > 0){
				                //check dt and parameter name
				                if(!currentId.parameters.get(0).type.equals(firstP.type)){
				                    error(((FunctStmtContext)_localctx).b , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' parameter type does not match declaration");
				                } else if(!currentId.parameters.get(0).id.equals(firstP.id)){
				                    error(((FunctStmtContext)_localctx).b , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' parameter ID does not match declaration");
				                }
				            }
				        }
				    
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(242);
					match(CMM);
					setState(243);
					((FunctStmtContext)_localctx).dt2 = dataType();
					setState(244);
					((FunctStmtContext)_localctx).c = match(DNT);

					        //store arg
					        Identifier nextP = new Identifier();
					        nextP.type = ((FunctStmtContext)_localctx).dt2.type;
					        nextP.id = ((FunctStmtContext)_localctx).c.getText();
					        nextP.hasKnown = false;
					        nextP.hasBeenUsed = false;

					        // ADD THIS FIX: Check if the parameter is an array
					        if (((FunctStmtContext)_localctx).dt2.type.endsWith("[]")) {
					            nextP.isArray = true;
					        }
					        if (((FunctStmtContext)_localctx).dt2.type.endsWith("[][]")) {
					            nextP.is2DArray = true;
					        }

					        //add to list
					        function.parameters.add(nextP);
					    
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			match(R_PRNTH);
			setState(255);
			match(L_CRLYB);

			        //System.out.println("DEBUG: defining function " + function.id);
			        //check parameters
			        if(currentId != null && !currentId.isImplemented){
			            System.out.println("Here");
			            if(currentId.parameters.size() != function.parameters.size()){
			                error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' parameter count does not match declaration");
			            }
			            System.out.println("Here 2");
			            for(int p = 0; p < function.parameters.size(); p++){
			                Identifier paramCheck = currentId.parameters.get(p);
			                Identifier paramFunct = function.parameters.get(p);
			                if(!paramCheck.type.equals(paramFunct.type)){
			                    error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' parameter type does not match declaration");
			                } else if(!paramCheck.id.equals(paramFunct.id)){
			                    error(((FunctStmtContext)_localctx).a , "function '" + ((FunctStmtContext)_localctx).a.getText() + "' parameter ID does not match declaration");
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
			        Identifier tempFunct = scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText());

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
			        
			        
			    
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881300466383620L) != 0)) {
				{
				{
				setState(257);
				stmt();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(KW_RTN);
			setState(264);
			((FunctStmtContext)_localctx).factor = factor("fa0");
			setState(265);
			match(SCOLN);
			setState(266);
			match(R_CRLYB);

			        //System.out.println("DEBUG: type of funct:" + ((FunctStmtContext)_localctx).d.type + " type of factor:" + ((FunctStmtContext)_localctx).factor.type);
			        String returnVal = "String ";
			        
			        //attach funct value 
			        if(!(((FunctStmtContext)_localctx).d.type.equals(((FunctStmtContext)_localctx).factor.type))){
			            //is not returning same data type
			            error((((FunctStmtContext)_localctx).factor!=null?(((FunctStmtContext)_localctx).factor.start):null), "Type incompatability between function (" + ((FunctStmtContext)_localctx).d.type + ") and return value (" + ((FunctStmtContext)_localctx).factor.type +")");
			        } else {
			            if((((FunctStmtContext)_localctx).factor.type.equals("strng") || ((FunctStmtContext)_localctx).factor.type.equals("chr"))){
			                scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).content = ((FunctStmtContext)_localctx).factor.content;
			            } else {
			                scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).value = ((FunctStmtContext)_localctx).factor.value;
			            }
			            //emit(" in.close();\n", writeTo);
			            //emit("return " + ((FunctStmtContext)_localctx).factor.code + "; \n", writeTo);  
			        }

			        //end scope
			        scopeStack.pop();
			        
			        //reset string builder 
			        writeTo = null;

			        //clear list
			        //scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).parameters = new ArrayList<>();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStmtContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopStmt);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHL:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				whileLoop();
				}
				break;
			case KW_FR:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				forLoop();
				}
				break;
			case KW_D:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				doWhileLoop();
				}
				break;
			case KW_BRK:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				breakStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ComparisonContext comparison;
		public TerminalNode KW_WHL() { return getToken(NoVwlsParser.KW_WHL, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(KW_WHL);
			setState(276);
			match(L_PRNTH);

			        //emit("while(", writeTo);
			    
			setState(278);
			((WhileLoopContext)_localctx).comparison = comparison("fa0");

			        //replace with string of comparison
			        //if(((WhileLoopContext)_localctx).comparison.value > 0){ //if true
			        //    emit("true", writeTo);
			        //} else {
			        //    emit("false", writeTo);
			        //}
			        //emit(((WhileLoopContext)_localctx).comparison.code, writeTo);
			    
			setState(280);
			match(R_PRNTH);

			        //emit("){", writeTo);
			     
			setState(282);
			blockStmt();

			            //emit("}", writeTo);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ComparisonContext comparison;
		public TerminalNode KW_FR() { return getToken(NoVwlsParser.KW_FR, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> SCOLN() { return getTokens(NoVwlsParser.SCOLN); }
		public TerminalNode SCOLN(int i) {
			return getToken(NoVwlsParser.SCOLN, i);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ForLoopIncContext forLoopInc() {
			return getRuleContext(ForLoopIncContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(KW_FR);
			setState(286);
			match(L_PRNTH);

			        //emit("for(", writeTo);
			    
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
			case KW_FLT:
			case KW_BL:
			case KW_CHR:
			case KW_STRNG:
			case DNT:
				{
				setState(288);
				assignStmt();
				}
				break;
			case SCOLN:
				{
				setState(289);
				match(SCOLN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(292);
			((ForLoopContext)_localctx).comparison = comparison("fa0");
			setState(293);
			match(SCOLN);

			            //emit(((ForLoopContext)_localctx).comparison.code + ";", writeTo);
			        
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599672066048L) != 0)) {
				{
				setState(295);
				forLoopInc();
				}
			}

			setState(298);
			match(R_PRNTH);

			        //emit("){", writeTo);
			        
			setState(300);
			blockStmt();

			        //emit("}", writeTo);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends ParserRuleContext {
		public ComparisonContext comparison;
		public TerminalNode KW_D() { return getToken(NoVwlsParser.KW_D, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public TerminalNode KW_WHL() { return getToken(NoVwlsParser.KW_WHL, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(KW_D);

			        //emit("do{\n", writeTo);
			        
			setState(305);
			blockStmt();
			setState(306);
			match(KW_WHL);
			setState(307);
			match(L_PRNTH);
			setState(308);
			((DoWhileLoopContext)_localctx).comparison = comparison("fa0");
			setState(309);
			match(R_PRNTH);
			setState(310);
			match(SCOLN);

			        //emit("}while("+ ((DoWhileLoopContext)_localctx).comparison.code + ");\n", writeTo);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode KW_BRK() { return getToken(NoVwlsParser.KW_BRK, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(KW_BRK);
			setState(314);
			match(SCOLN);

			        //emit("break;", writeTo);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode CMMNT_LN() { return getToken(NoVwlsParser.CMMNT_LN, 0); }
		public TerminalNode CMMNT_BLCK() { return getToken(NoVwlsParser.CMMNT_BLCK, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==CMMNT_LN || _la==CMMNT_BLCK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseCContext extends ParserRuleContext {
		public TerminalNode KW_LS() { return getToken(NoVwlsParser.KW_LS, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseC; }
	}

	public final ElseCContext elseC() throws RecognitionException {
		ElseCContext _localctx = new ElseCContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(KW_LS);
			setState(320);
			blockStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopIncContext extends ParserRuleContext {
		public Token DNT;
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode INC() { return getToken(NoVwlsParser.INC, 0); }
		public TerminalNode DCR() { return getToken(NoVwlsParser.DCR, 0); }
		public ForLoopIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInc; }
	}

	public final ForLoopIncContext forLoopInc() throws RecognitionException {
		ForLoopIncContext _localctx = new ForLoopIncContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forLoopInc);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				((ForLoopIncContext)_localctx).DNT = match(DNT);
				setState(324);
				match(INC);
				//emit($DNT.getText()+"++", writeTo);
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				((ForLoopIncContext)_localctx).DNT = match(DNT);
				setState(327);
				match(DCR);
				//emit($DNT.getText()+"--", writeTo);
				                
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public boolean isArray;
		public boolean is2DArray;
		public List<Object> arrayValues;
		public List<List<Object>> array2DValues;
		public StringBuilder code;
		public String finReg;
		public FactorContext a;
		public ComparisonExprContext b;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(String register) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), register);
		enterRule(_localctx, 44, RULE_expr);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((ExprContext)_localctx).a = factor(_localctx.register);

				            ((ExprContext)_localctx).hasKnownValue =  ((ExprContext)_localctx).a.hasKnownValue;
				            ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value;
				            ((ExprContext)_localctx).content =  ((ExprContext)_localctx).a.content;
				            ((ExprContext)_localctx).type =  ((ExprContext)_localctx).a.type;
				            ((ExprContext)_localctx).isArray =  ((ExprContext)_localctx).a.isArray;
				            ((ExprContext)_localctx).is2DArray =  ((ExprContext)_localctx).a.is2DArray;
				            ((ExprContext)_localctx).arrayValues =  ((ExprContext)_localctx).a.arrayValues;
				            ((ExprContext)_localctx).array2DValues =  ((ExprContext)_localctx).a.array2DValues;
				            ((ExprContext)_localctx).code =  ((ExprContext)_localctx).a.code;
				            ((ExprContext)_localctx).finReg =  ((ExprContext)_localctx).a.finReg;
				            
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				((ExprContext)_localctx).b = comparisonExpr(_localctx.register);

				            ((ExprContext)_localctx).hasKnownValue =  ((ExprContext)_localctx).b.hasKnownValue;
				            ((ExprContext)_localctx).value =  ((ExprContext)_localctx).b.value;
				            ((ExprContext)_localctx).type =  ((ExprContext)_localctx).b.type;
				            ((ExprContext)_localctx).isArray =  false;
				            ((ExprContext)_localctx).is2DArray =  false;
				            ((ExprContext)_localctx).code =  ((ExprContext)_localctx).b.code;
				            ((ExprContext)_localctx).finReg =  ((ExprContext)_localctx).b.finReg;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public float value;
		public StringBuilder code;
		public String finReg;
		public ComparisonExprContext a;
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ComparisonContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison(String register) throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState(), register);
		enterRule(_localctx, 46, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((ComparisonContext)_localctx).a = comparisonExpr(_localctx.register);

			        if(!(((ComparisonContext)_localctx).a.type.equals("bl"))){
			            System.err.println("Comparison must return boolean");
			        } else {
			            ((ComparisonContext)_localctx).hasKnownValue =  ((ComparisonContext)_localctx).a.hasKnownValue;
			            ((ComparisonContext)_localctx).value =  ((ComparisonContext)_localctx).a.value;
			            ((ComparisonContext)_localctx).code =  ((ComparisonContext)_localctx).a.code;
			            ((ComparisonContext)_localctx).finReg =  ((ComparisonContext)_localctx).a.finReg;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public StringBuilder code;
		public String finReg;
		public AdditiveExprContext a;
		public Token op;
		public AdditiveExprContext b;
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> LSSTHN() { return getTokens(NoVwlsParser.LSSTHN); }
		public TerminalNode LSSTHN(int i) {
			return getToken(NoVwlsParser.LSSTHN, i);
		}
		public List<TerminalNode> GRTRTHN() { return getTokens(NoVwlsParser.GRTRTHN); }
		public TerminalNode GRTRTHN(int i) {
			return getToken(NoVwlsParser.GRTRTHN, i);
		}
		public List<TerminalNode> LSSTHNREQL() { return getTokens(NoVwlsParser.LSSTHNREQL); }
		public TerminalNode LSSTHNREQL(int i) {
			return getToken(NoVwlsParser.LSSTHNREQL, i);
		}
		public List<TerminalNode> GRTRTHNREQL() { return getTokens(NoVwlsParser.GRTRTHNREQL); }
		public TerminalNode GRTRTHNREQL(int i) {
			return getToken(NoVwlsParser.GRTRTHNREQL, i);
		}
		public List<TerminalNode> EQL() { return getTokens(NoVwlsParser.EQL); }
		public TerminalNode EQL(int i) {
			return getToken(NoVwlsParser.EQL, i);
		}
		public List<TerminalNode> NTEQL() { return getTokens(NoVwlsParser.NTEQL); }
		public TerminalNode NTEQL(int i) {
			return getToken(NoVwlsParser.NTEQL, i);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ComparisonExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr(String register) throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState(), register);
		enterRule(_localctx, 48, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((ComparisonExprContext)_localctx).a = additiveExpr(_localctx.register);
			  
			        ((ComparisonExprContext)_localctx).hasKnownValue =  ((ComparisonExprContext)_localctx).a.hasKnownValue;
			        ((ComparisonExprContext)_localctx).value =  ((ComparisonExprContext)_localctx).a.value;
			        ((ComparisonExprContext)_localctx).type =  ((ComparisonExprContext)_localctx).a.type;
			        ((ComparisonExprContext)_localctx).code =  ((ComparisonExprContext)_localctx).a.code; 
			        ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).a.finReg;
			        //String nextRegister = (_localctx.register.equals("ft0")) ? "ft1" : "ft0";

			    
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) {
				{
				{
				setState(344);
				((ComparisonExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
					((ComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        //assign new reg w every new op
				        String nextRegister = getNewRegister(_localctx.type);
				        System.out.println((nextTotRegister) + " register");
				    
				setState(346);
				((ComparisonExprContext)_localctx).b = additiveExpr(nextRegister);
				  
				        _localctx.code.append(((ComparisonExprContext)_localctx).b.code);

				        //if (((ComparisonExprContext)_localctx).b.hasKnownValue) {  
				            String opType = ((ComparisonExprContext)_localctx).op.getText(); 
				            if (opType.equals("<")) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value < ((ComparisonExprContext)_localctx).b.value) ? 1 : 0; 

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    flt.d " + _localctx.finReg + ", ft1," + ((ComparisonExprContext)_localctx).b.finReg); // put back into int register
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    flt.d " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg + ", ft1"); // add float
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; //update to int register
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    slt " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    flt.d " + diffReg + ", " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    bgt " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (opType.equals(">")) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value > ((ComparisonExprContext)_localctx).b.value) ? 1 : 0;

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    flt.d " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", ft1"); // put back into int register
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    flt.d " + ((ComparisonExprContext)_localctx).b.finReg + ", ft1, " + _localctx.finReg); // add float
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; 
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    slt " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg );
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    flt.d " + diffReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg );
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    blt " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (opType.equals("==")) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value == ((ComparisonExprContext)_localctx).b.value) ? 1 : 0;

				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    feq.d " + _localctx.finReg + ", ft1," + ((ComparisonExprContext)_localctx).b.finReg); // put back into int register
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    feq.d " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg + ", ft1"); // add float
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; //update to int register
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    xor  t0, " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    emit(_localctx.code, "    slti " + _localctx.finReg +", t0, 1");
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    feq.d " + diffReg + ", " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    beq " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (opType.equals("<=")) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value <= ((ComparisonExprContext)_localctx).b.value) ? 1 : 0;

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fle.d " + _localctx.finReg + ", ft1," + ((ComparisonExprContext)_localctx).b.finReg); // put back into int register
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fle.d " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg + ", ft1"); // add float
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; //update to int register
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    slt t1, " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg ); //a > b
				                    emit(_localctx.code, "    xori " + _localctx.finReg + ", t1, 1"); //invert so a <= b
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    fle.d " + diffReg + ", " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    ble " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (opType.equals(">=") ) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value >= ((ComparisonExprContext)_localctx).b.value) ? 1 : 0;

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fle.d " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", ft1"); // put back into int register
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fle.d " + ((ComparisonExprContext)_localctx).b.finReg + ", ft1, " + _localctx.finReg); // add float
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; 
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    slt t1, " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg ); //a < b
				                    emit(_localctx.code, "    xori " + _localctx.finReg + ", t1, 1"); //invert so a >= b
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    fle.d " + diffReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg );
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    bge " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (opType.equals("!=") ) {  
				                ((ComparisonExprContext)_localctx).value =   (_localctx.value != ((ComparisonExprContext)_localctx).b.value) ? 1 : 0;

				                if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    feq.d " + _localctx.finReg + ", ft1," + ((ComparisonExprContext)_localctx).b.finReg); // put back into int register
				                    emit(_localctx.code, "    xori " + _localctx.finReg + ", " + _localctx.finReg + ", 1");
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((ComparisonExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((ComparisonExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    feq.d " + ((ComparisonExprContext)_localctx).b.finReg + ", " + _localctx.finReg + ", ft1"); // add float
				                    emit(_localctx.code, "    xori " + ((ComparisonExprContext)_localctx).b.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg + ", 1");
				                    ((ComparisonExprContext)_localctx).finReg =  ((ComparisonExprContext)_localctx).b.finReg; //update to int register
				                } else if (_localctx.type.equals("nt") && ((ComparisonExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    xor  t0, " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    emit(_localctx.code, "    slti " + _localctx.finReg +", t0, 1");
				                    emit(_localctx.code, "    xori " + _localctx.finReg + ", " + _localctx.finReg + ", 1");
				                } else if (_localctx.type.equals("flt") && ((ComparisonExprContext)_localctx).b.type.equals("flt")) {
				                    String diffReg = getNewRegister("nt");
				                    emit(_localctx.code, "    feq.d " + diffReg + ", " + _localctx.finReg + ", " + ((ComparisonExprContext)_localctx).b.finReg );
				                    emit(_localctx.code, "    xori " + diffReg + ", " + diffReg + ", 1");
				                    ((ComparisonExprContext)_localctx).finReg =  diffReg;
				                }

				                //emit(_localctx.code, "    bne " + _localctx.register + "," + _localctx.register + "," + nextRegister); 
				            } else ((ComparisonExprContext)_localctx).value =  0;  
				            ((ComparisonExprContext)_localctx).type =  "bl";

				            //((ComparisonExprContext)_localctx).code =  "(" + ((ComparisonExprContext)_localctx).a.code + ((ComparisonExprContext)_localctx).op.getText() + ((ComparisonExprContext)_localctx).b.code + ")"; 
				        // } else {
				        //     ((ComparisonExprContext)_localctx).hasKnownValue =  false;
				        //     ((ComparisonExprContext)_localctx).type =  "bl";
				        //     //((ComparisonExprContext)_localctx).code =  "(" + ((ComparisonExprContext)_localctx).a.code + ((ComparisonExprContext)_localctx).op.getText() + ((ComparisonExprContext)_localctx).b.code + ")";  
				        // }
				    
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public StringBuilder code;
		public String finReg;
		public MultiplicativeExprContext a;
		public Token op;
		public MultiplicativeExprContext b;
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLS() { return getTokens(NoVwlsParser.PLS); }
		public TerminalNode PLS(int i) {
			return getToken(NoVwlsParser.PLS, i);
		}
		public List<TerminalNode> MNS() { return getTokens(NoVwlsParser.MNS); }
		public TerminalNode MNS(int i) {
			return getToken(NoVwlsParser.MNS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdditiveExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr(String register) throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState(), register);
		enterRule(_localctx, 50, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((AdditiveExprContext)_localctx).a = multiplicativeExpr(_localctx.register);

			        ((AdditiveExprContext)_localctx).hasKnownValue =  ((AdditiveExprContext)_localctx).a.hasKnownValue;
			        ((AdditiveExprContext)_localctx).value =  ((AdditiveExprContext)_localctx).a.value;
			        ((AdditiveExprContext)_localctx).type =  ((AdditiveExprContext)_localctx).a.type;
			        ((AdditiveExprContext)_localctx).code =  ((AdditiveExprContext)_localctx).a.code;
			        ((AdditiveExprContext)_localctx).finReg =  ((AdditiveExprContext)_localctx).a.finReg;
			        //String nextRegister = getNewRegister(_localctx.type);
			    
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLS || _la==MNS) {
				{
				{
				setState(356);
				((AdditiveExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLS || _la==MNS) ) {
					((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        //assign new reg w every new op
				        String nextRegister = getNewRegister(_localctx.type);
				        System.out.println((nextTotRegister) + " register");
				    
				setState(358);
				((AdditiveExprContext)_localctx).b = multiplicativeExpr(nextRegister);

				        _localctx.code.append(((AdditiveExprContext)_localctx).b.code);
				        //if (_localctx.hasKnownValue && ((AdditiveExprContext)_localctx).b.hasKnownValue) {
				            if (((AdditiveExprContext)_localctx).op.getText().equals("+")) {
				                ((AdditiveExprContext)_localctx).value =  _localctx.value + ((AdditiveExprContext)_localctx).b.value;
				                
				                // if(((AdditiveExprContext)_localctx).b.type.equals("flt") && ((AdditiveExprContext)_localctx).a.type.){
				                //     ((AdditiveExprContext)_localctx).finReg =  "fa" + nextRegister;
				                // } else {
				                //     ((AdditiveExprContext)_localctx).finReg =  "a" + nextRegister;
				                // }

				                //System.out.println("type " + _localctx.type);

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((AdditiveExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    System.out.println("adding " + ((AdditiveExprContext)_localctx).a.value + " and " + ((AdditiveExprContext)_localctx).b.value);
				                    emit(_localctx.code, "    fcvt.d.w ft1, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fadd.d " + ((AdditiveExprContext)_localctx).b.finReg + ", " + ((AdditiveExprContext)_localctx).b.finReg + ", ft1"); // add float
				                    ((AdditiveExprContext)_localctx).finReg =  ((AdditiveExprContext)_localctx).b.finReg;
				                } else if (_localctx.type.equals("flt") && ((AdditiveExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((AdditiveExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w ft1, " + ((AdditiveExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fadd.d " + _localctx.finReg + ", " + _localctx.finReg + ", ft1"); // add float
				                } else if (_localctx.type.equals("nt") && ((AdditiveExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    add " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((AdditiveExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                    emit(_localctx.code, "    fadd.d " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((AdditiveExprContext)_localctx).b.finReg );
				                }


				            } else {
				                ((AdditiveExprContext)_localctx).value =  _localctx.value - ((AdditiveExprContext)_localctx).b.value;
				                
				                //System.out.println("type " + _localctx.type);

				                //emit based on type 
				                if (_localctx.type.equals("nt") && ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((AdditiveExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    System.out.println("adding " + ((AdditiveExprContext)_localctx).a.value + " and " + ((AdditiveExprContext)_localctx).b.value);
				                    emit(_localctx.code, "    fcvt.d.w f0, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fsub.d " + ((AdditiveExprContext)_localctx).b.finReg + ", f0, " + ((AdditiveExprContext)_localctx).b.finReg); // add float
				                    ((AdditiveExprContext)_localctx).finReg =  ((AdditiveExprContext)_localctx).b.finReg;
				                } else if (_localctx.type.equals("flt") && ((AdditiveExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((AdditiveExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w f0, " + ((AdditiveExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fsub.d " + _localctx.finReg + ", " + _localctx.finReg + ", f0"); // add float
				                } else if (_localctx.type.equals("nt") && ((AdditiveExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    sub " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((AdditiveExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                    emit(_localctx.code, "    fsub.d " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((AdditiveExprContext)_localctx).b.finReg );
				                }

				                //emit(_localctx.code, "    fsub.d " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            }

				            if (_localctx.type.equals("flt") || ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                ((AdditiveExprContext)_localctx).type =  "flt";
				                //((AdditiveExprContext)_localctx).code =  "" + _localctx.value;
				            } else {
				                ((AdditiveExprContext)_localctx).type =  "nt";
				                //((AdditiveExprContext)_localctx).code =  "" + (int)_localctx.value;
				            }

				            nextTotRegister --;
				        // } else {
				        //     ((AdditiveExprContext)_localctx).hasKnownValue =  false;
				        //     if ("flt".equals(((AdditiveExprContext)_localctx).a.type) || "flt".equals(((AdditiveExprContext)_localctx).b.type)) {
				        //         ((AdditiveExprContext)_localctx).type =  "flt";
				        //     } else {
				        //         ((AdditiveExprContext)_localctx).type =  "nt";
				        //     }
				        //     //((AdditiveExprContext)_localctx).code =  "(" + ((AdditiveExprContext)_localctx).a.code + ((AdditiveExprContext)_localctx).op.getText() + ((AdditiveExprContext)_localctx).b.code + ")"; 
				        // }

				    
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        resetRegisters();
			        System.out.println(nextTotRegister + " register");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public StringBuilder code;
		public String finReg;
		public UnaryExprContext a;
		public Token op;
		public UnaryExprContext b;
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> TMS() { return getTokens(NoVwlsParser.TMS); }
		public TerminalNode TMS(int i) {
			return getToken(NoVwlsParser.TMS, i);
		}
		public List<TerminalNode> DVD() { return getTokens(NoVwlsParser.DVD); }
		public TerminalNode DVD(int i) {
			return getToken(NoVwlsParser.DVD, i);
		}
		public List<TerminalNode> MOD() { return getTokens(NoVwlsParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(NoVwlsParser.MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	}

	public final MultiplicativeExprContext multiplicativeExpr(String register) throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState(), register);
		enterRule(_localctx, 52, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((MultiplicativeExprContext)_localctx).a = unaryExpr(_localctx.register);

			        ((MultiplicativeExprContext)_localctx).hasKnownValue =  ((MultiplicativeExprContext)_localctx).a.hasKnownValue;
			        ((MultiplicativeExprContext)_localctx).value =  ((MultiplicativeExprContext)_localctx).a.value;
			        ((MultiplicativeExprContext)_localctx).type =  ((MultiplicativeExprContext)_localctx).a.type;
			        ((MultiplicativeExprContext)_localctx).code =  ((MultiplicativeExprContext)_localctx).a.code;
			        ((MultiplicativeExprContext)_localctx).finReg =  ((MultiplicativeExprContext)_localctx).a.finReg;

			        //String nextRegister = getNewRegister(((MultiplicativeExprContext)_localctx).a.type);
			        
			    
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				{
				setState(370);
				((MultiplicativeExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
					((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        //assign new reg w every new op
				        String nextRegister = getNewRegister(_localctx.type);
				        System.out.println((nextTotRegister) + " register");
				    
				setState(372);
				((MultiplicativeExprContext)_localctx).b = unaryExpr(nextRegister);

				        _localctx.code.append(((MultiplicativeExprContext)_localctx).b.code);

				        if (((MultiplicativeExprContext)_localctx).b.hasKnownValue && ((MultiplicativeExprContext)_localctx).op.getText().equals("/") && ((MultiplicativeExprContext)_localctx).b.value == 0) {
				            error(((MultiplicativeExprContext)_localctx).op, "division by zero");
				            ((MultiplicativeExprContext)_localctx).hasKnownValue =  false; 
				            //((MultiplicativeExprContext)_localctx).code =  "Error";
				        } else {

				            if (((MultiplicativeExprContext)_localctx).op.getText().equals("*")) {
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value * ((MultiplicativeExprContext)_localctx).b.value;

				                if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    System.out.println("multiplying " + ((MultiplicativeExprContext)_localctx).a.value + " and " + ((MultiplicativeExprContext)_localctx).b.value);
				                    emit(_localctx.code, "    fcvt.d.w f0, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fmul.d " + ((MultiplicativeExprContext)_localctx).b.finReg + ", f0, " + ((MultiplicativeExprContext)_localctx).b.finReg); // add float
				                    ((MultiplicativeExprContext)_localctx).finReg =  ((MultiplicativeExprContext)_localctx).b.finReg;
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w f0, " + ((MultiplicativeExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fmul.d " + _localctx.finReg + ", " + _localctx.finReg + ", f0"); // add float
				                } else if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    mul " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    emit(_localctx.code, "    fmul.d " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                }

				                //emit(_localctx.code, "    fmul.d " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else if (((MultiplicativeExprContext)_localctx).op.getText().equals("%")){
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value % ((MultiplicativeExprContext)_localctx).b.value;

				                if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    System.out.println("mod of " + ((MultiplicativeExprContext)_localctx).a.value + " by " + ((MultiplicativeExprContext)_localctx).b.value);
				                    emit(_localctx.code, "    fcvt.d.w f0, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    frem.d " + ((MultiplicativeExprContext)_localctx).b.finReg + ", f0, " + ((MultiplicativeExprContext)_localctx).b.finReg); // add float
				                    ((MultiplicativeExprContext)_localctx).finReg =  ((MultiplicativeExprContext)_localctx).b.finReg;
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w f0, " + ((MultiplicativeExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    frem.d " + _localctx.finReg + ", " + _localctx.finReg + ", f0"); // add float
				                } else if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    rem " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    emit(_localctx.code, "    frem.d " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                }
				                //emit(_localctx.code, "    frem.d " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            } else {
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value / ((MultiplicativeExprContext)_localctx).b.value;

				                if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add int and float"); //temporary
				                    System.out.println("dividing " + ((MultiplicativeExprContext)_localctx).a.value + " by " + ((MultiplicativeExprContext)_localctx).b.value);
				                    emit(_localctx.code, "    fcvt.d.w f0, " +  _localctx.finReg);   // promote int
				                    emit(_localctx.code, "    fdiv.d " + ((MultiplicativeExprContext)_localctx).b.finReg + ", f0, " + ((MultiplicativeExprContext)_localctx).b.finReg); // add float
				                    ((MultiplicativeExprContext)_localctx).finReg =  ((MultiplicativeExprContext)_localctx).b.finReg;
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    //error(((MultiplicativeExprContext)_localctx).op, "type mismatch: cannot add float and int"); //temporary
				                    emit(_localctx.code, "    fcvt.d.w f0, " + ((MultiplicativeExprContext)_localctx).b.finReg);   // promote int
				                    emit(_localctx.code, "    fdiv.d " + _localctx.finReg + ", " + _localctx.finReg + ", f0"); // add float
				                } else if (_localctx.type.equals("nt") && ((MultiplicativeExprContext)_localctx).b.type.equals("nt")) {
				                    emit(_localctx.code, "    div " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                } else if (_localctx.type.equals("flt") && ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                    emit(_localctx.code, "    fdiv.d " + _localctx.finReg + ", " + _localctx.finReg + ", " + ((MultiplicativeExprContext)_localctx).b.finReg );
				                }
				                //emit(_localctx.code, "    fdiv.d " + _localctx.register + "," + _localctx.register + "," + nextRegister);
				            }
				        } 

				        //System.out.println(nextTotRegister + " register " + ((MultiplicativeExprContext)_localctx).op.getText());

				        if ("flt".equals(((MultiplicativeExprContext)_localctx).a.type) || "flt".equals(((MultiplicativeExprContext)_localctx).b.type)) {
				            ((MultiplicativeExprContext)_localctx).type =  "flt";
				            //((MultiplicativeExprContext)_localctx).code =  "" + _localctx.value;
				        } else {
				            ((MultiplicativeExprContext)_localctx).type =  "nt";
				            //((MultiplicativeExprContext)_localctx).code =  "" + (int)_localctx.value;
				        }
				        nextTotRegister --;
				    
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        //resetRegisters();
			        System.out.println(nextTotRegister + " register");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public StringBuilder code;
		public String finReg;
		public Token op;
		public FactorContext a;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLS() { return getToken(NoVwlsParser.PLS, 0); }
		public TerminalNode MNS() { return getToken(NoVwlsParser.MNS, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr(String register) throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState(), register);
		enterRule(_localctx, 54, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25769803778L) != 0)) {
				{
				setState(382);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 25769803778L) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(385);
			((UnaryExprContext)_localctx).a = factor(_localctx.register);

			        ((UnaryExprContext)_localctx).hasKnownValue =  ((UnaryExprContext)_localctx).a.hasKnownValue;
			        ((UnaryExprContext)_localctx).value =  ((UnaryExprContext)_localctx).a.value;
			        ((UnaryExprContext)_localctx).type =  ((UnaryExprContext)_localctx).a.type;
			        ((UnaryExprContext)_localctx).finReg =  ((UnaryExprContext)_localctx).a.finReg;

			        try {
			        if(((UnaryExprContext)_localctx).op.getText().equals("-")){
			            ((UnaryExprContext)_localctx).value =  -((UnaryExprContext)_localctx).a.value;
			            emit(_localctx.code, "    neg " + ((UnaryExprContext)_localctx).a.finReg + "," + ((UnaryExprContext)_localctx).a.finReg);
			        }
			        } catch (Exception e) {
			            // No unary operator present
			        }

			        ((UnaryExprContext)_localctx).code =  ((UnaryExprContext)_localctx).a.code;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String register;
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public boolean isArray;
		public boolean is2DArray;
		public List<Object> arrayValues;
		public List<List<Object>> array2DValues;
		public StringBuilder code;
		public String finReg;
		public Token NT;
		public Token FLT;
		public Token BL;
		public Token CHR;
		public Token STRNG;
		public Token DNT;
		public ArrayAccessContext arrayAccess;
		public ExprContext expr;
		public FunctCallContext functCall;
		public TerminalNode NT() { return getToken(NoVwlsParser.NT, 0); }
		public TerminalNode FLT() { return getToken(NoVwlsParser.FLT, 0); }
		public TerminalNode BL() { return getToken(NoVwlsParser.BL, 0); }
		public TerminalNode CHR() { return getToken(NoVwlsParser.CHR, 0); }
		public TerminalNode STRNG() { return getToken(NoVwlsParser.STRNG, 0); }
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public FunctCallContext functCall() {
			return getRuleContext(FunctCallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, String register) {
			super(parent, invokingState);
			this.register = register;
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor(String register) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), register);
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				((FactorContext)_localctx).NT = match(NT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).NT.getText()); 
				            ((FactorContext)_localctx).type =  "nt";
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            //code = ""+(int)_localctx.value;
				            int val = Integer.parseInt(((FactorContext)_localctx).NT.getText());

				            if(_localctx.register.equals("unk")){
				                ((FactorContext)_localctx).register =  "a0"; //default register
				            } else if (_localctx.register.equals("ft0")){
				                ((FactorContext)_localctx).register =  "a0"; //default float register
				            } else if (_localctx.register.equals("ft1")){
				                ((FactorContext)_localctx).register =  "a0"; //default float register
				            } else if (_localctx.register.equals("fa0")){
				                ((FactorContext)_localctx).register =  "a0"; //default float register
				            } else if (_localctx.register.equals("fa1")){
				                ((FactorContext)_localctx).register =  "a0"; //default float register
				            } else if (_localctx.register.equals("1") || _localctx.register.equals("2") || _localctx.register.equals("3") || _localctx.register.equals("4") || _localctx.register.equals("5") || _localctx.register.equals("6") || _localctx.register.equals("7")){
				                ((FactorContext)_localctx).register =  "a" + _localctx.register; //default register
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;

				            ((FactorContext)_localctx).code =  generateIntConstant(_localctx.finReg, val);

				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((FactorContext)_localctx).FLT = match(FLT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).value =  Float.parseFloat(((FactorContext)_localctx).FLT.getText()); 
				            ((FactorContext)_localctx).type =  "flt";
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            //code = ((FactorContext)_localctx).FLT.getText() + "f";
				            double val = Double.parseDouble(((FactorContext)_localctx).FLT.getText());

				            if(_localctx.register.equals("unk")){
				                ((FactorContext)_localctx).register =  "fa0"; //default register
				            } else if (_localctx.register.equals("a0")){
				                ((FactorContext)_localctx).register =  "fa0"; //default float register
				            } else if (_localctx.register.equals("a1")){
				                ((FactorContext)_localctx).register =  "fa0"; //default float register
				            } else if (_localctx.register.equals("1") || _localctx.register.equals("2") || _localctx.register.equals("3") || _localctx.register.equals("4") || _localctx.register.equals("5") || _localctx.register.equals("6") || _localctx.register.equals("7")){
				                ((FactorContext)_localctx).register =  "fa" + _localctx.register; //default register
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;

				            ((FactorContext)_localctx).code =  generateDoubleConstant(_localctx.finReg, val);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				((FactorContext)_localctx).BL = match(BL);
				 
				            ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).type =  "bl";
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            if(((FactorContext)_localctx).BL.getText().equals("true")){
				                ((FactorContext)_localctx).value =  1;
				            } else if(((FactorContext)_localctx).BL.getText().equals("false")){
				                ((FactorContext)_localctx).value =  0;
				            } else {
				                ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).BL.getText());
				            }
				            //((FactorContext)_localctx).code =  ""+(int)_localctx.value;
				            int val = Integer.parseInt(((FactorContext)_localctx).BL.getText());

				            if(_localctx.register.equals("unk")){
				                ((FactorContext)_localctx).register =  "a0"; //default register
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;
				            ((FactorContext)_localctx).code =  generateBoolConstant(_localctx.finReg, (int) _localctx.value);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				((FactorContext)_localctx).CHR = match(CHR);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).CHR.getText();
				            ((FactorContext)_localctx).type =  "chr";
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            //((FactorContext)_localctx).code =  ""+_localctx.content;
				            char val = _localctx.content.charAt(1); // Extract the character between the single quotes

				            if(_localctx.register.equals("unk")){
				                ((FactorContext)_localctx).register =  "a0"; //default register
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;
				            ((FactorContext)_localctx).code =  generateCharConstant(_localctx.finReg, val);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				((FactorContext)_localctx).STRNG = match(STRNG);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).STRNG.getText();
				            ((FactorContext)_localctx).type =  "strng";
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            //((FactorContext)_localctx).code =  ""+_localctx.content;
				            String val = _localctx.content.substring(1, _localctx.content.length() - 1); // Remove the surrounding double quotes

				            if(_localctx.register.equals("unk")){
				                ((FactorContext)_localctx).register =  "a0"; //default register
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;
				            ((FactorContext)_localctx).code =  generateStringConstant(_localctx.finReg, val);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				((FactorContext)_localctx).DNT = match(DNT);

				            String id = ((FactorContext)_localctx).DNT.getText();
				            used.add(id);
				            Identifier currentId = null;
				            for(int i = scopeStack.size()-1; i >= 0; i--){
				                currentId = scopeStack.get(i).table.get(id);
				                if(currentId != null) break;
				            }
				            if (currentId == null) {
				                if (currLHS != null && !preexistingLHS && id.equals(currLHS)) {
				                    error(((FactorContext)_localctx).DNT, "self-reference on first assignment of '" + currLHS + "'");
				                } else {
				                    error(((FactorContext)_localctx).DNT, "use of variable '" + id + "' before assignment");
				                }
				                ((FactorContext)_localctx).hasKnownValue =  false;
				                ((FactorContext)_localctx).type =  "null";
				            } else {
				                currentId.hasBeenUsed = true;
				                ((FactorContext)_localctx).hasKnownValue =  false;
				                ((FactorContext)_localctx).value =  currentId.value;
				                ((FactorContext)_localctx).type =  currentId.type;
				                ((FactorContext)_localctx).content =  currentId.content;
				                ((FactorContext)_localctx).isArray =  currentId.isArray;
				                ((FactorContext)_localctx).is2DArray =  currentId.is2DArray;
				                ((FactorContext)_localctx).arrayValues =  currentId.arrayValues;
				                ((FactorContext)_localctx).array2DValues =  currentId.array2DValues;
				            }

				            if(_localctx.register.equals("unk")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa0"; //default float register
				                } else {
				                    ((FactorContext)_localctx).register =  "a0"; //default register
				                }
				            } else if (_localctx.register.equals("ft0")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa0"; //default float register
				                } else {
				                    ((FactorContext)_localctx).register =  "a0"; //default register
				                }
				            } else if (_localctx.register.equals("ft1")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa1"; //default float register
				                } else {
				                    ((FactorContext)_localctx).register =  "a0"; //default register
				                }
				            } else if (_localctx.register.equals("fa0")){
				                if(!_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "a0"; //default register
				                }
				            } else if (_localctx.register.equals("fa1")){
				                if(!_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "a0"; //default register
				                }
				            } else if (_localctx.register.equals("a0")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa0"; //default float register
				                }
				            } else if (_localctx.register.equals("a1")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa0"; //default float register
				                }
				            } else if (_localctx.register.equals("1") || _localctx.register.equals("2") || _localctx.register.equals("3") || _localctx.register.equals("4") || _localctx.register.equals("5") || _localctx.register.equals("6") || _localctx.register.equals("7")){
				                if(_localctx.type.equals("flt")){
				                    ((FactorContext)_localctx).register =  "fa" + _localctx.register; //default float register
				                } else {
				                    ((FactorContext)_localctx).register =  "a" + _localctx.register; //default register
				                }
				            }

				            ((FactorContext)_localctx).finReg =  _localctx.register;
				            ((FactorContext)_localctx).code =  generateLoadId(_localctx.finReg, id);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				((FactorContext)_localctx).arrayAccess = arrayAccess();

				            ((FactorContext)_localctx).hasKnownValue =  ((FactorContext)_localctx).arrayAccess.hasKnownValue;
				            ((FactorContext)_localctx).type =  ((FactorContext)_localctx).arrayAccess.type;
				            ((FactorContext)_localctx).value =  ((FactorContext)_localctx).arrayAccess.value;
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).arrayAccess.content;
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            //((FactorContext)_localctx).code =  ((FactorContext)_localctx).arrayAccess.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(403);
				match(L_PRNTH);
				setState(404);
				((FactorContext)_localctx).expr = expr(_localctx.register);
				setState(405);
				match(R_PRNTH);
				 
				            ((FactorContext)_localctx).hasKnownValue =  ((FactorContext)_localctx).expr.hasKnownValue;
				            ((FactorContext)_localctx).value =  ((FactorContext)_localctx).expr.value;
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).expr.content;
				            ((FactorContext)_localctx).type =  ((FactorContext)_localctx).expr.type;
				            ((FactorContext)_localctx).isArray =  ((FactorContext)_localctx).expr.isArray;
				            ((FactorContext)_localctx).is2DArray =  ((FactorContext)_localctx).expr.is2DArray;
				            ((FactorContext)_localctx).arrayValues =  ((FactorContext)_localctx).expr.arrayValues;
				            ((FactorContext)_localctx).array2DValues =  ((FactorContext)_localctx).expr.array2DValues;
				            ((FactorContext)_localctx).code =  ((FactorContext)_localctx).expr.code ;
				            ((FactorContext)_localctx).finReg =  ((FactorContext)_localctx).expr.finReg;
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(408);
				((FactorContext)_localctx).functCall = functCall();

				            ((FactorContext)_localctx).hasKnownValue =  ((FactorContext)_localctx).functCall.hasKnownValue;
				            ((FactorContext)_localctx).value =  ((FactorContext)_localctx).functCall.value;
				            ((FactorContext)_localctx).type =  ((FactorContext)_localctx).functCall.type;
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).functCall.content;
				            ((FactorContext)_localctx).isArray =  false;
				            ((FactorContext)_localctx).is2DArray =  false;
				            // if(((FactorContext)_localctx).functCall.type.equals("strng") || ((FactorContext)_localctx).functCall.type.equals("chr")){
				            //     ((FactorContext)_localctx).code =  "" + _localctx.content;
				            // } else ((FactorContext)_localctx).code =  "" + _localctx.value;
				            //((FactorContext)_localctx).code =  ((FactorContext)_localctx).functCall.code;
				            
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctCallContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public String code;
		public Token DNT;
		public ExprContext p;
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public FunctCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functCall; }
	}

	public final FunctCallContext functCall() throws RecognitionException {
		FunctCallContext _localctx = new FunctCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((FunctCallContext)_localctx).DNT = match(DNT);
			setState(414);
			match(L_PRNTH);

			        String id = ((FunctCallContext)_localctx).DNT.getText();
			        used.add(id);
			        Identifier currentId = null;
			        for(int i = scopeStack.size()-1; i >= 0; i--){
			            currentId = scopeStack.get(i).table.get(id);
			            if(currentId != null) break;
			        }
			        if (currentId == null) {
			            // Report the error
			            error(((FunctCallContext)_localctx).DNT, "Function '" + ((FunctCallContext)_localctx).DNT.getText() + "' does not exist.");
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
			        ((FunctCallContext)_localctx).hasKnownValue =  currentId.hasKnown;
			       // ((FunctCallContext)_localctx).type =  currentId.type != null ? currentId.type : "null";
			        ((FunctCallContext)_localctx).value =  currentId.value;
			        ((FunctCallContext)_localctx).content =  currentId.content;
			        
			        //((FunctCallContext)_localctx).code =  id + "(";

			        // init param counter
			        int paramCount = 0;
			    
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503625687957506L) != 0)) {
				{
				setState(416);
				((FunctCallContext)_localctx).p = expr("fa0");

				        // If there are no parameters expected, report it
				        if (currentId.parameters == null || currentId.parameters.size() == 0) {
				            error(((FunctCallContext)_localctx).DNT, "There are no parameters for function '" + ((FunctCallContext)_localctx).DNT.getText() + "'");
				        } else {
				            // check first parameter
				            if (paramCount < currentId.parameters.size()) {
				                Identifier inputPar = currentId.parameters.get(paramCount);
				                if (((FunctCallContext)_localctx).p.type.equals(inputPar.type)) {
				                    // assign passed-in values to the parameter slot
				                    inputPar.value = ((FunctCallContext)_localctx).p.value;
				                    inputPar.content = ((FunctCallContext)_localctx).p.content;
				                    inputPar.type = ((FunctCallContext)_localctx).p.type;
				                    inputPar.hasKnown = ((FunctCallContext)_localctx).p.hasKnownValue;
				                    inputPar.isArray = ((FunctCallContext)_localctx).p.isArray;
				                    inputPar.is2DArray = ((FunctCallContext)_localctx).p.is2DArray;
				                    if (((FunctCallContext)_localctx).p.isArray) inputPar.arrayValues = ((FunctCallContext)_localctx).p.arrayValues;
				                    if (((FunctCallContext)_localctx).p.is2DArray) inputPar.array2DValues = ((FunctCallContext)_localctx).p.array2DValues;

				                    //_localctx.code += ((FunctCallContext)_localctx).p.code;

				                } else {
				                    error((((FunctCallContext)_localctx).p!=null?(((FunctCallContext)_localctx).p.start):null), "The input parameter type '" + ((FunctCallContext)_localctx).p.type + "' is not the same as parameter type '" + inputPar.type + "'");
				                }
				            } else {
				                error(((FunctCallContext)_localctx).DNT, "Too many parameters for function '" + ((FunctCallContext)_localctx).DNT.getText() + "'");
				            }
				        }
				        paramCount ++;
				      
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(418);
					match(CMM);
					setState(419);
					((FunctCallContext)_localctx).p = expr("fa0");

					            if (paramCount < currentId.parameters.size()) {
					                Identifier inputPar = currentId.parameters.get(paramCount);
					                if (((FunctCallContext)_localctx).p.type.equals(inputPar.type)) {
					                    inputPar.value = ((FunctCallContext)_localctx).p.value;
					                    inputPar.content = ((FunctCallContext)_localctx).p.content;
					                    inputPar.type = ((FunctCallContext)_localctx).p.type;
					                    inputPar.hasKnown = ((FunctCallContext)_localctx).p.hasKnownValue;
					                    inputPar.isArray = ((FunctCallContext)_localctx).p.isArray;
					                    inputPar.is2DArray = ((FunctCallContext)_localctx).p.is2DArray;
					                    if (((FunctCallContext)_localctx).p.isArray) inputPar.arrayValues = ((FunctCallContext)_localctx).p.arrayValues;
					                    if (((FunctCallContext)_localctx).p.is2DArray) inputPar.array2DValues = ((FunctCallContext)_localctx).p.array2DValues;
					                } else {
					                    error((((FunctCallContext)_localctx).p!=null?(((FunctCallContext)_localctx).p.start):null), "The input parameter type '" + ((FunctCallContext)_localctx).p.type + "' is not the same as parameter type '" + inputPar.type + "'");
					                }
					            } else {
					                error(((FunctCallContext)_localctx).DNT, "Too many parameters for function '" + ((FunctCallContext)_localctx).DNT.getText() + "'");
					            }

					            paramCount ++;
					            
					            _localctx.code += ", " + ((FunctCallContext)_localctx).p.code;
					        
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
			match(R_PRNTH);

			        
			        if (paramCount < currentId.parameters.size()){
			            error(((FunctCallContext)_localctx).DNT, "Function is missing parameters.");
			        } else if (paramCount > currentId.parameters.size()){
			            // Error is handled in the loops above, but keep for defensive coding.
			        }

			        // set return values from the function entry (dummy or real)
			        ((FunctCallContext)_localctx).value =  currentId.value;
			        ((FunctCallContext)_localctx).type =  currentId.type != null ? currentId.type : "null";
			        ((FunctCallContext)_localctx).content =  currentId.content;
			        ((FunctCallContext)_localctx).hasKnownValue =  currentId.hasKnown;
			        
			        _localctx.code += ")";
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctDefineContext extends ParserRuleContext {
		public DataTypeContext d;
		public Token a;
		public DataTypeContext dt;
		public Token b;
		public DataTypeContext dt2;
		public Token c;
		public TerminalNode KW_FNCTN() { return getToken(NoVwlsParser.KW_FNCTN, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> DNT() { return getTokens(NoVwlsParser.DNT); }
		public TerminalNode DNT(int i) {
			return getToken(NoVwlsParser.DNT, i);
		}
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public FunctDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functDefine; }
	}

	public final FunctDefineContext functDefine() throws RecognitionException {
		FunctDefineContext _localctx = new FunctDefineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(KW_FNCTN);
			setState(433);
			((FunctDefineContext)_localctx).d = dataType();
			setState(434);
			((FunctDefineContext)_localctx).a = match(DNT);

			        Identifier function = new Identifier();
			        function.id = ((FunctDefineContext)_localctx).a.getText();
			        function.type = ((FunctDefineContext)_localctx).d.type;
			        function.isFunction = true;
			        function.isImplemented = false;
			        function.hasBeenUsed = false;
			        function.hasKnown = true;
			        
			        Identifier currentId = null;
			        for(int i = scopeStack.size()-1; i >= 0; i--){
			            currentId = scopeStack.get(i).table.get(((FunctDefineContext)_localctx).a.getText());
			            if(currentId != null) break;
			        }
			        if(currentId != null){
			            error(((FunctDefineContext)_localctx).a , "function '" + ((FunctDefineContext)_localctx).a.getText() + "' is already defined");
			        }
			        
			        //store funct
			        scopeStack.peek().table.put(function.id, function);
			        mainTable.table.put(function.id, function);

			        //System.out.println("DEBUG: DNT " + ((FunctDefineContext)_localctx).a.getText() + " is " + scopeStack.peek().table.get(((FunctDefineContext)_localctx).a.getText()).id);
			    
			setState(436);
			match(L_PRNTH);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44695552L) != 0)) {
				{
				setState(437);
				((FunctDefineContext)_localctx).dt = dataType();
				setState(438);
				((FunctDefineContext)_localctx).b = match(DNT);

				        //store arg
				        Identifier firstP = new Identifier();
				        firstP.type = ((FunctDefineContext)_localctx).dt.type;
				        firstP.id = ((FunctDefineContext)_localctx).b.getText();
				        firstP.hasKnown = false;
				        firstP.hasBeenUsed = false;

				        
				        if (((FunctDefineContext)_localctx).dt.type.endsWith("[]")) {
				            firstP.isArray = true;
				        }
				        if (((FunctDefineContext)_localctx).dt.type.endsWith("[][]")) {
				            firstP.is2DArray = true;
				        }
				        
				        //add to list
				        scopeStack.peek().table.get(((FunctDefineContext)_localctx).a.getText()).parameters.add(firstP);
				    
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(440);
					match(CMM);
					setState(441);
					((FunctDefineContext)_localctx).dt2 = dataType();
					setState(442);
					((FunctDefineContext)_localctx).c = match(DNT);

					        //store arg
					        Identifier nextP = new Identifier();
					        nextP.type = ((FunctDefineContext)_localctx).dt2.type;
					        nextP.id = ((FunctDefineContext)_localctx).c.getText();
					        nextP.hasKnown = false;
					        nextP.hasBeenUsed = false;

					       
					        if (((FunctDefineContext)_localctx).dt2.type.endsWith("[]")) {
					            nextP.isArray = true;
					        }
					        if (((FunctDefineContext)_localctx).dt2.type.endsWith("[][]")) {
					            nextP.is2DArray = true;
					        }

					        //add to list
					        scopeStack.peek().table.get(((FunctDefineContext)_localctx).a.getText()).parameters.add(nextP);
					    
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452);
			match(R_PRNTH);
			setState(453);
			match(SCOLN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public String type;
		public PrimitiveDTContext a;
		public ArrayDTContext arrayDT;
		public PrimitiveDTContext primitiveDT() {
			return getRuleContext(PrimitiveDTContext.class,0);
		}
		public ArrayDTContext arrayDT() {
			return getRuleContext(ArrayDTContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dataType);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				((DataTypeContext)_localctx).a = primitiveDT();
				 ((DataTypeContext)_localctx).type =  ((DataTypeContext)_localctx).a.type; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				((DataTypeContext)_localctx).arrayDT = arrayDT();
				 ((DataTypeContext)_localctx).type =  ((DataTypeContext)_localctx).arrayDT.type; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDTContext extends ParserRuleContext {
		public String type;
		public TerminalNode KW_NT() { return getToken(NoVwlsParser.KW_NT, 0); }
		public TerminalNode KW_STRNG() { return getToken(NoVwlsParser.KW_STRNG, 0); }
		public TerminalNode KW_FLT() { return getToken(NoVwlsParser.KW_FLT, 0); }
		public TerminalNode KW_BL() { return getToken(NoVwlsParser.KW_BL, 0); }
		public TerminalNode KW_CHR() { return getToken(NoVwlsParser.KW_CHR, 0); }
		public PrimitiveDTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDT; }
	}

	public final PrimitiveDTContext primitiveDT() throws RecognitionException {
		PrimitiveDTContext _localctx = new PrimitiveDTContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primitiveDT);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(KW_NT);
				 ((PrimitiveDTContext)_localctx).type =  "nt"; 
				}
				break;
			case KW_STRNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(KW_STRNG);
				 ((PrimitiveDTContext)_localctx).type =  "strng"; 
				}
				break;
			case KW_FLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(KW_FLT);
				 ((PrimitiveDTContext)_localctx).type =  "flt"; 
				}
				break;
			case KW_BL:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(KW_BL);
				 ((PrimitiveDTContext)_localctx).type =  "bl"; 
				}
				break;
			case KW_CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				match(KW_CHR);
				 ((PrimitiveDTContext)_localctx).type =  "chr"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDTContext extends ParserRuleContext {
		public String type;
		public PrimitiveDTContext primitiveDT;
		public PrimitiveDTContext primitiveDT() {
			return getRuleContext(PrimitiveDTContext.class,0);
		}
		public List<TerminalNode> L_SQBR() { return getTokens(NoVwlsParser.L_SQBR); }
		public TerminalNode L_SQBR(int i) {
			return getToken(NoVwlsParser.L_SQBR, i);
		}
		public List<TerminalNode> R_SQBR() { return getTokens(NoVwlsParser.R_SQBR); }
		public TerminalNode R_SQBR(int i) {
			return getToken(NoVwlsParser.R_SQBR, i);
		}
		public ArrayDTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDT; }
	}

	public final ArrayDTContext arrayDT() throws RecognitionException {
		ArrayDTContext _localctx = new ArrayDTContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayDT);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				((ArrayDTContext)_localctx).primitiveDT = primitiveDT();
				setState(476);
				match(L_SQBR);
				setState(477);
				match(R_SQBR);
				 ((ArrayDTContext)_localctx).type =  ((ArrayDTContext)_localctx).primitiveDT.type + "[]"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				((ArrayDTContext)_localctx).primitiveDT = primitiveDT();
				setState(481);
				match(L_SQBR);
				setState(482);
				match(R_SQBR);
				setState(483);
				match(L_SQBR);
				setState(484);
				match(R_SQBR);
				 ((ArrayDTContext)_localctx).type =  ((ArrayDTContext)_localctx).primitiveDT.type + "[][]"; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public boolean isArray;
		public boolean is2DArray;
		public List<Object> arrayValues;
		public List<List<Object>> array2DValues;
		public String code;
		public String arrayName;
		public Token arrayCtx;
		public String indexCode;
		public Token id;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public List<TerminalNode> L_SQBR() { return getTokens(NoVwlsParser.L_SQBR); }
		public TerminalNode L_SQBR(int i) {
			return getToken(NoVwlsParser.L_SQBR, i);
		}
		public List<TerminalNode> R_SQBR() { return getTokens(NoVwlsParser.R_SQBR); }
		public TerminalNode R_SQBR(int i) {
			return getToken(NoVwlsParser.R_SQBR, i);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayAccess);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((ArrayAccessContext)_localctx).id = match(DNT);
				setState(490);
				match(L_SQBR);
				setState(491);
				((ArrayAccessContext)_localctx).e1 = expr("fa0");
				setState(492);
				match(R_SQBR);

				        // Set context fields
				        ((ArrayAccessContext)_localctx).arrayName =  ((ArrayAccessContext)_localctx).id.getText();
				        ((ArrayAccessContext)_localctx).arrayCtx =  ((ArrayAccessContext)_localctx).id; // FIXED: Removed illegal .start property
				        //((ArrayAccessContext)_localctx).indexCode =  ((ArrayAccessContext)_localctx).e1.code;
				        used.add(_localctx.arrayName);
				        
				        Identifier currId = null;
				        for(int i = scopeStack.size()-1; i >= 0; i--){
				            currId = scopeStack.get(i).table.get(_localctx.arrayName);
				            if(currId != null) break;
				        }

				       
				        if (currId == null) {
				            error(((ArrayAccessContext)_localctx).id, "Array '" + _localctx.arrayName + "' used before declaration.");
				            ((ArrayAccessContext)_localctx).type =  "null"; // Default safe type
				        } else if (!currId.isArray) {
				            error(((ArrayAccessContext)_localctx).id, "'" + _localctx.arrayName + "' is not a 1D array.");
				            ((ArrayAccessContext)_localctx).type =  "null"; // Default safe type
				        } else {
				            ((ArrayAccessContext)_localctx).type =  currId.type.substring(0, currId.type.length() - 2); 
				        }
				        
				        // Code Generation
				        ((ArrayAccessContext)_localctx).code =  _localctx.arrayName + "[" + ((ArrayAccessContext)_localctx).e1.code + "]";
				        ((ArrayAccessContext)_localctx).hasKnownValue =  false;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				((ArrayAccessContext)_localctx).id = match(DNT);
				setState(496);
				match(L_SQBR);
				setState(497);
				((ArrayAccessContext)_localctx).e2 = expr("fa0");
				setState(498);
				match(R_SQBR);
				setState(499);
				match(L_SQBR);
				setState(500);
				((ArrayAccessContext)_localctx).e3 = expr("fa0");
				setState(501);
				match(R_SQBR);

				        // Set context fields
				        ((ArrayAccessContext)_localctx).arrayName =  ((ArrayAccessContext)_localctx).id.getText();
				        ((ArrayAccessContext)_localctx).arrayCtx =  ((ArrayAccessContext)_localctx).id; // FIXED: Removed illegal .start property
				        ((ArrayAccessContext)_localctx).indexCode =  ((ArrayAccessContext)_localctx).e2.code + "][" + ((ArrayAccessContext)_localctx).e3.code; // Not strictly indexCode, but for internal use
				        used.add(_localctx.arrayName);
				        
				        Identifier currId = null;
				        for(int i = scopeStack.size()-1; i >= 0; i--){
				            currId = scopeStack.get(i).table.get(_localctx.arrayName);
				            if(currId != null) break;
				        }

				        if (currId == null) {
				            error(((ArrayAccessContext)_localctx).id, "Array '" + _localctx.arrayName + "' used before declaration.");
				            ((ArrayAccessContext)_localctx).type =  "null"; 
				        } else if (!currId.is2DArray) {
				            error(((ArrayAccessContext)_localctx).id, "'" + _localctx.arrayName + "' is not a 2D array.");
				            ((ArrayAccessContext)_localctx).type =  "null"; 
				        } else {
				            ((ArrayAccessContext)_localctx).type =  currId.type.substring(0, currId.type.length() - 4); 
				        }
				        
				        ((ArrayAccessContext)_localctx).code =  _localctx.arrayName + "[" + ((ArrayAccessContext)_localctx).e2.code + "][" + ((ArrayAccessContext)_localctx).e3.code + "]";
				        ((ArrayAccessContext)_localctx).hasKnownValue =  false;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u01fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000"+
		"\f\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001j\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002o\b\u0002\n\u0002\f\u0002r\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003"+
		"\u0005\u0085\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009c"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00ab\b\b\n\b\f\b\u00ae\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b9\b\b\n\b\f\b\u00bc\t\b\u0001\b"+
		"\u0001\b\u0003\b\u00c0\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n"+
		"\n\f\n\u00d1\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e6\b\f\n\f\f\f\u00e9\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f8\b\r\n\r\f\r\u00fb\t\r"+
		"\u0003\r\u00fd\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0103\b\r\n"+
		"\r\f\r\u0106\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0112\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0123\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0129\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u014a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0152\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u015e\b\u0018\n\u0018\f\u0018\u0161\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u016a\b\u0019\n\u0019\f\u0019\u016d\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0178\b\u001a\n\u001a\f\u001a"+
		"\u017b\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u0180\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u019c\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01a7\b\u001d\n\u001d\f\u001d\u01aa\t\u001d"+
		"\u0003\u001d\u01ac\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01be\b\u001e\n\u001e\f\u001e\u01c1\t\u001e\u0003\u001e\u01c3"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ce\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01da\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u01e8\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01f9\b\"\u0001\"\u0000\u0000#\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BD\u0000\u0005\u0001\u000023\u0001\u0000&+\u0001\u0000"+
		"!\"\u0001\u0000#%\u0002\u0000\u0001\u0001!\"\u0212\u0000F\u0001\u0000"+
		"\u0000\u0000\u0002i\u0001\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000"+
		"\u0006v\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0084\u0001"+
		"\u0000\u0000\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000"+
		"\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00c1\u0001\u0000"+
		"\u0000\u0000\u0014\u00c4\u0001\u0000\u0000\u0000\u0016\u00d6\u0001\u0000"+
		"\u0000\u0000\u0018\u00d9\u0001\u0000\u0000\u0000\u001a\u00ea\u0001\u0000"+
		"\u0000\u0000\u001c\u0111\u0001\u0000\u0000\u0000\u001e\u0113\u0001\u0000"+
		"\u0000\u0000 \u011d\u0001\u0000\u0000\u0000\"\u012f\u0001\u0000\u0000"+
		"\u0000$\u0139\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000("+
		"\u013f\u0001\u0000\u0000\u0000*\u0149\u0001\u0000\u0000\u0000,\u0151\u0001"+
		"\u0000\u0000\u0000.\u0153\u0001\u0000\u0000\u00000\u0156\u0001\u0000\u0000"+
		"\u00002\u0162\u0001\u0000\u0000\u00004\u0170\u0001\u0000\u0000\u00006"+
		"\u017f\u0001\u0000\u0000\u00008\u019b\u0001\u0000\u0000\u0000:\u019d\u0001"+
		"\u0000\u0000\u0000<\u01b0\u0001\u0000\u0000\u0000>\u01cd\u0001\u0000\u0000"+
		"\u0000@\u01d9\u0001\u0000\u0000\u0000B\u01e7\u0001\u0000\u0000\u0000D"+
		"\u01f8\u0001\u0000\u0000\u0000FL\u0006\u0000\uffff\uffff\u0000GH\u0003"+
		"\u0002\u0001\u0000HI\u0006\u0000\uffff\uffff\u0000IK\u0001\u0000\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0000\u0000\u0001PQ\u0006\u0000\uffff\uffff"+
		"\u0000Q\u0001\u0001\u0000\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0006"+
		"\u0001\uffff\uffff\u0000Tj\u0001\u0000\u0000\u0000UV\u0003\n\u0005\u0000"+
		"VW\u0006\u0001\uffff\uffff\u0000Wj\u0001\u0000\u0000\u0000Xj\u0003\b\u0004"+
		"\u0000Yj\u0003\u000e\u0007\u0000Z[\u0003\u0014\n\u0000[\\\u0006\u0001"+
		"\uffff\uffff\u0000\\j\u0001\u0000\u0000\u0000]^\u0003\u0018\f\u0000^_"+
		"\u0006\u0001\uffff\uffff\u0000_j\u0001\u0000\u0000\u0000`j\u0003\u001a"+
		"\r\u0000aj\u0003\u001c\u000e\u0000bj\u0003$\u0012\u0000cd\u0003:\u001d"+
		"\u0000de\u0005,\u0000\u0000ej\u0001\u0000\u0000\u0000fj\u0003<\u001e\u0000"+
		"gj\u0003&\u0013\u0000hj\u0003\u0006\u0003\u0000iR\u0001\u0000\u0000\u0000"+
		"iU\u0001\u0000\u0000\u0000iX\u0001\u0000\u0000\u0000iY\u0001\u0000\u0000"+
		"\u0000iZ\u0001\u0000\u0000\u0000i]\u0001\u0000\u0000\u0000i`\u0001\u0000"+
		"\u0000\u0000ia\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000ic\u0001"+
		"\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000j\u0003\u0001\u0000\u0000\u0000kl\u0005\u001e"+
		"\u0000\u0000lp\u0006\u0002\uffff\uffff\u0000mo\u0003\u0002\u0001\u0000"+
		"nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u001f\u0000\u0000tu\u0006\u0002\uffff\uffff\u0000"+
		"u\u0005\u0001\u0000\u0000\u0000vw\u0003@ \u0000wx\u00054\u0000\u0000x"+
		"y\u0005.\u0000\u0000yz\u00032\u0019\u0000z{\u0005/\u0000\u0000{|\u0005"+
		",\u0000\u0000|}\u0006\u0003\uffff\uffff\u0000}\u0007\u0001\u0000\u0000"+
		"\u0000~\u007f\u0003>\u001f\u0000\u007f\u0080\u00054\u0000\u0000\u0080"+
		"\u0081\u0005,\u0000\u0000\u0081\u0082\u0006\u0004\uffff\uffff\u0000\u0082"+
		"\t\u0001\u0000\u0000\u0000\u0083\u0085\u0003>\u001f\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u00054\u0000\u0000\u0087\u0088\u0006"+
		"\u0005\uffff\uffff\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0003"+
		"\f\u0006\u0000\u008a\u008b\u0006\u0005\uffff\uffff\u0000\u008b\u008c\u0005"+
		",\u0000\u0000\u008c\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0003,\u0016"+
		"\u0000\u008e\u008f\u0006\u0006\uffff\uffff\u0000\u008f\u009c\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0006\u0006\uffff"+
		"\uffff\u0000\u0092\u009c\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0003"+
		"\u0000\u0000\u0094\u009c\u0006\u0006\uffff\uffff\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u009c\u0006\u0006\uffff\uffff\u0000\u0097\u0098"+
		"\u0005\u0005\u0000\u0000\u0098\u009c\u0006\u0006\uffff\uffff\u0000\u0099"+
		"\u009a\u0005\u0006\u0000\u0000\u009a\u009c\u0006\u0006\uffff\uffff\u0000"+
		"\u009b\u008d\u0001\u0000\u0000\u0000\u009b\u0090\u0001\u0000\u0000\u0000"+
		"\u009b\u0093\u0001\u0000\u0000\u0000\u009b\u0095\u0001\u0000\u0000\u0000"+
		"\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\r\u0001\u0000\u0000\u0000\u009d\u009e\u0003D\"\u0000\u009e\u009f"+
		"\u0005 \u0000\u0000\u009f\u00a0\u0003\f\u0006\u0000\u00a0\u00a1\u0005"+
		",\u0000\u0000\u00a1\u00a2\u0006\u0007\uffff\uffff\u0000\u00a2\u000f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u001e\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0012\t\u0000\u00a5\u00ac\u0006\b\uffff\uffff\u0000\u00a6\u00a7\u0005"+
		"-\u0000\u0000\u00a7\u00a8\u0003\u0012\t\u0000\u00a8\u00a9\u0006\b\uffff"+
		"\uffff\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u001f"+
		"\u0000\u0000\u00b0\u00c0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001e"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3\u00ba\u0006\b\uffff"+
		"\uffff\u0000\u00b4\u00b5\u0005-\u0000\u0000\u00b5\u00b6\u0003\u0010\b"+
		"\u0000\u00b6\u00b7\u0006\b\uffff\uffff\u0000\u00b7\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00a3\u0001\u0000\u0000\u0000\u00bf\u00b1\u0001\u0000\u0000"+
		"\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003,\u0016\u0000"+
		"\u00c2\u00c3\u0006\t\uffff\uffff\u0000\u00c3\u0013\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0006\n\uffff\uffff\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000"+
		"\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8\u0003\u0016\u000b\u0000"+
		"\u00c8\u00cf\u0006\n\uffff\uffff\u0000\u00c9\u00ca\u0005-\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0016\u000b\u0000\u00cb\u00cc\u0006\n\uffff\uffff\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000"+
		"\u00d3\u00d4\u0005,\u0000\u0000\u00d4\u00d5\u0006\n\uffff\uffff\u0000"+
		"\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000\u00d7"+
		"\u00d8\u0006\u000b\uffff\uffff\u0000\u00d8\u0017\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\t\u0000\u0000\u00da\u00db\u0005\u001c\u0000\u0000\u00db"+
		"\u00dc\u0003.\u0017\u0000\u00dc\u00dd\u0005\u001d\u0000\u0000\u00dd\u00de"+
		"\u0006\f\uffff\uffff\u0000\u00de\u00df\u0003\u0004\u0002\u0000\u00df\u00e7"+
		"\u0006\f\uffff\uffff\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2"+
		"\u0006\f\uffff\uffff\u0000\u00e2\u00e3\u0003\u0004\u0002\u0000\u00e3\u00e4"+
		"\u0006\f\uffff\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0019"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\b\u0000\u0000\u00eb\u00ec\u0003>\u001f\u0000\u00ec\u00ed\u0005"+
		"4\u0000\u0000\u00ed\u00ee\u0006\r\uffff\uffff\u0000\u00ee\u00fc\u0005"+
		"\u001c\u0000\u0000\u00ef\u00f0\u0003>\u001f\u0000\u00f0\u00f1\u00054\u0000"+
		"\u0000\u00f1\u00f9\u0006\r\uffff\uffff\u0000\u00f2\u00f3\u0005-\u0000"+
		"\u0000\u00f3\u00f4\u0003>\u001f\u0000\u00f4\u00f5\u00054\u0000\u0000\u00f5"+
		"\u00f6\u0006\r\uffff\uffff\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u001d\u0000\u0000\u00ff"+
		"\u0100\u0005\u001e\u0000\u0000\u0100\u0104\u0006\r\uffff\uffff\u0000\u0101"+
		"\u0103\u0003\u0002\u0001\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108"+
		"\u0109\u00038\u001c\u0000\u0109\u010a\u0005,\u0000\u0000\u010a\u010b\u0005"+
		"\u001f\u0000\u0000\u010b\u010c\u0006\r\uffff\uffff\u0000\u010c\u001b\u0001"+
		"\u0000\u0000\u0000\u010d\u0112\u0003\u001e\u000f\u0000\u010e\u0112\u0003"+
		" \u0010\u0000\u010f\u0112\u0003\"\u0011\u0000\u0110\u0112\u0003$\u0012"+
		"\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u010e\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u001d\u0001\u0000\u0000\u0000\u0113\u0114\u0005\f\u0000\u0000"+
		"\u0114\u0115\u0005\u001c\u0000\u0000\u0115\u0116\u0006\u000f\uffff\uffff"+
		"\u0000\u0116\u0117\u0003.\u0017\u0000\u0117\u0118\u0006\u000f\uffff\uffff"+
		"\u0000\u0118\u0119\u0005\u001d\u0000\u0000\u0119\u011a\u0006\u000f\uffff"+
		"\uffff\u0000\u011a\u011b\u0003\u0004\u0002\u0000\u011b\u011c\u0006\u000f"+
		"\uffff\uffff\u0000\u011c\u001f\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u000b\u0000\u0000\u011e\u011f\u0005\u001c\u0000\u0000\u011f\u0122\u0006"+
		"\u0010\uffff\uffff\u0000\u0120\u0123\u0003\n\u0005\u0000\u0121\u0123\u0005"+
		",\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0003.\u0017"+
		"\u0000\u0125\u0126\u0005,\u0000\u0000\u0126\u0128\u0006\u0010\uffff\uffff"+
		"\u0000\u0127\u0129\u0003*\u0015\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0005\u001d\u0000\u0000\u012b\u012c\u0006\u0010\uffff\uffff"+
		"\u0000\u012c\u012d\u0003\u0004\u0002\u0000\u012d\u012e\u0006\u0010\uffff"+
		"\uffff\u0000\u012e!\u0001\u0000\u0000\u0000\u012f\u0130\u0005\r\u0000"+
		"\u0000\u0130\u0131\u0006\u0011\uffff\uffff\u0000\u0131\u0132\u0003\u0004"+
		"\u0002\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u0005\u001c\u0000"+
		"\u0000\u0134\u0135\u0003.\u0017\u0000\u0135\u0136\u0005\u001d\u0000\u0000"+
		"\u0136\u0137\u0005,\u0000\u0000\u0137\u0138\u0006\u0011\uffff\uffff\u0000"+
		"\u0138#\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u000f\u0000\u0000\u013a"+
		"\u013b\u0005,\u0000\u0000\u013b\u013c\u0006\u0012\uffff\uffff\u0000\u013c"+
		"%\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0000\u0000\u0000\u013e\'"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0005\n\u0000\u0000\u0140\u0141\u0003"+
		"\u0004\u0002\u0000\u0141)\u0001\u0000\u0000\u0000\u0142\u014a\u0003\n"+
		"\u0005\u0000\u0143\u0144\u00054\u0000\u0000\u0144\u0145\u00050\u0000\u0000"+
		"\u0145\u014a\u0006\u0015\uffff\uffff\u0000\u0146\u0147\u00054\u0000\u0000"+
		"\u0147\u0148\u00051\u0000\u0000\u0148\u014a\u0006\u0015\uffff\uffff\u0000"+
		"\u0149\u0142\u0001\u0000\u0000\u0000\u0149\u0143\u0001\u0000\u0000\u0000"+
		"\u0149\u0146\u0001\u0000\u0000\u0000\u014a+\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u00038\u001c\u0000\u014c\u014d\u0006\u0016\uffff\uffff\u0000\u014d"+
		"\u0152\u0001\u0000\u0000\u0000\u014e\u014f\u00030\u0018\u0000\u014f\u0150"+
		"\u0006\u0016\uffff\uffff\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u014b\u0001\u0000\u0000\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0152"+
		"-\u0001\u0000\u0000\u0000\u0153\u0154\u00030\u0018\u0000\u0154\u0155\u0006"+
		"\u0017\uffff\uffff\u0000\u0155/\u0001\u0000\u0000\u0000\u0156\u0157\u0003"+
		"2\u0019\u0000\u0157\u015f\u0006\u0018\uffff\uffff\u0000\u0158\u0159\u0007"+
		"\u0001\u0000\u0000\u0159\u015a\u0006\u0018\uffff\uffff\u0000\u015a\u015b"+
		"\u00032\u0019\u0000\u015b\u015c\u0006\u0018\uffff\uffff\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015e\u0161"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u01601\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u00034\u001a\u0000\u0163\u016b\u0006\u0019"+
		"\uffff\uffff\u0000\u0164\u0165\u0007\u0002\u0000\u0000\u0165\u0166\u0006"+
		"\u0019\uffff\uffff\u0000\u0166\u0167\u00034\u001a\u0000\u0167\u0168\u0006"+
		"\u0019\uffff\uffff\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0164"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0006\u0019\uffff\uffff\u0000\u016f3\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u00036\u001b\u0000\u0171\u0179\u0006\u001a\uffff\uffff\u0000\u0172\u0173"+
		"\u0007\u0003\u0000\u0000\u0173\u0174\u0006\u001a\uffff\uffff\u0000\u0174"+
		"\u0175\u00036\u001b\u0000\u0175\u0176\u0006\u001a\uffff\uffff\u0000\u0176"+
		"\u0178\u0001\u0000\u0000\u0000\u0177\u0172\u0001\u0000\u0000\u0000\u0178"+
		"\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0006\u001a\uffff\uffff\u0000"+
		"\u017d5\u0001\u0000\u0000\u0000\u017e\u0180\u0007\u0004\u0000\u0000\u017f"+
		"\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u00038\u001c\u0000\u0182\u0183"+
		"\u0006\u001b\uffff\uffff\u0000\u01837\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0005\u0010\u0000\u0000\u0185\u019c\u0006\u001c\uffff\uffff\u0000\u0186"+
		"\u0187\u0005\u0012\u0000\u0000\u0187\u019c\u0006\u001c\uffff\uffff\u0000"+
		"\u0188\u0189\u0005\u0014\u0000\u0000\u0189\u019c\u0006\u001c\uffff\uffff"+
		"\u0000\u018a\u018b\u0005\u0016\u0000\u0000\u018b\u019c\u0006\u001c\uffff"+
		"\uffff\u0000\u018c\u018d\u0005\u0018\u0000\u0000\u018d\u019c\u0006\u001c"+
		"\uffff\uffff\u0000\u018e\u018f\u00054\u0000\u0000\u018f\u019c\u0006\u001c"+
		"\uffff\uffff\u0000\u0190\u0191\u0003D\"\u0000\u0191\u0192\u0006\u001c"+
		"\uffff\uffff\u0000\u0192\u019c\u0001\u0000\u0000\u0000\u0193\u0194\u0005"+
		"\u001c\u0000\u0000\u0194\u0195\u0003,\u0016\u0000\u0195\u0196\u0005\u001d"+
		"\u0000\u0000\u0196\u0197\u0006\u001c\uffff\uffff\u0000\u0197\u019c\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0003:\u001d\u0000\u0199\u019a\u0006\u001c"+
		"\uffff\uffff\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0184\u0001"+
		"\u0000\u0000\u0000\u019b\u0186\u0001\u0000\u0000\u0000\u019b\u0188\u0001"+
		"\u0000\u0000\u0000\u019b\u018a\u0001\u0000\u0000\u0000\u019b\u018c\u0001"+
		"\u0000\u0000\u0000\u019b\u018e\u0001\u0000\u0000\u0000\u019b\u0190\u0001"+
		"\u0000\u0000\u0000\u019b\u0193\u0001\u0000\u0000\u0000\u019b\u0198\u0001"+
		"\u0000\u0000\u0000\u019c9\u0001\u0000\u0000\u0000\u019d\u019e\u00054\u0000"+
		"\u0000\u019e\u019f\u0005\u001c\u0000\u0000\u019f\u01ab\u0006\u001d\uffff"+
		"\uffff\u0000\u01a0\u01a1\u0003,\u0016\u0000\u01a1\u01a8\u0006\u001d\uffff"+
		"\uffff\u0000\u01a2\u01a3\u0005-\u0000\u0000\u01a3\u01a4\u0003,\u0016\u0000"+
		"\u01a4\u01a5\u0006\u001d\uffff\uffff\u0000\u01a5\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a0\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u001d\u0000"+
		"\u0000\u01ae\u01af\u0006\u001d\uffff\uffff\u0000\u01af;\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005\b\u0000\u0000\u01b1\u01b2\u0003>\u001f\u0000"+
		"\u01b2\u01b3\u00054\u0000\u0000\u01b3\u01b4\u0006\u001e\uffff\uffff\u0000"+
		"\u01b4\u01c2\u0005\u001c\u0000\u0000\u01b5\u01b6\u0003>\u001f\u0000\u01b6"+
		"\u01b7\u00054\u0000\u0000\u01b7\u01bf\u0006\u001e\uffff\uffff\u0000\u01b8"+
		"\u01b9\u0005-\u0000\u0000\u01b9\u01ba\u0003>\u001f\u0000\u01ba\u01bb\u0005"+
		"4\u0000\u0000\u01bb\u01bc\u0006\u001e\uffff\uffff\u0000\u01bc\u01be\u0001"+
		"\u0000\u0000\u0000\u01bd\u01b8\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01b5\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		"\u001d\u0000\u0000\u01c5\u01c6\u0005,\u0000\u0000\u01c6=\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0003@ \u0000\u01c8\u01c9\u0006\u001f\uffff\uffff\u0000"+
		"\u01c9\u01ce\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003B!\u0000\u01cb\u01cc"+
		"\u0006\u001f\uffff\uffff\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd"+
		"\u01c7\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01ce"+
		"?\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0011\u0000\u0000\u01d0\u01da"+
		"\u0006 \uffff\uffff\u0000\u01d1\u01d2\u0005\u0019\u0000\u0000\u01d2\u01da"+
		"\u0006 \uffff\uffff\u0000\u01d3\u01d4\u0005\u0013\u0000\u0000\u01d4\u01da"+
		"\u0006 \uffff\uffff\u0000\u01d5\u01d6\u0005\u0015\u0000\u0000\u01d6\u01da"+
		"\u0006 \uffff\uffff\u0000\u01d7\u01d8\u0005\u0017\u0000\u0000\u01d8\u01da"+
		"\u0006 \uffff\uffff\u0000\u01d9\u01cf\u0001\u0000\u0000\u0000\u01d9\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d3\u0001\u0000\u0000\u0000\u01d9\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01daA\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0003@ \u0000\u01dc\u01dd\u0005.\u0000"+
		"\u0000\u01dd\u01de\u0005/\u0000\u0000\u01de\u01df\u0006!\uffff\uffff\u0000"+
		"\u01df\u01e8\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003@ \u0000\u01e1\u01e2"+
		"\u0005.\u0000\u0000\u01e2\u01e3\u0005/\u0000\u0000\u01e3\u01e4\u0005."+
		"\u0000\u0000\u01e4\u01e5\u0005/\u0000\u0000\u01e5\u01e6\u0006!\uffff\uffff"+
		"\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01db\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e0\u0001\u0000\u0000\u0000\u01e8C\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u00054\u0000\u0000\u01ea\u01eb\u0005.\u0000\u0000\u01eb\u01ec"+
		"\u0003,\u0016\u0000\u01ec\u01ed\u0005/\u0000\u0000\u01ed\u01ee\u0006\""+
		"\uffff\uffff\u0000\u01ee\u01f9\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005"+
		"4\u0000\u0000\u01f0\u01f1\u0005.\u0000\u0000\u01f1\u01f2\u0003,\u0016"+
		"\u0000\u01f2\u01f3\u0005/\u0000\u0000\u01f3\u01f4\u0005.\u0000\u0000\u01f4"+
		"\u01f5\u0003,\u0016\u0000\u01f5\u01f6\u0005/\u0000\u0000\u01f6\u01f7\u0006"+
		"\"\uffff\uffff\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01e9\u0001"+
		"\u0000\u0000\u0000\u01f8\u01ef\u0001\u0000\u0000\u0000\u01f9E\u0001\u0000"+
		"\u0000\u0000\u001fLip\u0084\u009b\u00ac\u00ba\u00bf\u00cf\u00e7\u00f9"+
		"\u00fc\u0104\u0111\u0122\u0128\u0149\u0151\u015f\u016b\u0179\u017f\u019b"+
		"\u01a8\u01ab\u01bf\u01c2\u01cd\u01d9\u01e7\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}