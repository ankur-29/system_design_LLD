package structural_patterns.adapter;

import structural_patterns.adapter.adaptertype.PaymentAdapter;
import structural_patterns.adapter.legacy.OldPaymentSystem;
import structural_patterns.adapter.modern.PaymentProcessor;

public class Main {

    public static void main(String[] args) {

        OldPaymentSystem oldSystem = new OldPaymentSystem();

        // Adapter wraps old system
        PaymentProcessor processor = new PaymentAdapter(oldSystem);

        processor.processPayment(1000); // works
    }
}
