package coffekyun.springcore.circulardependencies;

import coffekyun.springcore.circulardependencies.CyclicA;
import coffekyun.springcore.circulardependencies.CyclicB;
import coffekyun.springcore.circulardependencies.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCircularConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) { // ini adalah kondisi circular dependencies dimana A depand ke B , B depand ke C dan C depand ke A
        return new CyclicC(cyclicA);          // akan menyebabkan error , jika A -> B , B -> C, C -> A
    }

}
