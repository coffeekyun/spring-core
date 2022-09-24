package coffekyun.springcore.optionaldependency;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// nah disini jika nullatau tidak ada atau bersifat optional untuk dependency yang dibutuhkan dia tidak akan error
// di sini ObjectProvider<T> bisa mengambil > 1 bean dengan tipe yang sama, atau secara otomatis load banyak bean, tapi di cek nilainya adal apa engga,
// jika hanya butuh 1 gunakan optional instead ObjectProvider
@Configuration
public class CategoryRepository {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }

}
