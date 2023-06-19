package com.javad.foursappspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    private long id;
    private String name;
    private String colour;
    private int size;
}
