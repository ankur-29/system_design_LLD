package structural_patterns.adapter.adaptertype;

import structural_patterns.adapter.legacy.OldPaymentSystem;
import structural_patterns.adapter.modern.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {

    private OldPaymentSystem oldPaymentSystem;

    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void processPayment(int amount) {
        // Convert new interface call to old system
        oldPaymentSystem.makePayment(amount);
    }
}