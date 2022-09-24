package coffekyun.springcore.application;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    @Autowired // akan otomatis di inject oleh springboot application
    Foo foo;

    @Test
    void testSpringBootApplication() {
        Assertions.assertNotNull(foo);
    }
}