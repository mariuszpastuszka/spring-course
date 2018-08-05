package pl.mpas;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${name:nie-ma}")
    private String name;

    @Value("${surname}")
    private String surname;

    @Value("${my-city}")
    private String myCity;

    public void introduceYourself() {
        System.out.println(String.format("I'm %s %s", name, surname));
        System.out.println("I'm from " + myCity);
    }
}
