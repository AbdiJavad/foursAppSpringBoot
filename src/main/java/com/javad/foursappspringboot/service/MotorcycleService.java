package com.javad.foursappspringboot.service;

import com.javad.foursappspringboot.model.Car;
import com.javad.foursappspringboot.model.Motorcycle;
import com.javad.foursappspringboot.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

     @Autowired
     private MotorcycleRepository motorcycleRepository;

     public List<Motorcycle> findAll(){
          return motorcycleRepository.findAll();
     }
     public  Motorcycle save (Motorcycle motorcycle) {
          return motorcycleRepository.save(motorcycle);
     }
     public void delete(long id){
          motorcycleRepository.findById(id);
     }
     public Motorcycle update(long id,Motorcycle motorcycle){
          Motorcycle motorcycleData = motorcycleRepository.findById(id).get();

          if (motorcycle.getName()!=null)
               motorcycleData.setName(motorcycle.getName());
          if (motorcycle.getColour()!=null)
               motorcycleData.setColour(motorcycle.getColour());
          if (motorcycle.getSize()>0)
               motorcycle.setSize(motorcycle.getSize());
          if (motorcycle.getModel()>0)
               motorcycle.setModel(motorcycle.getModel());
          return motorcycleRepository.save(motorcycleData);
     }


}
