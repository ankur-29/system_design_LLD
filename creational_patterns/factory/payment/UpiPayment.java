package creational_patterns.factory.payment;

public class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("UPI payment");
    }
    
}
