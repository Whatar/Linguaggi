import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Creating the input stream
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream is = System.in;
        CharStream cs = CharStreams.fromStream(is);

        // Creating the lexer
        ex2Lexer lexer = new ex2Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ex2Parser parser = new ex2Parser(tokens);

        // Creating the parser
        ParseTree tree = parser.main();
        System.out.println(tree.toStringTree(parser));
    }
}