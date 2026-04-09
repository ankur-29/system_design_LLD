package behavioral_patterns.strategy;

import behavioral_patterns.strategy.context.PaymentContext;
import behavioral_patterns.strategy.concrete.*;

public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext(new UpiPayment());

        context.pay(1000);

        // Switch strategy at runtime
        context.setStrategy(new CardPayment());
        context.pay(2000);

        context.setStrategy(new PaypalPayment());
        context.pay(3000);
    }
}