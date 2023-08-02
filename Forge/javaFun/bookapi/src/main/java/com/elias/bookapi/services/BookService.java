package com.elias.bookapi.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// ...

import org.springframework.stereotype.Service;

import com.elias.bookapi.models.BookModel;
import com.elias.bookapi.repositories.BookRepo;

@Service
public class BookService {
    //Agregando el book al repositorio como una dependencia
    private final BookRepo bookRepository;

    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Devolviendo todos los libros.
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public BookModel createBook(BookModel b) {
        return bookRepository.save(b);
    }

    //Editar un libro
    public BookModel updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {

        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            BookModel book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setNumberOfPages(numOfPages);
            book.setLanguage(lang);

            return bookRepository.save(book);
        } else {
            // Manejar el caso en el que no se encuentre el libro por su ID
            throw new NoSuchElementException("Libro no encontrado para el ID: " + id);
        }


    }

    //Obteniendo la información de un libro
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    //Eliminando un libro
    public void deleteBook(Long id) {

        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("No se encontró ningún libro con el ID proporcionado.");//Para agregar errores esta sentencia
        }
    }
}