package pl.mpas.car_rest.controller;

import pl.mpas.car_rest.domain.Car;

import java.util.List;

public interface CarService {
    List<Car> getFavoritesCars();
}
