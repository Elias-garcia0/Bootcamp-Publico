package com.elias.bookapi.controllers;


import java.util.List;

// ..
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elias.bookapi.models.BookModel;
import com.elias.bookapi.services.BookService;

@RestController
public class BookApiController {
    private final BookService bookService;
    public BookApiController(BookService bookService){
        this.bookService = bookService;
    }

    //GET GENERAL
    @RequestMapping("/api/books")
    public List<BookModel> index() {
        System.out.println("Se han solicitado los datos");

        return bookService.allBooks();
    }

    //POST PARA CARGAR DE A UN LIBRO
    @RequestMapping(value="/api/books", method= RequestMethod.POST)
    public BookModel create(@RequestParam(value="title") String title,
                       @RequestParam(value="description") String desc,
                       @RequestParam(value="language") String lang,
                       @RequestParam(value="pages") Integer numOfPages) {
        BookModel book = new BookModel();
        book.setLanguage(lang);
        book.setNumberOfPages(numOfPages);
        book.setDescription(desc);
        book.setTitle(title);
        return bookService.createBook(book);
    }


    //GET PARA SELECCIONAR DE A UN LIBRO
    @RequestMapping("/api/books/{id}")
    public BookModel show(@PathVariable("id") Long id) {
        BookModel book = bookService.findBook(id);
        return book;
    }

    //PUT para actualizar datos
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public BookModel update(@PathVariable("id") Long id,//Para poder editar debo mandar la direccion unica de ese libro
                       @RequestParam(value="title") String title,
                       @RequestParam(value="description") String desc,
                       @RequestParam(value="language") String lang,
                       @RequestParam(value="pages") Integer numOfPages) {
        BookModel book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

    //DELETE para eliminar
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);

        return "Libro "+id+ " eliminado";
    }
}