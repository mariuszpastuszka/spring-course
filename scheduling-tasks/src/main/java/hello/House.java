package hello;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class House {

    List<Window> windows;

    Door door;

    public House(Door door) {
        this.door = door;
    }

    public Optional<Door> getDoor() {
        return Optional.ofNullable(door);
    }

    public static void main(String[] args) {
        List<House> houses = Arrays.asList(
                new House(new Door(new Lock())),
                new House(null)
        );
        houses.stream()
                .map(house -> house.windows)
                .flatMap(windows1 -> windows1.stream())
                .collect(Collectors.toList());

        Optional<House> maybeHouse = Optional.of(new House(new Door(new Lock())));
        Optional<House> maybeHouse2 = Optional.of(new House(null));

        maybeHouse.flatMap(house -> house.getDoor())
                .flatMap(door1 -> door1.getLock())
                .orElse(new Lock());

        maybeHouse.flatMap(House::getDoor)
                .flatMap(Door::getLock)
                .orElse(new Lock());
    }
}
