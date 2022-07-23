package singleton;

public class DbSingleton {
    /*
     * Static at the moment means it is not currently threadsafe.
     * Also, it is currently eagerly loaded: the instance is created at start-up,
     * regardless of whether we use it. A better example is to use lazy-loading.
     */
    private static final DbSingleton instance = new DbSingleton();

    private DbSingleton() {

    }

    // getInstance naming of method is customary in Singleton pattern
    public static DbSingleton getInstance() {
        return instance;
    }
}
