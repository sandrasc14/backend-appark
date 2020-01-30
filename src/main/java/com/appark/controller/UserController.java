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

import com.appark.model.User;
import com.appark.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@PostMapping
	public User registrar(@RequestBody User obj) {
		return service.registrar(obj);
	}
	
	@PutMapping()
	public User modificar(@RequestBody User obj) {
		return service.modificar(obj);
	}
	
	@GetMapping
	public List<User> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public User listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
