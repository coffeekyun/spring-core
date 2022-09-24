package coffekyun.springcore.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Member {

    @Bean
    public Member memberNormalRepository() {
        return new Member();
    }

    @Bean
    public Member memberPremiumRepository() {
        return new Member();
    }
}
