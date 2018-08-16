package pl.mpas.car_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.car_rest.domain.Car;
import pl.mpas.car_rest.service.CarService;

import java.util.List;

@RestController
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars/favorites")
    List<Car> getFavoritesCars() {
        return carService.getFavoritesCars();
    }
}
