// Eager initialization of the singleton instance
// Thread-safe as the instance is created at class loading time, 
// but can lead to resource waste if the instance is never used

package creational_patterns.singleton;

public class EagerSingleton {
    // Static variable to hold the single instance of the class
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {}

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}
