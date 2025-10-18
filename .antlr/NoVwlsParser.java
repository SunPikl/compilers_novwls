// Generated from c:/Users/Morgan/Downloads/fall_25/Compilers/compilers_novwls/NoVwls.g4 by ANTLR 4.13.1
 import java.util.*; 
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, KW_PRNT=6, KW_SCN_NTGR=7, KW_SCN_FLT=8, 
		KW_SCN_STRNG=9, KW_SCN_CHR=10, KW_SCN_BL=11, KW_FNCTN=12, KW_F=13, KW_LS=14, 
		KW_FR=15, KW_WHL=16, KW_D=17, KW_RTN=18, KW_BRK=19, NT=20, KW_NT=21, FLT=22, 
		KW_FLT=23, BL=24, KW_BL=25, CHR=26, KW_CHR=27, STRNG=28, KW_STRNG=29, 
		KW_VD=30, KW_RRY=31, L_PRNTH=32, R_PRNTH=33, L_CRLYB=34, R_CRLYB=35, SSGN=36, 
		PLS=37, MNS=38, DVD=39, TMS=40, MOD=41, LSSTHN=42, GRTRTHN=43, LSSTHNREQL=44, 
		GRTRTHNREQL=45, EQL=46, NTEQL=47, SCOLN=48, CMM=49, WS=50, CMMNT_LN=51, 
		CMMNT_BLCK=52, DNT=53;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_blockStmt = 2, RULE_assignStmt = 3, 
		RULE_printStmt = 4, RULE_varC = 5, RULE_compareStmt = 6, RULE_functStmt = 7, 
		RULE_loopStmt = 8, RULE_while = 9, RULE_for = 10, RULE_doWhile = 11, RULE_comment = 12, 
		RULE_elseC = 13, RULE_forLoopInc = 14, RULE_expr = 15, RULE_comparison = 16, 
		RULE_comparisonExpr = 17, RULE_additiveExpr = 18, RULE_multiplicativeExpr = 19, 
		RULE_unaryExpr = 20, RULE_comparer = 21, RULE_factor = 22, RULE_functCall = 23, 
		RULE_dataType = 24, RULE_primitiveDT = 25, RULE_arrayDT = 26, RULE_array = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "blockStmt", "assignStmt", "printStmt", "varC", "compareStmt", 
			"functStmt", "loopStmt", "while", "for", "doWhile", "comment", "elseC", 
			"forLoopInc", "expr", "comparison", "comparisonExpr", "additiveExpr", 
			"multiplicativeExpr", "unaryExpr", "comparer", "factor", "functCall", 
			"dataType", "primitiveDT", "arrayDT", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'!'", "'['", "']'", "'prnt'", "'scnNT'", "'scnFLT'", 
			"'scnSTRNG'", "'scnCHR'", "'scnBL'", "'Fnctn'", "'f'", "'ls'", "'fr'", 
			"'whl'", "'d'", "'rtn'", "'brk'", null, "'nt'", null, "'flt'", null, 
			"'bl'", null, "'chr'", null, "'strng'", "'vd'", "'rry'", "'('", "')'", 
			"'{'", "'}'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", 
			"'=<'", "'=>'", "'=='", "'!='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "KW_PRNT", "KW_SCN_NTGR", "KW_SCN_FLT", 
			"KW_SCN_STRNG", "KW_SCN_CHR", "KW_SCN_BL", "KW_FNCTN", "KW_F", "KW_LS", 
			"KW_FR", "KW_WHL", "KW_D", "KW_RTN", "KW_BRK", "NT", "KW_NT", "FLT", 
			"KW_FLT", "BL", "KW_BL", "CHR", "KW_CHR", "STRNG", "KW_STRNG", "KW_VD", 
			"KW_RRY", "L_PRNTH", "R_PRNTH", "L_CRLYB", "R_CRLYB", "SSGN", "PLS", 
			"MNS", "DVD", "TMS", "MOD", "LSSTHN", "GRTRTHN", "LSSTHNREQL", "GRTRTHNREQL", 
			"EQL", "NTEQL", "SCOLN", "CMM", "WS", "CMMNT_LN", "CMMNT_BLCK", "DNT"
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

	public NoVwlsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(57);
				stmt();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(EOF);
			 printDiagnostics();
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
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
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
		public FunctCallContext functCall() {
			return getRuleContext(FunctCallContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				compareStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				functStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				loopStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				functCall();
				setState(73);
				match(SCOLN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				comment();
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
			setState(78);
			match(L_CRLYB);

			        scopeStack.push(new SymbolTable());
			    
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(80);
				stmt();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
	public static class AssignStmtContext extends ParserRuleContext {
		public DataTypeContext dt;
		public Token DNT;
		public ExprContext expr;
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode SSGN() { return getToken(NoVwlsParser.SSGN, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_SCN_NTGR() { return getToken(NoVwlsParser.KW_SCN_NTGR, 0); }
		public TerminalNode KW_SCN_STRNG() { return getToken(NoVwlsParser.KW_SCN_STRNG, 0); }
		public TerminalNode KW_SCN_FLT() { return getToken(NoVwlsParser.KW_SCN_FLT, 0); }
		public TerminalNode KW_SCN_CHR() { return getToken(NoVwlsParser.KW_SCN_CHR, 0); }
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
		enterRule(_localctx, 6, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715128832L) != 0)) {
				{
				setState(89);
				((AssignStmtContext)_localctx).dt = dataType();
				}
			}

			setState(92);
			((AssignStmtContext)_localctx).DNT = match(DNT);

			        currLHS = ((AssignStmtContext)_localctx).DNT.getText();
			        //preexistingLHS = mainTable.table.containsKey(currLHS);
			        preexistingLHS = scopeStack.peek().table.containsKey(currLHS);

			    
			setState(94);
			match(SSGN);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case NT:
			case FLT:
			case BL:
			case CHR:
			case STRNG:
			case L_PRNTH:
			case L_CRLYB:
			case PLS:
			case MNS:
			case DNT:
				{
				setState(95);
				((AssignStmtContext)_localctx).expr = expr();

				        // var assigned
				        assigned.add(currLHS);
				        Identifier newId = new Identifier();
				        newId.id = currLHS;

				        //if new var
				        if(!preexistingLHS){ 
				            //double check data type given AND matches
				            if(((AssignStmtContext)_localctx).dt.type == null){
				                error(((AssignStmtContext)_localctx).DNT, "data type is '" + ((AssignStmtContext)_localctx).dt.type + "'");
				            }

				            //set type
				            newId.type = ((AssignStmtContext)_localctx).dt.type; 
				        }

				        boolean error = false;
				        if(preexistingLHS){
				            // System.out.println("DEBUG: current type is " + ((AssignStmtContext)_localctx).expr.type);
				            // System.out.println("The current DNT's type is " + mainTable.table.get(currLHS).type);

				            //type check 
				            if(!(((AssignStmtContext)_localctx).expr.type.equals(mainTable.table.get(currLHS).type))){
				                error(((AssignStmtContext)_localctx).DNT, "type mismatch for " + currLHS + "'");
				                error = true;
				            }
				        } else {
				                //System.out.println(((AssignStmtContext)_localctx).dt.type + " and " + ((AssignStmtContext)_localctx).expr.type);
				            if(!(((AssignStmtContext)_localctx).expr.type.equals(((AssignStmtContext)_localctx).dt.type))){
				                //System.out.println("DEBUG issue with type match for " + currLHS + " where " + ((AssignStmtContext)_localctx).dt.type + " not " + ((AssignStmtContext)_localctx).expr.type);
				                error(((AssignStmtContext)_localctx).DNT, "type mismatch for " + currLHS );
				                error = true;
				            } 
				        }

				        if(!error){
				            newId.value = ((AssignStmtContext)_localctx).expr.value;
				            newId.content = ((AssignStmtContext)_localctx).expr.content;
				            newId.hasKnown = ((AssignStmtContext)_localctx).expr.hasKnownValue;
				            newId.hasBeenUsed = false;
				            //mainTable.table.put(newId.id, newId);
				            scopeStack.peek().table.put(newId.id, newId);
				        } else {
				            // newId.value = ((AssignStmtContext)_localctx).expr.value;
				            // newId.content = ((AssignStmtContext)_localctx).expr.content;
				            newId.hasKnown = false;
				            newId.hasBeenUsed = false;
				            //mainTable.table.put(newId.id, newId);
				            scopeStack.peek().table.put(newId.id, newId);
				        }

				        

				        // Clear LHS 
				        currLHS = null;
				        
				}
				break;
			case KW_SCN_NTGR:
				{
				setState(98);
				match(KW_SCN_NTGR);


				        //input
				        try{
				            int input = scan.nextInt();
				            if (scan.hasNextLine()) { //if scan.nextInt causes issues
				                scan.nextLine();  
				            }  
				            
				             // Successful RHS parse: consider variable now assigned.
				            assigned.add(currLHS);
				            Identifier newId = new Identifier();
				            newId.id = currLHS;
				            newId.value = input;
				            newId.type = "nt";
				            newId.hasKnown = true;
				            newId.hasBeenUsed = false;
				            scopeStack.peek().table.put(newId.id, newId);

				            //System.out.println(newId.id + " is " + newId.type + " with value " + newId.value);
				            // Clear LHS context.
				            currLHS = null;

				        } catch(Exception e){
				            System.err.println("Input was not an integer.");

				        }
				        

				        
				    
				}
				break;
			case KW_SCN_STRNG:
				{
				setState(100);
				match(KW_SCN_STRNG);

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
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			case KW_SCN_FLT:
				{
				setState(102);
				match(KW_SCN_FLT);

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
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println(newId.id + " is " + newId.type + " with value " + newId.value);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			case KW_SCN_CHR:
				{
				setState(104);
				match(KW_SCN_CHR);

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
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
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
	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext print;
		public VarCContext more;
		public TerminalNode KW_PRNT() { return getToken(NoVwlsParser.KW_PRNT, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarCContext> varC() {
			return getRuleContexts(VarCContext.class);
		}
		public VarCContext varC(int i) {
			return getRuleContext(VarCContext.class,i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(KW_PRNT);
			setState(111);
			match(L_PRNTH);
			setState(112);
			((PrintStmtContext)_localctx).print = expr();
			 
			            if(((PrintStmtContext)_localctx).print.type == null){
			                System.err.println("Error: cannot print null types");
			            }else if((((PrintStmtContext)_localctx).print.type.equals("strng") || ((PrintStmtContext)_localctx).print.type.equals("chr")) && ((PrintStmtContext)_localctx).print.content != null){
			                String printStr = ((PrintStmtContext)_localctx).print.content;
			                //printStr = printStr.substring(1);
			                printStr = printStr.substring(1, printStr.length() - 1);
			               System.out.print(printStr);
			            } else {

			                //System.out.println("DEBUG: the type is " + ((PrintStmtContext)_localctx).print.type);

			                if(((PrintStmtContext)_localctx).print.type.equals("flt")){ //if float, just give value (already in float form)
			                    System.out.print(((PrintStmtContext)_localctx).print.value);
			                } else {  //if bool or 
			                    int printval = (int)(Math.abs(((PrintStmtContext)_localctx).print.value));
			                    System.out.print(printval);
			                }
			                
			            }

			            
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(114);
				((PrintStmtContext)_localctx).more = varC();
				 
				            if(((PrintStmtContext)_localctx).print.type == null){
				                System.err.println("Error: cannot print null types");
				            }else if((((PrintStmtContext)_localctx).more.type.equals("strng") || ((PrintStmtContext)_localctx).more.type.equals("chr")) && ((PrintStmtContext)_localctx).more.content != null){
				                String printStr = ((PrintStmtContext)_localctx).more.content;
				                //System.out.println("precut " + printStr);
				                //printStr = printStr.substring(1);
				                printStr = printStr.substring(1, printStr.length() - 1);
				               System.out.print(printStr);
				            } else {

				                //System.out.println("DEBUG: the type is " + ((PrintStmtContext)_localctx).more.type);

				                if(((PrintStmtContext)_localctx).more.type.equals("flt")){ //if float, just give value (already in float form)
				                    System.out.print(((PrintStmtContext)_localctx).more.value);
				                } else {  //if bool or 
				                    int printval = (int)(Math.abs(((PrintStmtContext)_localctx).more.value));
				                    System.out.print(printval);
				                }
				                
				            }

				            
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                System.out.print("\n");
			            
			setState(123);
			match(R_PRNTH);
			setState(124);
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
	public static class VarCContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public ExprContext expr;
		public TerminalNode CMM() { return getToken(NoVwlsParser.CMM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varC; }
	}

	public final VarCContext varC() throws RecognitionException {
		VarCContext _localctx = new VarCContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CMM);
			setState(127);
			((VarCContext)_localctx).expr = expr();

			                if (((VarCContext)_localctx).expr.hasKnownValue) {
			                    ((VarCContext)_localctx).hasKnownValue =  true;
			                    ((VarCContext)_localctx).value =  ((VarCContext)_localctx).expr.value;
			                    ((VarCContext)_localctx).content =  ((VarCContext)_localctx).expr.content;
			                    ((VarCContext)_localctx).type =  ((VarCContext)_localctx).expr.type;
			                } else {
			                    ((VarCContext)_localctx).hasKnownValue =  false;
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
		public ComparisonContext a;
		public TerminalNode KW_F() { return getToken(NoVwlsParser.KW_F, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ElseCContext elseC() {
			return getRuleContext(ElseCContext.class,0);
		}
		public CompareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareStmt; }
	}

	public final CompareStmtContext compareStmt() throws RecognitionException {
		CompareStmtContext _localctx = new CompareStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(KW_F);
			setState(131);
			match(L_PRNTH);
			setState(132);
			((CompareStmtContext)_localctx).a = comparison();
			setState(133);
			match(R_PRNTH);
			setState(134);
			blockStmt();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LS) {
				{
				setState(135);
				elseC();
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
		enterRule(_localctx, 14, RULE_functStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(KW_FNCTN);
			setState(139);
			((FunctStmtContext)_localctx).d = dataType();
			setState(140);
			((FunctStmtContext)_localctx).a = match(DNT);

			        //add to function table
			        Identifier function = new Identifier();
			        function.id = ((FunctStmtContext)_localctx).a.getText();
			        function.type = ((FunctStmtContext)_localctx).d.type;
			        function.isFunction = true;
			        function.hasBeenUsed = false;
			        function.hasKnown = true;
			        
			        //store funct
			        scopeStack.peek().table.put(function.id, function);

			        //System.out.println("DEBUG: DNT " + ((FunctStmtContext)_localctx).a.getText() + " is " + scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).id);

			    
			setState(142);
			match(L_PRNTH);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715128832L) != 0)) {
				{
				setState(143);
				((FunctStmtContext)_localctx).dt = dataType();
				setState(144);
				((FunctStmtContext)_localctx).b = match(DNT);

				        //store arg
				        Identifier firstP = new Identifier();
				        firstP.type = ((FunctStmtContext)_localctx).dt.type;
				        firstP.id = ((FunctStmtContext)_localctx).b.getText();
				        firstP.hasKnown = false;
				        firstP.hasBeenUsed = false;

				        //add to list
				        scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).parameters.add(firstP);
				    
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(146);
					match(CMM);
					setState(147);
					((FunctStmtContext)_localctx).dt2 = dataType();
					setState(148);
					((FunctStmtContext)_localctx).c = match(DNT);

					        //store arg
					        Identifier nextP = new Identifier();
					        nextP.type = ((FunctStmtContext)_localctx).dt2.type;
					        nextP.id = ((FunctStmtContext)_localctx).c.getText();
					        nextP.hasKnown = false;
					        nextP.hasBeenUsed = false;

					        //add to list
					        scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText()).parameters.add(nextP);
					    
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(158);
			match(R_PRNTH);
			setState(159);
			match(L_CRLYB);

			        
			        //copy of funct's values for scope
			        Identifier tempFunct = scopeStack.peek().table.get(((FunctStmtContext)_localctx).a.getText());

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
			        
			        
			    
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(161);
				stmt();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(KW_RTN);
			setState(168);
			((FunctStmtContext)_localctx).factor = factor();
			setState(169);
			match(SCOLN);
			setState(170);
			match(R_CRLYB);

			        //System.out.println("DEBUG: type of funct:" + ((FunctStmtContext)_localctx).d.type + " type of factor:" + ((FunctStmtContext)_localctx).factor.type);
			        
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
			            
			        }

			        //end scope
			        scopeStack.pop();
			        System.out.println("scope deleted");

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
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopStmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHL:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				while_();
				}
				break;
			case KW_FR:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				for_();
				}
				break;
			case KW_D:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				doWhile();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode KW_WHL() { return getToken(NoVwlsParser.KW_WHL, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(KW_WHL);
			setState(179);
			match(L_PRNTH);
			setState(180);
			comparison();
			setState(181);
			match(R_PRNTH);
			setState(182);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode KW_FR() { return getToken(NoVwlsParser.KW_FR, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public ForLoopIncContext forLoopInc() {
			return getRuleContext(ForLoopIncContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(KW_FR);
			setState(185);
			match(L_PRNTH);
			setState(186);
			assignStmt();
			setState(187);
			comparison();
			setState(188);
			match(SCOLN);
			setState(189);
			forLoopInc();
			setState(190);
			match(R_PRNTH);
			setState(191);
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
	public static class DoWhileContext extends ParserRuleContext {
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
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(KW_D);
			setState(194);
			blockStmt();
			setState(195);
			match(KW_WHL);
			setState(196);
			match(L_PRNTH);
			setState(197);
			comparison();
			setState(198);
			match(R_PRNTH);
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
		enterRule(_localctx, 24, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		public ElseCContext elseC() {
			return getRuleContext(ElseCContext.class,0);
		}
		public ElseCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseC; }
	}

	public final ElseCContext elseC() throws RecognitionException {
		ElseCContext _localctx = new ElseCContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseC);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(202);
				match(KW_LS);
				setState(203);
				blockStmt();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(KW_LS);
				setState(205);
				blockStmt();
				setState(206);
				elseC();
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
	public static class ForLoopIncContext extends ParserRuleContext {
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode SSGN() { return getToken(NoVwlsParser.SSGN, 0); }
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ForLoopIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInc; }
	}

	public final ForLoopIncContext forLoopInc() throws RecognitionException {
		ForLoopIncContext _localctx = new ForLoopIncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoopInc);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(DNT);
				setState(211);
				match(SSGN);
				setState(212);
				additiveExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(DNT);
				setState(214);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(DNT);
				setState(216);
				match(T__1);
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
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public FactorContext a;
		public ComparisonExprContext b;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((ExprContext)_localctx).a = factor();

				                if (((ExprContext)_localctx).a.hasKnownValue) {
				                    ((ExprContext)_localctx).hasKnownValue =  true;
				                    ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value;
				                    ((ExprContext)_localctx).content =  ((ExprContext)_localctx).a.content;
				                    ((ExprContext)_localctx).type =  ((ExprContext)_localctx).a.type;
				                } else {
				                    ((ExprContext)_localctx).hasKnownValue =  false;
				                } 
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((ExprContext)_localctx).b = comparisonExpr();

				                if (((ExprContext)_localctx).b.hasKnownValue) {
				                    ((ExprContext)_localctx).hasKnownValue =  true;
				                    ((ExprContext)_localctx).value =  ((ExprContext)_localctx).b.value;
				                    ((ExprContext)_localctx).type =  ((ExprContext)_localctx).b.type;
				                } else {
				                    ((ExprContext)_localctx).hasKnownValue =  false;
				                } 
				            
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
		public boolean hasKnownValue;
		public float value;
		public ComparisonExprContext a;
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((ComparisonContext)_localctx).a = comparisonExpr();

			        //check if comparison gives a bool (thus comparing values)
			        if(!(((ComparisonContext)_localctx).a.type.equals("bl"))){
			            System.err.println("Input was not an integer.");
			        } else {
			            ((ComparisonContext)_localctx).hasKnownValue =  true;
			            ((ComparisonContext)_localctx).value =  ((ComparisonContext)_localctx).a.value;
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
		public boolean hasKnownValue;
		public String type;
		public float value;
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
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((ComparisonExprContext)_localctx).a = additiveExpr();
			  
			        if (((ComparisonExprContext)_localctx).a.hasKnownValue) {  
			            ((ComparisonExprContext)_localctx).hasKnownValue =  true; 
			            ((ComparisonExprContext)_localctx).value =  ((ComparisonExprContext)_localctx).a.value; 
			            ((ComparisonExprContext)_localctx).type =  ((ComparisonExprContext)_localctx).a.type;
			        } else ((ComparisonExprContext)_localctx).hasKnownValue =  false;  
			    
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277076930199552L) != 0)) {
				{
				{
				setState(232);
				((ComparisonExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 277076930199552L) != 0)) ) {
					((ComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 
				        String opType = ((ComparisonExprContext)_localctx).op.getText(); 
				    
				setState(234);
				((ComparisonExprContext)_localctx).b = additiveExpr();
				  
				        if (((ComparisonExprContext)_localctx).b.hasKnownValue) {  
				            ((ComparisonExprContext)_localctx).hasKnownValue =  true;  
				        } else ((ComparisonExprContext)_localctx).hasKnownValue =  false;  

				        if (opType.equals(">") && ((ComparisonExprContext)_localctx).a.value > ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else if (opType.equals("<") && ((ComparisonExprContext)_localctx).a.value < ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else if (opType.equals("==") && ((ComparisonExprContext)_localctx).a.value == ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else if (opType.equals("<=") && ((ComparisonExprContext)_localctx).a.value <= ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else if (opType.equals(">=") && ((ComparisonExprContext)_localctx).a.value >= ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else if (opType.equals("!=") && ((ComparisonExprContext)_localctx).a.value != ((ComparisonExprContext)_localctx).b.value) {  
				            ((ComparisonExprContext)_localctx).value =  1;  
				        } else ((ComparisonExprContext)_localctx).value =  0;  
				        
				        //set to bool type
				        ((ComparisonExprContext)_localctx).type =  "bl";

				    
				}
				}
				setState(241);
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
		public boolean hasKnownValue;
		public String type;
		public float value;
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
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((AdditiveExprContext)_localctx).a = multiplicativeExpr();

			        if (((AdditiveExprContext)_localctx).a.hasKnownValue) {
			            ((AdditiveExprContext)_localctx).hasKnownValue =  true;
			            ((AdditiveExprContext)_localctx).value =  ((AdditiveExprContext)_localctx).a.value;
			            ((AdditiveExprContext)_localctx).type =  ((AdditiveExprContext)_localctx).a.type;
			        } else ((AdditiveExprContext)_localctx).hasKnownValue =  false;
			    
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLS || _la==MNS) {
				{
				{
				setState(244);
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
				setState(245);
				((AdditiveExprContext)_localctx).b = multiplicativeExpr();

				        if (_localctx.hasKnownValue && ((AdditiveExprContext)_localctx).b.hasKnownValue) {
				            if (((AdditiveExprContext)_localctx).op.getText().equals("+")) {
				                ((AdditiveExprContext)_localctx).value =  _localctx.value + ((AdditiveExprContext)_localctx).b.value;
				            } else {
				                ((AdditiveExprContext)_localctx).value =  _localctx.value - ((AdditiveExprContext)_localctx).b.value;
				            }

				            //check if a or b are floats, change to float
				            if (((AdditiveExprContext)_localctx).a.type.equals("flt") || ((AdditiveExprContext)_localctx).b.type.equals("flt")) {
				                ((AdditiveExprContext)_localctx).type =  "flt";
				            } else {
				                ((AdditiveExprContext)_localctx).type =  "nt";
				            }

				        } else {
				            ((AdditiveExprContext)_localctx).hasKnownValue =  false;
				        }

				    
				}
				}
				setState(252);
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
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
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
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			((MultiplicativeExprContext)_localctx).a = unaryExpr();

			        if (((MultiplicativeExprContext)_localctx).a.hasKnownValue) {
			            ((MultiplicativeExprContext)_localctx).hasKnownValue =  true;
			            ((MultiplicativeExprContext)_localctx).value =  ((MultiplicativeExprContext)_localctx).a.value;
			            ((MultiplicativeExprContext)_localctx).type =  ((MultiplicativeExprContext)_localctx).a.type;
			        } else ((MultiplicativeExprContext)_localctx).hasKnownValue =  false;
			    
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(255);
				((MultiplicativeExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
					((MultiplicativeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				((MultiplicativeExprContext)_localctx).b = unaryExpr();

				        // Test if divide by 0
				        if (((MultiplicativeExprContext)_localctx).b.hasKnownValue && ((MultiplicativeExprContext)_localctx).op.getText().equals("/") && ((MultiplicativeExprContext)_localctx).b.value == 0) {
				            error(((MultiplicativeExprContext)_localctx).op, "division by zero");
				            ((MultiplicativeExprContext)_localctx).hasKnownValue =  false;  
				        } else if (_localctx.hasKnownValue && ((MultiplicativeExprContext)_localctx).b.hasKnownValue) {
				            if (((MultiplicativeExprContext)_localctx).op.getText().equals("*")) {
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value * ((MultiplicativeExprContext)_localctx).b.value;
				            } else if (((MultiplicativeExprContext)_localctx).op.getText().equals("%")){
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value % ((MultiplicativeExprContext)_localctx).b.value;
				            } else {
				                ((MultiplicativeExprContext)_localctx).value =  _localctx.value / ((MultiplicativeExprContext)_localctx).b.value;
				            }


				            //check if a or b are floats, change to float
				            if (((MultiplicativeExprContext)_localctx).a.type.equals("flt") || ((MultiplicativeExprContext)_localctx).b.type.equals("flt")) {
				                ((MultiplicativeExprContext)_localctx).type =  "flt";
				            } else {
				                ((MultiplicativeExprContext)_localctx).type =  "nt";
				            }

				        } else {
				            ((MultiplicativeExprContext)_localctx).hasKnownValue =  false;
				        }


				    
				}
				}
				setState(263);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
		public FactorContext a;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLS() { return getToken(NoVwlsParser.PLS, 0); }
		public TerminalNode MNS() { return getToken(NoVwlsParser.MNS, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316860424L) != 0)) {
				{
				setState(264);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316860424L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(267);
			((UnaryExprContext)_localctx).a = factor();

			        if (((UnaryExprContext)_localctx).a.hasKnownValue) {
			            ((UnaryExprContext)_localctx).hasKnownValue =  true;
			            ((UnaryExprContext)_localctx).value =  ((UnaryExprContext)_localctx).a.value;
			            ((UnaryExprContext)_localctx).type =  ((UnaryExprContext)_localctx).a.type;
			        } else ((UnaryExprContext)_localctx).hasKnownValue =  false;
			    
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
	public static class ComparerContext extends ParserRuleContext {
		public TerminalNode LSSTHN() { return getToken(NoVwlsParser.LSSTHN, 0); }
		public TerminalNode GRTRTHN() { return getToken(NoVwlsParser.GRTRTHN, 0); }
		public TerminalNode LSSTHNREQL() { return getToken(NoVwlsParser.LSSTHNREQL, 0); }
		public TerminalNode GRTRTHNREQL() { return getToken(NoVwlsParser.GRTRTHNREQL, 0); }
		public TerminalNode EQL() { return getToken(NoVwlsParser.EQL, 0); }
		public TerminalNode NTEQL() { return getToken(NoVwlsParser.NTEQL, 0); }
		public ComparerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparer; }
	}

	public final ComparerContext comparer() throws RecognitionException {
		ComparerContext _localctx = new ComparerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 277076930199552L) != 0)) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public boolean hasKnownValue;
		public String type;
		public float value;
		public String content;
		public Token NT;
		public Token FLT;
		public Token BL;
		public Token CHR;
		public Token STRNG;
		public Token DNT;
		public ExprContext expr;
		public FunctCallContext functCall;
		public TerminalNode NT() { return getToken(NoVwlsParser.NT, 0); }
		public TerminalNode FLT() { return getToken(NoVwlsParser.FLT, 0); }
		public TerminalNode BL() { return getToken(NoVwlsParser.BL, 0); }
		public TerminalNode CHR() { return getToken(NoVwlsParser.CHR, 0); }
		public TerminalNode STRNG() { return getToken(NoVwlsParser.STRNG, 0); }
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public FunctCallContext functCall() {
			return getRuleContext(FunctCallContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((FactorContext)_localctx).NT = match(NT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 

				            ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).NT.getText()); 
				            
				            ((FactorContext)_localctx).type =  "nt";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((FactorContext)_localctx).FLT = match(FLT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).value =  Float.parseFloat(((FactorContext)_localctx).FLT.getText()); 
				            ((FactorContext)_localctx).type =  "flt";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				((FactorContext)_localctx).BL = match(BL);
				 
				            ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).type =  "bl";
				            if(((FactorContext)_localctx).BL.getText().equals("true")){
				                ((FactorContext)_localctx).value =  1; //set true
				            } else if(((FactorContext)_localctx).BL.getText().equals("false")){
				                ((FactorContext)_localctx).value =  0; //set false
				            } else {
				                ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).BL.getText());  //autosets to 0 or 1
				            }
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				((FactorContext)_localctx).CHR = match(CHR);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).CHR.getText();
				            ((FactorContext)_localctx).type =  "chr";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				((FactorContext)_localctx).STRNG = match(STRNG);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).STRNG.getText();
				            ((FactorContext)_localctx).type =  "strng";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				((FactorContext)_localctx).DNT = match(DNT);

				            String id = ((FactorContext)_localctx).DNT.getText();
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
				                    error(((FactorContext)_localctx).DNT, "self-reference on first assignment of '" + currLHS + "'");
				                } else {
				                    error(((FactorContext)_localctx).DNT, "use of variable '" + id + "' before assignment");
				                }
				                ((FactorContext)_localctx).hasKnownValue =  false;
				                ((FactorContext)_localctx).type =  "null";
				            } else {
				                //System.out.println("DEBUG: Here type assigned to DNT " + currentId.type); //checking variable assign
				                currentId.hasBeenUsed = true;
				                ((FactorContext)_localctx).hasKnownValue =  currentId.hasKnown;
				                ((FactorContext)_localctx).value =  currentId.value;
				                ((FactorContext)_localctx).type =  currentId.type;
				                ((FactorContext)_localctx).content =  currentId.content;
				            }
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				match(DNT);
				setState(286);
				match(T__3);
				setState(287);
				factor();
				setState(288);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				match(L_PRNTH);
				setState(291);
				((FactorContext)_localctx).expr = expr();
				setState(292);
				match(R_PRNTH);
				 
				            if (((FactorContext)_localctx).expr.hasKnownValue) {
				                ((FactorContext)_localctx).hasKnownValue =  true;
				                ((FactorContext)_localctx).value =  ((FactorContext)_localctx).expr.value;
				                ((FactorContext)_localctx).content =  ((FactorContext)_localctx).expr.content;
				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).expr.type;
				            } else ((FactorContext)_localctx).hasKnownValue =  false;
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				((FactorContext)_localctx).functCall = functCall();

				         if (((FactorContext)_localctx).functCall.hasKnownValue) {
				            ((FactorContext)_localctx).hasKnownValue =  true;
				            ((FactorContext)_localctx).value =  ((FactorContext)_localctx).functCall.value;
				            ((FactorContext)_localctx).type =  ((FactorContext)_localctx).functCall.type;
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).functCall.content;
				        } else ((FactorContext)_localctx).hasKnownValue =  false;
				    
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
		public Token DNT;
		public FactorContext factor;
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
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
		enterRule(_localctx, 46, RULE_functCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((FunctCallContext)_localctx).DNT = match(DNT);
			setState(301);
			match(L_PRNTH);

			        //check if DNT is in function
			        String id = ((FunctCallContext)_localctx).DNT.getText();
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
			            error(((FunctCallContext)_localctx).DNT, "Function '" + ((FunctCallContext)_localctx).DNT.getText() + "' does not exist.");
			        } else {
			            // function exists
			            currentId.hasBeenUsed = true;
			            ((FunctCallContext)_localctx).hasKnownValue =  currentId.hasKnown;
			            
			        }

			        //check if factor matches type set in function
			        //assign if so, error if not

			        //init check for amount params 
			        int paramCount = 0;
			    
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007221087141888L) != 0)) {
				{
				setState(303);
				((FunctCallContext)_localctx).factor = factor();

				        //test if params
				        if((currentId !=null) && (currentId.parameters.size() > 0)){
				            Identifier inputPar = scopeStack.peek().table.get(currentId.id).parameters.get(0);
				            //check param
				            if(((FunctCallContext)_localctx).factor.type.equals(inputPar.type)){
				                //System.out.println("DEBUG: parameter success");
				            } else {
				                error((((FunctCallContext)_localctx).factor!=null?(((FunctCallContext)_localctx).factor.start):null), "The input parameter input type '" + ((FunctCallContext)_localctx).factor.type +"' is not the same as parameter type '" + inputPar.type + "'");
				            }
				        } else {
				            error(((FunctCallContext)_localctx).DNT, "There are no parameters for function '" + ((FunctCallContext)_localctx).DNT.getText() + "'");
				        }

				        paramCount ++; //inc param count
				        
				    
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(305);
					match(CMM);
					setState(306);
					((FunctCallContext)_localctx).factor = factor();

					        if((currentId !=null) && (currentId.parameters.size() > paramCount)){
					            Identifier inputPar = scopeStack.peek().table.get(currentId.id).parameters.get(paramCount);
					            //check param
					            if(((FunctCallContext)_localctx).factor.type.equals(inputPar.type)){
					                //System.out.println("DEBUG: parameter success");
					            } else {
					                error((((FunctCallContext)_localctx).factor!=null?(((FunctCallContext)_localctx).factor.start):null), "The input parameter input type '" + ((FunctCallContext)_localctx).factor.type +"' is not the same as parameter type '" + inputPar.type + "'");
					            }
					        } else {
					            error(((FunctCallContext)_localctx).DNT, "There are no additional parameters for function '" + ((FunctCallContext)_localctx).DNT.getText() + "'");
					        }

					        paramCount ++;

					    
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(R_PRNTH);

			        if(paramCount < currentId.parameters.size()){
			            error(((FunctCallContext)_localctx).DNT, "Function is missing parameters.");
			        } else if (paramCount > currentId.parameters.size()){
			            error(((FunctCallContext)_localctx).DNT, "Function has excessive parameters.");
			        }

			        //sets value, should be whatever is returned into the function DNT
			        ((FunctCallContext)_localctx).value =  currentId.value;
			        ((FunctCallContext)_localctx).type =  currentId.type;
			        ((FunctCallContext)_localctx).content =  currentId.content;
			        ((FunctCallContext)_localctx).hasKnownValue =  currentId.hasKnown;

			    
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
		enterRule(_localctx, 48, RULE_dataType);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((DataTypeContext)_localctx).a = primitiveDT();

				        ((DataTypeContext)_localctx).type =  ((DataTypeContext)_localctx).a.type;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				arrayDT();
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
		enterRule(_localctx, 50, RULE_primitiveDT);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(KW_NT);

				        ((PrimitiveDTContext)_localctx).type =  "nt";
				    
				}
				break;
			case KW_STRNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(KW_STRNG);

				        ((PrimitiveDTContext)_localctx).type =  "strng";
				    
				}
				break;
			case KW_FLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(KW_FLT);

				        ((PrimitiveDTContext)_localctx).type =  "flt";
				    
				}
				break;
			case KW_BL:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(KW_BL);

				        ((PrimitiveDTContext)_localctx).type =  "bl";
				    
				}
				break;
			case KW_CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
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
		public PrimitiveDTContext primitiveDT() {
			return getRuleContext(PrimitiveDTContext.class,0);
		}
		public TerminalNode KW_RRY() { return getToken(NoVwlsParser.KW_RRY, 0); }
		public TerminalNode NT() { return getToken(NoVwlsParser.NT, 0); }
		public ArrayDTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDT; }
	}

	public final ArrayDTContext arrayDT() throws RecognitionException {
		ArrayDTContext _localctx = new ArrayDTContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayDT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			primitiveDT();
			setState(338);
			match(KW_RRY);
			setState(339);
			match(T__3);
			setState(340);
			match(NT);
			setState(341);
			match(T__4);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
		public List<TerminalNode> CMM() { return getTokens(NoVwlsParser.CMM); }
		public TerminalNode CMM(int i) {
			return getToken(NoVwlsParser.CMM, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(L_CRLYB);
			setState(344);
			factor();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(345);
				match(CMM);
				setState(346);
				factor();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(R_CRLYB);
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
		"\u0004\u00015\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"v\b\u0004\n\u0004\f\u0004y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0089\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0098\b\u0007\n\u0007\f\u0007\u009b"+
		"\t\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00a3\b\u0007\n\u0007\f\u0007\u00a6\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00d1\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00da\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00e2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00ee\b\u0011\n\u0011\f\u0011\u00f1\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f9"+
		"\b\u0012\n\u0012\f\u0012\u00fc\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0104\b\u0013\n\u0013"+
		"\f\u0013\u0107\t\u0013\u0001\u0014\u0003\u0014\u010a\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u012b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0136\b\u0017\n\u0017\f\u0017\u0139\t\u0017\u0003\u0017\u013b\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0144\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0150\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u015c\b\u001b\n\u001b\f\u001b\u015f\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0246\u0000\u0005\u0001\u000034\u0001\u0000*/\u0001\u0000%&\u0001\u0000"+
		"\')\u0002\u0000\u0003\u0003%&\u0174\u00008\u0001\u0000\u0000\u0000\u0002"+
		"L\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006Z\u0001"+
		"\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000"+
		"\f\u0082\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010"+
		"\u00b0\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000\u0000\u0000\u0014"+
		"\u00b8\u0001\u0000\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018"+
		"\u00c8\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c"+
		"\u00d9\u0001\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00e3"+
		"\u0001\u0000\u0000\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00f2\u0001"+
		"\u0000\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000(\u0109\u0001\u0000\u0000"+
		"\u0000*\u010e\u0001\u0000\u0000\u0000,\u012a\u0001\u0000\u0000\u0000."+
		"\u012c\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u014f\u0001"+
		"\u0000\u0000\u00004\u0151\u0001\u0000\u0000\u00006\u0157\u0001\u0000\u0000"+
		"\u00008<\u0006\u0000\uffff\uffff\u00009;\u0003\u0002\u0001\u0000:9\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0000\u0000\u0001@A\u0006\u0000\uffff\uffff\u0000A\u0001"+
		"\u0001\u0000\u0000\u0000BM\u0003\u0004\u0002\u0000CM\u0003\u0006\u0003"+
		"\u0000DM\u0003\b\u0004\u0000EM\u0003\f\u0006\u0000FM\u0003\u000e\u0007"+
		"\u0000GM\u0003\u0010\b\u0000HI\u0003.\u0017\u0000IJ\u00050\u0000\u0000"+
		"JM\u0001\u0000\u0000\u0000KM\u0003\u0018\f\u0000LB\u0001\u0000\u0000\u0000"+
		"LC\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000"+
		"\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000"+
		"NO\u0005\"\u0000\u0000OS\u0006\u0002\uffff\uffff\u0000PR\u0003\u0002\u0001"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005#\u0000\u0000WX\u0006\u0002\uffff\uffff\u0000"+
		"X\u0005\u0001\u0000\u0000\u0000Y[\u00030\u0018\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u00055"+
		"\u0000\u0000]^\u0006\u0003\uffff\uffff\u0000^j\u0005$\u0000\u0000_`\u0003"+
		"\u001e\u000f\u0000`a\u0006\u0003\uffff\uffff\u0000ak\u0001\u0000\u0000"+
		"\u0000bc\u0005\u0007\u0000\u0000ck\u0006\u0003\uffff\uffff\u0000de\u0005"+
		"\t\u0000\u0000ek\u0006\u0003\uffff\uffff\u0000fg\u0005\b\u0000\u0000g"+
		"k\u0006\u0003\uffff\uffff\u0000hi\u0005\n\u0000\u0000ik\u0006\u0003\uffff"+
		"\uffff\u0000j_\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jd\u0001"+
		"\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u00050\u0000\u0000m\u0007\u0001\u0000\u0000"+
		"\u0000no\u0005\u0006\u0000\u0000op\u0005 \u0000\u0000pq\u0003\u001e\u000f"+
		"\u0000qw\u0006\u0004\uffff\uffff\u0000rs\u0003\n\u0005\u0000st\u0006\u0004"+
		"\uffff\uffff\u0000tv\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0006\u0004"+
		"\uffff\uffff\u0000{|\u0005!\u0000\u0000|}\u00050\u0000\u0000}\t\u0001"+
		"\u0000\u0000\u0000~\u007f\u00051\u0000\u0000\u007f\u0080\u0003\u001e\u000f"+
		"\u0000\u0080\u0081\u0006\u0005\uffff\uffff\u0000\u0081\u000b\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0084\u0005 \u0000"+
		"\u0000\u0084\u0085\u0003 \u0010\u0000\u0085\u0086\u0005!\u0000\u0000\u0086"+
		"\u0088\u0003\u0004\u0002\u0000\u0087\u0089\u0003\u001a\r\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\r\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\f\u0000\u0000\u008b\u008c\u00030"+
		"\u0018\u0000\u008c\u008d\u00055\u0000\u0000\u008d\u008e\u0006\u0007\uffff"+
		"\uffff\u0000\u008e\u009c\u0005 \u0000\u0000\u008f\u0090\u00030\u0018\u0000"+
		"\u0090\u0091\u00055\u0000\u0000\u0091\u0099\u0006\u0007\uffff\uffff\u0000"+
		"\u0092\u0093\u00051\u0000\u0000\u0093\u0094\u00030\u0018\u0000\u0094\u0095"+
		"\u00055\u0000\u0000\u0095\u0096\u0006\u0007\uffff\uffff\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u008f\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005!\u0000\u0000\u009f\u00a0\u0005\"\u0000\u0000\u00a0\u00a4\u0006"+
		"\u0007\uffff\uffff\u0000\u00a1\u00a3\u0003\u0002\u0001\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0012\u0000\u0000\u00a8\u00a9\u0003,\u0016\u0000\u00a9\u00aa\u0005"+
		"0\u0000\u0000\u00aa\u00ab\u0005#\u0000\u0000\u00ab\u00ac\u0006\u0007\uffff"+
		"\uffff\u0000\u00ac\u000f\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003\u0012"+
		"\t\u0000\u00ae\u00b1\u0003\u0014\n\u0000\u00af\u00b1\u0003\u0016\u000b"+
		"\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b4\u0005 \u0000\u0000"+
		"\u00b4\u00b5\u0003 \u0010\u0000\u00b5\u00b6\u0005!\u0000\u0000\u00b6\u00b7"+
		"\u0003\u0004\u0002\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u000f\u0000\u0000\u00b9\u00ba\u0005 \u0000\u0000\u00ba\u00bb\u0003"+
		"\u0006\u0003\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc\u00bd\u00050\u0000"+
		"\u0000\u00bd\u00be\u0003\u001c\u000e\u0000\u00be\u00bf\u0005!\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0004\u0002\u0000\u00c0\u0015\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0011\u0000\u0000\u00c2\u00c3\u0003\u0004\u0002\u0000"+
		"\u00c3\u00c4\u0005\u0010\u0000\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5"+
		"\u00c6\u0003 \u0010\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u0017\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0007\u0000\u0000\u0000\u00c9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u000e\u0000\u0000\u00cb\u00d1\u0003"+
		"\u0004\u0002\u0000\u00cc\u00cd\u0005\u000e\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0004\u0002\u0000\u00ce\u00cf\u0003\u001a\r\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u00055\u0000"+
		"\u0000\u00d3\u00d4\u0005$\u0000\u0000\u00d4\u00da\u0003$\u0012\u0000\u00d5"+
		"\u00d6\u00055\u0000\u0000\u00d6\u00da\u0005\u0001\u0000\u0000\u00d7\u00d8"+
		"\u00055\u0000\u0000\u00d8\u00da\u0005\u0002\u0000\u0000\u00d9\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u001d\u0001\u0000\u0000\u0000\u00db\u00dc\u0003"+
		",\u0016\u0000\u00dc\u00dd\u0006\u000f\uffff\uffff\u0000\u00dd\u00e2\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0003\"\u0011\u0000\u00df\u00e0\u0006\u000f"+
		"\uffff\uffff\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00db\u0001"+
		"\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e2\u001f\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0003\"\u0011\u0000\u00e4\u00e5\u0006\u0010"+
		"\uffff\uffff\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003$\u0012"+
		"\u0000\u00e7\u00ef\u0006\u0011\uffff\uffff\u0000\u00e8\u00e9\u0007\u0001"+
		"\u0000\u0000\u00e9\u00ea\u0006\u0011\uffff\uffff\u0000\u00ea\u00eb\u0003"+
		"$\u0012\u0000\u00eb\u00ec\u0006\u0011\uffff\uffff\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0#\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0003&\u0013\u0000\u00f3\u00fa\u0006\u0012\uffff"+
		"\uffff\u0000\u00f4\u00f5\u0007\u0002\u0000\u0000\u00f5\u00f6\u0003&\u0013"+
		"\u0000\u00f6\u00f7\u0006\u0012\uffff\uffff\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb%\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u0105\u0006\u0013\uffff\uffff"+
		"\u0000\u00ff\u0100\u0007\u0003\u0000\u0000\u0100\u0101\u0003(\u0014\u0000"+
		"\u0101\u0102\u0006\u0013\uffff\uffff\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\'\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0007\u0004\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0003,\u0016\u0000\u010c\u010d\u0006\u0014\uffff\uffff\u0000"+
		"\u010d)\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0001\u0000\u0000\u010f"+
		"+\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0014\u0000\u0000\u0111\u012b"+
		"\u0006\u0016\uffff\uffff\u0000\u0112\u0113\u0005\u0016\u0000\u0000\u0113"+
		"\u012b\u0006\u0016\uffff\uffff\u0000\u0114\u0115\u0005\u0018\u0000\u0000"+
		"\u0115\u012b\u0006\u0016\uffff\uffff\u0000\u0116\u0117\u0005\u001a\u0000"+
		"\u0000\u0117\u012b\u0006\u0016\uffff\uffff\u0000\u0118\u0119\u0005\u001c"+
		"\u0000\u0000\u0119\u012b\u0006\u0016\uffff\uffff\u0000\u011a\u011b\u0005"+
		"5\u0000\u0000\u011b\u012b\u0006\u0016\uffff\uffff\u0000\u011c\u012b\u0003"+
		"6\u001b\u0000\u011d\u011e\u00055\u0000\u0000\u011e\u011f\u0005\u0004\u0000"+
		"\u0000\u011f\u0120\u0003,\u0016\u0000\u0120\u0121\u0005\u0005\u0000\u0000"+
		"\u0121\u012b\u0001\u0000\u0000\u0000\u0122\u0123\u0005 \u0000\u0000\u0123"+
		"\u0124\u0003\u001e\u000f\u0000\u0124\u0125\u0005!\u0000\u0000\u0125\u0126"+
		"\u0006\u0016\uffff\uffff\u0000\u0126\u012b\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0003.\u0017\u0000\u0128\u0129\u0006\u0016\uffff\uffff\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u0110\u0001\u0000\u0000\u0000\u012a"+
		"\u0112\u0001\u0000\u0000\u0000\u012a\u0114\u0001\u0000\u0000\u0000\u012a"+
		"\u0116\u0001\u0000\u0000\u0000\u012a\u0118\u0001\u0000\u0000\u0000\u012a"+
		"\u011a\u0001\u0000\u0000\u0000\u012a\u011c\u0001\u0000\u0000\u0000\u012a"+
		"\u011d\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a"+
		"\u0127\u0001\u0000\u0000\u0000\u012b-\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u00055\u0000\u0000\u012d\u012e\u0005 \u0000\u0000\u012e\u013a\u0006\u0017"+
		"\uffff\uffff\u0000\u012f\u0130\u0003,\u0016\u0000\u0130\u0137\u0006\u0017"+
		"\uffff\uffff\u0000\u0131\u0132\u00051\u0000\u0000\u0132\u0133\u0003,\u0016"+
		"\u0000\u0133\u0134\u0006\u0017\uffff\uffff\u0000\u0134\u0136\u0001\u0000"+
		"\u0000\u0000\u0135\u0131\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u012f\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005!\u0000"+
		"\u0000\u013d\u013e\u0006\u0017\uffff\uffff\u0000\u013e/\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u00032\u0019\u0000\u0140\u0141\u0006\u0018\uffff\uffff"+
		"\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0144\u00034\u001a\u0000"+
		"\u0143\u013f\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000"+
		"\u01441\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0015\u0000\u0000\u0146"+
		"\u0150\u0006\u0019\uffff\uffff\u0000\u0147\u0148\u0005\u001d\u0000\u0000"+
		"\u0148\u0150\u0006\u0019\uffff\uffff\u0000\u0149\u014a\u0005\u0017\u0000"+
		"\u0000\u014a\u0150\u0006\u0019\uffff\uffff\u0000\u014b\u014c\u0005\u0019"+
		"\u0000\u0000\u014c\u0150\u0006\u0019\uffff\uffff\u0000\u014d\u014e\u0005"+
		"\u001b\u0000\u0000\u014e\u0150\u0006\u0019\uffff\uffff\u0000\u014f\u0145"+
		"\u0001\u0000\u0000\u0000\u014f\u0147\u0001\u0000\u0000\u0000\u014f\u0149"+
		"\u0001\u0000\u0000\u0000\u014f\u014b\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u0152\u0003"+
		"2\u0019\u0000\u0152\u0153\u0005\u001f\u0000\u0000\u0153\u0154\u0005\u0004"+
		"\u0000\u0000\u0154\u0155\u0005\u0014\u0000\u0000\u0155\u0156\u0005\u0005"+
		"\u0000\u0000\u01565\u0001\u0000\u0000\u0000\u0157\u0158\u0005\"\u0000"+
		"\u0000\u0158\u015d\u0003,\u0016\u0000\u0159\u015a\u00051\u0000\u0000\u015a"+
		"\u015c\u0003,\u0016\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015f"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0005#\u0000\u0000\u01617\u0001\u0000"+
		"\u0000\u0000\u0018<LSZjw\u0088\u0099\u009c\u00a4\u00b0\u00d0\u00d9\u00e1"+
		"\u00ef\u00fa\u0105\u0109\u012a\u0137\u013a\u0143\u014f\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}