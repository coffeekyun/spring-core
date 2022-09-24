package coffekyun.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimeAplicationContextApp {
    public static void main(String[] args) {

        // load spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrive bean from spring container
        Anime anime = context.getBean("animeSol", Anime.class);

        // close the context
        System.out.println(anime.get());

    }
}
