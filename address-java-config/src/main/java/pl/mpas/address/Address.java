package pl.mpas.address;

public class Address {
    private String city;

    private String street;

    private int flatNumber;

    public Address(String city, String street, int flatNumber) {
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "pl.mpas.address.Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
