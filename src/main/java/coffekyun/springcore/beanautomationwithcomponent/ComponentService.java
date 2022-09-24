package coffekyun.springcore.beanautomationwithcomponent;

import org.springframework.stereotype.Component;

@Component   // class ini akan otomatis di registrasikan sebagai bean, tanpa harus menggunakan @Bean, akan tetapi dia tidak boleh ada duplicate bean(return object yang sama)
// nama class akan otomatis menjadi nama Bean , akanteteapi menjadi camel case ComponentScan -> componentScan
public class ComponentService {
    // class ini akan menjadi bean, hanya satu bean

    public String hello() {
        return "Hello kaguya shinomiya";
    }
}
