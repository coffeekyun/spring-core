package coffekyun.springcore.eventlistener;

import coffekyun.springcore.eventlistener.listener.LoginAgainSuccessListener;
import coffekyun.springcore.eventlistener.listener.LoginSuccessListener;
import coffekyun.springcore.eventlistener.listener.LoginUserListener;
import coffekyun.springcore.eventlistener.publisher.LoginUserPublisherService;
import org.springframework.context.annotation.Import;

@Import(value = {
        LoginSuccessListener.class,
        LoginUserPublisherService.class,
        LoginAgainSuccessListener.class,
        LoginUserListener.class
})
public class EventListenerConfiguration {
}
