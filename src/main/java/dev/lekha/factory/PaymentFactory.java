package dev.lekha.factory;

import dev.lekha.constants.PaymentConstants;
import dev.lekha.model.Payment;

import java.util.UUID;

public class PaymentFactory {
    public Payment defaultPayment() {
        String paymentId = UUID.randomUUID().toString();
        return new Payment(paymentId,
                PaymentConstants.PaymentMode.CASH.name(),
                PaymentConstants.PaymentStatus.PENDING.name());
    }
}
