package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.Parking;

public interface IParkingRepo extends JpaRepository<Parking,Integer>{

}
