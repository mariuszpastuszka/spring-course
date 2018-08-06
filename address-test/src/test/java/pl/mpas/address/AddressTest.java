package pl.mpas.address;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class AddressTest {

    @Autowired
    private Address myAddress;

    @Autowired
    private Address myAddress2;

    @Test
    public void showAddress() {
        System.out.println("my adrress is: " + myAddress);
    }

    @Test
    public void areTheSame() {
        Assert.assertEquals(myAddress, myAddress2);
    }
}
