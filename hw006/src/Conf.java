import value.ExpValue;

        import java.util.HashMap;
        import java.util.Map;

public class Conf {
    private final Map<String, ExpValue<?>> mem = new HashMap<>();

    public Map<String, ExpValue<?>> getMem() {
        return mem;
    }

    public boolean update(String id, ExpValue<?> value) {
        if (mem.containsKey(id)) {
            mem.put(id, value);
            return true;
        }
        return false;
    }
}
