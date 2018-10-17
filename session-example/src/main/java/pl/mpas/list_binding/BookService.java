package pl.mpas.list_binding;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    void saveAll(List<Book> books);
}
