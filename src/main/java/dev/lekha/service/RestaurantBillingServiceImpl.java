package dev.lekha.service;

import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;
import dev.lekha.model.Restaurant;
import lombok.Getter;

import java.util.List;

@Getter
public class RestaurantBillingServiceImpl implements RestaurantMenuGenerateService, RestaurantOrderPlaceService {
    private final Restaurant restaurant;

    public RestaurantBillingServiceImpl(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public MenuItem getMenuItem(String name) {
        List<MenuItem> menu = restaurant.getMenu();
        for(MenuItem menuItem : menu) {
            if(menuItem.getName().equals(name)) {
                return menuItem;
            }
        }
        return null;
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
        restaurant.addMenuItem(menuItem);
    }

    @Override
    public void takeOrder(Order order) {
        restaurant.placeOrder(order);
    }
}
