// thread safe, Handles serialization, Prevents reflection attack

package creational_patterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void show() {
        System.out.println("Singleton using Enum");
    }
}
