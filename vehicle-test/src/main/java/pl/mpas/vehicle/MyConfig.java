package pl.mpas.vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    Owner makeOwner() {
        return new Owner("Olaf");
    }

    @Bean
    public Vehicle maluch() {
        return new Maluch(makeOwner());
    }

    @Bean
    public Vehicle makeBmw() {
        return new BMW(makeOwner());
    }

    @Bean
    public Vehicle makeSaab() {
        return new Saab(makeOwner());
    }
}
