package pl.mpas.mail.service;

public interface MailService {

    boolean sendEmailToUser(String address, String title, String message, String from);
}
