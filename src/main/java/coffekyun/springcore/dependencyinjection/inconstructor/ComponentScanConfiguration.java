package coffekyun.springcore.dependencyinjection.inconstructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "coffekyun.springcore.dependencyinjection.inconstructor.repository",
        "coffekyun.springcore.dependencyinjection.inconstructor.service"
})
public class ComponentScanConfiguration {
}
