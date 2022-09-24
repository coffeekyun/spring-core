package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDuplicateConfigurationTest {

    @Test
    void testDuplicateBeanFailed() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        //CharacterAnime character = applicationContext.getBean(CharacterAnime.class); // akan error karena tidak spesifik menyeburkan nama beannya
                                                                                     // karena dia mempunyai 2 buah bean dengan return yang sama di registreasi beannya
    }

    @Test
    void testGetBeanDuplicate() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanDuplicateConfiguration.class);

        CharacterAnime characterAnime1 = applicationContext.getBean("characterAnime1", CharacterAnime.class);
        CharacterAnime characterAnime2 = applicationContext.getBean("characterAnime2", CharacterAnime.class);

        Assertions.assertNotSame(characterAnime1, characterAnime2); // dia tidak akan singleton karena merupakan bean yang berbeda, akan tetapi punya return sama
    }
}
