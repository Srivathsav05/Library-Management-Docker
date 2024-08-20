package com.library_management.service;

import com.library_management.entity.Author;
import com.library_management.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LibraryService {
//Author Details
    List<Author> getAllAuthor();

//    List<Author> getAllAuthors();

    public Author getAuthorById(long id);

    public Author saveAuthor(Author author);

    public void deleteAuthor(long id);

    public List<Book> getAllBooks();

    public Book getBookById(long id);

    public Book saveBook(Book book);

    public void deleteBook(long id);
}
