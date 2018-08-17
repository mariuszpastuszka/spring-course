package pl.mpas.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {

    private JavaMailSender mailSender;

    @Autowired
    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public boolean sendEmailToUser(String address, String title, String message, String from) {
        boolean result = true;
        SimpleMailMessage newMailMessage = new SimpleMailMessage();
        newMailMessage.setTo(address);
        newMailMessage.setSubject(title);
        newMailMessage.setText(message);
        newMailMessage.setFrom(from);

        try {
            mailSender.send(newMailMessage);
        } catch (MailException exception) {
            result = false;
            System.err.println(String.format("Error occurred during mail sending: [%s]", exception));
        }
        return result;
    }
}
