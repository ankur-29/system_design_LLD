// Only responsibility: Database operations

package solid_principles.srp.good_example.repository;

import solid_principles.srp.good_example.model.User;

public class UserRepository {

    public void save(User user) {
        System.out.println("Saving user to database: " + user.getName());
    }
}