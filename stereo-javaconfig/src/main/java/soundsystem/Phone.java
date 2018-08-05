package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone implements ePlayer {

    private eMusic eMusic;

//    @Autowired
    public Phone(eMusic eMusic) {
        this.eMusic = eMusic;
    }

    @Override
    public void play() {
        eMusic.playMusic();
    }
}
