package pl.mpas.data_access;

import java.math.BigDecimal;

public class Smartphone {
    Long id;
    String brand;
    String model;
    String color;
    BigDecimal price;

    public Smartphone(Long id, String brand, String model, String color, BigDecimal price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Smartphone(String brand, String model, String color, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
