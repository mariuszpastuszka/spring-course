package pl.mpas.address;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    @Bean
    @Qualifier("first")
    public Address myFirstAddress() {
        return new Address("Warsaw", "wil", 15);
    }

    @Bean
    @Qualifier("second")
    public Address mySecondAddress() {
        return new Address("Gdansk", "adaf", 77);
    }
}
