package solid_principles.dip.good_example.service;

import solid_principles.dip.good_example.database.Database;

public class UserService {

    private Database db;

    // ✅ Constructor Injection
    public UserService(Database db) {
        this.db = db;
    }

    public void process() {
        db.connect();
    }
}