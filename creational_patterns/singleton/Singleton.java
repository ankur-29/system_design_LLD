// Bill Pugh's Singleton implementation using a static inner helper class
// Thread-safe and lazy initialization without synchronization overhead

package creational_patterns.singleton;

public class Singleton {

    private Singleton() {}

    private static class Helper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Helper.INSTANCE;
    }
}