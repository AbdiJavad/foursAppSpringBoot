package com.javad.foursappspringboot.controller;

import com.javad.foursappspringboot.model.Car;
import com.javad.foursappspringboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> findAll(){
        return carService.findAll();
    }
    @PostMapping
    public Car save(@RequestBody long id,Car car){
        return carService.save(car);
    }
    @DeleteMapping("{/id}")
    public void  delete(@PathVariable long id){
        carService.delete(id);
    }
    public  Car update(@PathVariable long id,@RequestBody Car car){
        return carService.update(id,car);
    }
}
