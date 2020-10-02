package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FirstPeek {

    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five");

        List<String> result = new ArrayList<>();
        Predicate<String> p1 = Predicate.isEqual("one");
        Predicate<String> p2 = Predicate.isEqual("three");

        Consumer<String> c2 = System.out::println;
        strings
                .stream()
                .peek(c2)
                .filter(p1.or(p2))
                .forEach(result::add);

        System.out.println("Size of result: " + result.size());
    }
}
