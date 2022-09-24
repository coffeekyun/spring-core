package coffekyun.springcore;

import coffekyun.springcore.data.CharacterAnime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDuplicateConfiguration {
    // yang di maksud duplicate disini adalah tipe return objectnya (bean) di container spring
    // secara otomatis nama method akan menjadi nama bean
    @Bean
   public CharacterAnime characterAnime1() {
       return new CharacterAnime();
   }

    @Bean
    public CharacterAnime characterAnime2() {
        return new CharacterAnime();
    }

}
