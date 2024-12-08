package com.example.Book.Service;
import com.example.Book.Entity.Book;
import com.example.Book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

        private final BookRepository bookRepository;
        @Autowired
        public BookService(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }
        public Book addBook(Book book) {
            return bookRepository.save(book);

        }
}
