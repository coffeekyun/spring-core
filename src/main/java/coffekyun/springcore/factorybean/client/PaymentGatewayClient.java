package coffekyun.springcore.factorybean.client;

import lombok.Data;
// misalkan ini adalah end point api miliki third party, bagaimana cara kita membuat bean dari class ini?
// ada dua opsi yang bisa kita lakukan, pertama mengguankan @Bean
// kedua mengguakan component dan di wrap menjadi satu dan implement FactoryBean
@Data
public class PaymentGatewayClient {

    private String endPoint;

    private String publicKey;

    private String privateKey;


}
