package coffekyun.springcore.eventlistener.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginAgainSuccessEvent extends ApplicationEvent {

    @Getter
    private User user;
    public LoginAgainSuccessEvent(User user) {
        super(user);
        this.user = user;
    }

}
