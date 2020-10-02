package streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class FirstReduction {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;

        int id=0;

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        int red = stream.reduce(id, sum);
        System.out.println(red);
    }
}
