package pl.mpas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mpas.service.WeatherService;

@Controller
public class WeatherController {

    WeatherService weatherService;

    @GetMapping("/display-weather")
    String diplayWeather(Model model) {
        model.addAttribute("weatherForecast", weatherService.getWeatherForecastForLondon());

        return "weather-page";
    }
}
