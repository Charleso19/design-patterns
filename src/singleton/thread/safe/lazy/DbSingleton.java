package singleton.thread.safe.lazy;

/**
 * Double locking mechanism version of singleton.
 */
public class DbSingleton {

    // volatile prevents cache incoherence issues.
    private static volatile DbSingleton instance;

    private DbSingleton() {
    }

    /*
     * Could make the method synchronised, but this is a performance hit:
     *
     *     public static synchronized DbSingleton getInstance() {
     *         if (instance == null) {
     *             instance = new DbSingleton();
     *         }
     *         return instance;
     *
     * Instead, we implement a double-check locking mechanism. We only acquire the
     * lock via synchronised if the instance is null, i.e. the first time we instantiate the
     * singleton. We can see that is already much more efficient than requiring the lock each
     * time getInstance is called.
     */
    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
