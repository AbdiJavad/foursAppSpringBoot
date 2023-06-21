package com.javad.foursappspringboot.controller;

import com.javad.foursappspringboot.model.Bicycle;
import com.javad.foursappspringboot.service.BicyclrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bicycle")
public class BicycleController {

    @Autowired
    private BicyclrService bicyclrService;

    @GetMapping
    public List<Bicycle> findbyid(Bicycle bicycle){
        return bicyclrService.findAll();
    }
    @PostMapping
    public Bicycle save(@RequestBody long id, Bicycle bicycle){
        return bicyclrService.save(bicycle);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        bicyclrService.delete(id);
    }
    @PutMapping("/{id}")
    public Bicycle update(@PathVariable long id,@RequestBody Bicycle bicycle){
        return bicyclrService.update(id, bicycle);
    }

}
