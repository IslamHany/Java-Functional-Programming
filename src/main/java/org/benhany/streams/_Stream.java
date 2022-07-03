package org.benhany.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.benhany.streams._Stream.Gender.*;

public class  _Stream {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Islam", MALE),
                new Person("Aisha", FEAMLE),
                new Person("Hany", MALE),
                new Person("Esraa", FEAMLE)
        );

        personList.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean containsOnlyFemales = personList.stream()
                .allMatch(person -> person.gender.equals(FEAMLE));

        System.out.println("containsOnlyFemales is: " + containsOnlyFemales);
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
