package coffekyun.springcore.eventlistener.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private User user;
    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
