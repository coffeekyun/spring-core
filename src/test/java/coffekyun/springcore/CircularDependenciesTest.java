package coffekyun.springcore;

import coffekyun.springcore.circulardependencies.BeanCircularConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependenciesTest {

    @Test
    void testCircularDependency() {

        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(BeanCircularConfiguration.class);
        });

    }
}
