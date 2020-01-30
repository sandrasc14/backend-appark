package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appark.model.Review;
import com.appark.repo.IReviewRepo;
import com.appark.service.IReviewService;

@Service
public class ReviewServiceImpl implements IReviewService{

	@Autowired
	private IReviewRepo repo;
	
	@Override
	public Review registrar(Review obj) {
		return repo.save(obj);
	}

	@Override
	public Review modificar(Review obj) {
		return repo.save(obj);
	}

	@Override
	public List<Review> listar() {
		return repo.findAll();
	}

	@Override
	public Review listarPorId(Integer id) {
		Optional<Review> op= repo.findById(id);
		return op.isPresent()? op.get() : new Review();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
