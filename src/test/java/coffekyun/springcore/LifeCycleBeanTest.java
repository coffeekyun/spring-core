package coffekyun.springcore;

import coffekyun.springcore.lifecycle.BeanLifeCycleConfiguration;
import coffekyun.springcore.lifecycle.Connection;
import coffekyun.springcore.lifecycle.Server;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleBeanTest {


    @Test
    void testLifeCycleFirstWay() {
        // menggunakan implementasi InitializeBean dan DisposableBean di Connection.class
        ApplicationContext applicationContext = 
                new AnnotationConfigApplicationContext(BeanLifeCycleConfiguration.class);

        Connection conection = applicationContext.getBean(Connection.class); // maka dia akan trigger otomatis method  afterPropertiesSet() sebelum bean di set
    }

    @Test
    void testLifeCycleCloseFirstWay() {

        // kita bisa menggunakan turunan dari Application context yaitu
        ConfigurableApplicationContext configurableApplicationContext =
                new AnnotationConfigApplicationContext(BeanLifeCycleConfiguration.class);
        // configurableApplicationContext.registerShutdownHook(); // digunakan untuk close otomatis

        Connection conection = configurableApplicationContext.getBean(Connection.class); // menggunakan implementasi InitializeBean dan DisposableBean

        configurableApplicationContext.close();  // maka sebelum ini di close dia akan memberi tahu si method destroy() untuk di eksekusi
    }

    @Test
    void testLifeCycleSecondWay() {
        // menggunakan initMethod dan destroyMethod di @Bean(initMethod = "" , destroyMethod="")
        ConfigurableApplicationContext configurableApplicationContext
                = new AnnotationConfigApplicationContext(BeanLifeCycleConfiguration.class);

        Server server = configurableApplicationContext.getBean(Server.class);

        configurableApplicationContext.close();

    }
    @Test
    void testLifeCycleThirdWay() {
        // megguakan annotatin @PostConstruct dan @PreDestroy akan secara otomatis di integrasikan dengan life cycle ketika kita meregistrasikan bean
        // abaikan penggunakan nama bean saat get karena ada redundansi di saat konfigurasi(oot materi)
        ConfigurableApplicationContext configurableApplicationContext
                = new AnnotationConfigApplicationContext(BeanLifeCycleConfiguration.class);

        Server server = configurableApplicationContext.getBean("server3", Server.class);

        configurableApplicationContext.close();

    }

}
