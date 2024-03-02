package dev.lekha.constants;

public class PaymentConstants {
    public enum PaymentStatus {
        PENDING,
        INPROGRESS,
        SUCCESSFUL,
        FAILURE
    }
    public enum PaymentMode {
        CASH,
        UPI,
        CARD
    }

}
