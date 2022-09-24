package coffekyun.springcore;

import coffekyun.springcore.ioc.Anime;
import coffekyun.springcore.ioc.AnimeSolImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Anime anime() { // method akan menjadi nama bean
        log.info("create object animeSolImpl");
        Anime anime = new AnimeSolImpl();
        return anime;
    }
}
