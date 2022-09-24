package coffekyun.springcore.factorybean.client;

import org.springframework.context.annotation.Import;

@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryBeanConfiguration {
}
