package com.javad.foursappspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
public class Bicycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String name;
    private String colour;
    private int size;
    private int model;

}
