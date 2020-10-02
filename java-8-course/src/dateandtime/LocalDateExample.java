package dateandtime;

import common.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class LocalDateExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Ahmed", LocalDate.of(1991,11,13)),
                new Person("Abdo",LocalDate.of(1891,11,13))
                , new Person("Refaat",LocalDate.of(1992,01,13)),
                new Person("Muhammad",LocalDate.of(1761,11,13)),
                new Person("Ali",LocalDate.of(1971,11,13)));

        LocalDate now = LocalDate.now();
        personList
                .stream().forEach( p-> {
                    Period period = Period.between(p.getDateOfBirth(), now);
            System.out.println(p.getName() + " was born " + period.get(ChronoUnit.YEARS) + "years");
                }
        );
    }
}
