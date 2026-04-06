package creational_patterns.builder.bad_example;

class User {

    private String name;
    private int age;
    private String email;
    private String phone;

    public User(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
}
