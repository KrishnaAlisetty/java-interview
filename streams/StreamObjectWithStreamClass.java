package streams;

import java.util.stream.Stream;

public class StreamObjectWithStreamClass {
    public static void main(String[] args) {
        /**
         * from Stream class methods
         * 
         * .<T>of(T... t)
         * .empty()
         * .generate(supplier) - infinite
         * .iterate(initalValue, UnaryOperator) - infinite
         * .iterate(initialValue, predicate, UnaryOperator)
         * 
         **/

        Stream.<Integer>of(1, 2, 3);

    }
}