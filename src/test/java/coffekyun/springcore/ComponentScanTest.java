package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Test
    void testComponentScan() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);

        Foo foo = configurableApplicationContext.getBean(Foo.class);
        Bar bar = configurableApplicationContext.getBean(Bar.class);

        configurableApplicationContext.close();
    }
}
