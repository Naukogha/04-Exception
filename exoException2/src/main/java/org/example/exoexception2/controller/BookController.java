package org.example.exoexception2.controller;

import org.example.exoexception2.entity.Book;
import org.example.exoexception2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public Book addBook(@RequestParam String title, @RequestParam String author) {
        return bookService.addBook(title, author);
    }

    @GetMapping("/")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
