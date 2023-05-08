// Generated from /home/leonardo/Documents/GitHub/Linguaggi/hw05/src/floatExp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class floatExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, TIMES=4, MINUS=5, DIV=6, MOD=7, EXPONENT=8, EQUAL=9, 
		SEMICOLON=10, NUM=11, FLOAT=12, ID=13, WS=14;
	public static final int
		RULE_main = 0, RULE_prog = 1, RULE_init = 2, RULE_exp = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "prog", "init", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'*'", "'-'", "'/'", "'mod'", "'^'", "'='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "PLUS", "TIMES", "MINUS", "DIV", "MOD", "EXPONENT", 
			"EQUAL", "SEMICOLON", "NUM", "FLOAT", "ID", "WS"
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
	public String getGrammarFileName() { return "floatExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public floatExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(floatExpParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			prog();
			setState(9);
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
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			init();
			setState(12);
			exp(0);
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
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdinitContext extends InitContext {
		public TerminalNode ID() { return getToken(floatExpParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(floatExpParser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(floatExpParser.SEMICOLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public IdinitContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitIdinit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilinitContext extends InitContext {
		public NilinitContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitNilinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_init);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new IdinitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(ID);
				setState(15);
				match(EQUAL);
				setState(16);
				exp(0);
				setState(17);
				match(SEMICOLON);
				setState(18);
				init();
				}
				break;
			case 2:
				_localctx = new NilinitContext(_localctx);
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
	public static class DivContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(floatExpParser.DIV, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public DivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(floatExpParser.MINUS, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD() { return getToken(floatExpParser.MOD, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public ModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(floatExpParser.EXPONENT, 0); }
		public TerminalNode MOD() { return getToken(floatExpParser.MOD, 0); }
		public TerminalNode TIMES() { return getToken(floatExpParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(floatExpParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(floatExpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(floatExpParser.MINUS, 0); }
		public ExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(floatExpParser.TIMES, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExpContext {
		public TerminalNode NUM() { return getToken(floatExpParser.NUM, 0); }
		public NumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(floatExpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(floatExpParser.PLUS, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(floatExpParser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(floatExpParser.EXPONENT, 0); }
		public TerminalNode RPAR() { return getToken(floatExpParser.RPAR, 0); }
		public ExponentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof floatExpVisitor ) return ((floatExpVisitor<? extends T>)visitor).visitExponent(this);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new MulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(24);
				match(LPAR);
				setState(25);
				exp(0);
				setState(26);
				match(TIMES);
				setState(27);
				exp(0);
				setState(28);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new DivContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(LPAR);
				setState(31);
				exp(0);
				setState(32);
				match(DIV);
				setState(33);
				exp(0);
				setState(34);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new ModContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(LPAR);
				setState(37);
				exp(0);
				setState(38);
				match(MOD);
				setState(39);
				exp(0);
				setState(40);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ExponentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(LPAR);
				setState(43);
				exp(0);
				setState(44);
				match(EXPONENT);
				setState(45);
				exp(0);
				setState(46);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new PlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(LPAR);
				setState(49);
				exp(0);
				setState(50);
				match(PLUS);
				setState(51);
				exp(0);
				setState(52);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(LPAR);
				setState(55);
				exp(0);
				setState(56);
				match(MINUS);
				setState(57);
				exp(0);
				setState(58);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(NUM);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(64);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(65);
					((ExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
						((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(66);
					exp(4);
					}
					} 
				}
				setState(71);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eI\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0016"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003?\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t"+
		"\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0001\u0001\u0000\u0003\bM\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b"+
		"\u0001\u0000\u0000\u0000\u0004\u0015\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001"+
		"\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\r\u0003"+
		"\u0006\u0003\u0000\r\u0003\u0001\u0000\u0000\u0000\u000e\u000f\u0005\r"+
		"\u0000\u0000\u000f\u0010\u0005\t\u0000\u0000\u0010\u0011\u0003\u0006\u0003"+
		"\u0000\u0011\u0012\u0005\n\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000"+
		"\u0015\u000e\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0005\u0001\u0000\u0000\u0000\u0017\u0018\u0006\u0003\uffff\uffff"+
		"\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0003\u0006\u0003"+
		"\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001c\u0003\u0006\u0003"+
		"\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d?\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003\u0006\u0003\u0000 !"+
		"\u0005\u0006\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005\u0002\u0000"+
		"\u0000#?\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0003\u0006"+
		"\u0003\u0000&\'\u0005\u0007\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005"+
		"\u0002\u0000\u0000)?\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000"+
		"+,\u0003\u0006\u0003\u0000,-\u0005\b\u0000\u0000-.\u0003\u0006\u0003\u0000"+
		"./\u0005\u0002\u0000\u0000/?\u0001\u0000\u0000\u000001\u0005\u0001\u0000"+
		"\u000012\u0003\u0006\u0003\u000023\u0005\u0003\u0000\u000034\u0003\u0006"+
		"\u0003\u000045\u0005\u0002\u0000\u00005?\u0001\u0000\u0000\u000067\u0005"+
		"\u0001\u0000\u000078\u0003\u0006\u0003\u000089\u0005\u0005\u0000\u0000"+
		"9:\u0003\u0006\u0003\u0000:;\u0005\u0002\u0000\u0000;?\u0001\u0000\u0000"+
		"\u0000<?\u0005\u000b\u0000\u0000=?\u0005\r\u0000\u0000>\u0017\u0001\u0000"+
		"\u0000\u0000>\u001e\u0001\u0000\u0000\u0000>$\u0001\u0000\u0000\u0000"+
		">*\u0001\u0000\u0000\u0000>0\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?E\u0001\u0000"+
		"\u0000\u0000@A\n\u0003\u0000\u0000AB\u0007\u0000\u0000\u0000BD\u0003\u0006"+
		"\u0003\u0004C@\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000\u0003\u0015>E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}