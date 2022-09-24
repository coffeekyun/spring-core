package coffekyun.springcore.inheritence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MerchantControllerImpl {

    @Autowired
    private MerchantService merchantService;


}
