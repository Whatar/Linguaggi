import org.antlr.v4.runtime.tree.ParseTree;
import value.*;

import java.util.*;

public class IntImp extends ImpBaseVisitor<Value> {

    private final Conf conf;
    private final ArncConf arncConf;

    private final LinkedList<String> openContexts = new LinkedList<>();
    private final LinkedList<String> openArncContexts = new LinkedList<>();

    public IntImp(Conf conf) {
        this.conf = conf;
        this.arncConf = new ArncConf();
        openContexts.addLast("!general");
        openArncContexts.addLast("!general");
        // new empty global context
        conf.updateContext("!general", new HashMap<>());
        conf.updateContext("!global", new HashMap<>());

        arncConf.updateContext("!general", new HashMap<>());
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        if (ctx == null){
            return null;
        }
        else {
            return (ComValue) visit(ctx);
        }
    }

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        for (int i = 0 ; i < ctx.fun().size() ; i++) {
            visitFun(ctx.fun(i));
        }
        for (int i = 0 ; i < ctx.newGlobalAssign().size() ; i++) {
            visitNewGlobalAssign(ctx.newGlobalAssign(i));
        }
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public Value visitArnoldC(ImpParser.ArnoldCContext ctx) {
        return visitArncCom(ctx.arncCom());
    }

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        Map<String, ExpValue<?>> currentContext = conf.getContext(openContexts.getLast());
        currentContext.put(id, v);
        conf.updateContext(openContexts.getLast(), currentContext);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitGlobalAssign(ImpParser.GlobalAssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        Map<String, ExpValue<?>> currentContext = conf.getContext("!global");
        currentContext.put(id, v);
        conf.updateContext("!global", currentContext);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitNewGlobalAssign(ImpParser.NewGlobalAssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        // if the current context is not !general, then we cannot assign to global variables
        if (!openContexts.getLast().equals("!general")) {
            System.err.println("Global variable assignment is not allowed in this context.");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        Map<String, ExpValue<?>> currentContext = conf.getContext("!global");
        currentContext.put(id, v);
        conf.updateContext("!global", currentContext);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }


    @Override
    public ComValue visitNonDet(ImpParser.NonDetContext ctx) {
        // randomly choose one of the two commands
        return visitCom(ctx.com(new Random().nextInt(2)));
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(ImpParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(ImpParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.DIV -> new NatValue(left / right);
            case ImpParser.MUL -> new NatValue(left * right);
            case ImpParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.PLUS -> new NatValue(left + right);
            case ImpParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.EQQ -> new BoolValue(left.equals(right));
            case ImpParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        String id = ctx.ID().getText();

        ExpValue<?> ret;
        Map<String, ExpValue<?>> funC = conf.getContext(openContexts.getLast());
        if (!funC.containsKey(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }
        ret = funC.get(id);

        return ret;
    }

    public ExpValue<?>  visitGlobalId(ImpParser.GlobalIdContext ctx) {
        String id = ctx.ID().getText();

        Map<String, ExpValue<?>> currentContext = conf.getContext("!global");
        if (!currentContext.containsKey(id)) {
            System.err.println("Global variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        return currentContext.get(id);
    }


    @Override
    public BoolValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.GEQ -> new BoolValue(left >= right);
            case ImpParser.LEQ -> new BoolValue(left <= right);
            case ImpParser.LT  -> new BoolValue(left < right);
            case ImpParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.AND -> new BoolValue(left && right);
            case ImpParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    // we save the function context in the conf, so we can use it later
    @Override
    public ExpValue<?> visitFun(ImpParser.FunContext ctx) {
        Map<String, ExpValue<?>> args = new HashMap<>();

        for (int i = 0; i < ctx.vars().getChildCount(); i++) {
            if (ctx.vars().getChild(i).getText().equals(","))
                continue;
            String id = ctx.vars().getChild(i).getText();



            if (!args.containsKey(id)) {
                args.put(id, new NatValue(0));
            }
            else {
                System.err.println("Parameter name " + id + " clashes with previous parameters");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }
        }

        Conf.FunctionContext functionContext = new Conf.FunctionContext(ctx, args);

        if(conf.containsFunction(ctx.ID().getText())){
            System.err.println("Fun " + ctx.ID().getText() + " already defined");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        conf.updateFunction(ctx.ID().getText(), functionContext);

        return new NatValue(0);
    }

    @Override
    public ExpValue<?> visitArncMethod(ImpParser.ArncMethodContext ctx) {
        Map<String, ExpValue<?>> args = new HashMap<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            if (ctx.ID(i).getText().equals(","))
                continue;
            String id = ctx.ID(0).getText();

            if (!args.containsKey(id)) {
                args.put(id, new NatValue(0));
            }
            else {
                System.err.println("Parameter name " + id + " clashes with previous parameters");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }
        }

        ArncConf.FunctionContext functionContext = new ArncConf.FunctionContext(ctx, args);

        if(arncConf.containsFunction(ctx.ID(0).getText())){
            System.err.println("Fun " + ctx.ID(0).getText() + " already defined");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        arncConf.updateFunction(ctx.ID(0).getText(), functionContext);

        return new NatValue(0);
    }


    @Override
    public Value visitVars(ImpParser.VarsContext ctx) {
        return super.visitVars(ctx);
    }

    @Override
    public ExpValue<?> visitFunCall(ImpParser.FunCallContext ctx) {
        String id = ctx.ID().getText();

        // check if the function was declared
        if (!conf.containsFunction(id)) {
            System.err.println("Function " + id + " used but never declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        Conf.FunctionContext functionContext = conf.getFunction(id);

        // copy the arguments
        Map<String, ExpValue<?>> args = functionContext.getArgs();
        Map<String, ExpValue<?>> argsCopy = new HashMap<>();
        for (String key : args.keySet()) {
            argsCopy.put(key, args.get(key));
        }

        // check if the number of arguments is correct
        // System.out.println("args"+ argsCopy+"size"+argsCopy.size());
        // System.out.println("exp"+ctx.exp()+"size"+ctx.exp().size());
        if (argsCopy.size() != ctx.exp().size()) {
            System.err.println("Function " + id + " called with the wrong number of arguments");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        // evaluate the arguments
        for (int i = 0; i < ctx.exp().size(); i++) {
            String argId = argsCopy.keySet().toArray()[i].toString();
            ExpValue<?> argValue = visitExp(ctx.exp(i));
            argsCopy.put(argId, argValue);
        }

        if (openContexts.contains(id)) {
            // let's loop through the context to find the last name of the function, and add _rec to it
            String newId = id;
            for (String current_context : openContexts) {
                if (current_context.contains("!")) {
                    if (current_context.split("!")[0].equals(id)) {
                        newId = current_context;
                    }
                }
            }
            openContexts.addLast(newId + "!");
        }
        else {
            openContexts.addLast(id); // push the function name to the context
        }

        conf.updateContext(openContexts.getLast(), argsCopy); // update the context with the arguments

        visitCom(functionContext.getCtx().com());
        ExpValue<?> ret = visitExp(functionContext.getCtx().exp());

        // we need to remove the context from the conf
        conf.removeContext(openContexts.getLast());

        openContexts.pollLast();

        return ret;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //we create a stack that all ArncOps can access
    ArncConf.opStack opStack = new ArncConf.opStack();

    @Override
    public ExpValue<?> visitArncPrint(ImpParser.ArncPrintContext ctx) {
        System.out.println(visitArncExp(ctx.arncExp()));
        return null;
    }

    private ArncComValue visitArncCom(ImpParser.ArncComContext ctx) {
        if (ctx == null){
            return null;
        }
        else {
            return (ArncComValue) visit(ctx);
        }
    }

    private ExpValue<?> visitArncExp(ImpParser.ArncExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private ExpValue<?> visitArncOp(ImpParser.ArncOpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private float visitFloatArncExp(ImpParser.ArncExpContext ctx) {
        try {
            return ((FloatValue) visitArncExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolArncExp(ImpParser.ArncExpContext ctx) {
        try {
            return ((BoolValue) visitArncExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ArncComValue visitArncAssign(ImpParser.ArncAssignContext ctx) {
        String id = ctx.ID().getText(); // we identify a arncVariable with a ? before the name
        ExpValue<?> v = visitArncExp(ctx.arncExp());

        Map<String, ExpValue<?>> currentContext = arncConf.getContext(openArncContexts.getLast());
        currentContext.put(id, v);
        arncConf.updateContext(openArncContexts.getLast(), currentContext);

        // if they are linked, update the other context
        if (arncConf.containsLinked(id, openArncContexts.getLast())) {
            String linkedId = arncConf.getLinked(id, openArncContexts.getLast());
            conf.updateGlobal(linkedId, v);
        }

        return ArncComValue.INSTANCE;
    }

    @Override
    public ArncComValue visitArncGlobalAssign(ImpParser.ArncGlobalAssignContext ctx) {
        String globalId = ctx.ID(0).getText();
        String localId = '?' + ctx.ID(1).getText();

        Map<String, ExpValue<?>> currentContext = conf.getContext(openArncContexts.getLast());
        currentContext.put(localId, conf.getGlobal(globalId));
        arncConf.updateContext(openArncContexts.getLast(), currentContext);

        arncConf.link(localId, openArncContexts.getLast(), globalId);

        return ArncComValue.INSTANCE;
    }

    @Override
    public Value visitArncIf(ImpParser.ArncIfContext ctx) {

        if(ctx.arncCom().size() == 1){
            return visitBoolArncExp(ctx.arncExp())
                    ? visitArncCom(ctx.arncCom(0))
                    : null;
        }
        else{
            return visitBoolArncExp(ctx.arncExp())
                    ? visitArncCom(ctx.arncCom(0))
                    : visitArncCom(ctx.arncCom(1));
        }
    }

    @Override
    public Value visitArncWhile(ImpParser.ArncWhileContext ctx) {
        if (!visitBoolArncExp(ctx.arncExp()))
            return ArncComValue.INSTANCE;

        visitArncCom(ctx.arncCom());

        return visitArncWhile(ctx);
    }

    @Override
    public Value visitArncSeq(ImpParser.ArncSeqContext ctx) {
        visitArncCom(ctx.arncCom(0));
        return visitArncCom(ctx.arncCom(1));
    }

    //TODO : ExpValue o ArncExpValue?
    @Override
    public Value visitArncId(ImpParser.ArncIdContext ctx) {
        String id = ctx.ID().getText(); // we identify a arncVariable with a ? before the name

        ExpValue<?> ret;
        Map<String, ExpValue<?>> funC = arncConf.getContext(openArncContexts.getLast());
        if (!funC.containsKey(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }
        ret = funC.get(id);

        return ret;
    }

    @Override
    public ExpValue<?> visitArncFunCall(ImpParser.ArncFunCallContext ctx) {
        // TODO: testare, finire
        String id = ctx.ID().getText();

        if (!arncConf.containsFunction(id)) {
            System.err.println("Function " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        List<ImpParser.ArncExpContext> exps = ctx.arncExp();
        List<ExpValue<?>> expValues = new ArrayList<>();
        for (ImpParser.ArncExpContext exp : exps) {
            expValues.add(visitArncExp(exp));
        }

        openArncContexts.addLast(id);

        ExpValue<?> ret = visitArncMethod(arncConf.getFunction(id).getCtx());

        openArncContexts.removeLast();

        return ret;
    }

    @Override
    public Value visitArncMetCall(ImpParser.ArncMetCallContext ctx) {
        String myVar = ctx.ID(1).getText();
        String method = ctx.ID(2).getText();

        List<ImpParser.ArncExpContext> args = ctx.arncExp();
        List<ExpValue<?>> argsValues = new ArrayList<>();
        for (int i = 0; i < ctx.arncExp().size(); i++) {
            argsValues.add(visitArncExp(ctx.arncExp(i)));
        }

        return null;
    }

    //NAT is considered FLOAT
    @Override
    public Value visitArncNat(ImpParser.ArncNatContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.NAT().getText()));
    }

    @Override
    public Value visitArncFloat(ImpParser.ArncFloatContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public BoolValue visitArncBool(ImpParser.ArncBoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public Value visitArncString(ImpParser.ArncStringContext ctx) {
        return new StringValue((ctx.STRING().getText()));
    }

    @Override
    public Value visitArncParExp(ImpParser.ArncParExpContext ctx) {
        return visitArncExp(ctx.arncExp());
    }

    @Override
    public FloatValue visitArncValzero(ImpParser.ArncValzeroContext ctx) {
        return new FloatValue(0f);
    }

    @Override
    public FloatValue visitArncValone(ImpParser.ArncValoneContext ctx) {
        return new FloatValue(1f);
    }

    @Override
    public Value visitArncOpResAssign(ImpParser.ArncOpResAssignContext ctx) {
        String myVar = ctx.ID().getText();
        ExpValue<?> stackValue = visitArncExp(ctx.arncExp());
        opStack.push(stackValue);
        ExpValue<?> res;

        for (int i = 0; i < ctx.arncOp().size(); i++) {
            System.out.println("SOno qui");
            visitArncOp(ctx.arncOp(i));
            System.out.println(visitArncOp(ctx.arncOp(i)));
            stackValue = (ExpValue<?>) opStack.getStackTop();
            Map<String, ExpValue<?>> currentContext = arncConf.getContext(openArncContexts.getLast());
            currentContext.put(myVar, stackValue);
            arncConf.updateContext(openArncContexts.getLast(), currentContext);
        }
        System.out.println("Stack Pop");
        opStack.pop();

        return null;
    }

    @Override
    public Value visitArncDivMul(ImpParser.ArncDivMulContext ctx) {

        if(opStack.getStackTop() instanceof FloatValue){
            Float stackTop = ((FloatValue) opStack.getStackTop()).toJavaValue();
            //System.out.println("stackTop -> " + stackTop);
            Float operand = visitFloatArncExp(ctx.arncExp());
            //System.out.println("operand -> " + operand);

            return switch (ctx.aop.getType()) {
                case ImpParser.ARNC_MUL -> (FloatValue)opStack.setStackTop(new FloatValue(stackTop * operand));
                case ImpParser.ARNC_DIV -> (FloatValue)opStack.setStackTop(new FloatValue(stackTop / operand));
                default -> null;
            };
        }
        System.err.println("YOUR INVITATION IS NOT FLOAT!");
        return null;
    }

    @Override
    public FloatValue visitArncPlusMinus(ImpParser.ArncPlusMinusContext ctx) {
        if(opStack.getStackTop() instanceof FloatValue){
            Float stackTop = ((FloatValue) opStack.getStackTop()).toJavaValue();
            //System.out.println("stackTop -> " + stackTop);
            Float operand = visitFloatArncExp(ctx.arncExp());
            //System.out.println("operand -> " + operand);

            return switch (ctx.aop.getType()) {
                case ImpParser.ARNC_PLUS -> (FloatValue)opStack.setStackTop(new FloatValue(stackTop + operand));
                case ImpParser.ARNC_MINUS -> (FloatValue)opStack.setStackTop(new FloatValue(stackTop - operand));
                default -> null;
            };
        }
        System.err.println("YOUR INVITATION IS NOT FLOAT!");
        return null;
    }

    @Override
    public Value visitArncCmpOp(ImpParser.ArncCmpOpContext ctx) {

        if(opStack.getStackTop() instanceof FloatValue){
            Float stackTop = ((FloatValue) opStack.getStackTop()).toJavaValue();
            //System.out.println("stackTop -> " + stackTop);
            Float operand = visitFloatArncExp(ctx.arncExp());
            //System.out.println("operand -> " + operand);

            return switch (ctx.aop.getType()) {
                case ImpParser.ARNC_EQUAL -> new BoolValue(stackTop.equals(operand));
                case ImpParser.ARNC_GRATER -> new BoolValue(stackTop > operand);
                default -> null;
            };
        }
        System.err.println("YOUR INVITATION IS NOT FLOAT!");
        return null;
    }

    @Override
    public Value visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Value visitArncLogOp(ImpParser.ArncLogOpContext ctx) {

        if(opStack.getStackTop() instanceof BoolValue){
            Boolean stackTop = ((BoolValue) opStack.getStackTop()).toJavaValue();
            //System.out.println("stackTop -> " + stackTop);
            Boolean operand = visitBoolArncExp(ctx.arncExp());
            //System.out.println("operand -> " + operand);

            return switch (ctx.aop.getType()) {
                case ImpParser.ARNC_AND -> (BoolValue)opStack.setStackTop(new BoolValue(stackTop && operand));
                case ImpParser.ARNC_OR -> (BoolValue)opStack.setStackTop(new BoolValue(stackTop || operand));
                default -> null;
            };
        }
        System.err.println("YOUR INVITATION IS NOT BOOLEAN!");
        return null;
    }


    @Override
    public Value visitArncMetVoid(ImpParser.ArncMetVoidContext ctx) {



        return null;
    }

    @Override
    public Value visitArncMetNonVoid(ImpParser.ArncMetNonVoidContext ctx) {
        return super.visitArncMetNonVoid(ctx);
    }



}
