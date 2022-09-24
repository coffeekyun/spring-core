package coffekyun.springcore.inheritence;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        MerchantServiceImpl.class
})
public class InheritenceConfiguration {
}
