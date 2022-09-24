package coffekyun.springcore.lifecycle;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

    // lebih baik menggunakan void sebagai return value karena bean life cycle tidak bisa menangkap return

    @PostConstruct
    public void start() {
        log.info("start application server");
    }

    @PreDestroy
    public void destroy() {
        log.info("close application server");
    }
}
