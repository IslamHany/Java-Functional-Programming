package org.benhany.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        System.out.println(upperCaseName.apply("islam"));
    }
}
