package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class BeanDependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("create foo");    // jadi pembuatan bean itu di eksekusi dari atas ke bawah, jika kita ingin membuat sebuah bean dibuat sebelum bean lainnya
        return new Foo();           // atau bean yang kita tentukan kita bisa menggunakan @BependsOn({nameBean yang ingin di dahulukan di bean lain})
    }

    @Bean
    public Bar bar() {
        log.info("create bar");
        return new Bar();
    }

}
