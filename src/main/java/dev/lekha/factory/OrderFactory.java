package dev.lekha.factory;

import dev.lekha.model.Customer;
import dev.lekha.model.MenuItem;
import dev.lekha.model.Order;

import java.util.List;
import java.util.UUID;

public class OrderFactory {
    public Order defaultOrder(final Customer customer, final List<MenuItem> menu) {
        String orderId = UUID.randomUUID().toString();
        return  new Order(orderId, customer, menu);
    }
}
