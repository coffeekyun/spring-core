package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanChangeNameConfiguration {

    @Primary
    @Bean(name = "characterAnimeOne") // kita bisa mengubah nama bean, karena defaultnya adalah mengguankan nama method, disini kita bisa menggubahnya
    public CharacterAnime characterAnime1() {
        return new CharacterAnime();
    }

    @Bean(name = "characterAnimeTwo") // mengubah nama bean
    public CharacterAnime characterAnime2() {
        return new CharacterAnime();
    }
}
