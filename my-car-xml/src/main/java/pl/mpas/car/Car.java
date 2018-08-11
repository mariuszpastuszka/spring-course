package pl.mpas.car;

public class Car {
    private String model;
    private Owner owner;

    public Car(String model, Owner owner) {
        this.model = model;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", owner=" + owner +
                '}';
    }
}
