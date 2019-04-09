package com.example.book.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(of = {"id"})
public class Address implements Serializable {

    private Long id;

    private String street;

    private String city;

    private Integer number;

    private String uf;


    private Author owner;



}
