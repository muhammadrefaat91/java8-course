package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {


    public static void main(String[] args) {

        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five");

        List<String> result = new ArrayList<>();

        Consumer<String> c = System.out::println;
//        strings.forEach(c);

//        strings.forEach(System.out::println);

        Consumer<String> c2 = result::add;
//        strings.forEach(c2);

        strings.forEach(c.andThen(c2));

        System.out.println("Size of result " + result.size());

    }


}
