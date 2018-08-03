package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private MediaPlayer player;

    @Autowired
    public Person(MediaPlayer player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Meloman";
    }
}
