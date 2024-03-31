package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Book;
import web.service.BookService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/library")
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public String findByAll(Model model) {
        List<Book> books = bookService.findByAll();
        model.addAttribute("books", books);
        System.out.println(books);
        return "books";
    }

    @GetMapping("/add-book")
    public String viewCreateBook(){
        return "add-book";
    }

    @PostMapping("/add-book")
    public String createBook(@ModelAttribute("building") Book book
    ){
       bookService.createBook(book);
       return "redirect:/library/books";
    }
}
