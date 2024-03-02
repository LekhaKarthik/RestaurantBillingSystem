package dev.lekha;

import dev.lekha.factory.CustomerFactory;
import dev.lekha.factory.MenuItemFactory;
import dev.lekha.factory.OrderFactory;
import dev.lekha.factory.RestaurantFactory;
import dev.lekha.model.Customer;
import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;
import dev.lekha.service.RestaurantBillingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final RestaurantBillingService restaurantBillingService = new RestaurantBillingService(
                new RestaurantFactory().defaultRestaurant("Don's Den"));

        restaurantBillingService.addMenuItem(
                new MenuItemFactory().defaultMenuItem("Chicken Biriyani", 120.00f));

        restaurantBillingService.addMenuItem(
                new MenuItemFactory().defaultMenuItem("Mutton Biriyani", 140.00f));

        Customer customer =
                new CustomerFactory().defaultCustomer("Arun", "9940245619");
        List<MenuItem> menu = new ArrayList<>();
        menu.add(restaurantBillingService.getMenuItem("Chicken Biriyani"));
        Order order = new OrderFactory().defaultOrder(customer, menu);
        restaurantBillingService.takeOrder(order);
    }
}