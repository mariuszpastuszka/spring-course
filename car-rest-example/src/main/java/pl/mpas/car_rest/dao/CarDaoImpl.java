package pl.mpas.car_rest.dao;

import org.springframework.stereotype.Repository;
import pl.mpas.car_rest.domain.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars() {
        return Arrays.asList(new Car());
    }
}
