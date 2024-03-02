package dev.lekha.model;

import lombok.Data;

@Data
public class Customer {
    private final String id;
    private final String name;
    private final String phone_number;

    public Customer(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        phone_number = phoneNumber;
    }
}
