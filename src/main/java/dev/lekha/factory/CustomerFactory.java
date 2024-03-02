package dev.lekha.factory;

import dev.lekha.model.Customer;

import java.util.UUID;

public class CustomerFactory {
    public Customer defaultCustomer(final String name, final String phoneNumber) {
        String customerId = UUID.randomUUID().toString();
        return new Customer(customerId, name, phoneNumber);
    }
}
