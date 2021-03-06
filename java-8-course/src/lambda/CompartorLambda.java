package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorLambda {

    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                return Integer.compare(s1.length(), s2.length());
            }
        };

        List<String> list = Arrays.asList("***", "**", "****", "*");
        Collections.sort(list, comp);

        //With Lambda
        Comparator<String> comparatorLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        Collections.sort(list, comparatorLambda);

        for (String s: list) {
            System.out.println(s);
        }
    }
}
