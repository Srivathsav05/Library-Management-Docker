package com.library_management.controller;

import com.library_management.entity.Book;
import com.library_management.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final LibraryService libraryService;

    public BookController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return libraryService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@RequestBody long id){
        return libraryService.getBookById(id);
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book){
        return libraryService.saveBook(book);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id){
        libraryService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
