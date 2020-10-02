package additionalmethods;

import common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ComparatorExamples {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Muhammad", 23), new Person("Abdo",29)
                , new Person("Ahmed",23), new Person("Refaat",20), new Person("Ali",26));

        //comparing by age then name

        Collections.sort(personList, Comparator.comparing(Person::getAge).thenComparing(k -> k.getName()));

        System.out.println(personList);


        Collections.sort(personList, Comparator.comparing(Person::getAge).reversed());

        //reverse person list by age
        System.out.println(personList);

    }
}
