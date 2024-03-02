package dev.lekha.model;

import lombok.Data;

import java.util.List;

@Data
public class Restaurant {
    private final String id;
    private final String name;
    private final List<MenuItem> menu;
    private final List<Order> orders;

    public Restaurant(String id, String name, List<MenuItem> menu, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.menu = menu;
        this.orders = orders;
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
        System.out.println("Menu item " + menuItem.getName() + " to " + this.name + "'s menu");
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Placing order");
    }
}
