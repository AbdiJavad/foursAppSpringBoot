package com.javad.foursappspringboot.service;

import com.javad.foursappspringboot.model.Car;
import com.javad.foursappspringboot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public Car save(Car car){
        return carRepository.save(car);
    }
    public void delete(long id){
        carRepository.findById(id);
    }
    public Car update(long id,Car car){
        Car carData=carRepository.findById(id).get();

        if (car.getName()!=null)
            carData.setName(car.getName());
        if (car.getColour()!=null)
            carData.setColour(car.getColour());
        if (car.getSize()>0)
            carData.setSize(car.getSize());
        return carRepository.save(carData);
    }

}
