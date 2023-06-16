import value.ExpValue;

import java.util.HashMap;
import java.util.Map;


public class ArncConf {
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

    // we link global variables to arnc variables
    // for each arnc variable that we want to link, we also use the context as key
    private class Tuple {
        String key;
        String context;

        public Tuple(String key, String context) {
            this.key = key;
            this.context = context;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Tuple))
                return false;
            Tuple tuple = (Tuple) o;
            return context.equals(tuple.context) && key.equals(tuple.key);
        }

        @Override
        public int hashCode() {
            return (key + context).hashCode();
        }
    }
    private Map<Tuple, ExpValue<?>> links = new HashMap<>();

    public void link(String key, String context, ExpValue<?> value) {
        links.put(new Tuple(key, context), value);
    }

    public ExpValue<?> getLinked(String key, String context) {
        return links.get(new Tuple(key, context));
    }

    //DEBUG
    public String getFunctions(){
        return functions.toString();
    }

}
