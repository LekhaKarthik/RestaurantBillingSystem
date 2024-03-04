package dev.lekha.model;

import lombok.Data;

@Data
public class Payment {
    private final String id;
    private final String paymentMode;
    private final String paymentStatus;
    public Payment(String id, String paymentMode, String paymentStatus) {
        this.id = id;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public void printPayment() {
        System.out.println("Payment ID: " + id);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Payment Status: " + paymentStatus);
    }
}
