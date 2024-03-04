package dev.lekha.model;

import dev.lekha.constants.OrderConstants;
import dev.lekha.factory.PaymentFactory;
import lombok.Data;

import java.util.Map;

@Data
public class Order {
    private final String id;
    private final Customer customer;
    private final Map<MenuItem, Integer> items;
    private float total_price;
    private String order_status;
    private Payment payment;

    public Order(String id, Customer customer, Map<MenuItem, Integer> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.total_price = calculateTotalPrice();
        this.order_status = OrderConstants.OrderStatus.PENDING.name();
        this.payment = new PaymentFactory().defaultPayment();
    }

    private float calculateTotalPrice() {
        final float[] totalPrice = {0};
        items.forEach((item, quantity) -> {
            totalPrice[0] += (item.getPrice() * quantity);
        });
        return totalPrice[0];
    }

    public void printBill() {
        System.out.println();
        System.out.println();
        System.out.println("***");
        System.out.println("Order id: " + id);
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer mobile number: " + customer.getPhone_number());
        System.out.println("Order items:");
        items.forEach((item, quantity) -> {
            System.out.println("* " + item.getName() + " - " + quantity);
        });
        System.out.println("Total price: " + total_price);
        System.out.println("Order status: " + order_status);
        payment.printPayment();
        System.out.println("***");
        System.out.println();
        System.out.println();
    }
}
