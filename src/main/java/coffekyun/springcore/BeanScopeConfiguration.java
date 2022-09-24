package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class BeanScopeConfiguration {

    @Bean
    @Scope("prototype") // scope adalah strategi bagaimana pembuatan object dibuat, defaultnya adalah singleton, masih banyak scope lainnya
    public Foo foo() {  // prototype akan membuatnya menjadi tidak singleton
        log.info("crete foo");
        return new Foo();
    }
}
