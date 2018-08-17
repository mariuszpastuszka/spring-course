package pl.mpas.mail.service;

import org.junit.Test;

import java.util.UUID;

public class UuidTest {

    @Test
    public void displayUuidTest() {
        UUID myUuid = UUID.randomUUID();
        System.out.println(String.format("my uuid: [%s]", myUuid));
    }
}
