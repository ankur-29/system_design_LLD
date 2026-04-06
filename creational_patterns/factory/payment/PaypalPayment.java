package creational_patterns.factory.payment;

public class PaypalPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("PayPal payment");
    }

}
