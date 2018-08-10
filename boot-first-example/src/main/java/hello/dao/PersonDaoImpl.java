package hello.dao;

import hello.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {

    @Override
    public List<Person> readAllPersonsFromDatasource() {
        return createPersons();
    }


    List<Person> createPersons() {
        List<Person> result = new ArrayList();

        result.add(new Person("Marek", "W."));
        result.add(new Person("Mirek", "M"));
        result.add(new Person("Olaf", "L"));
        result.add(new Person("Genowefa", "M"));
        result.add(new Person("Chuck", "X"));
        result.add(new Person("Kevin", "F"));

        return result;
    }
}
