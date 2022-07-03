package org.benhany.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String phoneNumber1 = "(123)456-7890";
        String phoneNumber2 = "123456";
        String phoneNumber3 = "(123)456-78904";
        System.out.println("This phone: " + phoneNumber1 + ", validity is: " + phonePredicate.test(phoneNumber1));
        System.out.println("This phone: " + phoneNumber3 + ", validity length is: " + phonePredicate.test(phoneNumber3));
        System.out.println("This phone: " + phoneNumber2 + ", validity is: " + phonePredicate.and(phonePredicateLength).test(phoneNumber2));
        System.out.println("This phone: " + phoneNumber1 + ", Or validity is: " + phonePredicate.or(phonePredicateLength).test(phoneNumber1));
    }

    static Predicate<String> phonePredicate = _Predicate::isPhoneNumberValid;
    static Predicate<String> phonePredicateLength = _Predicate::isPhoneNumber13;

    static Boolean isPhoneNumberValid(String phoneNumber){
        String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        return phoneNumber.matches(pattern);
    }

    static Boolean isPhoneNumber13(String phoneNumber){
        return phoneNumber.length() == 13;
    }
}
