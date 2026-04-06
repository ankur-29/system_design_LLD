package solid_principles.ocp.good_example.payment;

public class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing UPI Payment");
    }
}
