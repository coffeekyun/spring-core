package coffekyun.springcore.dependencyinjection.infield;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {
        "coffekyun.springcore.dependencyinjection.infield"
})
public class FieldDependencyInjectionConfiguration {
}
