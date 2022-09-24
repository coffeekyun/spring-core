package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import coffekyun.springcore.importconfiguration.MainConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    @Test
    void testImportConfiguration() {

        ConfigurableApplicationContext configurableApplicationContext
                = new AnnotationConfigApplicationContext(MainConfiguration.class);

        Foo foo = configurableApplicationContext.getBean(Foo.class);
        Bar bar = configurableApplicationContext.getBean(Bar.class);

        configurableApplicationContext.close();
    }
}
