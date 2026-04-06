package creational_patterns.factory.factorymethods;

import creational_patterns.factory.payment.*;

public class UpiPaymentFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
        return new UpiPayment();
    }
    
}
