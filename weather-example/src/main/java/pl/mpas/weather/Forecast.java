package pl.mpas.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    // todo: check other types
    private BigDecimal temp;
    private Long pressure;

    public Forecast() {
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "temp='" + temp + '\'' +
                ", pressure='" + pressure + '\'' +
                '}';
    }
}
