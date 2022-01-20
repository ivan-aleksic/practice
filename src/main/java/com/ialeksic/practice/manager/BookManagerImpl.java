package com.ialeksic.practice.manager;

import com.ialeksic.practice.entity.Book;
import com.ialeksic.practice.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookManagerImpl implements BookManager{

    private final BookRepository bookRepository;

    public BookManagerImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
}
