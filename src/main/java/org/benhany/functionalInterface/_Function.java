package org.benhany.functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));
        System.out.println(incrementByOneMethodRef.apply(1));
        System.out.println(incrementByTwoFunctionalInterface.apply(2));
        System.out.println(new FunctionImpl().apply(3));
        System.out.println(
                multiplyByTen.andThen(incrementByOneMethodRef)
                        .andThen(incrementByTwoFunctionalInterface)
                        .apply(5)
        );
    }

    static Function<Integer, Integer> incrementByOneMethodRef = _Function::increment;
    static Function<Integer, Integer> incrementByTwoFunctionalInterface = number -> {
        System.out.println("Adding Two");
        return number + 2;
    };

    static Function<Integer, Integer> multiplyByTen = number -> {
        System.out.println("Multiplying by 10");
        return number * 10;
    };

    static Integer increment(Integer num){
        System.out.println("Adding One");
        return num + 1;
    }

    static class FunctionImpl implements Function<Integer, Integer>{
        @Override
        public Integer apply(Integer num) {
            return ++num;
        }
    }
}
