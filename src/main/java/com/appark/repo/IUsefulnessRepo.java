package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.Usefulness;


public interface IUsefulnessRepo extends JpaRepository<Usefulness,Integer>{

}
