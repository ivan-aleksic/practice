package com.ialeksic.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence")
    @SequenceGenerator(name = "book_sequence", allocationSize = 10)
    private Long id;
    @Column
    private String title;
    @Column
    private String isbn;
    @Column
    private String authorFirstName;
    @Column(name="pero")
    private String authorLastName;
}
