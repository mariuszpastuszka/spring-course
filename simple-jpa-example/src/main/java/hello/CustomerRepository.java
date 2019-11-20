package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

//    @Query(nativeQuery = true, "")
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
