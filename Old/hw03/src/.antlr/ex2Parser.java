// Generated from c:\Users\leona\Documents\GitHub\Linguaggi\Old\hw03\src\ex2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ex2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LPAR=3, RPAR=4, PLUS=5, MUL=6, MINUS=7, DIV=8, MOD=9, 
		INTEGER=10, NEG=11, NAT=12, ID=13, WS=14;
	public static final int
		RULE_main = 0, RULE_start = 1, RULE_init = 2, RULE_exp = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "start", "init", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'+'", "'*'", "'-'", "'/'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LPAR", "RPAR", "PLUS", "MUL", "MINUS", "DIV", "MOD", 
			"INTEGER", "NEG", "NAT", "ID", "WS"
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
	public String getGrammarFileName() { return "ex2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ex2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ex2Parser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			start();
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

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends StartContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ExpressionContext(StartContext ctx) { copyFrom(ctx); }
	}
	public static class InitializationContext extends StartContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public InitializationContext(StartContext ctx) { copyFrom(ctx); }
	}
	public static class EndContext extends StartContext {
		public EndContext(StartContext ctx) { copyFrom(ctx); }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				_localctx = new InitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				init();
				setState(13);
				match(T__0);
				setState(14);
				start();
				}
				break;
			case 3:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				exp();
				setState(17);
				match(T__0);
				setState(18);
				start();
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ex2Parser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(ID);
			setState(23);
			match(T__1);
			setState(24);
			exp();
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
	public static class IdentifierContext extends ExpContext {
		public TerminalNode ID() { return getToken(ex2Parser.ID, 0); }
		public IdentifierContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class MinusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex2Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(ex2Parser.MINUS, 0); }
		public TerminalNode RPAR() { return getToken(ex2Parser.RPAR, 0); }
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ModContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex2Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ex2Parser.MOD, 0); }
		public TerminalNode RPAR() { return getToken(ex2Parser.RPAR, 0); }
		public ModContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex2Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ex2Parser.MUL, 0); }
		public TerminalNode RPAR() { return getToken(ex2Parser.RPAR, 0); }
		public TerminalNode DIV() { return getToken(ex2Parser.DIV, 0); }
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(ex2Parser.INTEGER, 0); }
		public IntegerContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class PlusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex2Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ex2Parser.PLUS, 0); }
		public TerminalNode RPAR() { return getToken(ex2Parser.RPAR, 0); }
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(LPAR);
				setState(29);
				exp();
				setState(30);
				match(PLUS);
				setState(31);
				exp();
				setState(32);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(LPAR);
				setState(35);
				exp();
				setState(36);
				match(MUL);
				setState(37);
				exp();
				setState(38);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(LPAR);
				setState(41);
				exp();
				setState(42);
				match(MINUS);
				setState(43);
				exp();
				setState(44);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(LPAR);
				setState(47);
				exp();
				setState(48);
				match(DIV);
				setState(49);
				exp();
				setState(50);
				match(RPAR);
				}
				break;
			case 7:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				match(LPAR);
				setState(53);
				exp();
				setState(54);
				match(MOD);
				setState(55);
				exp();
				setState(56);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\27\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5=\n\5\3\5\2\2\6\2\4\6\b\2\2\2B\2\n\3\2\2\2\4\26\3\2\2"+
		"\2\6\30\3\2\2\2\b<\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3\2\2\2\r\27"+
		"\3\2\2\2\16\17\5\6\4\2\17\20\7\3\2\2\20\21\5\4\3\2\21\27\3\2\2\2\22\23"+
		"\5\b\5\2\23\24\7\3\2\2\24\25\5\4\3\2\25\27\3\2\2\2\26\r\3\2\2\2\26\16"+
		"\3\2\2\2\26\22\3\2\2\2\27\5\3\2\2\2\30\31\7\17\2\2\31\32\7\4\2\2\32\33"+
		"\5\b\5\2\33\7\3\2\2\2\34=\7\f\2\2\35=\7\17\2\2\36\37\7\5\2\2\37 \5\b\5"+
		"\2 !\7\7\2\2!\"\5\b\5\2\"#\7\6\2\2#=\3\2\2\2$%\7\5\2\2%&\5\b\5\2&\'\7"+
		"\b\2\2\'(\5\b\5\2()\7\6\2\2)=\3\2\2\2*+\7\5\2\2+,\5\b\5\2,-\7\t\2\2-."+
		"\5\b\5\2./\7\6\2\2/=\3\2\2\2\60\61\7\5\2\2\61\62\5\b\5\2\62\63\7\n\2\2"+
		"\63\64\5\b\5\2\64\65\7\6\2\2\65=\3\2\2\2\66\67\7\5\2\2\678\5\b\5\289\7"+
		"\13\2\29:\5\b\5\2:;\7\6\2\2;=\3\2\2\2<\34\3\2\2\2<\35\3\2\2\2<\36\3\2"+
		"\2\2<$\3\2\2\2<*\3\2\2\2<\60\3\2\2\2<\66\3\2\2\2=\t\3\2\2\2\4\26<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}