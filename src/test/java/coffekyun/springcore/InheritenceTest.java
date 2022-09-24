package coffekyun.springcore;

import coffekyun.springcore.inheritence.InheritenceConfiguration;
import coffekyun.springcore.inheritence.MerchantService;
import coffekyun.springcore.inheritence.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritenceTest {

    @Test
    void testInheritence() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(InheritenceConfiguration.class);


        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

        // dia akan sama saja di ambil dari mana saja bisa, akan tetapi biasanya kita akan ambil dari interfacenya
        Assertions.assertSame(merchantService, merchantServiceImpl);

        System.out.println(merchantService.sayHello());

    }
}
