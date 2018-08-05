package pl.mpas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class PersonWithPropertiesTest {

    @Autowired
    Person meFromProperty;

    @Test
    public void printMeFromProperty() {
        meFromProperty.introduceYourself();
    }
}
