package creational_patterns.factory.factorymethods;

import creational_patterns.factory.payment.*;

public class PaypalPaymentFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }
    
}
