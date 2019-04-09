package com.example.book.models;


import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Data
public abstract class Person implements Serializable {

    private Long id;

    private String  name;

    private String lastName;

    private List<String> phones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
