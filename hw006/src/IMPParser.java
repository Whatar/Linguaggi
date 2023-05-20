// Generated from C:/Users/leona/IdeaProjects/Linguaggi/hw006/src\IMP.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOSTRING=1, CONCAT=2, BOOL=3, NOT=4, AND=5, OR=6, EQQ=7, NEQ=8, LT=9, 
		LEQ=10, GEQ=11, GT=12, WHILE=13, OUT=14, SKIPP=15, IF=16, THEN=17, ELSE=18, 
		LPAR=19, RPAR=20, LBRACE=21, RBRACE=22, LSQUARE=23, RSQUARE=24, PLUS=25, 
		TIMES=26, MINUS=27, DIV=28, MOD=29, POW=30, ASSIGN=31, SEMICOLON=32, NAT=33, 
		STRING=34, ID=35, WS=36;
	public static final int
		RULE_main = 0, RULE_prog = 1, RULE_com = 2, RULE_exp = 3, RULE_str = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "prog", "com", "exp", "str"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tostr'", "'.'", null, "'!'", "'&'", "'|'", "'=='", "'!='", "'<'", 
			"'<='", "'>='", "'>'", "'while'", "'out'", "'skip'", "'if'", "'then'", 
			"'else'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'*'", "'-'", 
			"'/'", "'mod'", "'^'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOSTRING", "CONCAT", "BOOL", "NOT", "AND", "OR", "EQQ", "NEQ", 
			"LT", "LEQ", "GEQ", "GT", "WHILE", "OUT", "SKIPP", "IF", "THEN", "ELSE", 
			"LPAR", "RPAR", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "PLUS", "TIMES", 
			"MINUS", "DIV", "MOD", "POW", "ASSIGN", "SEMICOLON", "NAT", "STRING", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "IMP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IMPParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			prog();
			setState(11);
			match(EOF);
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
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IMPParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			com(0);
			setState(14);
			match(EOF);
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
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(IMPParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(IMPParser.LSQUARE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(IMPParser.RSQUARE, 0); }
		public TerminalNode ASSIGN() { return getToken(IMPParser.ASSIGN, 0); }
		public ArrayAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitArrayAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(IMPParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(IMPParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(IMPParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(IMPParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(IMPParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(IMPParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(IMPParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(IMPParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(IMPParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(IMPParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(IMPParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(IMPParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(IMPParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(IMPParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(IMPParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(IMPParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(IMPParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(IMPParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(IMPParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(IMPParser.LPAR, 0); }
		public List<StrContext> str() {
			return getRuleContexts(StrContext.class);
		}
		public StrContext str(int i) {
			return getRuleContext(StrContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(IMPParser.RPAR, 0); }
		public List<TerminalNode> CONCAT() { return getTokens(IMPParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(IMPParser.CONCAT, i);
		}
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_com, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(IF);
				setState(18);
				match(LPAR);
				setState(19);
				exp(0);
				setState(20);
				match(RPAR);
				setState(21);
				match(THEN);
				setState(22);
				match(LBRACE);
				setState(23);
				com(0);
				setState(24);
				match(RBRACE);
				setState(25);
				match(ELSE);
				setState(26);
				match(LBRACE);
				setState(27);
				com(0);
				setState(28);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(ID);
				setState(31);
				match(ASSIGN);
				setState(32);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(ID);
				setState(34);
				match(LSQUARE);
				setState(35);
				exp(0);
				setState(36);
				match(RSQUARE);
				setState(37);
				match(ASSIGN);
				setState(38);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(WHILE);
				setState(42);
				match(LPAR);
				setState(43);
				exp(0);
				setState(44);
				match(RPAR);
				setState(45);
				match(LBRACE);
				setState(46);
				com(0);
				setState(47);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(OUT);
				setState(50);
				match(LPAR);
				setState(51);
				str();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONCAT) {
					{
					{
					setState(52);
					match(CONCAT);
					setState(53);
					str();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(63);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(64);
					match(SEMICOLON);
					setState(65);
					com(4);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(IMPParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(IMPParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(IMPParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(IMPParser.MOD, 0); }
		public MulDivModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(IMPParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElemContext extends ExpContext {
		public TerminalNode ID() { return getToken(IMPParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(IMPParser.LSQUARE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(IMPParser.RSQUARE, 0); }
		public ArrayElemContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitArrayElem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(IMPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IMPParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(IMPParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(IMPParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(IMPParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(IMPParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(IMPParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(IMPParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(IMPParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(IMPParser.AND, 0); }
		public TerminalNode OR() { return getToken(IMPParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(IMPParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(IMPParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(IMPParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(IMPParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(NOT);
				setState(75);
				exp(10);
				}
				break;
			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(ID);
				setState(78);
				match(LSQUARE);
				setState(79);
				exp(0);
				setState(80);
				match(RSQUARE);
				}
				break;
			case 6:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(LPAR);
				setState(83);
				exp(0);
				setState(84);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						match(POW);
						setState(90);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 872415232L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(IMPParser.STRING, 0); }
		public TerminalNode TOSTRING() { return getToken(IMPParser.TOSTRING, 0); }
		public TerminalNode LPAR() { return getToken(IMPParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(IMPParser.RPAR, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_str);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(STRING);
				}
				break;
			case TOSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(TOSTRING);
				setState(113);
				match(LPAR);
				setState(114);
				exp(0);
				setState(115);
				match(RPAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return com_sempred((ComContext)_localctx, predIndex);
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002C\b\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003k\b\u0003\n\u0003\f\u0003"+
		"n\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0004\u0000\u0002\u0004\u0006"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0005\u0002\u0000\u001a\u001a\u001c"+
		"\u001d\u0002\u0000\u0019\u0019\u001b\u001b\u0001\u0000\u0007\b\u0001\u0000"+
		"\t\f\u0001\u0000\u0005\u0006\u0085\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\r\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006V\u0001"+
		"\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f"+
		"\u0003\u0001\u0000\u0000\u0000\u0010\u0011\u0006\u0002\uffff\uffff\u0000"+
		"\u0011\u0012\u0005\u0010\u0000\u0000\u0012\u0013\u0005\u0013\u0000\u0000"+
		"\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0015\u0005\u0014\u0000\u0000"+
		"\u0015\u0016\u0005\u0011\u0000\u0000\u0016\u0017\u0005\u0015\u0000\u0000"+
		"\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u0016\u0000\u0000"+
		"\u0019\u001a\u0005\u0012\u0000\u0000\u001a\u001b\u0005\u0015\u0000\u0000"+
		"\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0016\u0000\u0000"+
		"\u001d>\u0001\u0000\u0000\u0000\u001e\u001f\u0005#\u0000\u0000\u001f "+
		"\u0005\u001f\u0000\u0000 >\u0003\u0006\u0003\u0000!\"\u0005#\u0000\u0000"+
		"\"#\u0005\u0017\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u0018\u0000"+
		"\u0000%&\u0005\u001f\u0000\u0000&\'\u0003\u0006\u0003\u0000\'>\u0001\u0000"+
		"\u0000\u0000(>\u0005\u000f\u0000\u0000)*\u0005\r\u0000\u0000*+\u0005\u0013"+
		"\u0000\u0000+,\u0003\u0006\u0003\u0000,-\u0005\u0014\u0000\u0000-.\u0005"+
		"\u0015\u0000\u0000./\u0003\u0004\u0002\u0000/0\u0005\u0016\u0000\u0000"+
		"0>\u0001\u0000\u0000\u000012\u0005\u000e\u0000\u000023\u0005\u0013\u0000"+
		"\u000038\u0003\b\u0004\u000045\u0005\u0002\u0000\u000057\u0003\b\u0004"+
		"\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0014\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=\u0010\u0001\u0000\u0000\u0000=\u001e\u0001\u0000\u0000\u0000=!\u0001"+
		"\u0000\u0000\u0000=(\u0001\u0000\u0000\u0000=)\u0001\u0000\u0000\u0000"+
		"=1\u0001\u0000\u0000\u0000>D\u0001\u0000\u0000\u0000?@\n\u0003\u0000\u0000"+
		"@A\u0005 \u0000\u0000AC\u0003\u0004\u0002\u0004B?\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0005\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0006"+
		"\u0003\uffff\uffff\u0000HW\u0005!\u0000\u0000IW\u0005\u0003\u0000\u0000"+
		"JK\u0005\u0004\u0000\u0000KW\u0003\u0006\u0003\nLW\u0005#\u0000\u0000"+
		"MN\u0005#\u0000\u0000NO\u0005\u0017\u0000\u0000OP\u0003\u0006\u0003\u0000"+
		"PQ\u0005\u0018\u0000\u0000QW\u0001\u0000\u0000\u0000RS\u0005\u0013\u0000"+
		"\u0000ST\u0003\u0006\u0003\u0000TU\u0005\u0014\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000VG\u0001\u0000\u0000\u0000VI\u0001\u0000\u0000\u0000VJ\u0001"+
		"\u0000\u0000\u0000VL\u0001\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000"+
		"VR\u0001\u0000\u0000\u0000Wl\u0001\u0000\u0000\u0000XY\n\u0007\u0000\u0000"+
		"YZ\u0005\u001e\u0000\u0000Zk\u0003\u0006\u0003\u0007[\\\n\u0006\u0000"+
		"\u0000\\]\u0007\u0000\u0000\u0000]k\u0003\u0006\u0003\u0007^_\n\u0005"+
		"\u0000\u0000_`\u0007\u0001\u0000\u0000`k\u0003\u0006\u0003\u0006ab\n\u0004"+
		"\u0000\u0000bc\u0007\u0002\u0000\u0000ck\u0003\u0006\u0003\u0005de\n\u0003"+
		"\u0000\u0000ef\u0007\u0003\u0000\u0000fk\u0003\u0006\u0003\u0004gh\n\u0002"+
		"\u0000\u0000hi\u0007\u0004\u0000\u0000ik\u0003\u0006\u0003\u0003jX\u0001"+
		"\u0000\u0000\u0000j[\u0001\u0000\u0000\u0000j^\u0001\u0000\u0000\u0000"+
		"ja\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u0007\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"ov\u0005\"\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0005\u0013\u0000\u0000"+
		"rs\u0003\u0006\u0003\u0000st\u0005\u0014\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000uo\u0001\u0000\u0000\u0000up\u0001\u0000\u0000\u0000v\t\u0001\u0000"+
		"\u0000\u0000\u00078=DVjlu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}