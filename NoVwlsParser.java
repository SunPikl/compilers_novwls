// Generated from ./NoVwls.g4 by ANTLR 4.13.2
 import java.util.*; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NoVwlsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		RULE_factor = 23, RULE_dataType = 24, RULE_primitiveDT = 25, RULE_arrayDT = 26, 
		RULE_array = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "blockStmt", "assignStmt", "printStmt", "varC", "compareStmt", 
			"functStmt", "loopStmt", "while", "for", "doWhile", "comment", "elseC", 
			"argC", "forLoopInc", "expr", "comparison", "comparisonExpr", "additiveExpr", 
			"multiplicativeExpr", "unaryExpr", "comparer", "factor", "dataType", 
			"primitiveDT", "arrayDT", "array"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitProgram(this);
		}
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_CRLYB:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				blockStmt();
				}
				break;
			case KW_NT:
			case KW_FLT:
			case KW_BL:
			case KW_CHR:
			case KW_STRNG:
			case DNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				assignStmt();
				}
				break;
			case KW_PRNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				printStmt();
				}
				break;
			case KW_F:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				compareStmt();
				}
				break;
			case KW_FNCTN:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				functStmt();
				}
				break;
			case KW_FR:
			case KW_WHL:
			case KW_D:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				loopStmt();
				}
				break;
			case CMMNT_LN:
			case CMMNT_BLCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				comment();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitBlockStmt(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(L_CRLYB);

			        scopeStack.push(new SymbolTable());
			    
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(77);
				stmt();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public TerminalNode KW_SCN_BL() { return getToken(NoVwlsParser.KW_SCN_BL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 715128832L) != 0)) {
				{
				setState(86);
				((AssignStmtContext)_localctx).dt = dataType();
				}
			}

			setState(89);
			((AssignStmtContext)_localctx).DNT = match(DNT);

			        currLHS = ((AssignStmtContext)_localctx).DNT.getText();
			        //preexistingLHS = mainTable.table.containsKey(currLHS);
			        preexistingLHS = scopeStack.peek().table.containsKey(currLHS);

			    
			setState(91);
			match(SSGN);
			setState(104);
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
				setState(92);
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
				setState(95);
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
				setState(97);
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
				setState(99);
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
				setState(101);
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
			case KW_SCN_BL:
				{
				setState(103);
				match(KW_SCN_BL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(KW_PRNT);
			setState(109);
			match(L_PRNTH);
			setState(110);
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

			            
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(112);
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
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                System.out.print("\n");
			            
			setState(121);
			match(R_PRNTH);
			setState(122);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterVarC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitVarC(this);
		}
	}

	public final VarCContext varC() throws RecognitionException {
		VarCContext _localctx = new VarCContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CMM);
			setState(125);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterCompareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitCompareStmt(this);
		}
	}

	public final CompareStmtContext compareStmt() throws RecognitionException {
		CompareStmtContext _localctx = new CompareStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(KW_F);
			setState(129);
			match(L_PRNTH);
			setState(130);
			((CompareStmtContext)_localctx).a = comparison();
			setState(131);
			match(R_PRNTH);

			                //if a true, perform block
			                
			            
			setState(133);
			blockStmt();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LS) {
				{
				setState(134);
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
		public TerminalNode KW_FNCTN() { return getToken(NoVwlsParser.KW_FNCTN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public TerminalNode L_PRNTH() { return getToken(NoVwlsParser.L_PRNTH, 0); }
		public TerminalNode R_PRNTH() { return getToken(NoVwlsParser.R_PRNTH, 0); }
		public TerminalNode L_CRLYB() { return getToken(NoVwlsParser.L_CRLYB, 0); }
		public TerminalNode KW_RTN() { return getToken(NoVwlsParser.KW_RTN, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode SCOLN() { return getToken(NoVwlsParser.SCOLN, 0); }
		public TerminalNode R_CRLYB() { return getToken(NoVwlsParser.R_CRLYB, 0); }
		public ArgCContext argC() {
			return getRuleContext(ArgCContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FunctStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterFunctStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitFunctStmt(this);
		}
	}

	public final FunctStmtContext functStmt() throws RecognitionException {
		FunctStmtContext _localctx = new FunctStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(KW_FNCTN);
			setState(138);
			dataType();
			setState(139);
			match(DNT);
			setState(140);
			match(L_PRNTH);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007221802270720L) != 0)) {
				{
				setState(141);
				argC(0);
				}
			}

			setState(144);
			match(R_PRNTH);
			setState(145);
			match(L_CRLYB);

			        scopeStack.push(new SymbolTable());
			    
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762616591036480L) != 0)) {
				{
				{
				setState(147);
				stmt();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(KW_RTN);
			setState(154);
			factor();
			setState(155);
			match(SCOLN);
			setState(156);
			match(R_CRLYB);

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitLoopStmt(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopStmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_WHL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				while_();
				}
				break;
			case KW_FR:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				for_();
				}
				break;
			case KW_D:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(KW_WHL);
			setState(165);
			match(L_PRNTH);
			setState(166);
			comparison();
			setState(167);
			match(R_PRNTH);
			setState(168);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(KW_FR);
			setState(171);
			match(L_PRNTH);
			setState(172);
			assignStmt();
			setState(173);
			comparison();
			setState(174);
			match(SCOLN);
			setState(175);
			forLoopInc();
			setState(176);
			match(R_PRNTH);
			setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitDoWhile(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(KW_D);
			setState(180);
			blockStmt();
			setState(181);
			match(KW_WHL);
			setState(182);
			match(L_PRNTH);
			setState(183);
			comparison();
			setState(184);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterElseC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitElseC(this);
		}
	}

	public final ElseCContext elseC() throws RecognitionException {
		ElseCContext _localctx = new ElseCContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseC);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				match(KW_LS);
				setState(189);
				blockStmt();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(KW_LS);
				setState(191);
				blockStmt();
				setState(192);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DNT() { return getToken(NoVwlsParser.DNT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ArgCContext> argC() {
			return getRuleContexts(ArgCContext.class);
		}
		public ArgCContext argC(int i) {
			return getRuleContext(ArgCContext.class,i);
		}
		public TerminalNode CMM() { return getToken(NoVwlsParser.CMM, 0); }
		public ArgCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterArgC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitArgC(this);
		}
	}

	public final ArgCContext argC() throws RecognitionException {
		return argC(0);
	}

	private ArgCContext argC(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgCContext _localctx = new ArgCContext(_ctx, _parentState);
		ArgCContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_argC, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
			case KW_FLT:
			case KW_BL:
			case KW_CHR:
			case KW_STRNG:
				{
				setState(197);
				dataType();
				setState(198);
				match(DNT);
				}
				break;
			case NT:
			case FLT:
			case BL:
			case CHR:
			case STRNG:
			case L_PRNTH:
			case L_CRLYB:
			case DNT:
				{
				{
				setState(200);
				factor();
				setState(201);
				match(DNT);
				setState(202);
				argC(0);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgCContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argC);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					match(CMM);
					setState(208);
					argC(2);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterForLoopInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitForLoopInc(this);
		}
	}

	public final ForLoopIncContext forLoopInc() throws RecognitionException {
		ForLoopIncContext _localctx = new ForLoopIncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoopInc);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(DNT);
				setState(215);
				match(SSGN);
				setState(216);
				additiveExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(DNT);
				setState(218);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(DNT);
				setState(220);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
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
				setState(226);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((ComparisonExprContext)_localctx).a = additiveExpr();
			  
			        if (((ComparisonExprContext)_localctx).a.hasKnownValue) {  
			            ((ComparisonExprContext)_localctx).hasKnownValue =  true; 
			            ((ComparisonExprContext)_localctx).value =  ((ComparisonExprContext)_localctx).a.value; 
			            ((ComparisonExprContext)_localctx).type =  ((ComparisonExprContext)_localctx).a.type;
			        } else ((ComparisonExprContext)_localctx).hasKnownValue =  false;  
			    
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277076930199552L) != 0)) {
				{
				{
				setState(236);
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
				    
				setState(238);
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
				setState(245);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitAdditiveExpr(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((AdditiveExprContext)_localctx).a = multiplicativeExpr();

			        if (((AdditiveExprContext)_localctx).a.hasKnownValue) {
			            ((AdditiveExprContext)_localctx).hasKnownValue =  true;
			            ((AdditiveExprContext)_localctx).value =  ((AdditiveExprContext)_localctx).a.value;
			            ((AdditiveExprContext)_localctx).type =  ((AdditiveExprContext)_localctx).a.type;
			        } else ((AdditiveExprContext)_localctx).hasKnownValue =  false;
			    
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLS || _la==MNS) {
				{
				{
				setState(248);
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
				setState(249);
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
				setState(256);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitMultiplicativeExpr(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((MultiplicativeExprContext)_localctx).a = unaryExpr();

			        if (((MultiplicativeExprContext)_localctx).a.hasKnownValue) {
			            ((MultiplicativeExprContext)_localctx).hasKnownValue =  true;
			            ((MultiplicativeExprContext)_localctx).value =  ((MultiplicativeExprContext)_localctx).a.value;
			            ((MultiplicativeExprContext)_localctx).type =  ((MultiplicativeExprContext)_localctx).a.type;
			        } else ((MultiplicativeExprContext)_localctx).hasKnownValue =  false;
			    
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(259);
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
				setState(260);
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
				setState(267);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316860424L) != 0)) {
				{
				setState(268);
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

			setState(271);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterComparer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitComparer(this);
		}
	}

	public final ComparerContext comparer() throws RecognitionException {
		ComparerContext _localctx = new ComparerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((FactorContext)_localctx).NT = match(NT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 

				            //type check
				            try {
				                ((FactorContext)_localctx).value =  Integer.parseInt(((FactorContext)_localctx).NT.getText()); 
				            } catch (Exception e) {
				                error(((FactorContext)_localctx).NT, "the following value is not an int '" + ((FactorContext)_localctx).NT.getText() + "'");
				            }

				            
				            ((FactorContext)_localctx).type =  "nt";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				((FactorContext)_localctx).FLT = match(FLT);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).value =  Float.parseFloat(((FactorContext)_localctx).FLT.getText()); 
				            ((FactorContext)_localctx).type =  "flt";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
				setState(282);
				((FactorContext)_localctx).CHR = match(CHR);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).CHR.getText();
				            ((FactorContext)_localctx).type =  "chr";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				((FactorContext)_localctx).STRNG = match(STRNG);
				   ((FactorContext)_localctx).hasKnownValue =  true; 
				            ((FactorContext)_localctx).content =  ((FactorContext)_localctx).STRNG.getText();
				            ((FactorContext)_localctx).type =  "strng";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
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
				setState(288);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(DNT);
				setState(290);
				match(T__3);
				setState(291);
				factor();
				setState(292);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				match(L_PRNTH);
				setState(295);
				((FactorContext)_localctx).expr = expr();
				setState(296);
				match(R_PRNTH);
				 
				            if (((FactorContext)_localctx).expr.hasKnownValue) {
				                ((FactorContext)_localctx).hasKnownValue =  true;
				                ((FactorContext)_localctx).value =  ((FactorContext)_localctx).expr.value;
				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).expr.type;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dataType);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((DataTypeContext)_localctx).a = primitiveDT();

				        ((DataTypeContext)_localctx).type =  ((DataTypeContext)_localctx).a.type;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterPrimitiveDT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitPrimitiveDT(this);
		}
	}

	public final PrimitiveDTContext primitiveDT() throws RecognitionException {
		PrimitiveDTContext _localctx = new PrimitiveDTContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primitiveDT);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NT:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(KW_NT);

				        ((PrimitiveDTContext)_localctx).type =  "nt";
				    
				}
				break;
			case KW_STRNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(KW_STRNG);

				        ((PrimitiveDTContext)_localctx).type =  "strng";
				    
				}
				break;
			case KW_FLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(KW_FLT);

				        ((PrimitiveDTContext)_localctx).type =  "flt";
				    
				}
				break;
			case KW_BL:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(KW_BL);

				        ((PrimitiveDTContext)_localctx).type =  "bl";
				    
				}
				break;
			case KW_CHR:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterArrayDT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitArrayDT(this);
		}
	}

	public final ArrayDTContext arrayDT() throws RecognitionException {
		ArrayDTContext _localctx = new ArrayDTContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayDT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			primitiveDT();
			setState(320);
			match(KW_RRY);
			setState(321);
			match(T__3);
			setState(322);
			match(NT);
			setState(323);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoVwlsListener ) ((NoVwlsListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(L_CRLYB);
			setState(326);
			factor();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMM) {
				{
				{
				setState(327);
				match(CMM);
				setState(328);
				factor();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return argC_sempred((ArgCContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean argC_sempred(ArgCContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002"+
		"R\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003"+
		"X\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004t\b\u0004\n\u0004\f\u0004"+
		"w\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0095\b\u0007\n\u0007\f\u0007\u0098\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00a3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cd\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00d2\b\u000e\n\u000e\f\u000e\u00d5"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00de\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e6\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f2\b\u0012\n"+
		"\u0012\f\u0012\u00f5\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fd\b\u0013\n\u0013\f\u0013"+
		"\u0100\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0108\b\u0014\n\u0014\f\u0014\u010b\t\u0014\u0001"+
		"\u0015\u0003\u0015\u010e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u012c\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0132\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u014a\b\u001b\n\u001b\f\u001b\u014d\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0000\u0001\u001c\u001c\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0246\u0000\u0005\u0001\u000034\u0001\u0000*/\u0001\u0000%&\u0001\u0000"+
		"\')\u0002\u0000\u0003\u0003%&\u0160\u00008\u0001\u0000\u0000\u0000\u0002"+
		"I\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000"+
		"\f\u0080\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010"+
		"\u00a2\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014"+
		"\u00aa\u0001\u0000\u0000\u0000\u0016\u00b3\u0001\u0000\u0000\u0000\u0018"+
		"\u00ba\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c"+
		"\u00cc\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00e5"+
		"\u0001\u0000\u0000\u0000\"\u00e7\u0001\u0000\u0000\u0000$\u00ea\u0001"+
		"\u0000\u0000\u0000&\u00f6\u0001\u0000\u0000\u0000(\u0101\u0001\u0000\u0000"+
		"\u0000*\u010d\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000."+
		"\u012b\u0001\u0000\u0000\u00000\u0131\u0001\u0000\u0000\u00002\u013d\u0001"+
		"\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u00006\u0145\u0001\u0000\u0000"+
		"\u00008<\u0006\u0000\uffff\uffff\u00009;\u0003\u0002\u0001\u0000:9\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0000\u0000\u0001@A\u0006\u0000\uffff\uffff\u0000A\u0001"+
		"\u0001\u0000\u0000\u0000BJ\u0003\u0004\u0002\u0000CJ\u0003\u0006\u0003"+
		"\u0000DJ\u0003\b\u0004\u0000EJ\u0003\f\u0006\u0000FJ\u0003\u000e\u0007"+
		"\u0000GJ\u0003\u0010\b\u0000HJ\u0003\u0018\f\u0000IB\u0001\u0000\u0000"+
		"\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\"\u0000\u0000"+
		"LP\u0006\u0002\uffff\uffff\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"ST\u0005#\u0000\u0000TU\u0006\u0002\uffff\uffff\u0000U\u0005\u0001\u0000"+
		"\u0000\u0000VX\u00030\u0018\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u00055\u0000\u0000Z[\u0006\u0003"+
		"\uffff\uffff\u0000[h\u0005$\u0000\u0000\\]\u0003 \u0010\u0000]^\u0006"+
		"\u0003\uffff\uffff\u0000^i\u0001\u0000\u0000\u0000_`\u0005\u0007\u0000"+
		"\u0000`i\u0006\u0003\uffff\uffff\u0000ab\u0005\t\u0000\u0000bi\u0006\u0003"+
		"\uffff\uffff\u0000cd\u0005\b\u0000\u0000di\u0006\u0003\uffff\uffff\u0000"+
		"ef\u0005\n\u0000\u0000fi\u0006\u0003\uffff\uffff\u0000gi\u0005\u000b\u0000"+
		"\u0000h\\\u0001\u0000\u0000\u0000h_\u0001\u0000\u0000\u0000ha\u0001\u0000"+
		"\u0000\u0000hc\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u00050\u0000\u0000k\u0007"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u0005 \u0000\u0000"+
		"no\u0003 \u0010\u0000ou\u0006\u0004\uffff\uffff\u0000pq\u0003\n\u0005"+
		"\u0000qr\u0006\u0004\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sp\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000xy\u0006\u0004\uffff\uffff\u0000yz\u0005!\u0000\u0000z{\u00050\u0000"+
		"\u0000{\t\u0001\u0000\u0000\u0000|}\u00051\u0000\u0000}~\u0003 \u0010"+
		"\u0000~\u007f\u0006\u0005\uffff\uffff\u0000\u007f\u000b\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u0082\u0005 \u0000\u0000"+
		"\u0082\u0083\u0003\"\u0011\u0000\u0083\u0084\u0005!\u0000\u0000\u0084"+
		"\u0085\u0006\u0006\uffff\uffff\u0000\u0085\u0087\u0003\u0004\u0002\u0000"+
		"\u0086\u0088\u0003\u001a\r\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\f\u0000\u0000\u008a\u008b\u00030\u0018\u0000\u008b\u008c\u0005"+
		"5\u0000\u0000\u008c\u008e\u0005 \u0000\u0000\u008d\u008f\u0003\u001c\u000e"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005!\u0000\u0000"+
		"\u0091\u0092\u0005\"\u0000\u0000\u0092\u0096\u0006\u0007\uffff\uffff\u0000"+
		"\u0093\u0095\u0003\u0002\u0001\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0012\u0000\u0000"+
		"\u009a\u009b\u0003.\u0017\u0000\u009b\u009c\u00050\u0000\u0000\u009c\u009d"+
		"\u0005#\u0000\u0000\u009d\u009e\u0006\u0007\uffff\uffff\u0000\u009e\u000f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a3\u0003\u0012\t\u0000\u00a0\u00a3\u0003"+
		"\u0014\n\u0000\u00a1\u00a3\u0003\u0016\u000b\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010"+
		"\u0000\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6\u00a7\u0003\"\u0011"+
		"\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8\u00a9\u0003\u0004\u0002\u0000"+
		"\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000f\u0000\u0000"+
		"\u00ab\u00ac\u0005 \u0000\u0000\u00ac\u00ad\u0003\u0006\u0003\u0000\u00ad"+
		"\u00ae\u0003\"\u0011\u0000\u00ae\u00af\u00050\u0000\u0000\u00af\u00b0"+
		"\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005!\u0000\u0000\u00b1\u00b2\u0003"+
		"\u0004\u0002\u0000\u00b2\u0015\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0011\u0000\u0000\u00b4\u00b5\u0003\u0004\u0002\u0000\u00b5\u00b6\u0005"+
		"\u0010\u0000\u0000\u00b6\u00b7\u0005 \u0000\u0000\u00b7\u00b8\u0003\""+
		"\u0011\u0000\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u0017\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0007\u0000\u0000\u0000\u00bb\u0019\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00c3\u0003\u0004\u0002"+
		"\u0000\u00be\u00bf\u0005\u000e\u0000\u0000\u00bf\u00c0\u0003\u0004\u0002"+
		"\u0000\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0006\u000e\uffff\uffff"+
		"\u0000\u00c5\u00c6\u00030\u0018\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7"+
		"\u00cd\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003.\u0017\u0000\u00c9\u00ca"+
		"\u00055\u0000\u0000\u00ca\u00cb\u0003\u001c\u000e\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c4\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0001"+
		"\u0000\u0000\u00cf\u00d0\u00051\u0000\u0000\u00d0\u00d2\u0003\u001c\u000e"+
		"\u0002\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u001d\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u00055\u0000\u0000\u00d7\u00d8\u0005$\u0000\u0000\u00d8"+
		"\u00de\u0003&\u0013\u0000\u00d9\u00da\u00055\u0000\u0000\u00da\u00de\u0005"+
		"\u0001\u0000\u0000\u00db\u00dc\u00055\u0000\u0000\u00dc\u00de\u0005\u0002"+
		"\u0000\u0000\u00dd\u00d6\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u001f\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003.\u0017\u0000\u00e0\u00e1\u0006\u0010\uffff"+
		"\uffff\u0000\u00e1\u00e6\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003$\u0012"+
		"\u0000\u00e3\u00e4\u0006\u0010\uffff\uffff\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00df\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003$\u0012\u0000"+
		"\u00e8\u00e9\u0006\u0011\uffff\uffff\u0000\u00e9#\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0003&\u0013\u0000\u00eb\u00f3\u0006\u0012\uffff\uffff\u0000"+
		"\u00ec\u00ed\u0007\u0001\u0000\u0000\u00ed\u00ee\u0006\u0012\uffff\uffff"+
		"\u0000\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u00f0\u0006\u0012\uffff\uffff"+
		"\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4%\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003(\u0014\u0000\u00f7"+
		"\u00fe\u0006\u0013\uffff\uffff\u0000\u00f8\u00f9\u0007\u0002\u0000\u0000"+
		"\u00f9\u00fa\u0003(\u0014\u0000\u00fa\u00fb\u0006\u0013\uffff\uffff\u0000"+
		"\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0003*\u0015\u0000\u0102\u0109"+
		"\u0006\u0014\uffff\uffff\u0000\u0103\u0104\u0007\u0003\u0000\u0000\u0104"+
		"\u0105\u0003*\u0015\u0000\u0105\u0106\u0006\u0014\uffff\uffff\u0000\u0106"+
		"\u0108\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a)\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0007\u0004\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0003.\u0017\u0000\u0110\u0111\u0006"+
		"\u0015\uffff\uffff\u0000\u0111+\u0001\u0000\u0000\u0000\u0112\u0113\u0007"+
		"\u0001\u0000\u0000\u0113-\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0014"+
		"\u0000\u0000\u0115\u012c\u0006\u0017\uffff\uffff\u0000\u0116\u0117\u0005"+
		"\u0016\u0000\u0000\u0117\u012c\u0006\u0017\uffff\uffff\u0000\u0118\u0119"+
		"\u0005\u0018\u0000\u0000\u0119\u012c\u0006\u0017\uffff\uffff\u0000\u011a"+
		"\u011b\u0005\u001a\u0000\u0000\u011b\u012c\u0006\u0017\uffff\uffff\u0000"+
		"\u011c\u011d\u0005\u001c\u0000\u0000\u011d\u012c\u0006\u0017\uffff\uffff"+
		"\u0000\u011e\u011f\u00055\u0000\u0000\u011f\u012c\u0006\u0017\uffff\uffff"+
		"\u0000\u0120\u012c\u00036\u001b\u0000\u0121\u0122\u00055\u0000\u0000\u0122"+
		"\u0123\u0005\u0004\u0000\u0000\u0123\u0124\u0003.\u0017\u0000\u0124\u0125"+
		"\u0005\u0005\u0000\u0000\u0125\u012c\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005 \u0000\u0000\u0127\u0128\u0003 \u0010\u0000\u0128\u0129\u0005!"+
		"\u0000\u0000\u0129\u012a\u0006\u0017\uffff\uffff\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u0114\u0001\u0000\u0000\u0000\u012b\u0116\u0001"+
		"\u0000\u0000\u0000\u012b\u0118\u0001\u0000\u0000\u0000\u012b\u011a\u0001"+
		"\u0000\u0000\u0000\u012b\u011c\u0001\u0000\u0000\u0000\u012b\u011e\u0001"+
		"\u0000\u0000\u0000\u012b\u0120\u0001\u0000\u0000\u0000\u012b\u0121\u0001"+
		"\u0000\u0000\u0000\u012b\u0126\u0001\u0000\u0000\u0000\u012c/\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u00032\u0019\u0000\u012e\u012f\u0006\u0018\uffff"+
		"\uffff\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u0132\u00034\u001a"+
		"\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u01321\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0015\u0000\u0000"+
		"\u0134\u013e\u0006\u0019\uffff\uffff\u0000\u0135\u0136\u0005\u001d\u0000"+
		"\u0000\u0136\u013e\u0006\u0019\uffff\uffff\u0000\u0137\u0138\u0005\u0017"+
		"\u0000\u0000\u0138\u013e\u0006\u0019\uffff\uffff\u0000\u0139\u013a\u0005"+
		"\u0019\u0000\u0000\u013a\u013e\u0006\u0019\uffff\uffff\u0000\u013b\u013c"+
		"\u0005\u001b\u0000\u0000\u013c\u013e\u0006\u0019\uffff\uffff\u0000\u013d"+
		"\u0133\u0001\u0000\u0000\u0000\u013d\u0135\u0001\u0000\u0000\u0000\u013d"+
		"\u0137\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e3\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u00032\u0019\u0000\u0140\u0141\u0005\u001f\u0000\u0000\u0141\u0142\u0005"+
		"\u0004\u0000\u0000\u0142\u0143\u0005\u0014\u0000\u0000\u0143\u0144\u0005"+
		"\u0005\u0000\u0000\u01445\u0001\u0000\u0000\u0000\u0145\u0146\u0005\""+
		"\u0000\u0000\u0146\u014b\u0003.\u0017\u0000\u0147\u0148\u00051\u0000\u0000"+
		"\u0148\u014a\u0003.\u0017\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0005#\u0000\u0000\u014f7\u0001"+
		"\u0000\u0000\u0000\u0017<IPWhu\u0087\u008e\u0096\u00a2\u00c2\u00cc\u00d3"+
		"\u00dd\u00e5\u00f3\u00fe\u0109\u010d\u012b\u0131\u013d\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}