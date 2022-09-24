package coffekyun.springcore.dependencyinjection.inconstructor.service;

import coffekyun.springcore.dependencyinjection.inconstructor.repository.ProductRepository;
import lombok.Getter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductService {

    @Getter // cuma buat ngetes doang (nyamaiin dari repo dan dari service)
    private ProductRepository productRepository;

    @Autowired // digunakan agar constructor ini auto dipilih alih alih konstructor kedua, karena menyebabkan error, di di constructor cuma bisa 1
    public ProductService(ProductRepository productRepository) { // otomatis akan mencari Product repository dan menginjectnya kedalam constructor
        this.productRepository = productRepository;             // akan tetapi hanya bisa menggnakan satu constructor saja disini
    }

    // bagaimana jika kita meregistrasikan dua buah constructor

    public ProductService(ProductRepository productRepository, String hello) { // akan error karena rule pertama tadi
        this.productRepository = productRepository;             // kita bisa memilih salah satu tapi harus menggunakan annotation @AutoWired
    }

    public void getHiiEhe() {
        log.info("call get hii ehee");
        productRepository.getHello();
    }
}
