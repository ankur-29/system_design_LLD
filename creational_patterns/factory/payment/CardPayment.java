package creational_patterns.factory.payment;

public class CardPayment implements Payment {
    
    @Override
    public void pay() {
        System.out.println("Card payment");
    }
}
