package com.elias.bookapi.repositories;


import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elias.bookapi.models.BookModel;

@Repository
public interface BookRepo extends CrudRepository<BookModel, Long> {

    List<BookModel> findAll();

	Book save(Book b);
}