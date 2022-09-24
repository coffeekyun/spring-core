package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanChangeNameTest {

    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp() {
        applicationContext =
                new AnnotationConfigApplicationContext(BeanChangeNameConfiguration.class);
    }

    @Test
    void testChangeNameBean() {

        CharacterAnime characterAnime = applicationContext.getBean(CharacterAnime.class);
        CharacterAnime characterAnime1 = applicationContext.getBean("characterAnimeOne", CharacterAnime.class);
        CharacterAnime characterAnime2 = applicationContext.getBean("characterAnimeTwo", CharacterAnime.class);

        Assertions.assertSame(characterAnime, characterAnime1);
        Assertions.assertNotSame(characterAnime, characterAnime2);
        Assertions.assertNotSame(characterAnime1, characterAnime2);
    }
}
