package org.benhany.functionalInterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("islam", "12345678");
        customerBooleanBiConsumer.accept(newCustomer, true);
        customerBooleanBiConsumer.accept(newCustomer, false);
    }

    static BiConsumer<Customer, Boolean> customerBooleanBiConsumer = _BiConsumer::greetCustomer;

    static void greetCustomer(Customer customer, Boolean showNumber){
        if (showNumber)
            System.out.println("Hello: " + customer.getName() + "Your phone is: " + customer.getPhone());
        else
            System.out.println("Hello: " + customer.getName());
    }

    static class Customer{
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }
    }
}
