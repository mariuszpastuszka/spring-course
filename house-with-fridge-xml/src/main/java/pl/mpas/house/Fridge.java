package pl.mpas.house;

import java.util.Map;

public class Fridge {
    private Map<String, String> dishesKinds;

    public void setDishesKinds(Map<String, String> dishesKinds) {
        this.dishesKinds = dishesKinds;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "dishesKinds=" + dishesKinds +
                '}';
    }
}
