package coffekyun.springcore.factorybean.client;

// misalkan ini adalah end point api miliki third party, bagaimana cara kita membuat bean dari class ini?
// ada dua opsi yang bisa kita lakukan, pertama mengguankan @Bean
// kedua mengguakan component dan di wrap menjadi satu dan implement FactoryBean

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

// disini kita bisa melakukan dependency injection dll, dan hal hal  yang bisa kita lakukan lainnya di component bisa kita lakukan disini
@Component(value = "paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> { // harus implement factory bean
    @Override
    public PaymentGatewayClient getObject() throws Exception { // ini(PaymentGatewayClient) secara otomatis akan di kemballikan menjadi beannya

        // disini kita bisa melakukan dependency injection dll, dan hal hal  yang bisa kita lakukan lainnya di component bisa kita lakukan disini

        // buat object third partynya misal
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndPoint("https://coffe/kyun");
        paymentGatewayClient.setPublicKey("public");
        paymentGatewayClient.setPrivateKey("private");
        return paymentGatewayClient;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }


}
