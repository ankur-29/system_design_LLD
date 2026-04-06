package solid_principles.srp.good_example;

import solid_principles.srp.good_example.model.User;
import solid_principles.srp.good_example.repository.UserRepository;
import solid_principles.srp.good_example.service.EmailService;
import solid_principles.srp.good_example.service.ReportService;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ankur", "ankur@gmail.com");

        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();
        ReportService reportService = new ReportService();

        userRepository.save(user);
        emailService.sendEmail(user);
        reportService.generateReport(user);
    }
}