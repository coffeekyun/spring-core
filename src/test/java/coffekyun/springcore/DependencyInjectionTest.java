package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.DependencyInjectionConfiguration;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import coffekyun.springcore.dependencyinjection.inbean.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    @Test
    void testWithDependencyInjection() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

        Foo foo = applicationContext.getBean("foo", Foo.class);
        Bar bar = applicationContext.getBean("bar", Bar.class);
        // disini kita melakukan dependency injection
        FooBar fooBar = applicationContext.getBean("fooBar", FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

    }

    @Test
    void testWithoutDepencencyInjection() {

        Foo foo = new Foo();
        Bar bar = new Bar();

        FooBar fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
