package com.example.Book.Controller;

import com.example.Book.Entity.Book;
import com.example.Book.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        System.out.println("Received Book: " + book);
        Book saveBook=bookService.addBook(book);
        System.out.println("Saved Book: " + saveBook);
        return ResponseEntity.ok(saveBook);

    }

}
