package solid_principles.ocp.good_example.service;

import solid_principles.ocp.good_example.payment.Payment;

public class PaymentService {

    public void processPayment(Payment payment) {
        payment.pay();
    }
}