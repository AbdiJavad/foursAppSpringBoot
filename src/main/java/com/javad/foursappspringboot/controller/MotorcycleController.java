package com.javad.foursappspringboot.controller;

import com.javad.foursappspringboot.model.Motorcycle;
import com.javad.foursappspringboot.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("motorcycle")
public class MotorcycleController {

    @Autowired
    private MotorcycleService motorcycleService;

    @GetMapping
    public List<Motorcycle> findAll(){
        return motorcycleService.findAll();
    }
    @PostMapping
    public Motorcycle save(long id,Motorcycle motorcycle){
        return motorcycleService.save(motorcycle);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        motorcycleService.delete(id);
    }
    @PutMapping("/{id}")
    public Motorcycle update(@PathVariable long id,@RequestBody Motorcycle motorcycle){
        return motorcycleService.update(id,motorcycle);
    }

}
