package com.javad.foursappspringboot.repository;

import com.javad.foursappspringboot.model.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface BicycleRepository extends JpaRepository<Bicycle,Long > {
}
