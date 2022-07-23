package singleton;

import singleton.not.thread.safe.eager.DbSingleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance =  DbSingleton.getInstance();
        DbSingleton instance2 =  DbSingleton.getInstance();

        System.out.println(instance == instance2);

    }
}
