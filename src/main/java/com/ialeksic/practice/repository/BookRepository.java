package com.ialeksic.practice.repository;

import com.ialeksic.practice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
