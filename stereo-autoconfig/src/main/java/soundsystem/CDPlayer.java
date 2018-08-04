package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    public static void main(String[] args) {
        CompactDisc disc = new SgtPeppers();

        CDPlayer cdPlayer = new CDPlayer(disc);

    }
}
