package org.benhany.declarative;
;
import java.util.Arrays;
import java.util.List;

import static org.benhany.declarative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Islam", MALE),
                new Person("Aisha", FEAMLE),
                new Person("Hany", MALE),
                new Person("Esraa", FEAMLE)
        );

        //Declarative approach
        personList.stream().filter(person -> FEAMLE.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEAMLE
    }
}
