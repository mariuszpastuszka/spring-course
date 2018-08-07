package pl.mpas.vehicle;

public class Owner {

    private String id;

    public Owner(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                '}';
    }
}
