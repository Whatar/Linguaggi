// Generated from /home/leonardo/Documents/GitHub/Linguaggi/hw05/src/floatExp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class floatExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, TIMES=4, MINUS=5, DIV=6, MOD=7, EXPONENT=8, EQUAL=9, 
		SEMICOLON=10, NUM=11, FLOAT=12, ID=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAR", "RPAR", "PLUS", "TIMES", "MINUS", "DIV", "MOD", "EXPONENT", "EQUAL", 
			"SEMICOLON", "NUM", "FLOAT", "INT", "NAT", "POS", "DIGIT", "POSDIGIT", 
			"ID", "WS"
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


	public floatExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "floatExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000eo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bD\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000bH\b\u000b\u000b\u000b\f\u000bI\u0003\u000b"+
		"L\b\u000b\u0001\f\u0001\f\u0001\f\u0003\fQ\b\f\u0001\r\u0001\r\u0003\r"+
		"U\b\r\u0001\u000e\u0001\u000e\u0005\u000eY\b\u000e\n\u000e\f\u000e\\\t"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f`\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0004\u0011e\b\u0011\u000b\u0011\f\u0011f\u0001\u0012"+
		"\u0004\u0012j\b\u0012\u000b\u0012\f\u0012k\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000"+
		"\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\r%\u000e\u0001\u0000\u0003"+
		"\u0001\u000019\u0002\u0000AZaz\u0003\u0000\t\n\r\r  r\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001"+
		"\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000"+
		"\u0000\r3\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u0011"+
		"9\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001"+
		"\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019P\u0001\u0000\u0000"+
		"\u0000\u001bT\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000\u001f"+
		"_\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000\u0000#d\u0001\u0000\u0000"+
		"\u0000%i\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005)\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005"+
		"+\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\b\u0001"+
		"\u0000\u0000\u0000/0\u0005-\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005"+
		"/\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005m\u0000\u000045\u0005"+
		"o\u0000\u000056\u0005d\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005"+
		"^\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005=\u0000\u0000:\u0012"+
		"\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0014\u0001\u0000\u0000"+
		"\u0000=>\u0003\u0017\u000b\u0000>\u0016\u0001\u0000\u0000\u0000?L\u0003"+
		"\u0019\f\u0000@D\u0003\u0019\f\u0000AB\u0005-\u0000\u0000BD\u00050\u0000"+
		"\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0005.\u0000\u0000FH\u0003\u001f\u000f\u0000GF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000K?\u0001\u0000\u0000\u0000"+
		"KC\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MQ\u0003\u001b"+
		"\r\u0000NO\u0005-\u0000\u0000OQ\u0003\u001d\u000e\u0000PM\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000"+
		"RU\u00050\u0000\u0000SU\u0003\u001d\u000e\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VZ\u0003!\u0010"+
		"\u0000WY\u0003\u001f\u000f\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001e"+
		"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]`\u00050\u0000\u0000"+
		"^`\u0003!\u0010\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"` \u0001\u0000\u0000\u0000ab\u0007\u0000\u0000\u0000b\"\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g$\u0001"+
		"\u0000\u0000\u0000hj\u0007\u0002\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0012\u0000\u0000n&\u0001\u0000"+
		"\u0000\u0000\n\u0000CIKPTZ_fk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}