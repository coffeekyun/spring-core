package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPrimaryConfigurationTest {

    @Test
    void testGetBean() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanDuplicateWithPrimaryConfiguration.class);

        CharacterAnime characterAnime = applicationContext.getBean(CharacterAnime.class); // secara otomatis akan menggauanakn characterAnime1, karena @Primary
        CharacterAnime characterAnime1 = applicationContext.getBean(CharacterAnime.class);
        CharacterAnime characterAnime2 = applicationContext.getBean("characterAnime2", CharacterAnime.class);

        Assertions.assertSame(characterAnime, characterAnime1);

        Assertions.assertNotSame(characterAnime, characterAnime2);
        Assertions.assertNotSame(characterAnime1, characterAnime2);
    }
}
