package dev.lekha.service;

import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;
import dev.lekha.model.Restaurant;
import lombok.Getter;

import java.util.List;

@Getter
public class RestaurantBillingService {
    private final Restaurant restaurant;

    public RestaurantBillingService(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public MenuItem getMenuItem(String name) {
        List<MenuItem> menu = restaurant.getMenu();
        for(MenuItem menuItem : menu) {
            if(menuItem.getName().equals(name)) {
                return menuItem;
            }
        }
        return null;
    }

    public void addMenuItem(MenuItem menuItem) {
        restaurant.addMenuItem(menuItem);
    }

    public void takeOrder(Order order) {
        restaurant.placeOrder(order);
    }
}
