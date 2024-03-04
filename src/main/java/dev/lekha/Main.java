package dev.lekha;

import dev.lekha.factory.CustomerFactory;
import dev.lekha.factory.MenuItemFactory;
import dev.lekha.factory.OrderFactory;
import dev.lekha.factory.RestaurantFactory;
import dev.lekha.model.Customer;
import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;
import dev.lekha.service.BillPrintingService;
import dev.lekha.service.RestaurantBillingService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final RestaurantBillingService restaurantBillingService = new RestaurantBillingService(
                new RestaurantFactory().defaultRestaurant("Don's Den"));

        restaurantBillingService.addMenuItem(
                new MenuItemFactory().defaultMenuItem("Chicken Biriyani", 120.00f));

        restaurantBillingService.addMenuItem(
                new MenuItemFactory().defaultMenuItem("Veg Biriyani", 100.00f));

        Customer customer1 =
                new CustomerFactory().defaultCustomer("Arun", "9940245619");
        Map<MenuItem, Integer> orderItems1 = new HashMap<>();
        orderItems1.put(restaurantBillingService.getMenuItem("Chicken Biriyani"), 1);
        Order order1 = new OrderFactory().defaultOrder(customer1, orderItems1);
        restaurantBillingService.takeOrder(order1);

        Customer customer2 =
                new CustomerFactory().defaultCustomer("Lekha", "7401174419");
        Map<MenuItem, Integer> orderItems2 = new HashMap<>();
        orderItems2.put(restaurantBillingService.getMenuItem("Veg Biriyani"), 1);
        orderItems2.put(restaurantBillingService.getMenuItem("Chicken Biriyani"), 2);
        Order order2 = new OrderFactory().defaultOrder(customer2, orderItems2);
        restaurantBillingService.takeOrder(order2);

        List<Order> orders = restaurantBillingService.getRestaurant().getOrders();
        BillPrintingService billPrintingService = new BillPrintingService(orders);
        billPrintingService.printBill();
    }
}