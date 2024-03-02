package dev.lekha.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private final Integer id;
    private final Customer customer;
    private final List<MenuItem> items;
    private final float total_price;
    private final String order_status;
    private final Payment payment;

    public Order(Integer id, Customer customer, List<MenuItem> items, float totalPrice, String orderStatus, Payment payment) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        total_price = totalPrice;
        order_status = orderStatus;
        this.payment = payment;
    }
}
