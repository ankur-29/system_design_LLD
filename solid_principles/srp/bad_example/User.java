// This class violates the Single Responsibility Principle (SRP) 
// because it has multiple responsibilities:
//   1. Managing user data (name and email)
//   2. Saving user data to a database
//   3. Sending emails
//   4. Generating reports

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Multiple responsibilities
    public void saveToDatabase() {
        System.out.println("Saving user to database");
    }

    public void sendEmail() {
        System.out.println("Sending email to " + email);
    }

    public void generateReport() {
        System.out.println("Generating report for " + name);
    }
}