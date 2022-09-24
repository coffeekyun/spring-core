package coffekyun.springcore.eventlistener.listener;

import coffekyun.springcore.eventlistener.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginUserListener {
    // nah disini kita bisa membuat banyak listener, dengan bermacam tipe event

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginEvent1(LoginSuccessEvent loginSuccessEvent) {
        log.info("success login {}", loginSuccessEvent.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginEvent2(LoginSuccessEvent loginSuccessEvent) {
        log.info("success login {}", loginSuccessEvent.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginEvent3(LoginSuccessEvent loginSuccessEvent) {
        log.info("success login {}", loginSuccessEvent.getUser());
    }


}
