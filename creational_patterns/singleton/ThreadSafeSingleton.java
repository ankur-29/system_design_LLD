// thread-safe singleton implementation using synchronized method
// Ensures that only one thread can access the getInstance() method at a time,
// slowing down performance in a multi-threaded environment due to synchronization overhead

package creational_patterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
