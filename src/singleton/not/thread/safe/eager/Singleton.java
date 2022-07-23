package singleton.not.thread.safe.eager;

public class Singleton {
    /*
     * Static at the moment means it is not currently threadsafe.
     * Also, it is currently eagerly loaded: the instance is created at start-up,
     * regardless of whether we use it. A better example is to use lazy-loading.
     */
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    // getInstance naming of method is customary in Singleton pattern
    public static Singleton getInstance() {
        return instance;
    }
}
