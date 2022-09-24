package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.insettermethod.SetterDependencyInjectionConfiguration;
import coffekyun.springcore.dependencyinjection.insettermethod.repository.AnimeRepository;
import coffekyun.springcore.dependencyinjection.insettermethod.repository.UserRepository;
import coffekyun.springcore.dependencyinjection.insettermethod.service.AnimeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterDependencyInjectionTest {
    @Test
    void testSetterDependencyInjection() {

        ConfigurableApplicationContext applicationContextTest =
                new AnnotationConfigApplicationContext(SetterDependencyInjectionConfiguration.class);

        AnimeService animeService = applicationContextTest.getBean(AnimeService.class);
        AnimeRepository animeRepository = applicationContextTest.getBean(AnimeRepository.class);
        UserRepository userRepository = applicationContextTest.getBean(UserRepository.class);

        Assertions.assertSame(animeRepository, animeService.getAnimeRepository());

        Assertions.assertSame(userRepository, animeService.getUserRepository());
    }
}
