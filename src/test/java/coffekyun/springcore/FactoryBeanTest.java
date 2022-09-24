package coffekyun.springcore;

import coffekyun.springcore.factorybean.client.FactoryBeanConfiguration;
import coffekyun.springcore.factorybean.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {

    @Test
    void testFactoryBean() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);


        PaymentGatewayClient  paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayClient);

        Assertions.assertSame("https://coffe/kyun", paymentGatewayClient.getEndPoint());
        Assertions.assertSame("public", paymentGatewayClient.getPublicKey());
        Assertions.assertSame("private", paymentGatewayClient.getPrivateKey());

    }
}
