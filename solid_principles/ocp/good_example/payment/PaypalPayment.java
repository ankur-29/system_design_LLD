package solid_principles.ocp.good_example.payment;

public class PaypalPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing PayPal Payment");
    }
}
