package dev.lekha.service;

import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;
import dev.lekha.model.Restaurant;

public class RestaurantBillingService {
    private final Restaurant restaurant;

    public RestaurantBillingService(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void addMenuItem(MenuItem menuItem) {
        restaurant.addMenuItem(menuItem);
    }

    public void takeOrder(Order order) {
        restaurant.placeOrder(order);
    }
}
