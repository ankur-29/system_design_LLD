package solid_principles.ocp.good_example;

import solid_principles.ocp.good_example.payment.*;
import solid_principles.ocp.good_example.service.PaymentService;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        Payment upi = new UpiPayment();
        Payment card = new CardPayment();
        Payment paypal = new PaypalPayment();

        paymentService.processPayment(upi);
        paymentService.processPayment(card);
        paymentService.processPayment(paypal);
    }
}