package pl.mpas.own_dependency_injection;

public class Holder {

    private String secret;
    private String secondSecret = new String("haaha gradle sucks!");

    public Holder(String secret) {
        this.secret = secret;
    }

    public void tellMeAboutSecret() {
        System.out.println("My secret is: " + secret);
    }
}
