package pl.mpas.mail.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = pl.mpas.mail.MailApplication.class)
public class MailServiceTest {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailService mailService;

    @Test
    public void verifyBeanInjection() {
        Assert.assertNotNull("javaMailSender reference shouldn't be null!", javaMailSender);
        Assert.assertNotNull("mailService reference shouldn't be null!", mailService);
    }

    @Test
    public void trySendMail() {
        Assert.assertTrue(mailService.sendEmailToUser("maniekdev@gmail.com", "Hello", "How are you", "Testowy@gmail.com"));
    }
}
