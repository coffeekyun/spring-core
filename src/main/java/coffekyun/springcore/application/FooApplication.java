package coffekyun.springcore.application;

import coffekyun.springcore.dependencyinjection.inbean.Bar;
import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // berisi auto configuration dll untuk konfigurasi container bean secara otomatis
public class FooApplication { // bagaimana cara testnya ?, kita bisa mengguankan @SpringBootTest(classess = MainApplicationTest.class)

    @Bean
    public Foo foo() {
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext foo = SpringApplication.run(FooApplication.class, args);// spring applllication sigunakan untuk membuat application context baru

        Foo fooBean = foo.getBean(Foo.class);
        System.out.println(fooBean);


    }
    // bagaimana jikakita ingin melakukan kostumisasi pada Spring application, seperti mematikan banner dll?, kita bisa membuat
    // object batu sari split application! >/< begini caranya

//    public static void main(String[] args) {
//        SpringApplication applicationContext = new SpringApplication(FooApplication.class);
//
//
//        // misal kita mau off kan banner
//        applicationContext.setBannerMode(Banner.Mode.OFF);
//
//        ConfigurableApplicationContext configurableApplicationContext = applicationContext.run();
//        Foo foo = configurableApplicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
}
