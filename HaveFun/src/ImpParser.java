// Generated from java-escape by ANTLR 4.11.1
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
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INITFUN=1, RETURN=2, GLOBAL=3, GL=4, ND=5, NAT=6, INT=7, FLOAT=8, STRING=9, 
		BOOL=10, PLUS=11, MINUS=12, MUL=13, DIV=14, MOD=15, POW=16, AND=17, OR=18, 
		EQQ=19, NEQ=20, LEQ=21, GEQ=22, LT=23, GT=24, NOT=25, IF=26, THEN=27, 
		ELSE=28, WHILE=29, SKIPP=30, ASSIGN=31, OUT=32, LPAR=33, RPAR=34, LBRACE=35, 
		RBRACE=36, SEMICOLON=37, COMMA=38, ARNC_INIT=39, ARNC_END=40, ARNC_SHOWTIME=41, 
		ARNC_TERM=42, ARNC_PRINT=43, ARNC_DECL=44, ARNC_VARSET=45, ARNC_SLY=46, 
		ARNC_OP_ASSIGN=47, ARNC_OP_BASE=48, ARNC_PLUS=49, ARNC_MINUS=50, ARNC_MUL=51, 
		ARNC_DIV=52, ARNC_OP_END=53, ARNC_EQUAL=54, ARNC_GRATER=55, ARNC_OR=56, 
		ARNC_AND=57, ARNC_IF=58, ARNC_ELSE=59, ARNC_ENDIF=60, ARNC_WHILE=61, ARNC_WHEND=62, 
		ARNC_VALZERO=63, ARNC_VALONE=64, ARNC_METHOD=65, ARNC_METCLOSE=66, ARNC_METARGS=67, 
		ARNC_METNONVOID=68, ARNC_RET=69, ARNC_METASSIGN=70, ARNC_CALLMET=71, ID=72, 
		WS=73;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_vars = 2, RULE_newGlobalAssign = 3, 
		RULE_com = 4, RULE_exp = 5, RULE_arncCom = 6, RULE_arncMet = 7, RULE_arncMetBody = 8, 
		RULE_arncExp = 9, RULE_arncOp = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "vars", "newGlobalAssign", "com", "exp", "arncCom", "arncMet", 
			"arncMetBody", "arncExp", "arncOp"
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
			"'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", "'ARNOLD OR SLY'", 
			"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'GET UP'", "'GET DOWN'", 
			"'YOU'RE FIRED'", "'HE HAD TO SPLIT'", "'ENOUGH TALK'", "'YOU ARE NOT YOU YOU ARE ME'", 
			"'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", "'KNOCK KNOCK'", 
			"'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", "'@I LIED'", "'@NO PROBLEMO'", "'LISTEN TO ME VERY CAREFULLY'", 
			"'HASTA LA VISTA, BABY'", "'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", 
			"'GIVE THESE PEOPLE AIR'", "'I'LL BE BACK'", "'GET YOUR ASS TO MARS'", 
			"'DO IT NOW'"
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
			"ARNC_PRINT", "ARNC_DECL", "ARNC_VARSET", "ARNC_SLY", "ARNC_OP_ASSIGN", 
			"ARNC_OP_BASE", "ARNC_PLUS", "ARNC_MINUS", "ARNC_MUL", "ARNC_DIV", "ARNC_OP_END", 
			"ARNC_EQUAL", "ARNC_GRATER", "ARNC_OR", "ARNC_AND", "ARNC_IF", "ARNC_ELSE", 
			"ARNC_ENDIF", "ARNC_WHILE", "ARNC_WHEND", "ARNC_VALZERO", "ARNC_VALONE", 
			"ARNC_METHOD", "ARNC_METCLOSE", "ARNC_METARGS", "ARNC_METNONVOID", "ARNC_RET", 
			"ARNC_METASSIGN", "ARNC_CALLMET", "ID", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INITFUN) {
				{
				{
				setState(22);
				fun();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(28);
				newGlobalAssign();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			com(0);
			setState(35);
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
			setState(37);
			match(INITFUN);
			setState(38);
			match(ID);
			setState(39);
			match(LPAR);
			setState(40);
			vars();
			setState(41);
			match(RPAR);
			setState(42);
			match(LBRACE);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 70368744186457L) != 0) {
				{
				setState(43);
				com(0);
				setState(44);
				match(SEMICOLON);
				}
			}

			setState(48);
			match(RETURN);
			setState(49);
			exp(0);
			setState(50);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(52);
					match(ID);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					match(ID);
					}
					}
					setState(64);
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
			setState(68);
			match(GLOBAL);
			setState(69);
			match(ID);
			setState(70);
			match(ASSIGN);
			setState(71);
			exp(0);
			setState(72);
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
		public TerminalNode ARNC_SHOWTIME() { return getToken(ImpParser.ARNC_SHOWTIME, 0); }
		public ArncComContext arncCom() {
			return getRuleContext(ArncComContext.class,0);
		}
		public TerminalNode ARNC_TERM() { return getToken(ImpParser.ARNC_TERM, 0); }
		public TerminalNode ARNC_END() { return getToken(ImpParser.ARNC_END, 0); }
		public List<ArncMetContext> arncMet() {
			return getRuleContexts(ArncMetContext.class);
		}
		public ArncMetContext arncMet(int i) {
			return getRuleContext(ArncMetContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(IF);
				setState(76);
				match(LPAR);
				setState(77);
				exp(0);
				setState(78);
				match(RPAR);
				setState(79);
				match(THEN);
				setState(80);
				match(LBRACE);
				setState(81);
				com(0);
				setState(82);
				match(RBRACE);
				setState(83);
				match(ELSE);
				setState(84);
				match(LBRACE);
				setState(85);
				com(0);
				setState(86);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(ID);
				setState(89);
				match(ASSIGN);
				setState(90);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(ID);
				setState(92);
				match(GL);
				setState(93);
				match(ASSIGN);
				setState(94);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(WHILE);
				setState(97);
				match(LPAR);
				setState(98);
				exp(0);
				setState(99);
				match(RPAR);
				setState(100);
				match(LBRACE);
				setState(101);
				com(0);
				setState(102);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ArnoldCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(ARNC_INIT);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_METHOD) {
					{
					{
					setState(105);
					arncMet();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(ARNC_SHOWTIME);
				setState(112);
				arncCom(0);
				setState(113);
				match(ARNC_TERM);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_METHOD) {
					{
					{
					setState(114);
					arncMet();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(ARNC_END);
				}
				break;
			case 7:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(OUT);
				setState(123);
				match(LPAR);
				setState(124);
				exp(0);
				setState(125);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(LBRACE);
				setState(128);
				com(0);
				setState(129);
				match(RBRACE);
				setState(130);
				match(ND);
				setState(131);
				match(LBRACE);
				setState(132);
				com(0);
				setState(133);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(137);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(138);
					match(SEMICOLON);
					setState(139);
					com(6);
					}
					} 
				}
				setState(144);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(LPAR);
				setState(149);
				exp(0);
				setState(150);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NOT);
				setState(153);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ID);
				setState(155);
				match(LPAR);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8623490112L) != 0 || _la==ID) {
					{
					{
					setState(156);
					exp(0);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					exp(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(ID);
				setState(172);
				match(GL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(175);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(176);
						match(POW);
						setState(177);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
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
						setState(183);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(187);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(188);
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
						setState(189);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
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
						setState(192);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class ArncComContext extends ParserRuleContext {
		public ArncComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncCom; }
	 
		public ArncComContext() { }
		public void copyFrom(ArncComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncMetCallContext extends ArncComContext {
		public TerminalNode ARNC_METASSIGN() { return getToken(ImpParser.ARNC_METASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode ARNC_CALLMET() { return getToken(ImpParser.ARNC_CALLMET, 0); }
		public List<ArncExpContext> arncExp() {
			return getRuleContexts(ArncExpContext.class);
		}
		public ArncExpContext arncExp(int i) {
			return getRuleContext(ArncExpContext.class,i);
		}
		public ArncMetCallContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMetCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncIfContext extends ArncComContext {
		public TerminalNode ARNC_IF() { return getToken(ImpParser.ARNC_IF, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public List<ArncComContext> arncCom() {
			return getRuleContexts(ArncComContext.class);
		}
		public ArncComContext arncCom(int i) {
			return getRuleContext(ArncComContext.class,i);
		}
		public TerminalNode ARNC_ENDIF() { return getToken(ImpParser.ARNC_ENDIF, 0); }
		public TerminalNode ARNC_ELSE() { return getToken(ImpParser.ARNC_ELSE, 0); }
		public ArncIfContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncOpResAssignContext extends ArncComContext {
		public TerminalNode ARNC_OP_ASSIGN() { return getToken(ImpParser.ARNC_OP_ASSIGN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_OP_BASE() { return getToken(ImpParser.ARNC_OP_BASE, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_OP_END() { return getToken(ImpParser.ARNC_OP_END, 0); }
		public List<ArncOpContext> arncOp() {
			return getRuleContexts(ArncOpContext.class);
		}
		public ArncOpContext arncOp(int i) {
			return getRuleContext(ArncOpContext.class,i);
		}
		public ArncOpResAssignContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncOpResAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncWhileContext extends ArncComContext {
		public TerminalNode ARNC_WHILE() { return getToken(ImpParser.ARNC_WHILE, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncComContext arncCom() {
			return getRuleContext(ArncComContext.class,0);
		}
		public TerminalNode ARNC_WHEND() { return getToken(ImpParser.ARNC_WHEND, 0); }
		public ArncWhileContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncSeqContext extends ArncComContext {
		public List<ArncComContext> arncCom() {
			return getRuleContexts(ArncComContext.class);
		}
		public ArncComContext arncCom(int i) {
			return getRuleContext(ArncComContext.class,i);
		}
		public ArncSeqContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncPrintContext extends ArncComContext {
		public TerminalNode ARNC_PRINT() { return getToken(ImpParser.ARNC_PRINT, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncPrintContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncAssignContext extends ArncComContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncAssignContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncGlobalAssignContext extends ArncComContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode ARNC_SLY() { return getToken(ImpParser.ARNC_SLY, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncGlobalAssignContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncComContext arncCom() throws RecognitionException {
		return arncCom(0);
	}

	private ArncComContext arncCom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArncComContext _localctx = new ArncComContext(_ctx, _parentState);
		ArncComContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arncCom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ArncPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				match(ARNC_PRINT);
				setState(200);
				arncExp();
				}
				break;
			case 2:
				{
				_localctx = new ArncAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(ARNC_DECL);
				setState(202);
				match(ID);
				setState(203);
				match(ARNC_VARSET);
				setState(204);
				arncExp();
				}
				break;
			case 3:
				{
				_localctx = new ArncGlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ARNC_DECL);
				setState(206);
				match(ID);
				setState(207);
				match(ARNC_SLY);
				setState(208);
				match(ID);
				setState(209);
				match(GL);
				setState(210);
				arncExp();
				}
				break;
			case 4:
				{
				_localctx = new ArncOpResAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(ARNC_OP_ASSIGN);
				setState(212);
				match(ID);
				setState(213);
				match(ARNC_OP_BASE);
				setState(214);
				arncExp();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 278660226943549440L) != 0) {
					{
					{
					setState(215);
					arncOp();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(ARNC_OP_END);
				}
				break;
			case 5:
				{
				_localctx = new ArncIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(ARNC_IF);
				setState(224);
				arncExp();
				setState(225);
				arncCom(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARNC_ELSE) {
					{
					setState(226);
					match(ARNC_ELSE);
					setState(227);
					arncCom(0);
					}
				}

				setState(230);
				match(ARNC_ENDIF);
				}
				break;
			case 6:
				{
				_localctx = new ArncWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(ARNC_WHILE);
				setState(233);
				arncExp();
				setState(234);
				arncCom(0);
				setState(235);
				match(ARNC_WHEND);
				}
				break;
			case 7:
				{
				_localctx = new ArncMetCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(ARNC_METASSIGN);
				setState(238);
				match(ID);
				setState(239);
				match(ARNC_CALLMET);
				setState(240);
				match(ID);
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						arncExp();
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArncSeqContext(new ArncComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arncCom);
					setState(249);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(250);
					arncCom(2);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class ArncMetContext extends ParserRuleContext {
		public ArncMetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncMet; }
	 
		public ArncMetContext() { }
		public void copyFrom(ArncMetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncMethodContext extends ArncMetContext {
		public TerminalNode ARNC_METHOD() { return getToken(ImpParser.ARNC_METHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public ArncMetBodyContext arncMetBody() {
			return getRuleContext(ArncMetBodyContext.class,0);
		}
		public TerminalNode ARNC_METCLOSE() { return getToken(ImpParser.ARNC_METCLOSE, 0); }
		public List<TerminalNode> ARNC_METARGS() { return getTokens(ImpParser.ARNC_METARGS); }
		public TerminalNode ARNC_METARGS(int i) {
			return getToken(ImpParser.ARNC_METARGS, i);
		}
		public ArncMethodContext(ArncMetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncMetContext arncMet() throws RecognitionException {
		ArncMetContext _localctx = new ArncMetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arncMet);
		int _la;
		try {
			_localctx = new ArncMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ARNC_METHOD);
			setState(257);
			match(ID);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARNC_METARGS) {
				{
				{
				setState(258);
				match(ARNC_METARGS);
				setState(259);
				match(ID);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			arncMetBody();
			setState(266);
			match(ARNC_METCLOSE);
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
	public static class ArncMetBodyContext extends ParserRuleContext {
		public ArncMetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncMetBody; }
	 
		public ArncMetBodyContext() { }
		public void copyFrom(ArncMetBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncMetNonVoidContext extends ArncMetBodyContext {
		public TerminalNode ARNC_METNONVOID() { return getToken(ImpParser.ARNC_METNONVOID, 0); }
		public ArncComContext arncCom() {
			return getRuleContext(ArncComContext.class,0);
		}
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_RET() { return getToken(ImpParser.ARNC_RET, 0); }
		public ArncMetNonVoidContext(ArncMetBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMetNonVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncMetVoidContext extends ArncMetBodyContext {
		public ArncComContext arncCom() {
			return getRuleContext(ArncComContext.class,0);
		}
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncMetVoidContext(ArncMetBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMetVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncMetBodyContext arncMetBody() throws RecognitionException {
		ArncMetBodyContext _localctx = new ArncMetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arncMetBody);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_METNONVOID:
				_localctx = new ArncMetNonVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ARNC_METNONVOID);
				setState(269);
				arncCom(0);
				setState(270);
				arncExp();
				setState(271);
				match(ARNC_RET);
				}
				break;
			case ARNC_PRINT:
			case ARNC_DECL:
			case ARNC_OP_ASSIGN:
			case ARNC_IF:
			case ARNC_WHILE:
			case ARNC_METASSIGN:
				_localctx = new ArncMetVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				arncCom(0);
				setState(274);
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
		enterRule(_localctx, 18, RULE_arncExp);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ArncNatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(NAT);
				}
				break;
			case 2:
				_localctx = new ArncFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new ArncBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new ArncStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new ArncParExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(LPAR);
				setState(283);
				arncExp();
				setState(284);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new ArncValzeroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(ARNC_VALONE);
				}
				break;
			case 7:
				_localctx = new ArncValoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				match(ARNC_VALZERO);
				}
				break;
			case 8:
				_localctx = new ArncIdContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				match(ID);
				}
				break;
			case 9:
				_localctx = new ArncFunCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				match(ID);
				setState(290);
				match(LPAR);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372028264839360L) != 0 || _la==ARNC_VALONE || _la==ID) {
					{
					{
					setState(291);
					arncExp();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
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
	public static class ArncPlusMinusContext extends ArncOpContext {
		public Token aop;
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_PLUS() { return getToken(ImpParser.ARNC_PLUS, 0); }
		public TerminalNode ARNC_MINUS() { return getToken(ImpParser.ARNC_MINUS, 0); }
		public ArncPlusMinusContext(ArncOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncCmpOpContext extends ArncOpContext {
		public Token aop;
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_EQUAL() { return getToken(ImpParser.ARNC_EQUAL, 0); }
		public TerminalNode ARNC_GRATER() { return getToken(ImpParser.ARNC_GRATER, 0); }
		public ArncCmpOpContext(ArncOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncCmpOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncDivMulContext extends ArncOpContext {
		public Token aop;
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public TerminalNode ARNC_DIV() { return getToken(ImpParser.ARNC_DIV, 0); }
		public TerminalNode ARNC_MUL() { return getToken(ImpParser.ARNC_MUL, 0); }
		public ArncDivMulContext(ArncOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncDivMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncLogOpContext extends ArncOpContext {
		public Token aop;
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_arncOp);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_MUL:
			case ARNC_DIV:
				_localctx = new ArncDivMulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				((ArncDivMulContext)_localctx).aop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ARNC_MUL || _la==ARNC_DIV) ) {
					((ArncDivMulContext)_localctx).aop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				arncExp();
				}
				break;
			case ARNC_PLUS:
			case ARNC_MINUS:
				_localctx = new ArncPlusMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				((ArncPlusMinusContext)_localctx).aop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ARNC_PLUS || _la==ARNC_MINUS) ) {
					((ArncPlusMinusContext)_localctx).aop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				arncExp();
				}
				break;
			case ARNC_EQUAL:
			case ARNC_GRATER:
				_localctx = new ArncCmpOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				((ArncCmpOpContext)_localctx).aop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ARNC_EQUAL || _la==ARNC_GRATER) ) {
					((ArncCmpOpContext)_localctx).aop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				arncExp();
				}
				break;
			case ARNC_OR:
			case ARNC_AND:
				_localctx = new ArncLogOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				((ArncLogOpContext)_localctx).aop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ARNC_OR || _la==ARNC_AND) ) {
					((ArncLogOpContext)_localctx).aop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
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
		case 6:
			return arncCom_sempred((ArncComContext)_localctx, predIndex);
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
	private boolean arncCom_sempred(ArncComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0005\u0000\u001e\b"+
		"\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u00026\b\u0002\n\u0002"+
		"\f\u00029\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002"+
		"\f\u0002@\t\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004k\b\u0004\n\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004\u0090"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u009e\b\u0005\n\u0005\f\u0005\u00a1\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00a5\b\u0005\n\u0005\f\u0005\u00a8\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ae\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00c2\b\u0005\n\u0005\f\u0005\u00c5\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d9\b\u0006"+
		"\n\u0006\f\u0006\u00dc\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00f3\b\u0006\n\u0006\f\u0006\u00f6\t\u0006\u0003\u0006\u00f8\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00fc\b\u0006\n\u0006\f\u0006"+
		"\u00ff\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0105\b\u0007\n\u0007\f\u0007\u0108\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0115\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0125"+
		"\b\t\n\t\f\t\u0128\t\t\u0001\t\u0003\t\u012b\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0135\b\n\u0001\n\u0000"+
		"\u0003\b\n\f\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\t\u0001\u0000\r\u000f\u0001\u0000\u000b\f\u0001\u0000\u0015\u0018"+
		"\u0001\u0000\u0013\u0014\u0001\u0000\u0011\u0012\u0001\u000034\u0001\u0000"+
		"12\u0001\u000067\u0001\u000089\u0161\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006D"+
		"\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000\u0000\n\u00ad\u0001"+
		"\u0000\u0000\u0000\f\u00f7\u0001\u0000\u0000\u0000\u000e\u0100\u0001\u0000"+
		"\u0000\u0000\u0010\u0114\u0001\u0000\u0000\u0000\u0012\u012a\u0001\u0000"+
		"\u0000\u0000\u0014\u0134\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000\"#\u0003\b\u0004\u0000#$\u0005\u0000\u0000\u0001"+
		"$\u0001\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005H\u0000"+
		"\u0000\'(\u0005!\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005\"\u0000"+
		"\u0000*.\u0005#\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005%\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u000012\u0003\n\u0005"+
		"\u000023\u0005$\u0000\u00003\u0003\u0001\u0000\u0000\u000046\u0005H\u0000"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008>\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0005&\u0000\u0000;=\u0005H\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?C\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AC\u0001\u0000\u0000\u0000B7\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005"+
		"H\u0000\u0000FG\u0005\u001f\u0000\u0000GH\u0003\n\u0005\u0000HI\u0005"+
		"%\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0006\u0004\uffff\uffff"+
		"\u0000KL\u0005\u001a\u0000\u0000LM\u0005!\u0000\u0000MN\u0003\n\u0005"+
		"\u0000NO\u0005\"\u0000\u0000OP\u0005\u001b\u0000\u0000PQ\u0005#\u0000"+
		"\u0000QR\u0003\b\u0004\u0000RS\u0005$\u0000\u0000ST\u0005\u001c\u0000"+
		"\u0000TU\u0005#\u0000\u0000UV\u0003\b\u0004\u0000VW\u0005$\u0000\u0000"+
		"W\u0088\u0001\u0000\u0000\u0000XY\u0005H\u0000\u0000YZ\u0005\u001f\u0000"+
		"\u0000Z\u0088\u0003\n\u0005\u0000[\\\u0005H\u0000\u0000\\]\u0005\u0004"+
		"\u0000\u0000]^\u0005\u001f\u0000\u0000^\u0088\u0003\n\u0005\u0000_\u0088"+
		"\u0005\u001e\u0000\u0000`a\u0005\u001d\u0000\u0000ab\u0005!\u0000\u0000"+
		"bc\u0003\n\u0005\u0000cd\u0005\"\u0000\u0000de\u0005#\u0000\u0000ef\u0003"+
		"\b\u0004\u0000fg\u0005$\u0000\u0000g\u0088\u0001\u0000\u0000\u0000hl\u0005"+
		"\'\u0000\u0000ik\u0003\u000e\u0007\u0000ji\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005)\u0000\u0000"+
		"pq\u0003\f\u0006\u0000qu\u0005*\u0000\u0000rt\u0003\u000e\u0007\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005(\u0000\u0000y\u0088\u0001\u0000\u0000\u0000z{\u0005"+
		" \u0000\u0000{|\u0005!\u0000\u0000|}\u0003\n\u0005\u0000}~\u0005\"\u0000"+
		"\u0000~\u0088\u0001\u0000\u0000\u0000\u007f\u0080\u0005#\u0000\u0000\u0080"+
		"\u0081\u0003\b\u0004\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083"+
		"\u0005\u0005\u0000\u0000\u0083\u0084\u0005#\u0000\u0000\u0084\u0085\u0003"+
		"\b\u0004\u0000\u0085\u0086\u0005$\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087J\u0001\u0000\u0000\u0000\u0087X\u0001\u0000\u0000\u0000"+
		"\u0087[\u0001\u0000\u0000\u0000\u0087_\u0001\u0000\u0000\u0000\u0087`"+
		"\u0001\u0000\u0000\u0000\u0087h\u0001\u0000\u0000\u0000\u0087z\u0001\u0000"+
		"\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0088\u008e\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\n\u0005\u0000\u0000\u008a\u008b\u0005%\u0000"+
		"\u0000\u008b\u008d\u0003\b\u0004\u0006\u008c\u0089\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0005\uffff\uffff\u0000"+
		"\u0092\u00ae\u0005\u0006\u0000\u0000\u0093\u00ae\u0005\n\u0000\u0000\u0094"+
		"\u0095\u0005!\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000\u0096\u0097"+
		"\u0005\"\u0000\u0000\u0097\u00ae\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u0019\u0000\u0000\u0099\u00ae\u0003\n\u0005\t\u009a\u009b\u0005H\u0000"+
		"\u0000\u009b\u009f\u0005!\u0000\u0000\u009c\u009e\u0003\n\u0005\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005&\u0000\u0000\u00a3\u00a5\u0003\n\u0005\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0005\"\u0000\u0000\u00aa\u00ae\u0005H\u0000\u0000\u00ab\u00ac"+
		"\u0005H\u0000\u0000\u00ac\u00ae\u0005\u0004\u0000\u0000\u00ad\u0091\u0001"+
		"\u0000\u0000\u0000\u00ad\u0093\u0001\u0000\u0000\u0000\u00ad\u0094\u0001"+
		"\u0000\u0000\u0000\u00ad\u0098\u0001\u0000\u0000\u0000\u00ad\u009a\u0001"+
		"\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00c3\u0001\u0000\u0000\u0000\u00af\u00b0\n\n"+
		"\u0000\u0000\u00b0\u00b1\u0005\u0010\u0000\u0000\u00b1\u00c2\u0003\n\u0005"+
		"\n\u00b2\u00b3\n\b\u0000\u0000\u00b3\u00b4\u0007\u0000\u0000\u0000\u00b4"+
		"\u00c2\u0003\n\u0005\t\u00b5\u00b6\n\u0007\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0001\u0000\u0000\u00b7\u00c2\u0003\n\u0005\b\u00b8\u00b9\n\u0006\u0000"+
		"\u0000\u00b9\u00ba\u0007\u0002\u0000\u0000\u00ba\u00c2\u0003\n\u0005\u0007"+
		"\u00bb\u00bc\n\u0005\u0000\u0000\u00bc\u00bd\u0007\u0003\u0000\u0000\u00bd"+
		"\u00c2\u0003\n\u0005\u0006\u00be\u00bf\n\u0004\u0000\u0000\u00bf\u00c0"+
		"\u0007\u0004\u0000\u0000\u00c0\u00c2\u0003\n\u0005\u0005\u00c1\u00af\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b2\u0001\u0000\u0000\u0000\u00c1\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u000b\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0006\u0006\uffff\uffff\u0000\u00c7\u00c8"+
		"\u0005+\u0000\u0000\u00c8\u00f8\u0003\u0012\t\u0000\u00c9\u00ca\u0005"+
		",\u0000\u0000\u00ca\u00cb\u0005H\u0000\u0000\u00cb\u00cc\u0005-\u0000"+
		"\u0000\u00cc\u00f8\u0003\u0012\t\u0000\u00cd\u00ce\u0005,\u0000\u0000"+
		"\u00ce\u00cf\u0005H\u0000\u0000\u00cf\u00d0\u0005.\u0000\u0000\u00d0\u00d1"+
		"\u0005H\u0000\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2\u00f8\u0003"+
		"\u0012\t\u0000\u00d3\u00d4\u0005/\u0000\u0000\u00d4\u00d5\u0005H\u0000"+
		"\u0000\u00d5\u00d6\u00050\u0000\u0000\u00d6\u00da\u0003\u0012\t\u0000"+
		"\u00d7\u00d9\u0003\u0014\n\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u00055\u0000\u0000\u00de\u00f8"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005:\u0000\u0000\u00e0\u00e1\u0003"+
		"\u0012\t\u0000\u00e1\u00e4\u0003\f\u0006\u0000\u00e2\u00e3\u0005;\u0000"+
		"\u0000\u00e3\u00e5\u0003\f\u0006\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005<\u0000\u0000\u00e7\u00f8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005=\u0000\u0000\u00e9\u00ea\u0003\u0012\t\u0000\u00ea\u00eb"+
		"\u0003\f\u0006\u0000\u00eb\u00ec\u0005>\u0000\u0000\u00ec\u00f8\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005F\u0000\u0000\u00ee\u00ef\u0005H\u0000"+
		"\u0000\u00ef\u00f0\u0005G\u0000\u0000\u00f0\u00f4\u0005H\u0000\u0000\u00f1"+
		"\u00f3\u0003\u0012\t\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00c6\u0001\u0000\u0000\u0000\u00f7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00cd\u0001\u0000\u0000\u0000\u00f7\u00d3"+
		"\u0001\u0000\u0000\u0000\u00f7\u00df\u0001\u0000\u0000\u0000\u00f7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f8\u00fd"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\n\u0001\u0000\u0000\u00fa\u00fc\u0003"+
		"\f\u0006\u0002\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\r\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005A\u0000\u0000\u0101\u0106\u0005H\u0000\u0000\u0102"+
		"\u0103\u0005C\u0000\u0000\u0103\u0105\u0005H\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0003"+
		"\u0010\b\u0000\u010a\u010b\u0005B\u0000\u0000\u010b\u000f\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005D\u0000\u0000\u010d\u010e\u0003\f\u0006"+
		"\u0000\u010e\u010f\u0003\u0012\t\u0000\u010f\u0110\u0005E\u0000\u0000"+
		"\u0110\u0115\u0001\u0000\u0000\u0000\u0111\u0112\u0003\f\u0006\u0000\u0112"+
		"\u0113\u0003\u0012\t\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010c"+
		"\u0001\u0000\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0115\u0011"+
		"\u0001\u0000\u0000\u0000\u0116\u012b\u0005\u0006\u0000\u0000\u0117\u012b"+
		"\u0005\b\u0000\u0000\u0118\u012b\u0005\n\u0000\u0000\u0119\u012b\u0005"+
		"\t\u0000\u0000\u011a\u011b\u0005!\u0000\u0000\u011b\u011c\u0003\u0012"+
		"\t\u0000\u011c\u011d\u0005\"\u0000\u0000\u011d\u012b\u0001\u0000\u0000"+
		"\u0000\u011e\u012b\u0005@\u0000\u0000\u011f\u012b\u0005?\u0000\u0000\u0120"+
		"\u012b\u0005H\u0000\u0000\u0121\u0122\u0005H\u0000\u0000\u0122\u0126\u0005"+
		"!\u0000\u0000\u0123\u0125\u0003\u0012\t\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012b\u0005\"\u0000"+
		"\u0000\u012a\u0116\u0001\u0000\u0000\u0000\u012a\u0117\u0001\u0000\u0000"+
		"\u0000\u012a\u0118\u0001\u0000\u0000\u0000\u012a\u0119\u0001\u0000\u0000"+
		"\u0000\u012a\u011a\u0001\u0000\u0000\u0000\u012a\u011e\u0001\u0000\u0000"+
		"\u0000\u012a\u011f\u0001\u0000\u0000\u0000\u012a\u0120\u0001\u0000\u0000"+
		"\u0000\u012a\u0121\u0001\u0000\u0000\u0000\u012b\u0013\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0007\u0005\u0000\u0000\u012d\u0135\u0003\u0012\t\u0000"+
		"\u012e\u012f\u0007\u0006\u0000\u0000\u012f\u0135\u0003\u0012\t\u0000\u0130"+
		"\u0131\u0007\u0007\u0000\u0000\u0131\u0135\u0003\u0012\t\u0000\u0132\u0133"+
		"\u0007\b\u0000\u0000\u0133\u0135\u0003\u0012\t\u0000\u0134\u012c\u0001"+
		"\u0000\u0000\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0134\u0130\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0015\u0001"+
		"\u0000\u0000\u0000\u0019\u0019\u001f.7>Blu\u0087\u008e\u009f\u00a6\u00ad"+
		"\u00c1\u00c3\u00da\u00e4\u00f4\u00f7\u00fd\u0106\u0114\u0126\u012a\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}