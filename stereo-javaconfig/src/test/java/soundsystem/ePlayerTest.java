package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class ePlayerTest {

    @Autowired
    ePlayer myPlayer;

    @Autowired
    @Qualifier("eMusic")
    eMusic eMusic;

    @Autowired
    @Qualifier("tulia")
    eMusic tulia;

    @Autowired
    @Qualifier("tulia")
    eMusic tulia2;

    @Test
    public void checkNull() {
        Assert.assertNotNull(myPlayer);

        myPlayer.play();
    }

    @Test
    public void checkeMusic() {
        eMusic.playMusic();
    }

    @Test
    public void checkTulia() {
        tulia.playMusic();
    }

    @Test
    public void testTuliaEquality() {
        Assert.assertNotEquals("Objects shouldn't be equal!", tulia, tulia2);
    }
}
