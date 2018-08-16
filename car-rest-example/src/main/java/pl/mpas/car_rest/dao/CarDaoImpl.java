package pl.mpas.car_rest.dao;

import org.springframework.stereotype.Repository;
import pl.mpas.car_rest.domain.Car;
import pl.mpas.car_rest.domain.Owner;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final Owner owner = new Owner("Mariusz", "P");

    @Override
    public List<Car> getCars() {
        return Arrays.asList(new Car("93", "Saab", Year.of(2000), owner),
                new Car("95", "Saab", Year.of(1999), owner),
                new Car("911", "Porshe", Year.of(2005), owner));
    }
}
