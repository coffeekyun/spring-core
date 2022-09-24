package coffekyun.springcore.importconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
    // empty,
    // ini adalah class main untuk menampung configuration dari foo dan bar .class
    // jadi saat kita membuat aplikasi tidak mungkin kita akan menumpuknya di dalam satu buah konfiguration saja
    // kita bisa split dia ke dalambeberapa konfiguration lalu load di class configuration utamanya dengan mengguankan import
    // saat membuat ApplcitaionContextnyacukup menggunakan MainConfiguration.class saja

    // akan tetapi jika terlalu banyak ini tidak akan menyenangkan, kita bisa menggunakan @ComponentScan untuk cara yang kedua(direkomendasikan)
    // untuk melihatnya kamu bisa melihat ComponentScanConfiguration.class, dan package configuration
}
