package value;

public class ArncComValue extends Value{

        public static final ArncComValue INSTANCE = new ArncComValue();

        private ArncComValue() { }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof ArncComValue;
        }

        @Override
        public int hashCode() {
            return 0;
        }
}
