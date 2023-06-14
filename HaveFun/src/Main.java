import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        ImpLexer lexer = new ImpLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ImpParser parser = new ImpParser(tokenStream);



        // we want the parser to bail out as soon as it encounters an error
        BailErrorStrategy strat = new BailErrorStrategy();

        parser.setErrorHandler(strat);
        ParseTree tree = parser.prog();

        IntImp interpreter = new IntImp(new Conf());
        interpreter.visit(tree);
    }
}
