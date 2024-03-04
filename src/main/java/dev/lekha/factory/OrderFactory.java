package dev.lekha.factory;

import dev.lekha.model.Customer;
import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;

import java.util.Map;
import java.util.UUID;

public class OrderFactory {
    public Order defaultOrder(final Customer customer, final Map<MenuItem, Integer> menu) {
        String orderId = UUID.randomUUID().toString();
        return  new Order(orderId, customer, menu);
    }
}
