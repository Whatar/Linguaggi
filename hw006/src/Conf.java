import value.ExpValue;

import java.util.ArrayList;
import java.util.HashMap;
        import java.util.Map;

public class Conf {
    private final Map<String, ExpValue<?>> mem = new HashMap<>();
    private final Map<String, ArrayList<ExpValue<?>>> arrays = new HashMap<>();

    public Map<String, ExpValue<?>> getMem() {
        return mem;
    }

    // we need a structure to store arrays and their values
    public Map<String, ArrayList<ExpValue<?>>> getArrays() {
        return arrays;
    }

    public boolean updateMem(String id, ExpValue<?> value) {
        mem.put(id, value);
        return true;
    }

    public boolean updateArray(String id, int index, ExpValue<?> value) {
        if (!arrays.containsKey(id)) {
            arrays.put(id, new ArrayList<>(99999));
        }
        // Retrieve the array from the map
        ArrayList<ExpValue<?>> targetArray = arrays.get(id);

        // Check if the ArrayList size is less than or equal to index
        if (targetArray.size() <= index) {
            // Resize the ArrayList by adding null elements until index + 1
            while (targetArray.size() <= index) {
                targetArray.add(null);
            }
        }

        targetArray.set(index, value);

        // Assign "0" to the element at index 5
        arrays.put(id, targetArray);

        return true;
    }

    public String getStringArray(String id) {
        String result = "";
            ArrayList<ExpValue<?>> targetArray = arrays.get(id);
            for (ExpValue<?> value : targetArray) {
                if (value == null) {
                    continue;
                }
                result += value.getValue();
                if (value != targetArray.get(targetArray.size() - 1)) {
                    result += ", ";
                }
            }
        return result;
    }
}
