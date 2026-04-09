package behavioral_patterns.strategy.concrete;

import behavioral_patterns.strategy.Istrategy.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
