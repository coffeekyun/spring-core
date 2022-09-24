package coffekyun.springcore.optionaldependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

// nah disini jika nullatau tidak ada atau bersifat optional untuk dependency yang dibutuhkan dia tidak akan error
// di sini ObjectProvider<T> bisa mengambil > 1 bean, atau secara otomatis load banyak bean, tapi di cek nilainya adal apa engga,
// sudah tidak direkomendasikan
@Import(value = {
        CategoryRepository.class
})

@ComponentScan(basePackages = {
        "coffekyun.springcore.optionaldependency"
})
public class ObjectProviderConfiguration {



}
