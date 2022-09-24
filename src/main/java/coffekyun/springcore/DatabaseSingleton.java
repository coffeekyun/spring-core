package coffekyun.springcore;

public class DatabaseSingleton {

    private static DatabaseSingleton databaseSingleton;

    public static DatabaseSingleton getInstance() {
        if (databaseSingleton == null) {
            databaseSingleton = new DatabaseSingleton();
        }
        return databaseSingleton;
    }

    private DatabaseSingleton() {

    }
}
