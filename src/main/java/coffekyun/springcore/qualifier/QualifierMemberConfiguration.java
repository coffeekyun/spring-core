package coffekyun.springcore.qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "coffekyun.springcore.qualifier"
})
public class QualifierMemberConfiguration {
}
