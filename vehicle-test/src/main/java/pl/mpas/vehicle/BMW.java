package pl.mpas.vehicle;

public class BMW extends Vehicle {

    public BMW(Owner owner) {
        super(owner);
    }

    @Override
    public void printBrand() {
        System.out.println("Bmw");
    }
}
