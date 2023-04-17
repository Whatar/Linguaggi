// Generated from C:/Users/leona/Documents/Github/Linguaggi/hw03/src\ex2.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ex2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LPAR=3, RPAR=4, PLUS=5, MUL=6, MINUS=7, DIV=8, MOD=9, 
		INTEGER=10, NEG=11, NAT=12, ID=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LPAR", "RPAR", "PLUS", "MUL", "MINUS", "DIV", "MOD", 
			"INTEGER", "NEG", "NAT", "ID", "WS"
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


	public ex2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ex2.g4"; }

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
		"\u0004\u0000\u000eS\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t4\b\t\u0001\n\u0001\n\u0001\n\u0005\n9\b\n\n\n\f\n<\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bA\b\u000b\n\u000b\f\u000bD\t\u000b"+
		"\u0003\u000bF\b\u000b\u0001\f\u0004\fI\b\f\u000b\f\f\fJ\u0001\r\u0004"+
		"\rN\b\r\u000b\r\f\rO\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0004\u0001"+
		"\u000019\u0001\u000009\u0001\u0000az\u0003\u0000\t\n\r\r  X\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000"+
		"\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000"+
		"\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b"+
		"\'\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000f+\u0001\u0000"+
		"\u0000\u0000\u0011-\u0001\u0000\u0000\u0000\u00133\u0001\u0000\u0000\u0000"+
		"\u00155\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019H"+
		"\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		";\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005=\u0000"+
		"\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\u0006\u0001"+
		"\u0000\u0000\u0000#$\u0005)\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005"+
		"+\u0000\u0000&\n\u0001\u0000\u0000\u0000\'(\u0005*\u0000\u0000(\f\u0001"+
		"\u0000\u0000\u0000)*\u0005-\u0000\u0000*\u000e\u0001\u0000\u0000\u0000"+
		"+,\u0005/\u0000\u0000,\u0010\u0001\u0000\u0000\u0000-.\u0005m\u0000\u0000"+
		"./\u0005o\u0000\u0000/0\u0005d\u0000\u00000\u0012\u0001\u0000\u0000\u0000"+
		"14\u0003\u0015\n\u000024\u0003\u0017\u000b\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0014\u0001\u0000\u0000\u000056\u0005-\u0000"+
		"\u00006:\u0007\u0000\u0000\u000079\u0007\u0001\u0000\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;\u0016\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=F\u00050\u0000\u0000>B\u0007\u0000\u0000\u0000?A\u0007\u0001\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000E=\u0001\u0000\u0000\u0000E>\u0001\u0000\u0000\u0000"+
		"F\u0018\u0001\u0000\u0000\u0000GI\u0007\u0002\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\u001a\u0001\u0000\u0000\u0000LN\u0007\u0003\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006"+
		"\r\u0000\u0000R\u001c\u0001\u0000\u0000\u0000\u0007\u00003:BEJO\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}