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
		RULE_com = 4, RULE_exp = 5, RULE_arncCom = 6, RULE_arncVarAss = 7, RULE_arncMet = 8, 
		RULE_arncMetBody = 9, RULE_arncExp = 10, RULE_arncOp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "vars", "newGlobalAssign", "com", "exp", "arncCom", "arncVarAss", 
			"arncMet", "arncMetBody", "arncExp", "arncOp"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INITFUN) {
				{
				{
				setState(24);
				fun();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(30);
				newGlobalAssign();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			com(0);
			setState(37);
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
			setState(39);
			match(INITFUN);
			setState(40);
			match(ID);
			setState(41);
			match(LPAR);
			setState(42);
			vars();
			setState(43);
			match(RPAR);
			setState(44);
			match(LBRACE);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 70368744186457L) != 0) {
				{
				setState(45);
				com(0);
				setState(46);
				match(SEMICOLON);
				}
			}

			setState(50);
			match(RETURN);
			setState(51);
			exp(0);
			setState(52);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(54);
					match(ID);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(60);
					match(COMMA);
					setState(61);
					match(ID);
					}
					}
					setState(66);
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
			setState(70);
			match(GLOBAL);
			setState(71);
			match(ID);
			setState(72);
			match(ASSIGN);
			setState(73);
			exp(0);
			setState(74);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(IF);
				setState(78);
				match(LPAR);
				setState(79);
				exp(0);
				setState(80);
				match(RPAR);
				setState(81);
				match(THEN);
				setState(82);
				match(LBRACE);
				setState(83);
				com(0);
				setState(84);
				match(RBRACE);
				setState(85);
				match(ELSE);
				setState(86);
				match(LBRACE);
				setState(87);
				com(0);
				setState(88);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(ID);
				setState(91);
				match(ASSIGN);
				setState(92);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(ID);
				setState(94);
				match(GL);
				setState(95);
				match(ASSIGN);
				setState(96);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(WHILE);
				setState(99);
				match(LPAR);
				setState(100);
				exp(0);
				setState(101);
				match(RPAR);
				setState(102);
				match(LBRACE);
				setState(103);
				com(0);
				setState(104);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ArnoldCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(ARNC_INIT);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_METHOD) {
					{
					{
					setState(107);
					arncMet();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(ARNC_SHOWTIME);
				setState(114);
				arncCom(0);
				setState(115);
				match(ARNC_TERM);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_METHOD) {
					{
					{
					setState(116);
					arncMet();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(ARNC_END);
				}
				break;
			case 7:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(OUT);
				setState(125);
				match(LPAR);
				setState(126);
				exp(0);
				setState(127);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LBRACE);
				setState(130);
				com(0);
				setState(131);
				match(RBRACE);
				setState(132);
				match(ND);
				setState(133);
				match(LBRACE);
				setState(134);
				com(0);
				setState(135);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
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
					setState(139);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(140);
					match(SEMICOLON);
					setState(141);
					com(6);
					}
					} 
				}
				setState(146);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(LPAR);
				setState(151);
				exp(0);
				setState(152);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(NOT);
				setState(155);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(ID);
				setState(157);
				match(LPAR);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8623490112L) != 0 || _la==ID) {
					{
					{
					setState(158);
					exp(0);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(164);
					match(COMMA);
					setState(165);
					exp(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(ID);
				setState(174);
				match(GL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						match(POW);
						setState(179);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
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
						setState(182);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
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
						setState(185);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
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
						setState(188);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190);
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
						setState(191);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
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
						setState(194);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(199);
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
		public TerminalNode ARNC_CALLMET() { return getToken(ImpParser.ARNC_CALLMET, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
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
	public static class ArncDeclarationContext extends ArncComContext {
		public TerminalNode ARNC_DECL() { return getToken(ImpParser.ARNC_DECL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArncVarAssContext arncVarAss() {
			return getRuleContext(ArncVarAssContext.class,0);
		}
		public ArncDeclarationContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncDeclaration(this);
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
		public List<TerminalNode> ARNC_ELSE() { return getTokens(ImpParser.ARNC_ELSE); }
		public TerminalNode ARNC_ELSE(int i) {
			return getToken(ImpParser.ARNC_ELSE, i);
		}
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
	public static class ArncMetAssContext extends ArncComContext {
		public TerminalNode ARNC_METASSIGN() { return getToken(ImpParser.ARNC_METASSIGN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArncComContext arncCom() {
			return getRuleContext(ArncComContext.class,0);
		}
		public ArncMetAssContext(ArncComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMetAss(this);
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
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_PRINT:
				{
				_localctx = new ArncPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(ARNC_PRINT);
				setState(202);
				arncExp();
				}
				break;
			case ARNC_DECL:
				{
				_localctx = new ArncDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(ARNC_DECL);
				setState(204);
				match(ID);
				setState(205);
				arncVarAss();
				}
				break;
			case ARNC_OP_ASSIGN:
				{
				_localctx = new ArncOpResAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ARNC_OP_ASSIGN);
				setState(207);
				match(ID);
				setState(208);
				match(ARNC_OP_BASE);
				setState(209);
				arncExp();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 278660226943549440L) != 0) {
					{
					{
					setState(210);
					arncOp();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(ARNC_OP_END);
				}
				break;
			case ARNC_IF:
				{
				_localctx = new ArncIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ARNC_IF);
				setState(219);
				arncExp();
				setState(220);
				arncCom(0);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARNC_ELSE) {
					{
					{
					setState(221);
					match(ARNC_ELSE);
					setState(222);
					arncCom(0);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(ARNC_ENDIF);
				}
				break;
			case ARNC_WHILE:
				{
				_localctx = new ArncWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(ARNC_WHILE);
				setState(231);
				arncExp();
				setState(232);
				arncCom(0);
				setState(233);
				match(ARNC_WHEND);
				}
				break;
			case ARNC_METASSIGN:
				{
				_localctx = new ArncMetAssContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(ARNC_METASSIGN);
				setState(236);
				match(ID);
				setState(237);
				arncCom(3);
				}
				break;
			case ARNC_CALLMET:
				{
				_localctx = new ArncMetCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(ARNC_CALLMET);
				setState(239);
				match(ID);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						arncExp();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
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
					setState(248);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249);
					arncCom(2);
					}
					} 
				}
				setState(254);
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
	public static class ArncVarAssContext extends ParserRuleContext {
		public ArncVarAssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arncVarAss; }
	 
		public ArncVarAssContext() { }
		public void copyFrom(ArncVarAssContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncAssignContext extends ArncVarAssContext {
		public TerminalNode ARNC_VARSET() { return getToken(ImpParser.ARNC_VARSET, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncAssignContext(ArncVarAssContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArncGlobalAssignContext extends ArncVarAssContext {
		public TerminalNode ARNC_SLY() { return getToken(ImpParser.ARNC_SLY, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode GL() { return getToken(ImpParser.GL, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
		public ArncGlobalAssignContext(ArncVarAssContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncVarAssContext arncVarAss() throws RecognitionException {
		ArncVarAssContext _localctx = new ArncVarAssContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arncVarAss);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_VARSET:
				_localctx = new ArncAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ARNC_VARSET);
				setState(256);
				arncExp();
				}
				break;
			case ARNC_SLY:
				_localctx = new ArncGlobalAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(ARNC_SLY);
				setState(258);
				match(ID);
				setState(259);
				match(GL);
				setState(260);
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
		enterRule(_localctx, 16, RULE_arncMet);
		int _la;
		try {
			_localctx = new ArncMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ARNC_METHOD);
			setState(264);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARNC_METARGS) {
				{
				{
				setState(265);
				match(ARNC_METARGS);
				setState(266);
				match(ID);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			arncMetBody();
			setState(273);
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
		public TerminalNode ARNC_RET() { return getToken(ImpParser.ARNC_RET, 0); }
		public ArncExpContext arncExp() {
			return getRuleContext(ArncExpContext.class,0);
		}
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
		public ArncMetVoidContext(ArncMetBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArncMetVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArncMetBodyContext arncMetBody() throws RecognitionException {
		ArncMetBodyContext _localctx = new ArncMetBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arncMetBody);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_METNONVOID:
				_localctx = new ArncMetNonVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ARNC_METNONVOID);
				setState(276);
				arncCom(0);
				setState(277);
				match(ARNC_RET);
				setState(278);
				arncExp();
				}
				break;
			case ARNC_PRINT:
			case ARNC_DECL:
			case ARNC_OP_ASSIGN:
			case ARNC_IF:
			case ARNC_WHILE:
			case ARNC_METASSIGN:
			case ARNC_CALLMET:
				_localctx = new ArncMetVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				arncCom(0);
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
		enterRule(_localctx, 20, RULE_arncExp);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ArncNatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(NAT);
				}
				break;
			case 2:
				_localctx = new ArncFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(FLOAT);
				}
				break;
			case 3:
				_localctx = new ArncBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new ArncStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new ArncParExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(LPAR);
				setState(288);
				arncExp();
				setState(289);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new ArncValzeroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(ARNC_VALONE);
				}
				break;
			case 7:
				_localctx = new ArncValoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				match(ARNC_VALZERO);
				}
				break;
			case 8:
				_localctx = new ArncIdContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(ID);
				}
				break;
			case 9:
				_localctx = new ArncGlobalIdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				match(ID);
				setState(295);
				match(GL);
				}
				break;
			case 10:
				_localctx = new ArncFunCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(296);
				match(ID);
				setState(297);
				match(LPAR);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372028264839360L) != 0 || _la==ARNC_VALONE || _la==ID) {
					{
					{
					setState(298);
					arncExp();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
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
		enterRule(_localctx, 22, RULE_arncOp);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNC_MUL:
			case ARNC_DIV:
				_localctx = new ArncDivMulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
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
				setState(308);
				arncExp();
				}
				break;
			case ARNC_PLUS:
			case ARNC_MINUS:
				_localctx = new ArncPlusMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
				setState(310);
				arncExp();
				}
				break;
			case ARNC_EQUAL:
			case ARNC_GRATER:
				_localctx = new ArncCmpOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
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
				setState(312);
				arncExp();
				}
				break;
			case ARNC_OR:
			case ARNC_AND:
				_localctx = new ArncLogOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
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
				setState(314);
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
		"\u0004\u0001I\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"8\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004m\b\u0004\n\u0004\f\u0004p\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004v\b\u0004\n\u0004"+
		"\f\u0004y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008f\b\u0004"+
		"\n\u0004\f\u0004\u0092\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a0\b\u0005\n\u0005\f\u0005"+
		"\u00a3\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a7\b\u0005\n\u0005"+
		"\f\u0005\u00aa\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00b0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00c4\b\u0005\n\u0005\f\u0005\u00c7"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d4\b\u0006\n\u0006\f\u0006\u00d7\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00e0\b\u0006\n\u0006\f\u0006\u00e3\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f2"+
		"\b\u0006\n\u0006\f\u0006\u00f5\t\u0006\u0003\u0006\u00f7\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00fb\b\u0006\n\u0006\f\u0006\u00fe\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0106\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u010c"+
		"\b\b\n\b\f\b\u010f\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u011a\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u012c\b\n\n\n\f\n\u012f\t\n\u0001\n"+
		"\u0003\n\u0132\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u013c\b\u000b\u0001"+
		"\u000b\u0000\u0003\b\n\f\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\t\u0001\u0000\r\u000f\u0001\u0000\u000b\f\u0001\u0000"+
		"\u0015\u0018\u0001\u0000\u0013\u0014\u0001\u0000\u0011\u0012\u0001\u0000"+
		"34\u0001\u000012\u0001\u000067\u0001\u000089\u0169\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000"+
		"\u0000\u0006F\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000\u0000"+
		"\n\u00af\u0001\u0000\u0000\u0000\f\u00f6\u0001\u0000\u0000\u0000\u000e"+
		"\u0105\u0001\u0000\u0000\u0000\u0010\u0107\u0001\u0000\u0000\u0000\u0012"+
		"\u0119\u0001\u0000\u0000\u0000\u0014\u0131\u0001\u0000\u0000\u0000\u0016"+
		"\u013b\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"!\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e \u0003"+
		"\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0003\b\u0004\u0000%&\u0005"+
		"\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0005\u0001\u0000"+
		"\u0000()\u0005H\u0000\u0000)*\u0005!\u0000\u0000*+\u0003\u0004\u0002\u0000"+
		"+,\u0005\"\u0000\u0000,0\u0005#\u0000\u0000-.\u0003\b\u0004\u0000./\u0005"+
		"%\u0000\u0000/1\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u0000"+
		"34\u0003\n\u0005\u000045\u0005$\u0000\u00005\u0003\u0001\u0000\u0000\u0000"+
		"68\u0005H\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:@\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<=\u0005&\u0000\u0000=?\u0005H\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AE\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CE\u0001\u0000\u0000\u0000D9\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0005H\u0000\u0000HI\u0005\u001f\u0000\u0000IJ\u0003\n\u0005"+
		"\u0000JK\u0005%\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0006\u0004"+
		"\uffff\uffff\u0000MN\u0005\u001a\u0000\u0000NO\u0005!\u0000\u0000OP\u0003"+
		"\n\u0005\u0000PQ\u0005\"\u0000\u0000QR\u0005\u001b\u0000\u0000RS\u0005"+
		"#\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005$\u0000\u0000UV\u0005\u001c"+
		"\u0000\u0000VW\u0005#\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005$\u0000"+
		"\u0000Y\u008a\u0001\u0000\u0000\u0000Z[\u0005H\u0000\u0000[\\\u0005\u001f"+
		"\u0000\u0000\\\u008a\u0003\n\u0005\u0000]^\u0005H\u0000\u0000^_\u0005"+
		"\u0004\u0000\u0000_`\u0005\u001f\u0000\u0000`\u008a\u0003\n\u0005\u0000"+
		"a\u008a\u0005\u001e\u0000\u0000bc\u0005\u001d\u0000\u0000cd\u0005!\u0000"+
		"\u0000de\u0003\n\u0005\u0000ef\u0005\"\u0000\u0000fg\u0005#\u0000\u0000"+
		"gh\u0003\b\u0004\u0000hi\u0005$\u0000\u0000i\u008a\u0001\u0000\u0000\u0000"+
		"jn\u0005\'\u0000\u0000km\u0003\u0010\b\u0000lk\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005)\u0000"+
		"\u0000rs\u0003\f\u0006\u0000sw\u0005*\u0000\u0000tv\u0003\u0010\b\u0000"+
		"ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z{\u0005(\u0000\u0000{\u008a\u0001\u0000\u0000\u0000|}\u0005"+
		" \u0000\u0000}~\u0005!\u0000\u0000~\u007f\u0003\n\u0005\u0000\u007f\u0080"+
		"\u0005\"\u0000\u0000\u0080\u008a\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"#\u0000\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u0084\u0005$\u0000"+
		"\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005#\u0000\u0000"+
		"\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088\u0005$\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089L\u0001\u0000\u0000\u0000\u0089Z\u0001"+
		"\u0000\u0000\u0000\u0089]\u0001\u0000\u0000\u0000\u0089a\u0001\u0000\u0000"+
		"\u0000\u0089b\u0001\u0000\u0000\u0000\u0089j\u0001\u0000\u0000\u0000\u0089"+
		"|\u0001\u0000\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u008a\u0090"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\n\u0005\u0000\u0000\u008c\u008d\u0005"+
		"%\u0000\u0000\u008d\u008f\u0003\b\u0004\u0006\u008e\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\t\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0005\uffff"+
		"\uffff\u0000\u0094\u00b0\u0005\u0006\u0000\u0000\u0095\u00b0\u0005\n\u0000"+
		"\u0000\u0096\u0097\u0005!\u0000\u0000\u0097\u0098\u0003\n\u0005\u0000"+
		"\u0098\u0099\u0005\"\u0000\u0000\u0099\u00b0\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0019\u0000\u0000\u009b\u00b0\u0003\n\u0005\t\u009c\u009d"+
		"\u0005H\u0000\u0000\u009d\u00a1\u0005!\u0000\u0000\u009e\u00a0\u0003\n"+
		"\u0005\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a8\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005&\u0000\u0000\u00a5\u00a7\u0003\n\u0005"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00b0\u0005\"\u0000\u0000\u00ac\u00b0\u0005H\u0000\u0000"+
		"\u00ad\u00ae\u0005H\u0000\u0000\u00ae\u00b0\u0005\u0004\u0000\u0000\u00af"+
		"\u0093\u0001\u0000\u0000\u0000\u00af\u0095\u0001\u0000\u0000\u0000\u00af"+
		"\u0096\u0001\u0000\u0000\u0000\u00af\u009a\u0001\u0000\u0000\u0000\u00af"+
		"\u009c\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00c5\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\n\n\u0000\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00c4"+
		"\u0003\n\u0005\n\u00b4\u00b5\n\b\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000"+
		"\u0000\u00b6\u00c4\u0003\n\u0005\t\u00b7\u00b8\n\u0007\u0000\u0000\u00b8"+
		"\u00b9\u0007\u0001\u0000\u0000\u00b9\u00c4\u0003\n\u0005\b\u00ba\u00bb"+
		"\n\u0006\u0000\u0000\u00bb\u00bc\u0007\u0002\u0000\u0000\u00bc\u00c4\u0003"+
		"\n\u0005\u0007\u00bd\u00be\n\u0005\u0000\u0000\u00be\u00bf\u0007\u0003"+
		"\u0000\u0000\u00bf\u00c4\u0003\n\u0005\u0006\u00c0\u00c1\n\u0004\u0000"+
		"\u0000\u00c1\u00c2\u0007\u0004\u0000\u0000\u00c2\u00c4\u0003\n\u0005\u0005"+
		"\u00c3\u00b1\u0001\u0000\u0000\u0000\u00c3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00b7\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000"+
		"\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u000b\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0006\uffff\uffff"+
		"\u0000\u00c9\u00ca\u0005+\u0000\u0000\u00ca\u00f7\u0003\u0014\n\u0000"+
		"\u00cb\u00cc\u0005,\u0000\u0000\u00cc\u00cd\u0005H\u0000\u0000\u00cd\u00f7"+
		"\u0003\u000e\u0007\u0000\u00ce\u00cf\u0005/\u0000\u0000\u00cf\u00d0\u0005"+
		"H\u0000\u0000\u00d0\u00d1\u00050\u0000\u0000\u00d1\u00d5\u0003\u0014\n"+
		"\u0000\u00d2\u00d4\u0003\u0016\u000b\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u00055\u0000\u0000"+
		"\u00d9\u00f7\u0001\u0000\u0000\u0000\u00da\u00db\u0005:\u0000\u0000\u00db"+
		"\u00dc\u0003\u0014\n\u0000\u00dc\u00e1\u0003\f\u0006\u0000\u00dd\u00de"+
		"\u0005;\u0000\u0000\u00de\u00e0\u0003\f\u0006\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"<\u0000\u0000\u00e5\u00f7\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005=\u0000"+
		"\u0000\u00e7\u00e8\u0003\u0014\n\u0000\u00e8\u00e9\u0003\f\u0006\u0000"+
		"\u00e9\u00ea\u0005>\u0000\u0000\u00ea\u00f7\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005F\u0000\u0000\u00ec\u00ed\u0005H\u0000\u0000\u00ed\u00f7\u0003"+
		"\f\u0006\u0003\u00ee\u00ef\u0005G\u0000\u0000\u00ef\u00f3\u0005H\u0000"+
		"\u0000\u00f0\u00f2\u0003\u0014\n\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00f6\u00cb\u0001\u0000\u0000\u0000\u00f6\u00ce\u0001\u0000\u0000\u0000"+
		"\u00f6\u00da\u0001\u0000\u0000\u0000\u00f6\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00eb\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fc\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u0001\u0000\u0000\u00f9"+
		"\u00fb\u0003\f\u0006\u0002\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\r\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005-\u0000\u0000\u0100\u0106\u0003\u0014"+
		"\n\u0000\u0101\u0102\u0005.\u0000\u0000\u0102\u0103\u0005H\u0000\u0000"+
		"\u0103\u0104\u0005\u0004\u0000\u0000\u0104\u0106\u0003\u0014\n\u0000\u0105"+
		"\u00ff\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106"+
		"\u000f\u0001\u0000\u0000\u0000\u0107\u0108\u0005A\u0000\u0000\u0108\u010d"+
		"\u0005H\u0000\u0000\u0109\u010a\u0005C\u0000\u0000\u010a\u010c\u0005H"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0003\u0012\t\u0000\u0111\u0112\u0005B\u0000"+
		"\u0000\u0112\u0011\u0001\u0000\u0000\u0000\u0113\u0114\u0005D\u0000\u0000"+
		"\u0114\u0115\u0003\f\u0006\u0000\u0115\u0116\u0005E\u0000\u0000\u0116"+
		"\u0117\u0003\u0014\n\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u011a"+
		"\u0003\f\u0006\u0000\u0119\u0113\u0001\u0000\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u0013\u0001\u0000\u0000\u0000\u011b\u0132\u0005"+
		"\u0006\u0000\u0000\u011c\u0132\u0005\b\u0000\u0000\u011d\u0132\u0005\n"+
		"\u0000\u0000\u011e\u0132\u0005\t\u0000\u0000\u011f\u0120\u0005!\u0000"+
		"\u0000\u0120\u0121\u0003\u0014\n\u0000\u0121\u0122\u0005\"\u0000\u0000"+
		"\u0122\u0132\u0001\u0000\u0000\u0000\u0123\u0132\u0005@\u0000\u0000\u0124"+
		"\u0132\u0005?\u0000\u0000\u0125\u0132\u0005H\u0000\u0000\u0126\u0127\u0005"+
		"H\u0000\u0000\u0127\u0132\u0005\u0004\u0000\u0000\u0128\u0129\u0005H\u0000"+
		"\u0000\u0129\u012d\u0005!\u0000\u0000\u012a\u012c\u0003\u0014\n\u0000"+
		"\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u0005\"\u0000\u0000\u0131\u011b\u0001\u0000\u0000\u0000\u0131"+
		"\u011c\u0001\u0000\u0000\u0000\u0131\u011d\u0001\u0000\u0000\u0000\u0131"+
		"\u011e\u0001\u0000\u0000\u0000\u0131\u011f\u0001\u0000\u0000\u0000\u0131"+
		"\u0123\u0001\u0000\u0000\u0000\u0131\u0124\u0001\u0000\u0000\u0000\u0131"+
		"\u0125\u0001\u0000\u0000\u0000\u0131\u0126\u0001\u0000\u0000\u0000\u0131"+
		"\u0128\u0001\u0000\u0000\u0000\u0132\u0015\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0007\u0005\u0000\u0000\u0134\u013c\u0003\u0014\n\u0000\u0135\u0136"+
		"\u0007\u0006\u0000\u0000\u0136\u013c\u0003\u0014\n\u0000\u0137\u0138\u0007"+
		"\u0007\u0000\u0000\u0138\u013c\u0003\u0014\n\u0000\u0139\u013a\u0007\b"+
		"\u0000\u0000\u013a\u013c\u0003\u0014\n\u0000\u013b\u0133\u0001\u0000\u0000"+
		"\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0137\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001b!09@Dnw\u0089\u0090\u00a1\u00a8\u00af\u00c3\u00c5\u00d5"+
		"\u00e1\u00f3\u00f6\u00fc\u0105\u010d\u0119\u012d\u0131\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}