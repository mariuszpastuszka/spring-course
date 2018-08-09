package hello.dao;

import hello.Person;

import java.util.List;

public interface PersonDao {
    List<Person> readAllPersonsFromDatasource();
}
