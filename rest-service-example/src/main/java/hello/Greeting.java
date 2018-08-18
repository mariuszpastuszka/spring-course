package hello;

class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

public class Greeting {

    private final long id;
    private final String content;
    private final Person person;

    public Greeting(long id, String content, Person person) {
        this.id = id;
        this.content = content;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Person getPerson() {
        return person;
    }
}
