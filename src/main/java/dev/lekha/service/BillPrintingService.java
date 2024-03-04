package dev.lekha.service;

import dev.lekha.model.Order;

import java.util.List;

public class BillPrintingService {
    private final List<Order> orders;

    public BillPrintingService(List<Order> order) {
        this.orders = order;
    }

    public void printBill() {
        for (Order order : orders) {
            System.out.println();
            System.out.println();
            System.out.println("***");
            System.out.println("Order id: " + order.getId());
            System.out.println("Customer name: " + order.getCustomer().getName());
            System.out.println("Customer mobile number: " + order.getCustomer().getPhone_number());
            System.out.println("Order items:");
            order.getItems().forEach((item, quantity) -> {
                System.out.println("* " + item.getName() + " - " + quantity);
            });
            System.out.println("Total price: " + order.getTotal_price());
            System.out.println("Order status: " + order.getOrder_status());
            order.getPayment().printPayment();
            System.out.println("***");
            System.out.println();
            System.out.println();
        }
    }
}
