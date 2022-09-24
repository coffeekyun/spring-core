package coffekyun.springcore.inheritence;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class MerchantServiceImpl implements MerchantService{
    // bean bisa di akses dengan menggunakan parentny, disini dinamakan inheritence bean
    @Override
    public Foo sayHello() {
        log.info("call method say hello");
        return new Foo();
    }

    @Override
    public List<Foo> sayHii() {
        return List.of();
    }
}
