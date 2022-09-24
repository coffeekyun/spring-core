package coffekyun.springcore.dependencyinjection.inbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) { // cara melakukan dependency injection , secara otomatis akan mencarikan bean yang cocok
        return new FooBar(foo, bar);         // dan secara otomatis akan di inject(masukan) keadalam parameter yang ada
    }

}
