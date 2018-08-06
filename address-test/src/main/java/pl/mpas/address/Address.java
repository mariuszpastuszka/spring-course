package pl.mpas.address;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Address {
    @Value("${mieszkam}")
    private String city;

    @Value("${przy-ulicy}")
    private String street;

    @Value("${number}")
    private int flatNumber;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
