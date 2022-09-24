package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTest {

    @Test
    void testCreateScope() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);

        Foo foo1 = applicationContext.getBean(Foo.class); // akan membuat bean baru
        Foo foo2 = applicationContext.getBean(Foo.class); // akan membuat bean baru
        Foo foo3 = applicationContext.getBean(Foo.class); // akan membuat bean baru dalam artian ketiga bean tidak singleton

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);

    }
}
