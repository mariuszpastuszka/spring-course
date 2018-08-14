package pl.mpas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mpas.weather.WeatherForecast;

@Service
public class WeatherServiceImpl implements WeatherService {
    private static final String url = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
    private RestTemplate restTemplate;

    @Autowired
    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherForecast getWeatherForecastForLondon() {
        return restTemplate.getForObject(url, WeatherForecast.class);
    }
}
