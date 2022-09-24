package coffekyun.springcore.qualifier;

import lombok.Getter;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// misal kita mempunyai dua buah bean dengan return yang sama(beanyang sama),
// maka kita bisa menggunakan qualifer jika ingin menggunakan kedua bean tersebut
@Component
public class MemberService {
    // kita bisa meggunakan @Qualifier untuk menentukan bean mana yang akan di inject
    // kita bisa inject di mana saja , misal di costructor, setter dan field dependency injection

    // kita bisa memilih bean yang mana yang ingin digunakan jika terjadi duplicate, menggunakan @Qualifier
    @Getter
    @Autowired
    @Qualifier("memberNormalRepository") // bgini cara set qualifernnya, dimana dia di dapatkan dari nama method
    Member memberNormalRepository;


    @Getter
    @Autowired
    @Qualifier("memberPremiumRepository")
    Member memberPremiumRepository;

}
