package coffekyun.springcore.dependencyinjection.infield;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter // abaikan cuma buat helperr ajaaahh
    @Autowired // field injectionsudah tidak direkomendasikan kalau bisa coba pakai constructor injection(hanya bisa satu), atau setter injection(bisa banyak)
    private CustomerRepository customerRepository;
}
