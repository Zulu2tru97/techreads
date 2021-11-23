package com.manifestcorp.techreads.controller;

import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/books/api")
public class ResourceController {


    @Autowired
    BookRepository bookRepository;

    @GetMapping({"", "/"})
    public List<Book> books() {
        return bookRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<List<Book>> add(){
        Book book = new Book("Title", 9.8, "Author", "none");
        bookRepository.saveAndFlush(book);
        List<Book> books = bookRepository.findAll();
        return new ResponseEntity<>(books, HttpStatus.CREATED);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<Book>> delete(@PathVariable(value = "id") Long id){
        bookRepository.deleteById(id);
        List<Book> books= bookRepository.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/details/{id}")
    public Optional<Book> details(@PathVariable("id") Long id){
        Optional<Book> book = Optional.of(bookRepository.findById(id).orElse(new Book()));
        return book;
    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void edit(@PathVariable("id") Long id, @RequestBody Book book){
        bookRepository.saveAndFlush(book);
    }
}
