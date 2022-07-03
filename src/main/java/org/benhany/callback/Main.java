package org.benhany.callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Islam", "Hany", helloInEnglish);
        hello("Islam", "Hany", helloInSpanish);
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        String fullName = firstName + " " + lastName;

        callback.accept(fullName);
    }

    static Consumer<String> helloInEnglish = name -> System.out.println("Hello: " + name);
    static Consumer<String> helloInSpanish = name -> System.out.println("Hola: " + name);
}
