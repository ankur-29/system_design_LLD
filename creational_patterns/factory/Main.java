package creational_patterns.factory;

import creational_patterns.factory.factorymethods.*;
import creational_patterns.factory.payment.Payment;

public class Main {

    public static void main(String[] args) {

        PaymentFactory factory;

        factory = new UpiPaymentFactory();
        Payment upi = factory.createPayment();
        upi.pay();

        factory = new CardPaymentFactory();
        Payment card = factory.createPayment();
        card.pay();
    }
}
