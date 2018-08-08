package pl.mpas.house;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/my-beans.xml")
public class HouseTest {

    @Autowired
    House myHouse;

    @Autowired
    Fridge myFridge;

    @Test
    public void testWiring() {
        Assert.assertNotNull(myHouse);
        Assert.assertNotNull(myFridge);
    }
}
