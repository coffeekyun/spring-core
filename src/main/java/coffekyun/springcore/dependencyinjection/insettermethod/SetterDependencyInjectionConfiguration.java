package coffekyun.springcore.dependencyinjection.insettermethod;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "coffekyun.springcore.dependencyinjection.insettermethod.repository",
        "coffekyun.springcore.dependencyinjection.insettermethod.service",
        "coffekyun.springcore.dependencyinjection.insettermethod.repository"
})
public class SetterDependencyInjectionConfiguration {

}
