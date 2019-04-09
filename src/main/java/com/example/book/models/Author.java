package com.example.book.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class Author extends Person{

    @JsonIgnore
    private Set<Book> books = new HashSet<>();


    private Address address;

    private String document;

    private LocalDate birthDate;
}
