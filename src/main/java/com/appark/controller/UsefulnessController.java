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

import com.appark.model.Usefulness;
import com.appark.service.IUsefulnessService;

@RestController
@RequestMapping("/usefulness")
public class UsefulnessController {
	
	@Autowired
	private IUsefulnessService service;
	
	@PostMapping
	public Usefulness registrar(@RequestBody Usefulness obj) {
		return service.registrar(obj);
	}
	
	@PutMapping()
	public Usefulness modificar(@RequestBody Usefulness obj) {
		return service.modificar(obj);
	}
	
	@GetMapping
	public List<Usefulness> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Usefulness listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
