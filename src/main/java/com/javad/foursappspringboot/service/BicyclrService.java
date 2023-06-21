package com.javad.foursappspringboot.service;

import com.javad.foursappspringboot.model.Bicycle;
import com.javad.foursappspringboot.model.Motorcycle;
import com.javad.foursappspringboot.repository.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicyclrService {

    @Autowired
    private BicycleRepository bicycleRepository;

    public List<Bicycle> findAll(){
        return bicycleRepository.findAll();
    }
    public Bicycle save(Bicycle bicycle){
        return bicycleRepository.save(bicycle);
    }
    public void delete(long id){
       bicycleRepository.findById(id);
    }
    public Bicycle update(long id ,Bicycle bicycle){
        Bicycle bicycleData = bicycleRepository.findById(id).get();

        if (bicycle.getName()!=null)
            bicycle.setName(bicycle.getName());
        if (bicycle.getColour()!=null)
            bicycle.setColour(bicycle.getColour());
        if (bicycle.getSize()>0)
            bicycle.setSize(bicycle.getSize());
        if (bicycle.getModel()>0)
            bicycle.setModel(bicycle.getModel());
        return bicycleRepository.save(bicycleData);
    }

}
