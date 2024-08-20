package com.library_management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Table(name = "books")
public class Book {
    @Id
    private long id;
    private String name;
    private String isbn;
    @JsonIgnore
    @ManyToOne
    private Author author;

}
