package value;

public abstract class ArncExpValue<T> extends Value {

    private final T value;

    ArncExpValue(T value) {
        this.value = value;
    }

    public T toJavaValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArncExpValue<?> expValue = (ArncExpValue<?>) o;
        return value.equals(expValue.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
