// Generated from c:\Users\leona\Documents\GitHub\Linguaggi\Old\hw03\src\ex1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ex1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, MUL=4, MINUS=5, DIV=6, MOD=7, INTEGER=8, NEG=9, 
		NAT=10, WS=11;
	public static final int
		RULE_main = 0, RULE_exp = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'*'", "'-'", "'/'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "PLUS", "MUL", "MINUS", "DIV", "MOD", "INTEGER", 
			"NEG", "NAT", "WS"
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
	public String getGrammarFileName() { return "ex1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ex1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ex1Parser.EOF, 0); }
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
			setState(4);
			exp();
			setState(5);
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
	public static class MinusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(ex1Parser.MINUS, 0); }
		public TerminalNode RPAR() { return getToken(ex1Parser.RPAR, 0); }
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ModContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ex1Parser.MOD, 0); }
		public TerminalNode RPAR() { return getToken(ex1Parser.RPAR, 0); }
		public ModContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ex1Parser.MUL, 0); }
		public TerminalNode RPAR() { return getToken(ex1Parser.RPAR, 0); }
		public TerminalNode DIV() { return getToken(ex1Parser.DIV, 0); }
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(ex1Parser.INTEGER, 0); }
		public IntegerContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class PlusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ex1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ex1Parser.PLUS, 0); }
		public TerminalNode RPAR() { return getToken(ex1Parser.RPAR, 0); }
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(LPAR);
				setState(9);
				exp();
				setState(10);
				match(PLUS);
				setState(11);
				exp();
				setState(12);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(LPAR);
				setState(15);
				exp();
				setState(16);
				match(MUL);
				setState(17);
				exp();
				setState(18);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				match(LPAR);
				setState(21);
				exp();
				setState(22);
				match(MINUS);
				setState(23);
				exp();
				setState(24);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				match(LPAR);
				setState(27);
				exp();
				setState(28);
				match(DIV);
				setState(29);
				exp();
				setState(30);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				match(LPAR);
				setState(33);
				exp();
				setState(34);
				match(MOD);
				setState(35);
				exp();
				setState(36);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r+\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3)\n\3\3\3\2\2\4\2\4\2\2\2-\2\6\3\2\2\2\4(\3\2\2\2\6\7\5\4\3\2\7\b\7"+
		"\2\2\3\b\3\3\2\2\2\t)\7\n\2\2\n\13\7\3\2\2\13\f\5\4\3\2\f\r\7\5\2\2\r"+
		"\16\5\4\3\2\16\17\7\4\2\2\17)\3\2\2\2\20\21\7\3\2\2\21\22\5\4\3\2\22\23"+
		"\7\6\2\2\23\24\5\4\3\2\24\25\7\4\2\2\25)\3\2\2\2\26\27\7\3\2\2\27\30\5"+
		"\4\3\2\30\31\7\7\2\2\31\32\5\4\3\2\32\33\7\4\2\2\33)\3\2\2\2\34\35\7\3"+
		"\2\2\35\36\5\4\3\2\36\37\7\b\2\2\37 \5\4\3\2 !\7\4\2\2!)\3\2\2\2\"#\7"+
		"\3\2\2#$\5\4\3\2$%\7\t\2\2%&\5\4\3\2&\'\7\4\2\2\')\3\2\2\2(\t\3\2\2\2"+
		"(\n\3\2\2\2(\20\3\2\2\2(\26\3\2\2\2(\34\3\2\2\2(\"\3\2\2\2)\5\3\2\2\2"+
		"\3(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}