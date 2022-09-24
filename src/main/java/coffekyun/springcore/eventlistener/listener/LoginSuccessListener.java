package coffekyun.springcore.eventlistener.listener;

import coffekyun.springcore.eventlistener.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    // cara manual, cuma bisa satu listener per class, lihat LoginUserFailedListener untuk melihat yang otomatis menggunakan annotation
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("success login from user {}",  event.getUser().getUsername());
    }
}
