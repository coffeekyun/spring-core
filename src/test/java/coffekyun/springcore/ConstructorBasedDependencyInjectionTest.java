package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inconstructor.ComponentScanConfiguration;
import coffekyun.springcore.dependencyinjection.inconstructor.repository.ProductRepository;
import coffekyun.springcore.dependencyinjection.inconstructor.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorBasedDependencyInjectionTest {

    @Test
    void testConstructorDependencyInjection() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);

        ProductService productService =  configurableApplicationContext.getBean(ProductService.class);
        ProductRepository productRepository = configurableApplicationContext.getBean(ProductRepository.class);

        Assertions.assertEquals(productRepository, productService.getProductRepository());

        productService.getHiiEhe();

    }
}
