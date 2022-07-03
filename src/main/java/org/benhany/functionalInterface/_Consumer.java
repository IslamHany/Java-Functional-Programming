package org.benhany.functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("islam", "12345678");
        greetCustomer(newCustomer);
        customerConsumer.accept(newCustomer);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello: " + customer.getName());
    }

    static Consumer<Customer> customerConsumer = _Consumer::greetCustomer;

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
