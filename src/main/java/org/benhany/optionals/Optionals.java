package org.benhany.optionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String defaultValue = (String) Optional.ofNullable(null)
                .orElse("default value");

        Optional.ofNullable("test@test.com")
                        .ifPresent(email -> {
                            System.out.println("Sending Email to: " + email + "...");
                        });
        System.out.println(defaultValue);
    }
}
