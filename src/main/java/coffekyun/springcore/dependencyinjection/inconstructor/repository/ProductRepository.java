package coffekyun.springcore.dependencyinjection.inconstructor.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductRepository {

    public void getHello() {
        log.info("call hello from repository");
    }

}
