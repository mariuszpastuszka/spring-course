package pl.mpas.own_dependency_injection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class HolderTest {

    @Test
    public void checkSecretOfHolder() {
        Holder holder = new Holder("It's just secret");
        holder.tellMeAboutSecret();

        try {
            Field secretFromInside = holder.getClass().getDeclaredField("secret");
            secretFromInside.setAccessible(true);
            try {
                String secret = (String) secretFromInside.get(holder);
                System.out.println("So I know Your secret: " + secret);
                Assert.assertNotNull("Secret shouldn't be null!", secret);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
