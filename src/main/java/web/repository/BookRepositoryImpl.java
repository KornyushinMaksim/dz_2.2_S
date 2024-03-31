package web.repository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import web.model.Book;

import java.util.List;

@AllArgsConstructor
@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> books;
    @Override
    public void createBook(Book book) {
        this.books.add(book);
    }

    @Override
    public List<Book> findByAll() {
        return this.books;
    }
}
