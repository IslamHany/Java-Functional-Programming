package org.benhany.functionalInterface;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMul.apply(4, 10));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMul = _BiFunction::incrementByOneAndMultiply;

    static Integer incrementByOneAndMultiply(Integer num, Integer mul){
        return (num + 1) * mul;
    }
}
