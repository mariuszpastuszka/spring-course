package hello.dao;

import hello.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> readAllPersonsFromDatasource() {
        return null;
    }
}
