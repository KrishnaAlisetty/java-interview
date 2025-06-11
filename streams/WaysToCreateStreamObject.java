package streams;

public class WaysToCreateStreamObject {
    public static void main(String[] args) {
        /**
         * from Stream class methods
         * 
         * .empty()
         * .<T>of(T... t)
         * .generate(supplier) - infinite
         * .iterate(initalValue, UnaryOperator) - infinite
         * .iterate(initialValue, predicate, UnaryOperator)
         * .builder()
         * 
         **/

        /**
         * StreamSupport.stream(spliterator, false);
         */

        /**
         * from collections API.
         * .stream()
         */

        /**
         * from Arrays utility class
         * .stream()
         */

        /**
         * from primitive streams
         * .range(startValue, endValue);
         * .rangeClosed(startValue, endValue)
         */

        /**
         * from Random class
         * .ints()
         * .longs()
         * .doubles()
         *
         */

        /**
         * from String class
         * .chars()
         */

    }
}