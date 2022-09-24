package coffekyun.springcore.optionaldependency;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


// nah disini jika nullatau tidak ada atau bersifat optional untuk dependency yang dibutuhkan dia tidak akan error
// di sini ObjectProvider<T> bisa mengambil > 1 bean dengan tipe yang sama, atau secara otomatis load banyak bean, tapi di cek nilainya adal apa engga,
// jika hanya butuh 1 gunakan optional instead ObjectProvider
@Component
public class CategoryService {

    @Getter // jangan hiraukan cuma helper, nah bisa ambil > 1
    private List<Foo> foos;

    public CategoryService(ObjectProvider<Foo> foo) {
        foos = foo.stream() // secara otomatis dia akakn dipilih  yang ada sjaa
                .collect(Collectors.toList());
    }
}
