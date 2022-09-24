package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class BeanLazyConfiguration {

    @Lazy // artinya bean ini akan di buat ketika dibutuhkan saja tidak dibuat di awal ketika applikasi di nyalakan
    @Bean
    public Foo foo() {
        log.info("create foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("create bar");
        return new Bar();
    }
}
