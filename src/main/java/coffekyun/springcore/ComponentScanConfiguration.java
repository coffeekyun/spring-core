package coffekyun.springcore;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "coffekyun.springcore.configuration" // bisa lebih dari satu dan inner(turunan package jika ada(akan ikut discan)), akan mendapatkan semua configurasi di package tersebut
})
public class ComponentScanConfiguration {
    // load konfigurasi yang ada di packagage configuration // cara kedua karena
    // mengguankan @Import tidak menyenangkan(lihat cara pertama di package importconfiguration)

    // ini akan meload semua konfigurasi di package tersebut
}
