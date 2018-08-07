package pl.mpas.vehicle;

public class Maluch extends Vehicle {
    public Maluch(Owner owner) {
        super(owner);
    }

    @Override
    public void printBrand() {
        System.out.println("super auto");
    }
}
