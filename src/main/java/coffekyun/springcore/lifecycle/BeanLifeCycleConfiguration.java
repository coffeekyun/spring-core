package coffekyun.springcore.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// adalah proses ketika kita ingin berkomunikasi dengan bean ketika suatu bean akan dibuat(sudah siap) atau akan di hancurkan(destroy)
// jika sebelum(selesai dibuat tapi belum di beritahukan ke bean) kita bisa menggunakan implements InitializingBean
// jika sesudah(akan di hancurkan atau di close) kita bisa menggunakan DisposableBean

// ada 3 cara untuk melakukan integrasi dengan life cycle bean , yang kita prakterkkan saat ini adalah cara manual
// cara pertama implement InitializingBean dan DisposableBean (digunakan ketika kita punya akses ke class yang digunakan di life cycle)
// cara kedua ketika melakukan registrasi @Bean(initMehod = "nama init method" , destroyMethod = "nama destroy method") (digunakan ketika kita tidak memiliki akses ke class yang akan di masukan ke life cycle, misal dari library orang lain)
// ketiga menggunakan @PostConstucut (sebelum) dan @PreDestroy (sesudah) (digunakan ketika kita punya akses ke classnya ,dalam artian akses mengubah dan menulis)

// untuk contoh pengguaknnya lebih lengkapnya bisa lihat di Server dan BeanLifeCycleConfiguration

@Configuration
public class BeanLifeCycleConfiguration {

    @Bean
    public Connection connection() { // opsi ke 1 integrasi dengan bean life cycle, Connection akan implement InitializingBean dan DisposableBean
        return new Connection();
    }

    @Primary // ini tidak masuk yaa, ini karena redundant dengan bean line 21 dia di anggap bean yang sama
    @Bean(initMethod = "start", destroyMethod = "destroy") // opsi ke 2 integrasi dengan bean life cycle
    public Server server() {
        return new Server();
    }

    @Bean() // ini adalah cara ketiga yaitu cukup tambahkan annotation @PostConstruct dan @PreDestroy di method classnya yang akan digunakan sebagai intergrasi life cycle
    public Server server3() { // bean akan secara otomatis mengenali, karena kita sudah registrasikan dia di Server.class, dan menentukan @PostCOnstruct dan @PreDestroynya
        return new Server();
    }
}
