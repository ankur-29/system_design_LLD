package creational_patterns.prototype.deepcopy;

public class Main {

    public static void main(String[] args) throws Exception {

        Address address = new Address("Bangalore");
        User user1 = new User("Ankur", address);

        User user2 = (User) user1.clone();

        user2.address.city = "Delhi";

        System.out.println(user1.address.city); // ✅ Bangalore
    }
}
