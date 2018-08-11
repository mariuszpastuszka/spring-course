package pl.mpas.player;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/my-beans.xml")
public class PlayersTest {

    @Autowired
    @Qualifier("messi")
    Player messiPLayer;

    @Autowired
    Player neymar;

    @Autowired
    Team myTeam;

    @Test
    public void checkTeamTest() {
        Assert.assertNotNull(myTeam);
        System.out.println(myTeam);
    }

    @Test
    public void checkPlayers() {
        Assert.assertNotNull(messiPLayer);
        Assert.assertNotNull(neymar);

        System.out.println(messiPLayer);
        System.out.println(neymar);
    }
}
