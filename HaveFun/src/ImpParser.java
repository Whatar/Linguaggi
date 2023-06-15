// Generated from C:/Users/leona/Documents/Github/Linguaggi/HaveFun/src\Imp.g4 by ANTLR 4.12.0
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
		RULE_prog = 0, RULE_fun = 1, RULE_vars = 2, RULE_newGlobalAssign = 3, 
		RULE_com = 4, RULE_exp = 5, RULE_arnc = 6, RULE_stat = 7, RULE_arncExp = 8, 
		RULE_arncOp = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "vars", "newGlobalAssign", "com", "exp", "arnc", "stat", 
			"arncExp", "arncOp"
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
		public List<NewGlobalAssignContext> newGlobalAssign() {
			return getRuleContexts(NewGlobalAssignContext.class);
		}
		public NewGlobalAssignContext newGlobalAssign(int i) {
			return getRuleContext(NewGlobalAssignContext.class,i);
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INITFUN) {
				{
				{
				setState(20);
				fun();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(26);
				newGlobalAssign();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			com(0);
			setState(33);
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
			setState(35);
			match(INITFUN);
			setState(36);
			match(ID);
			setState(37);
			match(LPAR);
			setState(38);
			vars();
			setState(39);
			match(RPAR);
			setState(40);
			match(LBRACE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 274877915737L) != 0)) {
				{
				setState(41);
				com(0);
				setState(42);
				match(SEMICOLON);
				}
			}

			setState(46);
			match(RETURN);
			setState(47);
			exp(0);
			setState(48);
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
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
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
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(50);
					match(ID);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(56);
					match(COMMA);
					setState(57);
					match(ID);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
	public static class NewGlobalAssignContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public NewGlobalAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newGlobalAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNewGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewGlobalAssignContext newGlobalAssign() throws RecognitionException {
		NewGlobalAssignContext _localctx = new NewGlobalAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newGlobalAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(GLOBAL);
			setState(67);
			match(ID);
			setState(68);
			match(ASSIGN);
			setState(69);
			exp(0);
			setState(70);
			match(SEMICOLON);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(IF);
				setState(74);
				match(LPAR);
				setState(75);
				exp(0);
				setState(76);
				match(RPAR);
				setState(77);
				match(THEN);
				setState(78);
				match(LBRACE);
				setState(79);
				com(0);
				setState(80);
				match(RBRACE);
				setState(81);
				match(ELSE);
				setState(82);
				match(LBRACE);
				setState(83);
				com(0);
				setState(84);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(ID);
				setState(87);
				match(ASSIGN);
				setState(88);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(ID);
				setState(90);
				match(GL);
				setState(91);
				match(ASSIGN);
				setState(92);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(WHILE);
				setState(95);
				match(LPAR);
				setState(96);
				exp(0);
				setState(97);
				match(RPAR);
				setState(98);
				match(LBRACE);
				setState(99);
				com(0);
				setState(100);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ArnoldCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(ARNC_INIT);
				setState(103);
				arnc();
				setState(104);
				match(ARNC_END);
				}
				break;
			case 7:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(OUT);
				setState(107);
				match(LPAR);
				setState(108);
				exp(0);
				setState(109);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(LBRACE);
				setState(112);
				com(0);
				setState(113);
				match(RBRACE);
				setState(114);
				match(ND);
				setState(115);
				match(LBRACE);
				setState(116);
				com(0);
				setState(117);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(121);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(122);
					match(SEMICOLON);
					setState(123);
					com(6);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LPAR);
				setState(133);
				exp(0);
				setState(134);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(NOT);
				setState(137);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ID);
				setState(139);
				match(LPAR);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 288230376286453777L) != 0)) {
					{
					{
					setState(140);
					exp(0);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					exp(0);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(ID);
				setState(156);
				match(GL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(159);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(160);
						match(POW);
						setState(161);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(162);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(163);
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
						setState(164);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(165);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(166);
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
						setState(167);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(168);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(169);
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
						setState(170);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
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
						setState(173);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
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
						setState(176);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(181);
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
		enterRule(_localctx, 12, RULE_arnc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ARNC_SHOWTIME);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297133449705947136L) != 0)) {
				{
				{
				setState(183);
				stat();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
	public static class ArncDeclarationContext extends StatContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncIfContext extends StatContext {
		public TerminalNode ARNC_IF() { return getToken(ImpParser.ARNC_IF, 0); }
		public List<ArncExpContext> arncExp() {
			return getRuleContexts(ArncExpContext.class);
		}
		public ArncExpContext arncExp(int i) {
			return getRuleContext(ArncExpContext.class,i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode ARNC_ENDIF() { return getToken(ImpParser.ARNC_ENDIF, 0); }
		public List<TerminalNode> ARNC_ELSE() { return getTokens(ImpParser.ARNC_ELSE); }
		public TerminalNode ARNC_ELSE(int i) {
			return getToken(ImpParser.ARNC_ELSE, i);
		}
		public ArncIfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncWhileContext extends StatContext {
		public TerminalNode ARNC_WHILE() { return getToken(ImpParser.ARNC_WHILE, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_WHEND() { return getToken(ImpParser.ARNC_WHEND, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ArncWhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncPrintContext extends StatContext {
		public TerminalNode ARNC_PRINT() { return getToken(ImpParser.ARNC_PRINT, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncPrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncAssignContext extends StatContext {
		public TerminalNode ARNC_ASSIGN() { return getToken(ImpParser.ARNC_ASSIGN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_OP_BASE() { return getToken(ImpParser.ARNC_OP_BASE, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncOpContext arncOp() {
			return getRuleContext(ArncOpContext.class,0);
		}
		public TerminalNode ARNC_OP_END() { return getToken(ImpParser.ARNC_OP_END, 0); }
		public ArncAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncGlobalAssignContext extends StatContext {
		public TerminalNode ARNC_ASSIGN() { return getToken(ImpParser.ARNC_ASSIGN, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_OP_BASE() { return getToken(ImpParser.ARNC_OP_BASE, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncOpContext arncOp() {
			return getRuleContext(ArncOpContext.class,0);
		}
		public TerminalNode ARNC_OP_END() { return getToken(ImpParser.ARNC_OP_END, 0); }
		public ArncGlobalAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncGlobalDeclarationContext extends StatContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncGlobalDeclarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArncPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(ARNC_PRINT);
				setState(192);
				arncExp();
				}
				break;
			case 2:
				_localctx = new ArncDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ARNC_DECL);
				setState(194);
				match(ID);
				setState(195);
				match(ARNC_VARSET);
				setState(196);
				arncExp();
				}
				break;
			case 3:
				_localctx = new ArncGlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(ARNC_DECL);
				setState(198);
				match(GLOBAL);
				setState(199);
				match(ID);
				setState(200);
				match(ARNC_VARSET);
				setState(201);
				arncExp();
				}
				break;
			case 4:
				_localctx = new ArncAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(ARNC_ASSIGN);
				setState(203);
				match(ID);
				setState(204);
				match(ARNC_OP_BASE);
				setState(205);
				arncExp();
				setState(206);
				arncOp();
				setState(207);
				match(ARNC_OP_END);
				}
				break;
			case 5:
				_localctx = new ArncGlobalAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(ARNC_ASSIGN);
				setState(210);
				match(GL);
				setState(211);
				match(ID);
				setState(212);
				match(ARNC_OP_BASE);
				setState(213);
				arncExp();
				setState(214);
				arncOp();
				setState(215);
				match(ARNC_OP_END);
				}
				break;
			case 6:
				_localctx = new ArncIfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(ARNC_IF);
				setState(218);
				arncExp();
				setState(219);
				stat();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_ELSE) {
					{
					{
					setState(220);
					match(ARNC_ELSE);
					setState(221);
					arncExp();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(ARNC_ENDIF);
				}
				break;
			case 7:
				_localctx = new ArncWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(ARNC_WHILE);
				setState(230);
				arncExp();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297133449705947136L) != 0)) {
					{
					{
					setState(231);
					stat();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
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
	public static class ArncExpContext extends ParserRuleContext {
		public ArncExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncExp; }
	 
		public ArncExpContext() { }
		public void copyFrom(ArncExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncBoolContext extends ArncExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public ArncBoolContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncIdContext extends ArncExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArncIdContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncValzeroContext extends ArncExpContext {
		public TerminalNode ARNC_VALONE() { return getToken(ImpParser.ARNC_VALONE, 0); }
		public ArncValzeroContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncValzero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncParExpContext extends ArncExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ArncParExpContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncStringContext extends ArncExpContext {
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public ArncStringContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncFunCallContext extends ArncExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ArncExpContext> arncExp() {
			return getRuleContexts(ArncExpContext.class);
		}
		public ArncExpContext arncExp(int i) {
			return getRuleContext(ArncExpContext.class,i);
		}
		public ArncFunCallContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncFloatContext extends ArncExpContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public ArncFloatContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncGlobalIdContext extends ArncExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public ArncGlobalIdContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncGlobalId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncNatContext extends ArncExpContext {
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public ArncNatContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncValoneContext extends ArncExpContext {
		public TerminalNode ARNC_VALZERO() { return getToken(ImpParser.ARNC_VALZERO, 0); }
		public ArncValoneContext(ArncExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncValone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncExpContext arncExp() throws RecognitionException {
		ArncExpContext _localctx = new ArncExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arncExp);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ArncNatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(NAT);
				}
				break;
			case 2:
				_localctx = new ArncFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new ArncBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new ArncStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new ArncParExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(LPAR);
				setState(246);
				arncExp();
				setState(247);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new ArncValzeroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(ARNC_VALONE);
				}
				break;
			case 7:
				_localctx = new ArncValoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				match(ARNC_VALZERO);
				}
				break;
			case 8:
				_localctx = new ArncIdContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				match(ID);
				}
				break;
			case 9:
				_localctx = new ArncGlobalIdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				match(ID);
				setState(253);
				match(GL);
				}
				break;
			case 10:
				_localctx = new ArncFunCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(ID);
				setState(255);
				match(LPAR);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 504403158399713309L) != 0)) {
					{
					{
					setState(256);
					arncExp();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(RPAR);
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
	public static class ArncOpContext extends ParserRuleContext {
		public ArncOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncOp; }
	 
		public ArncOpContext() { }
		public void copyFrom(ArncOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncCalcOpContext extends ArncOpContext {
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_MUL() { return getToken(ImpParser.ARNC_MUL, 0); }
		public TerminalNode ARNC_DIV() { return getToken(ImpParser.ARNC_DIV, 0); }
		public TerminalNode ARNC_PLUS() { return getToken(ImpParser.ARNC_PLUS, 0); }
		public TerminalNode ARNC_MINUS() { return getToken(ImpParser.ARNC_MINUS, 0); }
		public ArncCalcOpContext(ArncOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncCalcOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncLogOpContext extends ArncOpContext {
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_EQUAL() { return getToken(ImpParser.ARNC_EQUAL, 0); }
		public TerminalNode ARNC_GRATER() { return getToken(ImpParser.ARNC_GRATER, 0); }
		public TerminalNode ARNC_OR() { return getToken(ImpParser.ARNC_OR, 0); }
		public TerminalNode ARNC_AND() { return getToken(ImpParser.ARNC_AND, 0); }
		public ArncLogOpContext(ArncOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncLogOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncOpContext arncOp() throws RecognitionException {
		ArncOpContext _localctx = new ArncOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arncOp);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_PLUS:
			case ARNC_MINUS:
			case ARNC_MUL:
			case ARNC_DIV:
				_localctx = new ArncCalcOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				arncExp();
				}
				break;
			case ARNC_EQUAL:
			case ARNC_GRATER:
			case ARNC_OR:
			case ARNC_AND:
				_localctx = new ArncLogOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135107988821114880L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				arncExp();
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
		case 4:
			return com_sempred((ComContext)_localctx, predIndex);
		case 5:
			return exp_sempred((ExpContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\u0004\u0001A\u0110\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f"+
		"\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t"+
		"\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004}\b\u0004\n\u0004\f\u0004\u0080\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u008e\b\u0005\n\u0005\f\u0005\u0091\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0095\b\u0005\n\u0005\f\u0005\u0098\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009e\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00b2\b\u0005\n\u0005\f\u0005\u00b5\t\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00b9\b\u0006\n\u0006\f\u0006\u00bc\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00df\b\u0007\n\u0007\f\u0007\u00e2\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e9"+
		"\b\u0007\n\u0007\f\u0007\u00ec\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00f0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0102\b\b\n\b\f\b\u0105\t\b\u0001\b\u0003\b\u0108\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u010e\b\t\u0001\t\u0000\u0002\b\n\n"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0007\u0001\u0000"+
		"\r\u000f\u0001\u0000\u000b\f\u0001\u0000\u0015\u0018\u0001\u0000\u0013"+
		"\u0014\u0001\u0000\u0011\u0012\u0001\u000003\u0001\u000058\u0135\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004@\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000"+
		"\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u00b6\u0001\u0000\u0000\u0000"+
		"\u000e\u00ef\u0001\u0000\u0000\u0000\u0010\u0107\u0001\u0000\u0000\u0000"+
		"\u0012\u010d\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 !\u0003\b\u0004\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005"+
		"@\u0000\u0000%&\u0005!\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005"+
		"\"\u0000\u0000(,\u0005#\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005%\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0003"+
		"\n\u0005\u000001\u0005$\u0000\u00001\u0003\u0001\u0000\u0000\u000024\u0005"+
		"@\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006<\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0005&\u0000\u00009;\u0005@\u0000\u0000:"+
		"8\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=A\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?A\u0001\u0000\u0000\u0000@5\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0003\u0000"+
		"\u0000CD\u0005@\u0000\u0000DE\u0005\u001f\u0000\u0000EF\u0003\n\u0005"+
		"\u0000FG\u0005%\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0006\u0004"+
		"\uffff\uffff\u0000IJ\u0005\u001a\u0000\u0000JK\u0005!\u0000\u0000KL\u0003"+
		"\n\u0005\u0000LM\u0005\"\u0000\u0000MN\u0005\u001b\u0000\u0000NO\u0005"+
		"#\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005$\u0000\u0000QR\u0005\u001c"+
		"\u0000\u0000RS\u0005#\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005$\u0000"+
		"\u0000Ux\u0001\u0000\u0000\u0000VW\u0005@\u0000\u0000WX\u0005\u001f\u0000"+
		"\u0000Xx\u0003\n\u0005\u0000YZ\u0005@\u0000\u0000Z[\u0005\u0004\u0000"+
		"\u0000[\\\u0005\u001f\u0000\u0000\\x\u0003\n\u0005\u0000]x\u0005\u001e"+
		"\u0000\u0000^_\u0005\u001d\u0000\u0000_`\u0005!\u0000\u0000`a\u0003\n"+
		"\u0005\u0000ab\u0005\"\u0000\u0000bc\u0005#\u0000\u0000cd\u0003\b\u0004"+
		"\u0000de\u0005$\u0000\u0000ex\u0001\u0000\u0000\u0000fg\u0005\'\u0000"+
		"\u0000gh\u0003\f\u0006\u0000hi\u0005(\u0000\u0000ix\u0001\u0000\u0000"+
		"\u0000jk\u0005 \u0000\u0000kl\u0005!\u0000\u0000lm\u0003\n\u0005\u0000"+
		"mn\u0005\"\u0000\u0000nx\u0001\u0000\u0000\u0000op\u0005#\u0000\u0000"+
		"pq\u0003\b\u0004\u0000qr\u0005$\u0000\u0000rs\u0005\u0005\u0000\u0000"+
		"st\u0005#\u0000\u0000tu\u0003\b\u0004\u0000uv\u0005$\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wH\u0001\u0000\u0000\u0000wV\u0001\u0000\u0000\u0000"+
		"wY\u0001\u0000\u0000\u0000w]\u0001\u0000\u0000\u0000w^\u0001\u0000\u0000"+
		"\u0000wf\u0001\u0000\u0000\u0000wj\u0001\u0000\u0000\u0000wo\u0001\u0000"+
		"\u0000\u0000x~\u0001\u0000\u0000\u0000yz\n\u0005\u0000\u0000z{\u0005%"+
		"\u0000\u0000{}\u0003\b\u0004\u0006|y\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0006\u0005\uffff\uffff\u0000\u0082\u009e\u0005\u0006\u0000"+
		"\u0000\u0083\u009e\u0005\n\u0000\u0000\u0084\u0085\u0005!\u0000\u0000"+
		"\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087"+
		"\u009e\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0019\u0000\u0000\u0089"+
		"\u009e\u0003\n\u0005\t\u008a\u008b\u0005@\u0000\u0000\u008b\u008f\u0005"+
		"!\u0000\u0000\u008c\u008e\u0003\n\u0005\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0096\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005&\u0000"+
		"\u0000\u0093\u0095\u0003\n\u0005\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009e\u0005\"\u0000\u0000\u009a"+
		"\u009e\u0005@\u0000\u0000\u009b\u009c\u0005@\u0000\u0000\u009c\u009e\u0005"+
		"\u0004\u0000\u0000\u009d\u0081\u0001\u0000\u0000\u0000\u009d\u0083\u0001"+
		"\u0000\u0000\u0000\u009d\u0084\u0001\u0000\u0000\u0000\u009d\u0088\u0001"+
		"\u0000\u0000\u0000\u009d\u008a\u0001\u0000\u0000\u0000\u009d\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00b3\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\n\n\u0000\u0000\u00a0\u00a1\u0005\u0010"+
		"\u0000\u0000\u00a1\u00b2\u0003\n\u0005\n\u00a2\u00a3\n\b\u0000\u0000\u00a3"+
		"\u00a4\u0007\u0000\u0000\u0000\u00a4\u00b2\u0003\n\u0005\t\u00a5\u00a6"+
		"\n\u0007\u0000\u0000\u00a6\u00a7\u0007\u0001\u0000\u0000\u00a7\u00b2\u0003"+
		"\n\u0005\b\u00a8\u00a9\n\u0006\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000"+
		"\u0000\u00aa\u00b2\u0003\n\u0005\u0007\u00ab\u00ac\n\u0005\u0000\u0000"+
		"\u00ac\u00ad\u0007\u0003\u0000\u0000\u00ad\u00b2\u0003\n\u0005\u0006\u00ae"+
		"\u00af\n\u0004\u0000\u0000\u00af\u00b0\u0007\u0004\u0000\u0000\u00b0\u00b2"+
		"\u0003\n\u0005\u0005\u00b1\u009f\u0001\u0000\u0000\u0000\u00b1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u000b\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005"+
		")\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005*\u0000"+
		"\u0000\u00be\r\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005+\u0000\u0000"+
		"\u00c0\u00f0\u0003\u0010\b\u0000\u00c1\u00c2\u0005,\u0000\u0000\u00c2"+
		"\u00c3\u0005@\u0000\u0000\u00c3\u00c4\u0005-\u0000\u0000\u00c4\u00f0\u0003"+
		"\u0010\b\u0000\u00c5\u00c6\u0005,\u0000\u0000\u00c6\u00c7\u0005\u0003"+
		"\u0000\u0000\u00c7\u00c8\u0005@\u0000\u0000\u00c8\u00c9\u0005-\u0000\u0000"+
		"\u00c9\u00f0\u0003\u0010\b\u0000\u00ca\u00cb\u0005.\u0000\u0000\u00cb"+
		"\u00cc\u0005@\u0000\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0010\b\u0000\u00ce\u00cf\u0003\u0012\t\u0000\u00cf\u00d0\u00054\u0000"+
		"\u0000\u00d0\u00f0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005.\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3\u00d4\u0005@\u0000\u0000\u00d4"+
		"\u00d5\u0005/\u0000\u0000\u00d5\u00d6\u0003\u0010\b\u0000\u00d6\u00d7"+
		"\u0003\u0012\t\u0000\u00d7\u00d8\u00054\u0000\u0000\u00d8\u00f0\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u00059\u0000\u0000\u00da\u00db\u0003\u0010"+
		"\b\u0000\u00db\u00e0\u0003\u000e\u0007\u0000\u00dc\u00dd\u0005:\u0000"+
		"\u0000\u00dd\u00df\u0003\u0010\b\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005;\u0000\u0000\u00e4"+
		"\u00f0\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005<\u0000\u0000\u00e6\u00ea"+
		"\u0003\u0010\b\u0000\u00e7\u00e9\u0003\u000e\u0007\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"=\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00bf\u0001\u0000"+
		"\u0000\u0000\u00ef\u00c1\u0001\u0000\u0000\u0000\u00ef\u00c5\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ca\u0001\u0000\u0000\u0000\u00ef\u00d1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00d9\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f0\u000f\u0001\u0000\u0000\u0000\u00f1\u0108\u0005\u0006"+
		"\u0000\u0000\u00f2\u0108\u0005\b\u0000\u0000\u00f3\u0108\u0005\n\u0000"+
		"\u0000\u00f4\u0108\u0005\t\u0000\u0000\u00f5\u00f6\u0005!\u0000\u0000"+
		"\u00f6\u00f7\u0003\u0010\b\u0000\u00f7\u00f8\u0005\"\u0000\u0000\u00f8"+
		"\u0108\u0001\u0000\u0000\u0000\u00f9\u0108\u0005?\u0000\u0000\u00fa\u0108"+
		"\u0005>\u0000\u0000\u00fb\u0108\u0005@\u0000\u0000\u00fc\u00fd\u0005@"+
		"\u0000\u0000\u00fd\u0108\u0005\u0004\u0000\u0000\u00fe\u00ff\u0005@\u0000"+
		"\u0000\u00ff\u0103\u0005!\u0000\u0000\u0100\u0102\u0003\u0010\b\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0005\"\u0000\u0000\u0107\u00f1\u0001\u0000\u0000\u0000\u0107"+
		"\u00f2\u0001\u0000\u0000\u0000\u0107\u00f3\u0001\u0000\u0000\u0000\u0107"+
		"\u00f4\u0001\u0000\u0000\u0000\u0107\u00f5\u0001\u0000\u0000\u0000\u0107"+
		"\u00f9\u0001\u0000\u0000\u0000\u0107\u00fa\u0001\u0000\u0000\u0000\u0107"+
		"\u00fb\u0001\u0000\u0000\u0000\u0107\u00fc\u0001\u0000\u0000\u0000\u0107"+
		"\u00fe\u0001\u0000\u0000\u0000\u0108\u0011\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0007\u0005\u0000\u0000\u010a\u010e\u0003\u0010\b\u0000\u010b\u010c"+
		"\u0007\u0006\u0000\u0000\u010c\u010e\u0003\u0010\b\u0000\u010d\u0109\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0013\u0001"+
		"\u0000\u0000\u0000\u0014\u0017\u001d,5<@w~\u008f\u0096\u009d\u00b1\u00b3"+
		"\u00ba\u00e0\u00ea\u00ef\u0103\u0107\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}