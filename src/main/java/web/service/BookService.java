package web.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Book;
import web.repository.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void createBook(Book book) {
        bookRepository.createBook(book);
    }

    public List<Book> findByAll(){
        return bookRepository.findByAll();
    }
}
