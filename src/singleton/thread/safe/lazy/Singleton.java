package singleton.thread.safe.lazy;

/**
 * Double locking mechanism version of singleton.
 */
public class Singleton {

    // volatile prevents cache incoherence issues.
    private static volatile Singleton instance;

    private Singleton() {
    }

    /*
     * Could make the method synchronised, but this is a performance hit:
     *
     *     public static synchronized Singleton getInstance() {
     *         if (instance == null) {
     *             instance = new Singleton();
     *         }
     *         return instance;
     *
     * Instead, we implement a double-check locking mechanism. We only acquire the
     * lock via synchronised if the instance is null, i.e. the first time we instantiate the
     * singleton. We can see that is already much more efficient than requiring the lock each
     * time getInstance is called.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
