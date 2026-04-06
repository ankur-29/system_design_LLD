package solid_principles.ocp.good_example.payment;

public class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing Card Payment");
    }
}
