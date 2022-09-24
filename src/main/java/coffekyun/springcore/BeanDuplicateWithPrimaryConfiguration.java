package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanDuplicateWithPrimaryConfiguration {

    @Primary // nah disini jika tidak disebutkan secara eksplisit nama beannya maka secara default dia akan mengguankan bean yang diberi annotation @Primary
    @Bean
    public CharacterAnime characterAnime1() {
        return new CharacterAnime();
    }

    @Bean
    public CharacterAnime characterAnime2() {
        return new CharacterAnime();
    }
}
