package pl.mpas.car_rest.controller;

import pl.mpas.car_rest.dao.CarDao;
import pl.mpas.car_rest.domain.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao carDao;
    @Override
    public List<Car> getFavoritesCars() {
        return null;
    }
}
