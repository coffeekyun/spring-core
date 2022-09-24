package coffekyun.springcore;

import coffekyun.springcore.dependencyinjection.inbean.Foo;
import coffekyun.springcore.dependencyinjection.inbean.FooBar;
import coffekyun.springcore.optionaldependency.CategoryRepository;
import coffekyun.springcore.optionaldependency.CategoryService;
import coffekyun.springcore.optionaldependency.ObjectProviderConfiguration;
import coffekyun.springcore.optionaldependency.OptionalConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalAndObjectProviderDITestConfiguration {

    @Test
    void testOptionalDI() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(OptionalConfiguration.class);

        Foo foo = configurableApplicationContext.getBean(Foo.class);

        FooBar fooBar = configurableApplicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo()); // nah jadi dia tidak akan error karena mengguakna optional, walaupun tidak ada di untuk Bar

    }

    @Test
    void testObjectProviderDI() {

        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);

        // cek apakah benar ObjectProvider<T> load 3 bean

        CategoryService categoryService = configurableApplicationContext.getBean(CategoryService.class);

        Assertions.assertSame(4, categoryService.getFoos().size());

    }
}
