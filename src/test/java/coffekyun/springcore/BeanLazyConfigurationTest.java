package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLazyConfigurationTest {

    @Test
    void testBean() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanLazyConfiguration.class);

        // disini dia akan create bar saja , foo baru akan di eksekusi ketika bean di ambil

    }

    @Test
    void testLazyBean() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanLazyConfiguration.class);


        Foo foo = applicationContext.getBean(Foo.class);// nah disini foo baru akan dibuat

    }

}
