package structural_patterns.facade.subsystem;

public class PaymentService {

    public void makePayment(int amount) {
        System.out.println("Processing payment of " + amount);
    }
}