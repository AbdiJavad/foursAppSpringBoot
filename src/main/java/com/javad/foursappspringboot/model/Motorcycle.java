package com.javad.foursappspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
public class Motorcycle {
    @Id
    private long id;
    private String name;
    private String colour;
    private int size;
    private int model;
}
