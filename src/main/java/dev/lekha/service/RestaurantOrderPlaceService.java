package dev.lekha.service;

import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;

public interface RestaurantOrderPlaceService {
    public MenuItem getMenuItem(String name);
    public void takeOrder(Order order);
}
