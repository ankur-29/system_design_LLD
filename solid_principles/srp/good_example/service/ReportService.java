package solid_principles.srp.good_example.service;

import solid_principles.srp.good_example.model.User;

public class ReportService {

    public void generateReport(User user) {
        System.out.println("Generating report for: " + user.getName());
    }
}