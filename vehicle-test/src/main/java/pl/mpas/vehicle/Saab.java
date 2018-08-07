package pl.mpas.vehicle;

public class Saab extends Vehicle {
    public Saab(Owner owner) {
        super(owner);
    }

    @Override
    public void printBrand() {
        System.out.println("Saab");
    }
}
