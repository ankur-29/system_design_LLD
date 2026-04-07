package structural_patterns.adapter.legacy;

public class OldPaymentSystem {

    public void makePayment(int amount) {
        System.out.println("Processing payment of " + amount + " using old system");
    }
}
