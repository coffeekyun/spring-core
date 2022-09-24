package coffekyun.springcore.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// adalah proses ketika kita ingin berkomunikasi dengan bean ketika suatu bean akan dibuat(sudah siap) atau akan di hancurkan(destroy)
// jika sebelum(selesai dibuat tapi belum di beritahukan ke bean) kita bisa menggunakan implements InitializingBean
// jika sesudah(akan di hancurkan atau di close) kita bisa menggunakan DisposableBean

// ada 3 cara untuk melakukan integrasi dengan life cycle bean , yang kita prakterkkan saat ini adalah cara manual
// cara pertama implement InitializingBean dan DisposableBean (digunakan ketika kita punya akses ke class yang digunakan di life cycle)
// cara kedua ketika melakukan registrasi @Bean(initMehod = "nama init method" , destroyMethod = "nama destroy method") (digunakan ketika kita tidak memiliki akses ke class yang akan di masukan ke life cycle, misal dari library orang lain)
// ketiga menggunakan @PostConstucut (sebelum) dan @PreDestroy (sesudah) (digunakan ketika kita punya akses ke classnya ,dalam artian akses mengubah dan menulis)

// untuk contoh pengguaknnya lebih lengkapnya bisa lihat di Server dan BeanLifeCycleConfiguration
@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception { // ini disebut callback method
        // do something , before bean registered
        log.info("Connection is already to used");
    }

    @Override
    public void destroy() throws Exception {
        // do something before bean closed
        log.info("Connection is already closed");
    }
}
