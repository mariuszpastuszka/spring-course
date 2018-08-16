package pl.mpas.car_rest.domain;

import java.time.Year;

public class Car {
    private String model;
    private String brand;
    private Year year;
    private Owner owner;

    public Car() {
        // empty
    }

    public Car(String model, String brand, Year year, Owner owner) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                '}';
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
