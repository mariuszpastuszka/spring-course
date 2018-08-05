package pl.mpas;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("name")
    private String name;

    @Value("${surname}")
    private String surname;

    public void introduceYourself() {
        System.out.println(String.format("I'm %s %s", name, surname));
    }
}
