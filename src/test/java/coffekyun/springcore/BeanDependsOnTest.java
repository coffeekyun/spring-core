package coffekyun.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDependsOnTest {

    @Test
    void testDependsOn() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanDependsOnConfiguration.class);

    }
}
