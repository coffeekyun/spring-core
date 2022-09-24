package coffekyun.springcore;

import coffekyun.springcore.eventlistener.EventListenerConfiguration;
import coffekyun.springcore.eventlistener.publisher.LoginUserPublisherService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerTest {
    @Test
    void testEventListener() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(EventListenerConfiguration.class);

        configurableApplicationContext.registerShutdownHook();

        LoginUserPublisherService publisher = configurableApplicationContext.getBean(LoginUserPublisherService.class);

        publisher.onLoginUser("kaguya", "kaguya");
        publisher.onLoginUser("kaguya", "rem");
        publisher.onLoginUser("chihiro", "kaguya");

    }
}
