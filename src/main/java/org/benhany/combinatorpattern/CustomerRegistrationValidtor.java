package org.benhany.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidtor extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidtor isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidtor isPhoneValid(){
        return customer -> customer.getPhone().startsWith("+0") ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidtor isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS : ValidationResult.NOT_AN_ADULT;
    }

    default CustomerRegistrationValidtor and(CustomerRegistrationValidtor other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ?
                    other.apply(customer) : result;
        };
    }
}
