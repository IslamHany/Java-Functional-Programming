package org.benhany.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(connectionUrlSupplier.get());
    }

    static String getDbConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> connectionUrlSupplier = _Supplier::getDbConnectionUrl;
}
