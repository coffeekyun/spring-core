package coffekyun.springcore;

import coffekyun.springcore.beanautomationwithcomponent.ComponentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    @Test
    void testComponent() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(ComponentServiceConfiguration.class);


        Assertions.assertNotNull(configurableApplicationContext);

        configurableApplicationContext.close();
    }

    @Test
    void testComponentCall() {
        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(ComponentServiceConfiguration.class);

        ComponentService componentService = configurableApplicationContext.getBean(ComponentService.class);
        String hello = componentService.hello();

        Assertions.assertEquals("Hello kaguya shinomiya", hello);

        //test singleton
        ComponentService componentService2 = configurableApplicationContext.getBean(ComponentService.class);
        Assertions.assertSame(componentService, componentService2);

    }
}
