import value.ExpValue;

import java.util.HashMap;
import java.util.Map;



public class Conf {


    // We need to save the context of each function call, so we can visit the function body each time it is called
    public static class FunctionContext {
        private final ImpParser.FunContext ctx;
        private final Map<String, ExpValue<?>> args;

        public FunctionContext(ImpParser.FunContext ctx, Map<String, ExpValue<?>> args) {
            this.ctx = ctx;
            this.args = args;
        }

        public Map<String, ExpValue<?>> getArgs() {
            return args;
        }

        public ImpParser.FunContext getCtx() {
            return ctx;
        }

        public boolean contains(String id) {
            return args.containsKey(id);
        }

        public ExpValue<?> get(String id) {
            return args.get(id);
        }
    }

    private final Map<String, ExpValue<?>> map = new HashMap<>();

    // Basically we have a map of contexts for each function call
    private final Map<String, Map> contexts = new HashMap<>();

    // We also have a map of declared functions
    private final Map<String, FunctionContext> functions = new HashMap<>();

    public boolean contains(String id) {
        return map.containsKey(id);
    }

    public ExpValue<?> get(String id) {
        return map.get(id);
    }

    public void update(String id, ExpValue<?> v) {
        map.put(id, v);
    }

    public boolean containsContext(String id) {
        return contexts.containsKey(id);
    }

    public Map<String, ExpValue<?>> getContext(String id) {
        return contexts.get(id);
    }

    public void updateContext(String id, Map<String, ExpValue<?>> v) {
        contexts.put(id, v);
    }

    public void removeContext(String id) {
        contexts.remove(id);
    }

    public boolean containsFunction(String id) {
        return functions.containsKey(id);
    }

    public FunctionContext getFunction(String id) {
        return functions.get(id);
    }

    public void updateFunction(String id, FunctionContext v) {
        functions.put(id, v);
    }


    //DEBUG
    public String getFunctions(){
        return functions.toString();
    }

}
