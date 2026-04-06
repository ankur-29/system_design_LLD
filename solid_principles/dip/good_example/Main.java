package solid_principles.dip.good_example;

import solid_principles.dip.good_example.database.*;
import solid_principles.dip.good_example.service.UserService;

public class Main {

    public static void main(String[] args) {

        Database mysql = new MySQLDatabase();
        UserService userService1 = new UserService(mysql);
        userService1.process();

        Database mongo = new MongoDBDatabase();
        UserService userService2 = new UserService(mongo);
        userService2.process();
    }
}
