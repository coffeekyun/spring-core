package coffekyun.springcore.dependencyinjection.inbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionQualifierConfiguration {

    @Primary
    @Bean
    public Foo fooOne() { // dua bean yang sama
        return new Foo();
    }

    @Bean
    public Foo fooTwo() { // dengan ini
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean                                    // sekarang maalahnya bagaimana jika kita memiliki bean(object yang mengembalikan Object yang sama)
    public FooBar fooBar(@Qualifier("fooTwo") Foo foo, Bar bar) { // kita bisa menggunakan @Primary dia akan mengambil bean pertama , tapi bagiman jika kita tidak mau menggunakan @Primary bean ?
        return new FooBar(foo, bar);         // nah disini kita bisa menggunakan @Qualifier("nama bean") untuk secara eksplisit menyebuatkan nama bean yang harus di load
    }

}
