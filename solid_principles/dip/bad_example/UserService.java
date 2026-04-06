package solid_principles.dip.bad_example;

class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class UserService {

    private MySQLDatabase db;

    public UserService() {
        this.db = new MySQLDatabase(); // ❌ tightly coupled
    }

    public void process() {
        db.connect();
    }
}
