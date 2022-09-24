package coffekyun.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testCreateApplicationContext() {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class, NonNonConfiguration.class);

        Assertions.assertNotNull(context);

    }
}
