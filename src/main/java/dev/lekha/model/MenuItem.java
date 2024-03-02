package dev.lekha.model;

import lombok.Data;

@Data
public class MenuItem {
    private final String id;
    private final String name;
    private final float price;

    public MenuItem(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
