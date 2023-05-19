import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("About to create the input stream");

        // Creating the input stream
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream is = cl.getResourceAsStream(args[0]);
        CharStream cs = CharStreams.fromStream(is);

        System.out.println("About to create the lexer and parser");
        // Creating the lexer
        floatExpLexer lexer = new floatExpLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        floatExpParser parser = new floatExpParser(tokens);

        // Creating the parser
        ParseTree tree = parser.main();

        // Creating the interpreter
        floatExp interpreter = new floatExp();

        System.out.println("About to run the interpreter");

        // Running the interpreter
        System.out.println("Result: " + interpreter.visit(tree));
    }
}