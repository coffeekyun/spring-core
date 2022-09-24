package coffekyun.springcore.eventlistener.publisher;

import coffekyun.springcore.eventlistener.event.LoginSuccessEvent;
import coffekyun.springcore.eventlistener.event.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class LoginUserPublisherService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Boolean onLoginUser(String username, String password) {
        if (isLoginUser(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            return false;
        }
    }

    private boolean isLoginUser(String username, String password) {
        return "kaguya".equals(username) && "kaguya".equals(password);
    }
}
