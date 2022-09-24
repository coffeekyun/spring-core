package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.infield.CustomerRepository;
import coffekyun.springcore.dependencyinjection.infield.CustomerService;
import coffekyun.springcore.dependencyinjection.infield.FieldDependencyInjectionConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldDependencyInjectionTest {
    @Test
    void testFieldDependencyInjection() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(FieldDependencyInjectionConfiguration.class);

        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

        Assertions.assertSame(customerRepository, customerService.getCustomerRepository());

    }
}
