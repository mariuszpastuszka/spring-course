package pl.mpas.vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("olaf")
    Owner makeOwner() {
        return new Owner("Olaf");
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("szkop")
    Owner makeSecondOwner() {
        return new Owner("Harald");
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

    @Bean
    @Qualifier("93")
    public Vehicle makeAnotherSaab(@Qualifier("szkop") Owner owner) {
        return new Saab(owner);
    }
}
