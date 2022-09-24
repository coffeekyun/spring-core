package coffekyun.springcore.optionaldependency;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import coffekyun.springcore.dependencyinjection.inbean.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Optional;

// secara default dependency di bean adalah wajib,
// jika tidak ada maka akan menhasilkan error, nah spring bisa menggunakan Optional<T> jika datanya tidak wajib memiliki dependency(bisa null)
// agar tidak terjadi error
@Configuration
public class OptionalConfiguration {

    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> fooOptional, Optional<Bar> barOptional) { // nah misal dependency yang di butuuhkan nga ada dia tidak akan error
        return new FooBar(fooOptional.orElse(null), barOptional.orElse(null));
    }

}
