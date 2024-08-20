package com.library_management.controller;

import com.library_management.entity.Author;
import com.library_management.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final LibraryService libraryService;

    public AuthorController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    @GetMapping
    public List<Author> getAllAuthors(){
        return libraryService.getAllAuthor();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@RequestBody long id){
        return libraryService.getAuthorById(id);
    }

    @PostMapping("/create")
    public Author createAuthor(@RequestBody Author author){
        return libraryService.saveAuthor(author);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable long id){
        libraryService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }

}
