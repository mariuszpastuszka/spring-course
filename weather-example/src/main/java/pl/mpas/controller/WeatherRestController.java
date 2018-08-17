package pl.mpas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.service.WeatherService;
import pl.mpas.weather.WeatherForecast;

@RestController
public class WeatherRestController {

    private WeatherService weatherService;

    @Autowired
    public WeatherRestController (WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/display-weather-as-json")
    WeatherForecast getWeatherAsJson() {
        return weatherService.getWeatherForecastForLondon();
    }
}
