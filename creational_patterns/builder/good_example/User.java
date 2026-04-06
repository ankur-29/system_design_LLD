package creational_patterns.builder.good_example;

public class User {

    private String name;
    private int age;
    private String email;
    private String phone;

    // Private constructor
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static Builder Class
    public static class Builder {

        private String name;
        private int age;
        private String email;
        private String phone;

        public Builder(String name) { // required field
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}