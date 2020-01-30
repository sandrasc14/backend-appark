package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.Review;

public interface IReviewRepo extends JpaRepository<Review,Integer>{

}
