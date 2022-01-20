package com.ialeksic.practice.controller;

import com.ialeksic.practice.entity.Book;
import com.ialeksic.practice.manager.BookManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/book")

public class BookController {
    private final BookManager bookManager;

    public BookController(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @GetMapping("/create")
    private String createBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "book-create";
    }

    @PostMapping("/create")
    private String saveBook(@ModelAttribute Book book) {
        bookManager.createBook(book);
        return "redirect:/book/list";
    }
}

