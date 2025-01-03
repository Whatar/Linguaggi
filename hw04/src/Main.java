import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        System.out.println("Loading Memory");

        // Load initial memory
        // Read memory list from file, and index from file
        // Creating the input stream

        if (args.length < 1) {
            System.out.println("Usage: java Main <Program> [<inputMemory>]");
            System.exit(1);
        }

        // Creating the interpreter
        bf interpreter = new bf();

        // split the brackets, and store each element inside the memory list, and the index in the index variable
        // get the values inside the brackets
        if (args.length > 1) {
            InputStream initIs = cl.getResourceAsStream(args[1]);
            CharStream initCs = CharStreams.fromStream(initIs);

            ArrayList<Integer> memory = new ArrayList<>();
            String[] initMemory = initCs.toString().split("]")[0].split("\\[");
            Integer index = Integer.parseInt(initCs.toString().split("]")[1]);

            // cycle through initMemory.split(",")
            for (String s : initMemory[1].split(",")) {
                memory.add(Integer.parseInt(s));
            }

            interpreter.setMemory(memory);
            interpreter.setIndex(index);
        }
        else{
            // init memory
            ArrayList<Integer> memory = new ArrayList<>();
            memory.add(0);
            interpreter.setMemory(memory);
            interpreter.setIndex(0);
        }

        System.out.println("Memory loaded");
        // Printing the memory
        System.out.println("Mem: " + interpreter.getMemory());
        System.out.println("Index: " + interpreter.getIndex());

        System.out.println("About to create the input stream");

        // Creating the input stream
        InputStream is = cl.getResourceAsStream(args[0]);
        CharStream cs = CharStreams.fromStream(is);

        System.out.println("About to create the lexer and parser");
        // Creating the lexer
        bfLexer lexer = new bfLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bfParser parser = new bfParser(tokens);

        // Creating the parser
        ParseTree tree = parser.main();

        System.out.println("About to run the interpreter");

        // Running the interpreter
        interpreter.visit(tree);

        // Printing the memory
        System.out.println("Mem: " + interpreter.getMemory());
        System.out.println("Index: " + interpreter.getIndex());
    }
}