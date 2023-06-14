// Generated from C:/Users/leona/Documents/GitHub/Linguaggi/HaveFun/src\Imp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INITFUN=1, RETURN=2, GLOBAL=3, GL=4, ND=5, NAT=6, INT=7, FLOAT=8, STRING=9, 
		BOOL=10, PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, POW=16, AND=17, OR=18, 
		EQQ=19, NEQ=20, LEQ=21, GEQ=22, LT=23, GT=24, NOT=25, IF=26, THEN=27, 
		ELSE=28, WHILE=29, SKIPP=30, ASSIGN=31, OUT=32, LPAR=33, RPAR=34, LBRACE=35, 
		RBRACE=36, SEMICOLON=37, COMMA=38, ARNC_INIT=39, ARNC_END=40, ARNC_SHOWTIME=41, 
		ARNC_TERM=42, ARNC_PRINT=43, ARNC_DECL=44, ARNC_VARSET=45, ARNC_ASSIGN=46, 
		ARNC_OP_BASE=47, ARNC_PLUS=48, ARNC_MINUS=49, ARNC_MUL=50, ARNC_DIV=51, 
		ARNC_OP_END=52, ARNC_EQUAL=53, ARNC_GRATER=54, ARNC_OR=55, ARNC_AND=56, 
		ARNC_IF=57, ARNC_ELSE=58, ARNC_ENDIF=59, ARNC_WHILE=60, ARNC_WHEND=61, 
		ARNC_VALZERO=62, ARNC_VALONE=63, ID=64, WS=65;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_vars = 2, RULE_com = 3, RULE_exp = 4, 
		RULE_arnc = 5, RULE_stat = 6, RULE_arnc_exp = 7, RULE_arnc_op = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "vars", "com", "exp", "arnc", "stat", "arnc_exp", "arnc_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'return'", "'global'", "'.g'", "'nd'", null, null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", "'|'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'${'", "'}$'", "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", 
			"'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", "'GET TO THE CHOPPER'", 
			"'HERE IS MY INVITATION'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", 
			"'HE HAD TO SPLIT'", "'ENOUGH TALK'", "'YOU ARE NOT YOU YOU ARE ME'", 
			"'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", "'KNOCK KNOCK'", 
			"'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", "'@I LIED'", "'@NO PROBLEMO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INITFUN", "RETURN", "GLOBAL", "GL", "ND", "NAT", "INT", "FLOAT", 
			"STRING", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "LPAR", "RPAR", "LBRACE", "RBRACE", 
			"SEMICOLON", "COMMA", "ARNC_INIT", "ARNC_END", "ARNC_SHOWTIME", "ARNC_TERM", 
			"ARNC_PRINT", "ARNC_DECL", "ARNC_VARSET", "ARNC_ASSIGN", "ARNC_OP_BASE", 
			"ARNC_PLUS", "ARNC_MINUS", "ARNC_MUL", "ARNC_DIV", "ARNC_OP_END", "ARNC_EQUAL", 
			"ARNC_GRATER", "ARNC_OR", "ARNC_AND", "ARNC_IF", "ARNC_ELSE", "ARNC_ENDIF", 
			"ARNC_WHILE", "ARNC_WHEND", "ARNC_VALZERO", "ARNC_VALONE", "ID", "WS"
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
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INITFUN) {
				{
				{
				setState(18);
				fun();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			com(0);
			setState(25);
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
	public static class FunContext extends ParserRuleContext {
		public TerminalNode INITFUN() { return getToken(ImpParser.INITFUN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(ImpParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(INITFUN);
			setState(28);
			match(ID);
			setState(29);
			match(LPAR);
			setState(30);
			vars();
			setState(31);
			match(RPAR);
			setState(32);
			match(LBRACE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2305843082974724097L) != 0)) {
				{
				setState(33);
				com(0);
				setState(34);
				match(SEMICOLON);
				}
			}

			setState(38);
			match(RETURN);
			setState(39);
			exp(0);
			setState(40);
			match(RBRACE);
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
	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ImpParser.COMMA, 0); }
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
				match(COMMA);
				setState(45);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class NewGlobalAssignContext extends ComContext {
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NewGlobalAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNewGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonDetContext extends ComContext {
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ND() { return getToken(ImpParser.ND, 0); }
		public NonDetContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNonDet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(ImpParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ImpParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCContext extends ComContext {
		public TerminalNode ARNC_INIT() { return getToken(ImpParser.ARNC_INIT, 0); }
		public ArncContext arnc() {
			return getRuleContext(ArncContext.class,0);
		}
		public TerminalNode ARNC_END() { return getToken(ImpParser.ARNC_END, 0); }
		public ArnoldCContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldC(this);
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
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(ImpParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOut(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(IF);
				setState(51);
				match(LPAR);
				setState(52);
				exp(0);
				setState(53);
				match(RPAR);
				setState(54);
				match(THEN);
				setState(55);
				match(LBRACE);
				setState(56);
				com(0);
				setState(57);
				match(RBRACE);
				setState(58);
				match(ELSE);
				setState(59);
				match(LBRACE);
				setState(60);
				com(0);
				setState(61);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(ID);
				setState(64);
				match(ASSIGN);
				setState(65);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new NewGlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(GLOBAL);
				setState(67);
				match(ID);
				setState(68);
				match(ASSIGN);
				setState(69);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				setState(71);
				match(GL);
				setState(72);
				match(ASSIGN);
				setState(73);
				exp(0);
				}
				break;
			case 5:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(SKIPP);
				}
				break;
			case 6:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(WHILE);
				setState(76);
				match(LPAR);
				setState(77);
				exp(0);
				setState(78);
				match(RPAR);
				setState(79);
				match(LBRACE);
				setState(80);
				com(0);
				setState(81);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new ArnoldCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(ARNC_INIT);
				setState(84);
				arnc();
				setState(85);
				match(ARNC_END);
				}
				break;
			case 8:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(OUT);
				setState(88);
				match(LPAR);
				setState(89);
				exp(0);
				setState(90);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(LBRACE);
				setState(93);
				com(0);
				setState(94);
				match(RBRACE);
				setState(95);
				match(ND);
				setState(96);
				match(LBRACE);
				setState(97);
				com(0);
				setState(98);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(102);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(103);
					match(SEMICOLON);
					setState(104);
					com(6);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNat(this);
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
		public TerminalNode PLUS() { return getToken(ImpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImpParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalIdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public GlobalIdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FunCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNot(this);
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
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
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
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitCmpExp(this);
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
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
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
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(LPAR);
				setState(114);
				exp(0);
				setState(115);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(NOT);
				setState(118);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(ID);
				setState(120);
				match(LPAR);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 288230376286453777L) != 0)) {
					{
					{
					setState(121);
					exp(0);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					exp(0);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				setState(137);
				match(GL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(140);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(141);
						match(POW);
						setState(142);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(144);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
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
						setState(148);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
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
						setState(154);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
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
						setState(157);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class ArncContext extends ParserRuleContext {
		public TerminalNode ARNC_SHOWTIME() { return getToken(ImpParser.ARNC_SHOWTIME, 0); }
		public TerminalNode ARNC_TERM() { return getToken(ImpParser.ARNC_TERM, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ArncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncContext arnc() throws RecognitionException {
		ArncContext _localctx = new ArncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arnc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ARNC_SHOWTIME);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297133449705947136L) != 0)) {
				{
				{
				setState(164);
				stat();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(ARNC_TERM);
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_globalDeclarationContext extends StatContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_globalDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_globalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_assignContext extends StatContext {
		public TerminalNode ARNC_ASSIGN() { return getToken(ImpParser.ARNC_ASSIGN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_OP_BASE() { return getToken(ImpParser.ARNC_OP_BASE, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_opContext arnc_op() {
			return getRuleContext(Arnc_opContext.class,0);
		}
		public TerminalNode ARNC_OP_END() { return getToken(ImpParser.ARNC_OP_END, 0); }
		public Arnc_assignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_printContext extends StatContext {
		public TerminalNode ARNC_PRINT() { return getToken(ImpParser.ARNC_PRINT, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_printContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_print(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_declarationContext extends StatContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_declarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_ifContext extends StatContext {
		public TerminalNode ARNC_IF() { return getToken(ImpParser.ARNC_IF, 0); }
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode ARNC_ENDIF() { return getToken(ImpParser.ARNC_ENDIF, 0); }
		public List<TerminalNode> ARNC_ELSE() { return getTokens(ImpParser.ARNC_ELSE); }
		public TerminalNode ARNC_ELSE(int i) {
			return getToken(ImpParser.ARNC_ELSE, i);
		}
		public Arnc_ifContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_if(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_whileContext extends StatContext {
		public TerminalNode ARNC_WHILE() { return getToken(ImpParser.ARNC_WHILE, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public TerminalNode ARNC_WHEND() { return getToken(ImpParser.ARNC_WHEND, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Arnc_whileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_while(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_globalAssignContext extends StatContext {
		public TerminalNode ARNC_ASSIGN() { return getToken(ImpParser.ARNC_ASSIGN, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_OP_BASE() { return getToken(ImpParser.ARNC_OP_BASE, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_opContext arnc_op() {
			return getRuleContext(Arnc_opContext.class,0);
		}
		public TerminalNode ARNC_OP_END() { return getToken(ImpParser.ARNC_OP_END, 0); }
		public Arnc_globalAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_globalAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Arnc_printContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ARNC_PRINT);
				setState(173);
				arnc_exp(0);
				}
				break;
			case 2:
				_localctx = new Arnc_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(ARNC_DECL);
				setState(175);
				match(ID);
				setState(176);
				match(ARNC_VARSET);
				setState(177);
				arnc_exp(0);
				}
				break;
			case 3:
				_localctx = new Arnc_globalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ARNC_DECL);
				setState(179);
				match(GLOBAL);
				setState(180);
				match(ID);
				setState(181);
				match(ARNC_VARSET);
				setState(182);
				arnc_exp(0);
				}
				break;
			case 4:
				_localctx = new Arnc_assignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(ARNC_ASSIGN);
				setState(184);
				match(ID);
				setState(185);
				match(ARNC_OP_BASE);
				setState(186);
				arnc_exp(0);
				setState(187);
				arnc_op();
				setState(188);
				match(ARNC_OP_END);
				}
				break;
			case 5:
				_localctx = new Arnc_globalAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(ARNC_ASSIGN);
				setState(191);
				match(GL);
				setState(192);
				match(ID);
				setState(193);
				match(ARNC_OP_BASE);
				setState(194);
				arnc_exp(0);
				setState(195);
				arnc_op();
				setState(196);
				match(ARNC_OP_END);
				}
				break;
			case 6:
				_localctx = new Arnc_ifContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(ARNC_IF);
				setState(199);
				arnc_exp(0);
				setState(200);
				stat();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_ELSE) {
					{
					{
					setState(201);
					match(ARNC_ELSE);
					setState(202);
					arnc_exp(0);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(ARNC_ENDIF);
				}
				break;
			case 7:
				_localctx = new Arnc_whileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				match(ARNC_WHILE);
				setState(211);
				arnc_exp(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297133449705947136L) != 0)) {
					{
					{
					setState(212);
					stat();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(ARNC_WHEND);
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
	public static class Arnc_expContext extends ParserRuleContext {
		public Arnc_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnc_exp; }
	 
		public Arnc_expContext() { }
		public void copyFrom(Arnc_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_plusMinusContext extends Arnc_expContext {
		public Token op;
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ImpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImpParser.MINUS, 0); }
		public Arnc_plusMinusContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_plusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_natContext extends Arnc_expContext {
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public Arnc_natContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_nat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_logicExpContext extends Arnc_expContext {
		public Token op;
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public Arnc_logicExpContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_logicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_floatContext extends Arnc_expContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public Arnc_floatContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_float(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_parExpContext extends Arnc_expContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public Arnc_parExpContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_parExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_funCallContext extends Arnc_expContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Arnc_funCallContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_funCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_eqExpContext extends Arnc_expContext {
		public Token op;
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public Arnc_eqExpContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_eqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_divMulModContext extends Arnc_expContext {
		public Token op;
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public Arnc_divMulModContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_divMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_powContext extends Arnc_expContext {
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public Arnc_powContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_pow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_valoneContext extends Arnc_expContext {
		public TerminalNode ARNC_VALZERO() { return getToken(ImpParser.ARNC_VALZERO, 0); }
		public Arnc_valoneContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_valone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_idContext extends Arnc_expContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public Arnc_idContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_stringContext extends Arnc_expContext {
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public Arnc_stringContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_string(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_notContext extends Arnc_expContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_notContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_not(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_boolContext extends Arnc_expContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public Arnc_boolContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_cmpExpContext extends Arnc_expContext {
		public Token op;
		public List<Arnc_expContext> arnc_exp() {
			return getRuleContexts(Arnc_expContext.class);
		}
		public Arnc_expContext arnc_exp(int i) {
			return getRuleContext(Arnc_expContext.class,i);
		}
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public Arnc_cmpExpContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_cmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_valzeroContext extends Arnc_expContext {
		public TerminalNode ARNC_VALONE() { return getToken(ImpParser.ARNC_VALONE, 0); }
		public Arnc_valzeroContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_valzero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_globalIdContext extends Arnc_expContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public Arnc_globalIdContext(Arnc_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_globalId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arnc_expContext arnc_exp() throws RecognitionException {
		return arnc_exp(0);
	}

	private Arnc_expContext arnc_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arnc_expContext _localctx = new Arnc_expContext(_ctx, _parentState);
		Arnc_expContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_arnc_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Arnc_natContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(223);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new Arnc_floatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(FLOAT);
				}
				break;
			case 3:
				{
				_localctx = new Arnc_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new Arnc_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new Arnc_parExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(LPAR);
				setState(228);
				arnc_exp(0);
				setState(229);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new Arnc_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(NOT);
				setState(232);
				arnc_exp(11);
				}
				break;
			case 7:
				{
				_localctx = new Arnc_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new Arnc_globalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(ID);
				setState(235);
				match(GL);
				}
				break;
			case 9:
				{
				_localctx = new Arnc_funCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				setState(237);
				match(LPAR);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 288230376286453777L) != 0)) {
					{
					{
					setState(238);
					exp(0);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new Arnc_valzeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(ARNC_VALONE);
				}
				break;
			case 11:
				{
				_localctx = new Arnc_valoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(ARNC_VALZERO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Arnc_powContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(249);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(250);
						match(POW);
						setState(251);
						arnc_exp(12);
						}
						break;
					case 2:
						{
						_localctx = new Arnc_divMulModContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(252);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(253);
						((Arnc_divMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((Arnc_divMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						arnc_exp(11);
						}
						break;
					case 3:
						{
						_localctx = new Arnc_plusMinusContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(255);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(256);
						((Arnc_plusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Arnc_plusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						arnc_exp(10);
						}
						break;
					case 4:
						{
						_localctx = new Arnc_cmpExpContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						((Arnc_cmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
							((Arnc_cmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						arnc_exp(9);
						}
						break;
					case 5:
						{
						_localctx = new Arnc_eqExpContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(261);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(262);
						((Arnc_eqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((Arnc_eqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						arnc_exp(8);
						}
						break;
					case 6:
						{
						_localctx = new Arnc_logicExpContext(new Arnc_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnc_exp);
						setState(264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(265);
						((Arnc_logicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((Arnc_logicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						arnc_exp(7);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class Arnc_opContext extends ParserRuleContext {
		public Arnc_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnc_op; }
	 
		public Arnc_opContext() { }
		public void copyFrom(Arnc_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_minusContext extends Arnc_opContext {
		public TerminalNode ARNC_MINUS() { return getToken(ImpParser.ARNC_MINUS, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_minusContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_minus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_plusContext extends Arnc_opContext {
		public TerminalNode ARNC_PLUS() { return getToken(ImpParser.ARNC_PLUS, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_plusContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_plus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_andContext extends Arnc_opContext {
		public TerminalNode ARNC_AND() { return getToken(ImpParser.ARNC_AND, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_andContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_and(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_divContext extends Arnc_opContext {
		public TerminalNode ARNC_DIV() { return getToken(ImpParser.ARNC_DIV, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_divContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_div(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_mulContext extends Arnc_opContext {
		public TerminalNode ARNC_MUL() { return getToken(ImpParser.ARNC_MUL, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_mulContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_mul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_gtContext extends Arnc_opContext {
		public TerminalNode ARNC_GRATER() { return getToken(ImpParser.ARNC_GRATER, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_gtContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_gt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_equContext extends Arnc_opContext {
		public TerminalNode ARNC_EQUAL() { return getToken(ImpParser.ARNC_EQUAL, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_equContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_equ(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Arnc_orContext extends Arnc_opContext {
		public TerminalNode ARNC_OR() { return getToken(ImpParser.ARNC_OR, 0); }
		public Arnc_expContext arnc_exp() {
			return getRuleContext(Arnc_expContext.class,0);
		}
		public Arnc_orContext(Arnc_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnc_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arnc_opContext arnc_op() throws RecognitionException {
		Arnc_opContext _localctx = new Arnc_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arnc_op);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_PLUS:
				_localctx = new Arnc_plusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(ARNC_PLUS);
				setState(273);
				arnc_exp(0);
				}
				break;
			case ARNC_MINUS:
				_localctx = new Arnc_minusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(ARNC_MINUS);
				setState(275);
				arnc_exp(0);
				}
				break;
			case ARNC_MUL:
				_localctx = new Arnc_mulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(ARNC_MUL);
				setState(277);
				arnc_exp(0);
				}
				break;
			case ARNC_DIV:
				_localctx = new Arnc_divContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(ARNC_DIV);
				setState(279);
				arnc_exp(0);
				}
				break;
			case ARNC_EQUAL:
				_localctx = new Arnc_equContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(ARNC_EQUAL);
				setState(281);
				arnc_exp(0);
				}
				break;
			case ARNC_GRATER:
				_localctx = new Arnc_gtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(ARNC_GRATER);
				setState(283);
				arnc_exp(0);
				}
				break;
			case ARNC_OR:
				_localctx = new Arnc_orContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(ARNC_OR);
				setState(285);
				arnc_exp(0);
				}
				break;
			case ARNC_AND:
				_localctx = new Arnc_andContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				match(ARNC_AND);
				setState(287);
				arnc_exp(0);
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
		case 3:
			return com_sempred((ComContext)_localctx, predIndex);
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 7:
			return arnc_exp_sempred((Arnc_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean arnc_exp_sempred(Arnc_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00020\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003e\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003j\b\u0003\n\u0003"+
		"\f\u0003m\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0082\b\u0004\n\u0004\f\u0004\u0085\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u009f\b\u0004\n\u0004\f\u0004\u00a2\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00a6\b\u0005\n\u0005\f\u0005\u00a9\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00cc\b\u0006\n\u0006\f\u0006\u00cf"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d6\b\u0006\n\u0006\f\u0006\u00d9\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00dd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00f0\b\u0007\n\u0007\f\u0007\u00f3\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f8\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u010c"+
		"\b\u0007\n\u0007\f\u0007\u010f\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0121\b\b\u0001\b\u0000\u0003\u0006"+
		"\b\u000e\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0005\u0001"+
		"\u0000\r\u000f\u0001\u0000\u000b\f\u0001\u0000\u0015\u0018\u0001\u0000"+
		"\u0013\u0014\u0001\u0000\u0011\u0012\u0155\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000"+
		"\u0006d\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u00a3"+
		"\u0001\u0000\u0000\u0000\f\u00dc\u0001\u0000\u0000\u0000\u000e\u00f7\u0001"+
		"\u0000\u0000\u0000\u0010\u0120\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005"+
		"\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"\u0001\u0000\u0000\u001c\u001d\u0005@\u0000\u0000\u001d\u001e\u0005!\u0000"+
		"\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\"\u0000\u0000"+
		" $\u0005#\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005%\u0000\u0000"+
		"#%\u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\b"+
		"\u0004\u0000()\u0005$\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*0\u0005"+
		"@\u0000\u0000+,\u0005@\u0000\u0000,-\u0005&\u0000\u0000-0\u0005@\u0000"+
		"\u0000.0\u0001\u0000\u0000\u0000/*\u0001\u0000\u0000\u0000/+\u0001\u0000"+
		"\u0000\u0000/.\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0006\u0003\uffff\uffff\u000023\u0005\u001a\u0000\u000034\u0005!\u0000"+
		"\u000045\u0003\b\u0004\u000056\u0005\"\u0000\u000067\u0005\u001b\u0000"+
		"\u000078\u0005#\u0000\u000089\u0003\u0006\u0003\u00009:\u0005$\u0000\u0000"+
		":;\u0005\u001c\u0000\u0000;<\u0005#\u0000\u0000<=\u0003\u0006\u0003\u0000"+
		"=>\u0005$\u0000\u0000>e\u0001\u0000\u0000\u0000?@\u0005@\u0000\u0000@"+
		"A\u0005\u001f\u0000\u0000Ae\u0003\b\u0004\u0000BC\u0005\u0003\u0000\u0000"+
		"CD\u0005@\u0000\u0000DE\u0005\u001f\u0000\u0000Ee\u0003\b\u0004\u0000"+
		"FG\u0005@\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u001f\u0000\u0000"+
		"Ie\u0003\b\u0004\u0000Je\u0005\u001e\u0000\u0000KL\u0005\u001d\u0000\u0000"+
		"LM\u0005!\u0000\u0000MN\u0003\b\u0004\u0000NO\u0005\"\u0000\u0000OP\u0005"+
		"#\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005$\u0000\u0000Re\u0001\u0000"+
		"\u0000\u0000ST\u0005\'\u0000\u0000TU\u0003\n\u0005\u0000UV\u0005(\u0000"+
		"\u0000Ve\u0001\u0000\u0000\u0000WX\u0005 \u0000\u0000XY\u0005!\u0000\u0000"+
		"YZ\u0003\b\u0004\u0000Z[\u0005\"\u0000\u0000[e\u0001\u0000\u0000\u0000"+
		"\\]\u0005#\u0000\u0000]^\u0003\u0006\u0003\u0000^_\u0005$\u0000\u0000"+
		"_`\u0005\u0005\u0000\u0000`a\u0005#\u0000\u0000ab\u0003\u0006\u0003\u0000"+
		"bc\u0005$\u0000\u0000ce\u0001\u0000\u0000\u0000d1\u0001\u0000\u0000\u0000"+
		"d?\u0001\u0000\u0000\u0000dB\u0001\u0000\u0000\u0000dF\u0001\u0000\u0000"+
		"\u0000dJ\u0001\u0000\u0000\u0000dK\u0001\u0000\u0000\u0000dS\u0001\u0000"+
		"\u0000\u0000dW\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000ek\u0001"+
		"\u0000\u0000\u0000fg\n\u0005\u0000\u0000gh\u0005%\u0000\u0000hj\u0003"+
		"\u0006\u0003\u0006if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0007\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0006\u0004\uffff\uffff\u0000"+
		"o\u008b\u0005\u0006\u0000\u0000p\u008b\u0005\n\u0000\u0000qr\u0005!\u0000"+
		"\u0000rs\u0003\b\u0004\u0000st\u0005\"\u0000\u0000t\u008b\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0019\u0000\u0000v\u008b\u0003\b\u0004\twx\u0005"+
		"@\u0000\u0000x|\u0005!\u0000\u0000y{\u0003\b\u0004\u0000zy\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0083\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005&\u0000\u0000\u0080\u0082\u0003\b\u0004\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u008b\u0005\"\u0000\u0000\u0087\u008b\u0005@\u0000\u0000\u0088"+
		"\u0089\u0005@\u0000\u0000\u0089\u008b\u0005\u0004\u0000\u0000\u008an\u0001"+
		"\u0000\u0000\u0000\u008ap\u0001\u0000\u0000\u0000\u008aq\u0001\u0000\u0000"+
		"\u0000\u008au\u0001\u0000\u0000\u0000\u008aw\u0001\u0000\u0000\u0000\u008a"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u00a0\u0001\u0000\u0000\u0000\u008c\u008d\n\n\u0000\u0000\u008d\u008e"+
		"\u0005\u0010\u0000\u0000\u008e\u009f\u0003\b\u0004\n\u008f\u0090\n\b\u0000"+
		"\u0000\u0090\u0091\u0007\u0000\u0000\u0000\u0091\u009f\u0003\b\u0004\t"+
		"\u0092\u0093\n\u0007\u0000\u0000\u0093\u0094\u0007\u0001\u0000\u0000\u0094"+
		"\u009f\u0003\b\u0004\b\u0095\u0096\n\u0006\u0000\u0000\u0096\u0097\u0007"+
		"\u0002\u0000\u0000\u0097\u009f\u0003\b\u0004\u0007\u0098\u0099\n\u0005"+
		"\u0000\u0000\u0099\u009a\u0007\u0003\u0000\u0000\u009a\u009f\u0003\b\u0004"+
		"\u0006\u009b\u009c\n\u0004\u0000\u0000\u009c\u009d\u0007\u0004\u0000\u0000"+
		"\u009d\u009f\u0003\b\u0004\u0005\u009e\u008c\u0001\u0000\u0000\u0000\u009e"+
		"\u008f\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000\u0000\u009e"+
		"\u0095\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e"+
		"\u009b\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\t\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a7"+
		"\u0005)\u0000\u0000\u00a4\u00a6\u0003\f\u0006\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"*\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005+\u0000"+
		"\u0000\u00ad\u00dd\u0003\u000e\u0007\u0000\u00ae\u00af\u0005,\u0000\u0000"+
		"\u00af\u00b0\u0005@\u0000\u0000\u00b0\u00b1\u0005-\u0000\u0000\u00b1\u00dd"+
		"\u0003\u000e\u0007\u0000\u00b2\u00b3\u0005,\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0003\u0000\u0000\u00b4\u00b5\u0005@\u0000\u0000\u00b5\u00b6\u0005-\u0000"+
		"\u0000\u00b6\u00dd\u0003\u000e\u0007\u0000\u00b7\u00b8\u0005.\u0000\u0000"+
		"\u00b8\u00b9\u0005@\u0000\u0000\u00b9\u00ba\u0005/\u0000\u0000\u00ba\u00bb"+
		"\u0003\u000e\u0007\u0000\u00bb\u00bc\u0003\u0010\b\u0000\u00bc\u00bd\u0005"+
		"4\u0000\u0000\u00bd\u00dd\u0001\u0000\u0000\u0000\u00be\u00bf\u0005.\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1\u0005@\u0000\u0000"+
		"\u00c1\u00c2\u0005/\u0000\u0000\u00c2\u00c3\u0003\u000e\u0007\u0000\u00c3"+
		"\u00c4\u0003\u0010\b\u0000\u00c4\u00c5\u00054\u0000\u0000\u00c5\u00dd"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u00059\u0000\u0000\u00c7\u00c8\u0003"+
		"\u000e\u0007\u0000\u00c8\u00cd\u0003\f\u0006\u0000\u00c9\u00ca\u0005:"+
		"\u0000\u0000\u00ca\u00cc\u0003\u000e\u0007\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005;\u0000"+
		"\u0000\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005<\u0000\u0000"+
		"\u00d3\u00d7\u0003\u000e\u0007\u0000\u00d4\u00d6\u0003\f\u0006\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005=\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00ac"+
		"\u0001\u0000\u0000\u0000\u00dc\u00ae\u0001\u0000\u0000\u0000\u00dc\u00b2"+
		"\u0001\u0000\u0000\u0000\u00dc\u00b7\u0001\u0000\u0000\u0000\u00dc\u00be"+
		"\u0001\u0000\u0000\u0000\u00dc\u00c6\u0001\u0000\u0000\u0000\u00dc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00dd\r\u0001\u0000\u0000\u0000\u00de\u00df\u0006"+
		"\u0007\uffff\uffff\u0000\u00df\u00f8\u0005\u0006\u0000\u0000\u00e0\u00f8"+
		"\u0005\b\u0000\u0000\u00e1\u00f8\u0005\n\u0000\u0000\u00e2\u00f8\u0005"+
		"\t\u0000\u0000\u00e3\u00e4\u0005!\u0000\u0000\u00e4\u00e5\u0003\u000e"+
		"\u0007\u0000\u00e5\u00e6\u0005\"\u0000\u0000\u00e6\u00f8\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0019\u0000\u0000\u00e8\u00f8\u0003\u000e\u0007"+
		"\u000b\u00e9\u00f8\u0005@\u0000\u0000\u00ea\u00eb\u0005@\u0000\u0000\u00eb"+
		"\u00f8\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005@\u0000\u0000\u00ed\u00f1"+
		"\u0005!\u0000\u0000\u00ee\u00f0\u0003\b\u0004\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f8\u0005"+
		"\"\u0000\u0000\u00f5\u00f8\u0005?\u0000\u0000\u00f6\u00f8\u0005>\u0000"+
		"\u0000\u00f7\u00de\u0001\u0000\u0000\u0000\u00f7\u00e0\u0001\u0000\u0000"+
		"\u0000\u00f7\u00e1\u0001\u0000\u0000\u0000\u00f7\u00e2\u0001\u0000\u0000"+
		"\u0000\u00f7\u00e3\u0001\u0000\u0000\u0000\u00f7\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00e9\u0001\u0000\u0000\u0000\u00f7\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u010d\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\n\f\u0000\u0000\u00fa\u00fb\u0005\u0010\u0000\u0000"+
		"\u00fb\u010c\u0003\u000e\u0007\f\u00fc\u00fd\n\n\u0000\u0000\u00fd\u00fe"+
		"\u0007\u0000\u0000\u0000\u00fe\u010c\u0003\u000e\u0007\u000b\u00ff\u0100"+
		"\n\t\u0000\u0000\u0100\u0101\u0007\u0001\u0000\u0000\u0101\u010c\u0003"+
		"\u000e\u0007\n\u0102\u0103\n\b\u0000\u0000\u0103\u0104\u0007\u0002\u0000"+
		"\u0000\u0104\u010c\u0003\u000e\u0007\t\u0105\u0106\n\u0007\u0000\u0000"+
		"\u0106\u0107\u0007\u0003\u0000\u0000\u0107\u010c\u0003\u000e\u0007\b\u0108"+
		"\u0109\n\u0006\u0000\u0000\u0109\u010a\u0007\u0004\u0000\u0000\u010a\u010c"+
		"\u0003\u000e\u0007\u0007\u010b\u00f9\u0001\u0000\u0000\u0000\u010b\u00fc"+
		"\u0001\u0000\u0000\u0000\u010b\u00ff\u0001\u0000\u0000\u0000\u010b\u0102"+
		"\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0108"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u000f"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u00050\u0000\u0000\u0111\u0121\u0003\u000e\u0007\u0000\u0112\u0113\u0005"+
		"1\u0000\u0000\u0113\u0121\u0003\u000e\u0007\u0000\u0114\u0115\u00052\u0000"+
		"\u0000\u0115\u0121\u0003\u000e\u0007\u0000\u0116\u0117\u00053\u0000\u0000"+
		"\u0117\u0121\u0003\u000e\u0007\u0000\u0118\u0119\u00055\u0000\u0000\u0119"+
		"\u0121\u0003\u000e\u0007\u0000\u011a\u011b\u00056\u0000\u0000\u011b\u0121"+
		"\u0003\u000e\u0007\u0000\u011c\u011d\u00057\u0000\u0000\u011d\u0121\u0003"+
		"\u000e\u0007\u0000\u011e\u011f\u00058\u0000\u0000\u011f\u0121\u0003\u000e"+
		"\u0007\u0000\u0120\u0110\u0001\u0000\u0000\u0000\u0120\u0112\u0001\u0000"+
		"\u0000\u0000\u0120\u0114\u0001\u0000\u0000\u0000\u0120\u0116\u0001\u0000"+
		"\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000"+
		"\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0011\u0001\u0000\u0000\u0000\u0013\u0015$/dk|\u0083"+
		"\u008a\u009e\u00a0\u00a7\u00cd\u00d7\u00dc\u00f1\u00f7\u010b\u010d\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}