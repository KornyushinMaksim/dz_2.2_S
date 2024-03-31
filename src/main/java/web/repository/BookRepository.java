package web.repository;

import web.model.Book;
import java.util.List;

public interface BookRepository {
    void createBook(Book book);
    List<Book> findByAll();
}
