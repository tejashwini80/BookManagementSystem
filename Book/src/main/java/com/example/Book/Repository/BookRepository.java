package com.example.Book.Repository;

import com.example.Book.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Integer> {


}
