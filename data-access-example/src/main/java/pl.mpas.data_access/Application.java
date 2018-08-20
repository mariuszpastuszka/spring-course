package pl.mpas.data_access;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(" +
                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        jdbcTemplate.execute("DROP TABLE cars IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE cars(" +
                "id SERIAL, brand VARCHAR(255), model VARCHAR(255))");

        jdbcTemplate.execute("DROP TABLE phones IF EXISTS ");

        jdbcTemplate.execute("CREATE TABLE phones (id SERIAL, brand VARCHAR (50), model VARCHAR (50), color VARCHAR (50), price DECIMAL(19,2))");

        jdbcTemplate.update("INSERT INTO phones (brand, model, color, price) VALUES (?,?,?,?)", "p1", "p2","p3", "555");

        // Split up the array of whole names into an array of first/last names
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        // Use a Java 8 stream to print out each tuple of the list
        splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);

        log.info("Querying for customer records where first_name = 'Josh':");
        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] { "Josh" },
                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> log.info(customer.toString()));

        jdbcTemplate.update("INSERT INTO cars(brand, model) VALUES (?, ?)", "Bmw", "7");

        List<Car> cars = jdbcTemplate.query("SELECT id, brand, model from cars",
                (rs, rowNum) -> new Car(rs.getLong("id"), rs.getString("brand"),
                        rs.getString("model")));

        cars.forEach(System.out::println);

//        List<Smartphone> smartphones = Arrays.asList(new Smartphone("Nokia", "3210", "Black", BigDecimal.valueOf(100)));
//
//        for (Smartphone s : smartphones) {
//            jdbcTemplate.update("INSERT INTO smartphones(branch, model, color, price) VALUES (?, ?, ?, ?)",
//                    s.getBrand(), s.getModel(), s.getColor(), s.getPrice());
//        }
    }
}