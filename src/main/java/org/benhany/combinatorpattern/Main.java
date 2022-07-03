package org.benhany.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Islam",
                "test@test.com",
                "+02165521",
                LocalDate.of(2000,1,1));

        Customer customer2 = new Customer("Islam",
                "testtest.com",
                "+02165521",
                LocalDate.of(2000,1,1));

        Customer customer3 = new Customer("Islam",
                "test@test.com",
                "02165521",
                LocalDate.of(2000,1,1));

        Customer customer4 = new Customer("Islam",
                "test@test.com",
                "+02165521",
                LocalDate.of(2018,1,1));

        CustomerValidatorService customer1ValidatorService = new CustomerValidatorService();

        System.out.println(customer1ValidatorService.isValid(customer1));

        // Using combinator pattern
        ValidationResult result1 = CustomerRegistrationValidtor.isEmailValid()
                .and(CustomerRegistrationValidtor.isAdult())
                .and(CustomerRegistrationValidtor.isPhoneValid())
                .apply(customer1);

        ValidationResult result2 = CustomerRegistrationValidtor.isEmailValid()
                .and(CustomerRegistrationValidtor.isAdult())
                .and(CustomerRegistrationValidtor.isPhoneValid())
                .apply(customer2);

        ValidationResult result3 = CustomerRegistrationValidtor.isEmailValid()
                .and(CustomerRegistrationValidtor.isAdult())
                .and(CustomerRegistrationValidtor.isPhoneValid())
                .apply(customer3);

        ValidationResult result4 = CustomerRegistrationValidtor.isEmailValid()
                .and(CustomerRegistrationValidtor.isAdult())
                .and(CustomerRegistrationValidtor.isPhoneValid())
                .apply(customer4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
