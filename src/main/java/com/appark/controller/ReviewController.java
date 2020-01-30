package com.appark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appark.model.Review;
import com.appark.service.IReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
	
	@Autowired
	private IReviewService service;
	
	@PostMapping
	public Review registrar(@RequestBody Review obj) {
		return service.registrar(obj);
	}
	
	@PutMapping()
	public Review modificar(@RequestBody Review obj) {
		return service.modificar(obj);
	}
	
	@GetMapping
	public List<Review> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Review listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
