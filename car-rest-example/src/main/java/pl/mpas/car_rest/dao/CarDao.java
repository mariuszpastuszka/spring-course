package pl.mpas.car_rest.dao;

import pl.mpas.car_rest.domain.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars();
}
