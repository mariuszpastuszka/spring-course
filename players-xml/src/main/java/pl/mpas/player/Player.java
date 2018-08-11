package pl.mpas.player;

import java.math.BigDecimal;

public class Player {
    private String name;
    private BigDecimal playerValue;
    private int age;

    public Player() {
        //
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerValue(BigDecimal playerValue) {
        this.playerValue = playerValue;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(String name, BigDecimal playerValue, int age) {
        this.name = name;
        this.playerValue = playerValue;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerValue=" + playerValue +
                ", age=" + age +
                '}';
    }

}
