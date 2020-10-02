package streams;

import common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReductionExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Integer red1 =
        list1.stream()
                .reduce(0, (s1, s2) -> s1+s2);

        Integer red2 =
                list1.stream()
                        .reduce(2, Integer::sum); //with lambda expression

        System.out.println(red2);

        //max

        Optional<Integer> red3 = list1.stream()
                .max(Comparator.naturalOrder());

        System.out.println("red max " + red3);

        //terminal operation

        List<Person> persons = Arrays.asList(new Person("Ahmed"), new Person("Ali"));

        boolean red4 = persons.stream()
                .map(s -> s.getName())
                .allMatch(s -> s.length() > 3);

        System.out.println("Is all persons name length grearer than 3 " +red4);


        List<Person> personList = Arrays.asList(new Person("Ahmed", 23), new Person("Abdo",29)
                , new Person("Refaat",22), new Person("Muhammad",20), new Person("Ali",26));

        //get the youngest person in 20
        Optional<Person> person = personList.stream()
                .filter(p -> p.getAge() >= 20)
                .min(Comparator.comparing(Person::getAge));

        System.out.println("The youngest person in 20 " +person.get());

        //collect with groupBy

        Map<Integer, Long> personMap = personList.stream()

        .collect(Collectors.groupingBy(
                Person::getAge,
                Collectors.counting()
        ));

        System.out.println(personMap);

        //group by list persons name
       Map<Integer, List<String>>  personsMap =  personList.stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println(personsMap);

    }

}
