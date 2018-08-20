package pl.mpas.data_access;

public class Car {
    private Long id;
    private String brand;
    private String model;

    public Car(Long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
