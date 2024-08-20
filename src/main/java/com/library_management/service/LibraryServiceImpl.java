package com.library_management.service;

import com.library_management.entity.Author;
import com.library_management.entity.Book;
import com.library_management.repository.AuthorRepository;
import com.library_management.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public LibraryServiceImpl(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(long id){
        Optional<Author> author =authorRepository.findById(id);
        if(author.isPresent()){
            return author.get();
        }else{
            throw new RuntimeException("Author not found");
        }
    }

    @Override
    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(long id){
        authorRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(long id){
        Optional<Book> book =bookRepository.findById(id);
        if(book.isPresent()){
            return book.get();
        }else{
            throw new RuntimeException("Book not found");
        }
    }

    @Override
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }
}
