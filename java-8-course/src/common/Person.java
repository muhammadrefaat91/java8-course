package common;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Person (String name){
        this.name = name;
    }

    public Person (String name, int age){
        this.name = name;
        this.age=age;
    }

    public Person (String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth=dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
            return age;
        }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
        public String toString() {
            return "common.Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


}
