import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class bf extends bfBaseVisitor<Integer>{
    // memory list
    private List<Integer> memory = new ArrayList<>();
    private Integer index = 0;

    @Override
    public Integer visitMain(bfParser.MainContext ctx) {
        return visit(ctx.com());
    }

    @Override
    public Integer visitPlus(bfParser.PlusContext ctx) {
        memory.set(index, memory.get(index) + 1);
        return visit(ctx.com());
    }

    @Override
    public Integer visitMinus(bfParser.MinusContext ctx) {
        memory.set(index, memory.get(index) - 1);
        return visit(ctx.com());
    }

    @Override
    public Integer visitComma(bfParser.CommaContext ctx) {
        // Try to read a character from the input stream
        try {
            memory.set(index, System.in.read());
        } catch (Exception e) {
            System.out.println("Error reading from input stream");
        }
        return visit(ctx.com());
    }

    @Override
    public Integer visitDot(bfParser.DotContext ctx) {
        System.out.print((char) memory.get(index).intValue());
        return visit(ctx.com());
    }

    @Override
    public Integer visitLt(bfParser.LtContext ctx) {
        index--;
        return visit(ctx.com());
    }

    @Override
    public Integer visitGt(bfParser.GtContext ctx) {
        index++;
        return visit(ctx.com());
    }

    public Integer visitLoop(bfParser.LoopContext ctx) {
        while (memory.get(index) != 0) {
            visit((ParseTree) ctx.com());
        }
        return visit((ParseTree) ctx.com());
    }

    public List<Integer> getMemory() {
        return memory;
    }

    public void setMemory(List<Integer> memory) {
        this.memory = memory;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
