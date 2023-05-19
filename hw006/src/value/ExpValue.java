package value;

import java.util.Objects;

public abstract class ExpValue<T> extends Value {
    private final T value;
    ExpValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public int op(ExpValue<?> other, String op){
        // convert following line to integer
        Double a = ((Math.pow((Integer) value, (Integer) other.getValue())));
        Integer b = a.intValue();
        return switch (op) {
            case "+" -> ((Integer) value) + ((Integer) other.getValue());
            case "-" -> ((Integer) value) - ((Integer) other.getValue());
            case "*" -> ((Integer) value) * ((Integer) other.getValue());
            case "/" -> ((Integer) value) / ((Integer) other.getValue());
            case "%" -> ((Integer) value) % ((Integer) other.getValue());
            case "^" -> ((Double)(Math.pow((Integer) value, (Integer) other.getValue()))).intValue();
            case "<" -> ((Integer) value) < ((Integer) other.getValue()) ? 1 : 0;
            case ">" -> ((Integer) value) > ((Integer) other.getValue()) ? 1 : 0;
            case "<=" -> ((Integer) value) <= ((Integer) other.getValue()) ? 1 : 0;
            case ">=" -> ((Integer) value) >= ((Integer) other.getValue()) ? 1 : 0;
            case "==" -> ((Integer) value).equals(((Integer) other.getValue())) ? 1 : 0;
            case "!=" -> !((Integer) value).equals(((Integer) other.getValue())) ? 1 : 0;
            default -> 0;
        };
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ExpValue<?> expValue = (ExpValue<?>) obj;
        return value.equals(expValue.value);
    }

    public int hashCode(){
        return Objects.hash(value);
    }
}
