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
		RULE_elseC = 13, RULE_argC = 14, RULE_forLoopInc = 15, RULE_expr = 16, 
		RULE_comparison = 17, RULE_comparisonExpr = 18, RULE_additiveExpr = 19, 
		RULE_multiplicativeExpr = 20, RULE_unaryExpr = 21, RULE_comparer = 22, 
		RULE_factor = 23, RULE_functCall = 24, RULE_dataType = 25, RULE_primitiveDT = 26, 
		RULE_arrayDT = 27, RULE_array = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "blockStmt", "assignStmt", "printStmt", "varC", "compareStmt", 
			"functStmt", "loopStmt", "while", "for", "doWhile", "comment", "elseC", 
			"argC", "forLoopInc", "expr", "comparison", "comparisonExpr", "additiveExpr", 
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
	        boolean isFunction; //if DNT is a function
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(59);
				stmt();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				blockStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				assignStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				printStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				compareStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				functStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				loopStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				functCall();
				setState(75);
				match(SCOLN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
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
			setState(80);
			match(L_CRLYB);

			        scopeStack.push(new SymbolTable());
			    
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(82);
				stmt();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715128832L) != 0)) {
				{
				setState(91);
				((AssignStmtContext)_localctx).dt = dataType();
				}
			}

			setState(94);
			((AssignStmtContext)_localctx).DNT = match(DNT);

			        currLHS = ((AssignStmtContext)_localctx).DNT.getText();
			        //preexistingLHS = mainTable.table.containsKey(currLHS);
			        preexistingLHS = scopeStack.peek().table.containsKey(currLHS);

			    
			setState(96);
			match(SSGN);
			setState(108);
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
				setState(97);
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
				setState(100);
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
				            //mainTable.table.put(newId.id, newId);
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
				setState(102);
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
				        //mainTable.table.put(newId.id, newId);
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			case KW_SCN_FLT:
				{
				setState(104);
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
				        //mainTable.table.put(newId.id, newId);
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println(newId.id + " is " + newId.type + " with value " + newId.value);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			case KW_SCN_CHR:
				{
				setState(106);
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
				        //mainTable.table.put(newId.id, newId);
				        scopeStack.peek().table.put(newId.id, newId);

				        //System.out.println("DEBUG: " + newId.id + " is " + newId.type + " with value " + newId.content);
				        // Clear LHS context.
				        currLHS = null;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
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
			setState(112);
			match(KW_PRNT);
			setState(113);
			match(L_PRNTH);
			setState(114);
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

			            
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(116);
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
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                System.out.print("\n");
			            
			setState(125);
			match(R_PRNTH);
			setState(126);
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
			setState(128);
			match(CMM);
			setState(129);
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
			setState(132);
			match(KW_F);
			setState(133);
			match(L_PRNTH);
			setState(134);
			((CompareStmtContext)_localctx).a = comparison();
			setState(135);
			match(R_PRNTH);
			setState(136);
			blockStmt();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LS) {
				{
				setState(137);
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
		public DataTypeContext dataType;
		public Token DNT;
		public DataTypeContext dt;
		public DataTypeContext dt2;
		public FactorContext factor;
		public TerminalNode KW_FNCTN() { return getToken(NoVwlsParser.KW_FNCTN, 0); }
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
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public TerminalNode KW_RTN() { return getToken(NoVwlsParser.KW_RTN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
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
			setState(140);
			match(KW_FNCTN);
			setState(141);
			((FunctStmtContext)_localctx).dataType = dataType();
			setState(142);
			((FunctStmtContext)_localctx).DNT = match(DNT);
			setState(143);
			match(L_PRNTH);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715128832L) != 0)) {
				{
				setState(144);
				((FunctStmtContext)_localctx).dt = ((FunctStmtContext)_localctx).dataType = dataType();
				setState(145);
				((FunctStmtContext)_localctx).DNT = match(DNT);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(146);
					match(CMM);
					setState(147);
					((FunctStmtContext)_localctx).dt2 = ((FunctStmtContext)_localctx).dataType = dataType();
					setState(148);
					((FunctStmtContext)_localctx).DNT = match(DNT);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(157);
			match(R_PRNTH);
			setState(158);
			match(L_CRLYB);


			        scopeStack.push(new SymbolTable());

			        //add to function table
			        Identifier function = new Identifier();
			        function.id = ((FunctStmtContext)_localctx).DNT.getText();
			        function.type = ((FunctStmtContext)_localctx).dataType.type;
			        function.isFunction = true;

			        //store args??
			        
			    
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(160);
				stmt();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(KW_RTN);
			setState(167);
			((FunctStmtContext)_localctx).factor = factor();
			setState(168);
			match(SCOLN);
			setState(169);
			match(R_CRLYB);

			        //attach funct value 
			        if(!(((FunctStmtContext)_localctx).dataType.type.equals(((FunctStmtContext)_localctx).factor.type))){
			            //is not returning same data type
			            error(((FunctStmtContext)_localctx).DNT, "Type incompatability between function and return value");
			        } else {
			            if((((FunctStmtContext)_localctx).factor.type.equals("strng") || ((FunctStmtContext)_localctx).factor.type.equals("chr"))){
			                //mainTable.table.get(((FunctStmtContext)_localctx).DNT.getText()).content = ((FunctStmtContext)_localctx).factor.content;
			            } else {
			                //mainTable.table.get(((FunctStmtContext)_localctx).DNT.getText()).value = ((FunctStmtContext)_localctx).factor.value;
			            }
			            
			        }

			        //end scope
			        scopeStack.pop();
			        System.out.println("scope deleted");
			    
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHL:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				while_();
				}
				break;
			case KW_FR:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				for_();
				}
				break;
			case KW_D:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
			setState(177);
			match(KW_WHL);
			setState(178);
			match(L_PRNTH);
			setState(179);
			comparison();
			setState(180);
			match(R_PRNTH);
			setState(181);
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
			setState(183);
			match(KW_FR);
			setState(184);
			match(L_PRNTH);
			setState(185);
			assignStmt();
			setState(186);
			comparison();
			setState(187);
			match(SCOLN);
			setState(188);
			forLoopInc();
			setState(189);
			match(R_PRNTH);
			setState(190);
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
			setState(192);
			match(KW_D);
			setState(193);
			blockStmt();
			setState(194);
			match(KW_WHL);
			setState(195);
			match(L_PRNTH);
			setState(196);
			comparison();
			setState(197);
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
			setState(199);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(201);
				match(KW_LS);
				setState(202);
				blockStmt();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(KW_LS);
				setState(204);
				blockStmt();
				setState(205);
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
	public static class ArgCContext extends ParserRuleContext {
		public DataTypeContext dt;
		public Token DNT;
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ArgCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argC; }
	}

	public final ArgCContext argC() throws RecognitionException {
		ArgCContext _localctx = new ArgCContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((ArgCContext)_localctx).dt = dataType();
			setState(210);
			((ArgCContext)_localctx).DNT = match(DNT);

			            //create DNT without value, doesnt matter if name repeated UNLESS in funct scope
			            // currLHS = ((ArgCContext)_localctx).DNT.getText();
			            // // preexistingLHS = scopeStack.peek().table.containsKey(currLHS);
			            // Identifier parameter = new Identifier();
			            // parameter.id = currLHS;
			            // parameter.type = 
			            // if(((ArgCContext)_localctx).dt.type == null){
			            //     error(((ArgCContext)_localctx).DNT, "data type is '" + ((ArgCContext)_localctx).dt.type + "'");
			            // }

			            // //set type
			            // newId.type = ((ArgCContext)_localctx).dt.type;

			            //add to function scope
			            
			        
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
		enterRule(_localctx, 30, RULE_forLoopInc);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(DNT);
				setState(214);
				match(SSGN);
				setState(215);
				additiveExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(DNT);
				setState(217);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(DNT);
				setState(219);
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
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
				setState(225);
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
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 36, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((ComparisonExprContext)_localctx).a = additiveExpr();
			  
			        if (((ComparisonExprContext)_localctx).a.hasKnownValue) {  
			            ((ComparisonExprContext)_localctx).hasKnownValue =  true; 
			            ((ComparisonExprContext)_localctx).value =  ((ComparisonExprContext)_localctx).a.value; 
			            ((ComparisonExprContext)_localctx).type =  ((ComparisonExprContext)_localctx).a.type;
			        } else ((ComparisonExprContext)_localctx).hasKnownValue =  false;  
			    
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277076930199552L) != 0)) {
				{
				{
				setState(235);
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
				    
				setState(237);
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
				setState(244);
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
		enterRule(_localctx, 38, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((AdditiveExprContext)_localctx).a = multiplicativeExpr();

			        if (((AdditiveExprContext)_localctx).a.hasKnownValue) {
			            ((AdditiveExprContext)_localctx).hasKnownValue =  true;
			            ((AdditiveExprContext)_localctx).value =  ((AdditiveExprContext)_localctx).a.value;
			            ((AdditiveExprContext)_localctx).type =  ((AdditiveExprContext)_localctx).a.type;
			        } else ((AdditiveExprContext)_localctx).hasKnownValue =  false;
			    
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLS || _la==MNS) {
				{
				{
				setState(247);
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
				setState(248);
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
				setState(255);
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
		enterRule(_localctx, 40, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((MultiplicativeExprContext)_localctx).a = unaryExpr();

			        if (((MultiplicativeExprContext)_localctx).a.hasKnownValue) {
			            ((MultiplicativeExprContext)_localctx).hasKnownValue =  true;
			            ((MultiplicativeExprContext)_localctx).value =  ((MultiplicativeExprContext)_localctx).a.value;
			            ((MultiplicativeExprContext)_localctx).type =  ((MultiplicativeExprContext)_localctx).a.type;
			        } else ((MultiplicativeExprContext)_localctx).hasKnownValue =  false;
			    
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(258);
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
				setState(259);
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
				setState(266);
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
		enterRule(_localctx, 42, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316860424L) != 0)) {
				{
				setState(267);
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

			setState(270);
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
		enterRule(_localctx, 44, RULE_comparer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((FactorContext)_localctx).NT = match(NT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 

				            ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).NT.getText()); 
				            
				            ((FactorContext)_localctx).type =  "nt";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((FactorContext)_localctx).FLT = match(FLT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).value =  Float.parseFloat(((FactorContext)_localctx).FLT.getText()); 
				            ((FactorContext)_localctx).type =  "flt";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
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
				setState(281);
				((FactorContext)_localctx).CHR = match(CHR);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).CHR.getText();
				            ((FactorContext)_localctx).type =  "chr";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				((FactorContext)_localctx).STRNG = match(STRNG);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).STRNG.getText();
				            ((FactorContext)_localctx).type =  "strng";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
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
				setState(287);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				match(DNT);
				setState(289);
				match(T__3);
				setState(290);
				factor();
				setState(291);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(293);
				match(L_PRNTH);
				setState(294);
				((FactorContext)_localctx).expr = expr();
				setState(295);
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
				setState(298);
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
		enterRule(_localctx, 48, RULE_functCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((FunctCallContext)_localctx).DNT = match(DNT);
			setState(304);
			match(L_PRNTH);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007221087141888L) != 0)) {
				{
				setState(305);
				factor();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMM) {
					{
					{
					setState(306);
					match(CMM);
					setState(307);
					factor();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(315);
			match(R_PRNTH);

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

			            //sets value, should be whatever is returned into the function DNT
			            ((FunctCallContext)_localctx).value =  currentId.value;
			            ((FunctCallContext)_localctx).type =  currentId.type;
			            ((FunctCallContext)_localctx).content =  currentId.content;

			            //check params
			            
			        }

			        //check if factor matches type set in function
			        //assign if so, error if not
			    
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
		enterRule(_localctx, 50, RULE_dataType);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((DataTypeContext)_localctx).a = primitiveDT();

				        ((DataTypeContext)_localctx).type =  ((DataTypeContext)_localctx).a.type;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		enterRule(_localctx, 52, RULE_primitiveDT);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(KW_NT);

				        ((PrimitiveDTContext)_localctx).type =  "nt";
				    
				}
				break;
			case KW_STRNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(KW_STRNG);

				        ((PrimitiveDTContext)_localctx).type =  "strng";
				    
				}
				break;
			case KW_FLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(KW_FLT);

				        ((PrimitiveDTContext)_localctx).type =  "flt";
				    
				}
				break;
			case KW_BL:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(KW_BL);

				        ((PrimitiveDTContext)_localctx).type =  "bl";
				    
				}
				break;
			case KW_CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
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
		enterRule(_localctx, 54, RULE_arrayDT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			primitiveDT();
			setState(337);
			match(KW_RRY);
			setState(338);
			match(T__3);
			setState(339);
			match(NT);
			setState(340);
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
		enterRule(_localctx, 56, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(L_CRLYB);
			setState(343);
			factor();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(344);
				match(CMM);
				setState(345);
				factor();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
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
		"\u0004\u00015\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b\u0000"+
		"\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003]\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003m\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007\u009a\t\u0007\u0003"+
		"\u0007\u009c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00a2\b\u0007\n\u0007\f\u0007\u00a5\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00b0\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00d0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00dd\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e5\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f1\b\u0012\n\u0012\f\u0012"+
		"\u00f4\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00fc\b\u0013\n\u0013\f\u0013\u00ff\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0107\b\u0014\n\u0014\f\u0014\u010a\t\u0014\u0001\u0015\u0003\u0015"+
		"\u010d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u012e\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0135\b\u0018\n\u0018"+
		"\f\u0018\u0138\t\u0018\u0003\u0018\u013a\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0143\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u014f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u015b\b\u001c\n\u001c\f\u001c\u015e\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0005\u0001\u0000"+
		"34\u0001\u0000*/\u0001\u0000%&\u0001\u0000\')\u0002\u0000\u0003\u0003"+
		"%&\u0172\u0000:\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000"+
		"\u0004P\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bp\u0001"+
		"\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000"+
		"\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000"+
		"\u0000\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000"+
		"\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000"+
		"\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000\u001c\u00d1\u0001\u0000"+
		"\u0000\u0000\u001e\u00dc\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000"+
		"\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00e9\u0001\u0000\u0000\u0000"+
		"&\u00f5\u0001\u0000\u0000\u0000(\u0100\u0001\u0000\u0000\u0000*\u010c"+
		"\u0001\u0000\u0000\u0000,\u0111\u0001\u0000\u0000\u0000.\u012d\u0001\u0000"+
		"\u0000\u00000\u012f\u0001\u0000\u0000\u00002\u0142\u0001\u0000\u0000\u0000"+
		"4\u014e\u0001\u0000\u0000\u00006\u0150\u0001\u0000\u0000\u00008\u0156"+
		"\u0001\u0000\u0000\u0000:>\u0006\u0000\uffff\uffff\u0000;=\u0003\u0002"+
		"\u0001\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000AB\u0005\u0000\u0000\u0001BC\u0006\u0000\uffff"+
		"\uffff\u0000C\u0001\u0001\u0000\u0000\u0000DO\u0003\u0004\u0002\u0000"+
		"EO\u0003\u0006\u0003\u0000FO\u0003\b\u0004\u0000GO\u0003\f\u0006\u0000"+
		"HO\u0003\u000e\u0007\u0000IO\u0003\u0010\b\u0000JK\u00030\u0018\u0000"+
		"KL\u00050\u0000\u0000LO\u0001\u0000\u0000\u0000MO\u0003\u0018\f\u0000"+
		"ND\u0001\u0000\u0000\u0000NE\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000"+
		"\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NI\u0001\u0000"+
		"\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0003"+
		"\u0001\u0000\u0000\u0000PQ\u0005\"\u0000\u0000QU\u0006\u0002\uffff\uffff"+
		"\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005#\u0000\u0000YZ\u0006"+
		"\u0002\uffff\uffff\u0000Z\u0005\u0001\u0000\u0000\u0000[]\u00032\u0019"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u00055\u0000\u0000_`\u0006\u0003\uffff\uffff\u0000`l\u0005"+
		"$\u0000\u0000ab\u0003 \u0010\u0000bc\u0006\u0003\uffff\uffff\u0000cm\u0001"+
		"\u0000\u0000\u0000de\u0005\u0007\u0000\u0000em\u0006\u0003\uffff\uffff"+
		"\u0000fg\u0005\t\u0000\u0000gm\u0006\u0003\uffff\uffff\u0000hi\u0005\b"+
		"\u0000\u0000im\u0006\u0003\uffff\uffff\u0000jk\u0005\n\u0000\u0000km\u0006"+
		"\u0003\uffff\uffff\u0000la\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000"+
		"\u0000lf\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u00050\u0000\u0000o\u0007\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0006\u0000\u0000qr\u0005 \u0000\u0000rs\u0003"+
		" \u0010\u0000sy\u0006\u0004\uffff\uffff\u0000tu\u0003\n\u0005\u0000uv"+
		"\u0006\u0004\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wt\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0006\u0004\uffff\uffff\u0000}~\u0005!\u0000\u0000~\u007f\u00050\u0000"+
		"\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0081\u00051\u0000\u0000"+
		"\u0081\u0082\u0003 \u0010\u0000\u0082\u0083\u0006\u0005\uffff\uffff\u0000"+
		"\u0083\u000b\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085"+
		"\u0086\u0005 \u0000\u0000\u0086\u0087\u0003\"\u0011\u0000\u0087\u0088"+
		"\u0005!\u0000\u0000\u0088\u008a\u0003\u0004\u0002\u0000\u0089\u008b\u0003"+
		"\u001a\r\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008d\u0005\f\u0000"+
		"\u0000\u008d\u008e\u00032\u0019\u0000\u008e\u008f\u00055\u0000\u0000\u008f"+
		"\u009b\u0005 \u0000\u0000\u0090\u0091\u00032\u0019\u0000\u0091\u0098\u0005"+
		"5\u0000\u0000\u0092\u0093\u00051\u0000\u0000\u0093\u0094\u00032\u0019"+
		"\u0000\u0094\u0095\u00055\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0092\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u0090\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005!\u0000\u0000\u009e"+
		"\u009f\u0005\"\u0000\u0000\u009f\u00a3\u0006\u0007\uffff\uffff\u0000\u00a0"+
		"\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0012\u0000\u0000\u00a7"+
		"\u00a8\u0003.\u0017\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9\u00aa\u0005"+
		"#\u0000\u0000\u00aa\u00ab\u0006\u0007\uffff\uffff\u0000\u00ab\u000f\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b0\u0003\u0012\t\u0000\u00ad\u00b0\u0003\u0014"+
		"\n\u0000\u00ae\u00b0\u0003\u0016\u000b\u0000\u00af\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0010\u0000"+
		"\u0000\u00b2\u00b3\u0005 \u0000\u0000\u00b3\u00b4\u0003\"\u0011\u0000"+
		"\u00b4\u00b5\u0005!\u0000\u0000\u00b5\u00b6\u0003\u0004\u0002\u0000\u00b6"+
		"\u0013\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8"+
		"\u00b9\u0005 \u0000\u0000\u00b9\u00ba\u0003\u0006\u0003\u0000\u00ba\u00bb"+
		"\u0003\"\u0011\u0000\u00bb\u00bc\u00050\u0000\u0000\u00bc\u00bd\u0003"+
		"\u001e\u000f\u0000\u00bd\u00be\u0005!\u0000\u0000\u00be\u00bf\u0003\u0004"+
		"\u0002\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0011"+
		"\u0000\u0000\u00c1\u00c2\u0003\u0004\u0002\u0000\u00c2\u00c3\u0005\u0010"+
		"\u0000\u0000\u00c3\u00c4\u0005 \u0000\u0000\u00c4\u00c5\u0003\"\u0011"+
		"\u0000\u00c5\u00c6\u0005!\u0000\u0000\u00c6\u0017\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0007\u0000\u0000\u0000\u00c8\u0019\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u000e\u0000\u0000\u00ca\u00d0\u0003\u0004\u0002\u0000"+
		"\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00cd\u0003\u0004\u0002\u0000"+
		"\u00cd\u00ce\u0003\u001a\r\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00d0"+
		"\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2\u00032\u0019\u0000\u00d2\u00d3"+
		"\u00055\u0000\u0000\u00d3\u00d4\u0006\u000e\uffff\uffff\u0000\u00d4\u001d"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u00055\u0000\u0000\u00d6\u00d7\u0005"+
		"$\u0000\u0000\u00d7\u00dd\u0003&\u0013\u0000\u00d8\u00d9\u00055\u0000"+
		"\u0000\u00d9\u00dd\u0005\u0001\u0000\u0000\u00da\u00db\u00055\u0000\u0000"+
		"\u00db\u00dd\u0005\u0002\u0000\u0000\u00dc\u00d5\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u001f\u0001\u0000\u0000\u0000\u00de\u00df\u0003.\u0017\u0000\u00df"+
		"\u00e0\u0006\u0010\uffff\uffff\u0000\u00e0\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003$\u0012\u0000\u00e2\u00e3\u0006\u0010\uffff\uffff\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0003$\u0012\u0000\u00e7\u00e8\u0006\u0011\uffff\uffff\u0000\u00e8"+
		"#\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003&\u0013\u0000\u00ea\u00f2\u0006"+
		"\u0012\uffff\uffff\u0000\u00eb\u00ec\u0007\u0001\u0000\u0000\u00ec\u00ed"+
		"\u0006\u0012\uffff\uffff\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee\u00ef"+
		"\u0006\u0012\uffff\uffff\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"%\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0003(\u0014\u0000\u00f6\u00fd\u0006\u0013\uffff\uffff\u0000\u00f7\u00f8"+
		"\u0007\u0002\u0000\u0000\u00f8\u00f9\u0003(\u0014\u0000\u00f9\u00fa\u0006"+
		"\u0013\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\'\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0003"+
		"*\u0015\u0000\u0101\u0108\u0006\u0014\uffff\uffff\u0000\u0102\u0103\u0007"+
		"\u0003\u0000\u0000\u0103\u0104\u0003*\u0015\u0000\u0104\u0105\u0006\u0014"+
		"\uffff\uffff\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0102\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109)\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010d\u0007\u0004"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0003.\u0017"+
		"\u0000\u010f\u0110\u0006\u0015\uffff\uffff\u0000\u0110+\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0007\u0001\u0000\u0000\u0112-\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\u0014\u0000\u0000\u0114\u012e\u0006\u0017\uffff\uffff"+
		"\u0000\u0115\u0116\u0005\u0016\u0000\u0000\u0116\u012e\u0006\u0017\uffff"+
		"\uffff\u0000\u0117\u0118\u0005\u0018\u0000\u0000\u0118\u012e\u0006\u0017"+
		"\uffff\uffff\u0000\u0119\u011a\u0005\u001a\u0000\u0000\u011a\u012e\u0006"+
		"\u0017\uffff\uffff\u0000\u011b\u011c\u0005\u001c\u0000\u0000\u011c\u012e"+
		"\u0006\u0017\uffff\uffff\u0000\u011d\u011e\u00055\u0000\u0000\u011e\u012e"+
		"\u0006\u0017\uffff\uffff\u0000\u011f\u012e\u00038\u001c\u0000\u0120\u0121"+
		"\u00055\u0000\u0000\u0121\u0122\u0005\u0004\u0000\u0000\u0122\u0123\u0003"+
		".\u0017\u0000\u0123\u0124\u0005\u0005\u0000\u0000\u0124\u012e\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005 \u0000\u0000\u0126\u0127\u0003 \u0010\u0000"+
		"\u0127\u0128\u0005!\u0000\u0000\u0128\u0129\u0006\u0017\uffff\uffff\u0000"+
		"\u0129\u012e\u0001\u0000\u0000\u0000\u012a\u012b\u00030\u0018\u0000\u012b"+
		"\u012c\u0006\u0017\uffff\uffff\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
		"\u012d\u0113\u0001\u0000\u0000\u0000\u012d\u0115\u0001\u0000\u0000\u0000"+
		"\u012d\u0117\u0001\u0000\u0000\u0000\u012d\u0119\u0001\u0000\u0000\u0000"+
		"\u012d\u011b\u0001\u0000\u0000\u0000\u012d\u011d\u0001\u0000\u0000\u0000"+
		"\u012d\u011f\u0001\u0000\u0000\u0000\u012d\u0120\u0001\u0000\u0000\u0000"+
		"\u012d\u0125\u0001\u0000\u0000\u0000\u012d\u012a\u0001\u0000\u0000\u0000"+
		"\u012e/\u0001\u0000\u0000\u0000\u012f\u0130\u00055\u0000\u0000\u0130\u0139"+
		"\u0005 \u0000\u0000\u0131\u0136\u0003.\u0017\u0000\u0132\u0133\u00051"+
		"\u0000\u0000\u0133\u0135\u0003.\u0017\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005!\u0000\u0000\u013c\u013d\u0006\u0018\uffff\uffff"+
		"\u0000\u013d1\u0001\u0000\u0000\u0000\u013e\u013f\u00034\u001a\u0000\u013f"+
		"\u0140\u0006\u0019\uffff\uffff\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u00036\u001b\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142"+
		"\u0141\u0001\u0000\u0000\u0000\u01433\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005\u0015\u0000\u0000\u0145\u014f\u0006\u001a\uffff\uffff\u0000\u0146"+
		"\u0147\u0005\u001d\u0000\u0000\u0147\u014f\u0006\u001a\uffff\uffff\u0000"+
		"\u0148\u0149\u0005\u0017\u0000\u0000\u0149\u014f\u0006\u001a\uffff\uffff"+
		"\u0000\u014a\u014b\u0005\u0019\u0000\u0000\u014b\u014f\u0006\u001a\uffff"+
		"\uffff\u0000\u014c\u014d\u0005\u001b\u0000\u0000\u014d\u014f\u0006\u001a"+
		"\uffff\uffff\u0000\u014e\u0144\u0001\u0000\u0000\u0000\u014e\u0146\u0001"+
		"\u0000\u0000\u0000\u014e\u0148\u0001\u0000\u0000\u0000\u014e\u014a\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f5\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u00034\u001a\u0000\u0151\u0152\u0005\u001f\u0000"+
		"\u0000\u0152\u0153\u0005\u0004\u0000\u0000\u0153\u0154\u0005\u0014\u0000"+
		"\u0000\u0154\u0155\u0005\u0005\u0000\u0000\u01557\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0005\"\u0000\u0000\u0157\u015c\u0003.\u0017\u0000\u0158"+
		"\u0159\u00051\u0000\u0000\u0159\u015b\u0003.\u0017\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"#\u0000\u0000\u01609\u0001\u0000\u0000\u0000\u0018>NU\\ly\u008a\u0098"+
		"\u009b\u00a3\u00af\u00cf\u00dc\u00e4\u00f2\u00fd\u0108\u010c\u012d\u0136"+
		"\u0139\u0142\u014e\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}