package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstConsumer {

    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five");

        List<String> result = new ArrayList<>();
        Consumer<String> c1 = result::add;
        Consumer<String> c2 = System.out::println;
        strings.stream().forEach(c1.andThen(c2));
    }
}
