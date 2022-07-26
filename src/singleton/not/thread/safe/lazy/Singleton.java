package singleton.not.thread.safe.lazy;

public class Singleton {

    // Static at the moment means it is not currently threadsafe.
    private static Singleton instance;

    private Singleton() {
    }

    /*
     * getInstance naming of method is customary in Singleton pattern.
     * Also, compared to singleton.not.thread.safe.eager.Singleton, this object
     * is lazily loaded: the singleton is only initialised when (or if) the getInstance
     * method is called, and not at JVM start-up.
     *
     * This is a performance improvement - if we had loads of classes being eagerly loaded
     * at start-up, it could take a considerable amount of time. Using the lazy loading
     * reduces this load at start-up.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
