package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.DependencyInjectionQualifierConfiguration;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import coffekyun.springcore.dependencyinjection.inbean.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionQualifierTest {

    @Test
    void testDependencyInjectionQualifier() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(DependencyInjectionQualifierConfiguration.class);

        Foo fooOne = applicationContext.getBean(Foo.class); // akan menambil @primary Foo
        Foo fooTwo = applicationContext.getBean("fooTwo", Foo.class); // akan di ambil yang ada @Qualifier alih-alih @Primary
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(fooTwo, fooBar.getFoo());
        Assertions.assertNotSame(fooOne, fooBar.getFoo());

    }
}
