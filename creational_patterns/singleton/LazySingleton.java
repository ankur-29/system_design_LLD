// used for Lazy Initialization of the singleton instance
// Not thread-safe, can lead to multiple instances in a multi-threaded environment

package creational_patterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}