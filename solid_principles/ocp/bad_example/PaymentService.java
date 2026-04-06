package solid_principles.ocp.bad_example;

class PaymentService {

    public void pay(String type) {

        if (type.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        } else if (type.equals("CARD")) {
            System.out.println("Processing Card Payment");
        } else if (type.equals("PAYPAL")) {
            System.out.println("Processing PayPal Payment");
        }
    }
}