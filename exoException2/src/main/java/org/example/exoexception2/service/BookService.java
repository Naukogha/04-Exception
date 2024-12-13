package org.example.exoexception2.service;


import org.example.exoexception2.annotation.Exception;
import org.example.exoexception2.annotation.Logging;
import org.example.exoexception2.annotation.Performance;
import org.example.exoexception2.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<Book>();

    public BookService() {
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Moby Dick", "Herman Melville"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
        books.add(new Book("War and Peace", "Leo Tolstoy"));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book("Brave New World", "Aldous Huxley"));
    }


    @Logging
    @Performance
    public Book addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }

    @Exception
    @Logging
    @Performance
    public List<Book> getBooks() {
        return books;
    }


}
