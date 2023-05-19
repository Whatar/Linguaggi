package value;

public abstract class ExpValue<T> extends Value {
    private final T value;
    ExpValue(T value){
        this.value = value;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
