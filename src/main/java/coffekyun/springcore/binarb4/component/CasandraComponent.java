package coffekyun.springcore.binarb4.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class CasandraComponent {
    String casandraConfig;
}
