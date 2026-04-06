package creational_patterns.factory.factorymethods;

import creational_patterns.factory.payment.Payment;

public interface PaymentFactory {
    Payment createPayment();
}
