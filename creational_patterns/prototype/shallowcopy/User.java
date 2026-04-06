package creational_patterns.prototype.shallowcopy;

public class User implements Cloneable {

    String name;
    Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // ❌ shallow copy
    }
}
