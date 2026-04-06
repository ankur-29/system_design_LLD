package creational_patterns.builder;

import creational_patterns.builder.good_example.User;

public class Main {

    public static void main(String[] args) {

        //bad example
        // User user = new User("Ankur", 25, null, null);

        //good example
        User user = new User.Builder("Ankur")
                .age(25)
                .email("ankur@gmail.com")
                .build();

        System.out.println("User created successfully");
    }
}
