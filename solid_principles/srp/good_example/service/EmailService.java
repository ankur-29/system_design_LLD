package solid_principles.srp.good_example.service;

import solid_principles.srp.good_example.model.User;

public class EmailService {

    public void sendEmail(User user) {
        System.out.println("Sending email to: " + user.getEmail());
    }
}