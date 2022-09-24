package coffekyun.springcore;

import coffekyun.springcore.ioc.AnimeRomanceImpl;
import coffekyun.springcore.ioc.AnimeSolImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTest {

    @Test
    void testCreateBeanConfiguration() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(applicationContext);

    }

    @Test
    void testCreateBean() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        AnimeSolImpl animesol1 = applicationContext.getBean(AnimeSolImpl.class); // akan merupakan singleton
        AnimeSolImpl animesol2 = applicationContext.getBean(AnimeSolImpl.class); // akan merupakan singleton

        Assertions.assertSame(animesol1, animesol2);

    }

    @Test
    void testCreateBeanAndCallMethod() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        AnimeSolImpl animesol = applicationContext.getBean(AnimeSolImpl.class); // akan merupakan singleton

        String sol = animesol.get();
        System.out.println(sol);


    }

    @Test
    void testCreateBeanFailed() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // karena belum di configurasi
        //AnimeRomanceImpl romance = applicationContext.getBean(AnimeRomanceImpl.class);


    }
}
