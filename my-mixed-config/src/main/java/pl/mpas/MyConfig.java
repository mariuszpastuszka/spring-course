package pl.mpas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource({"/strings.properties", "/my-values.properties"})
public class MyConfig {
}
