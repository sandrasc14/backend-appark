package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.User;

public interface IUserRepo extends JpaRepository<User,Integer>{

}
