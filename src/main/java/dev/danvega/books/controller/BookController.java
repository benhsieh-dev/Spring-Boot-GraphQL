package dev.danvega.books.controller;

import dev.danvega.books.model.Book;
import dev.danvega.books.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    @SchemaMapping(typeName = "Query",value = "allBooks")
    @QueryMapping
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}