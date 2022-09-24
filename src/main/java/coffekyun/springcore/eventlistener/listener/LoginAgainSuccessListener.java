package coffekyun.springcore.eventlistener.listener;

import coffekyun.springcore.eventlistener.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    // cara manual, cuma bisa satu listener per class, lihat LoginUserFailedListener untuk melihat yang otomatis menggunakan annotation
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("login success again {}", event.getUser().getUsername());
    }
}
