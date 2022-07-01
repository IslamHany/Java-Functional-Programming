package org.benhany.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.benhany.imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Islam", MALE),
                new Person("Aisha", FEAMLE),
                new Person("Hany", MALE),
                new Person("Esraa", FEAMLE)
        );

        //Imperative approach
         List<Person> females = new ArrayList<>();

         for (Person person: personList){
             if (FEAMLE.equals(person.gender))
                 females.add(person);
         }

        for (Person female: females) {
            System.out.println(female);
        }

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
