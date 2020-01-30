package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.appark.model.Vehicle;

public interface IVehicleRepo extends JpaRepository<Vehicle,Integer>{

}
