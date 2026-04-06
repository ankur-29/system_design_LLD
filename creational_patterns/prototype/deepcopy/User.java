package creational_patterns.prototype.deepcopy;

public class User implements Cloneable {

    String name;
    Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Address newAddress = new Address(this.address.city);

        return new User(this.name, newAddress); // ✅ deep copy
    }
}
