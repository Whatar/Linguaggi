package value;

public class FloatValue extends ExpValue<Float> {

    public FloatValue(Float value) {
        super(value);
    }

    public float getValue() {
        return super.toJavaValue();
    }

    public boolean isTrue() {
        return this.getValue() != 0;
    }
}
