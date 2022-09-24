package coffekyun.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    // secara default ketika spring membuat object dia akan menjadi object singleton

    @Test
    void testSingleton() {

        DatabaseSingleton databaseSingleton1 = DatabaseSingleton.getInstance(); // akan merupakan object yang sama
        DatabaseSingleton databaseSingleton2 = DatabaseSingleton.getInstance(); // akan merupakan object yang sama dengan database sington1

        Assertions.assertSame(databaseSingleton1, databaseSingleton2);

    }
}
