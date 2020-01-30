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

import com.appark.model.Vehicle;
import com.appark.service.IVehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {
	
	@Autowired
	private IVehicleService service;
	
	@PostMapping
	public Vehicle registrar(@RequestBody Vehicle vehicle) {
		return service.registrar(vehicle);
	}
	
	@PutMapping()
	public Vehicle modificar(@RequestBody Vehicle vehicle) {
		return service.modificar(vehicle);
	}
	
	@GetMapping
	public List<Vehicle> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Vehicle listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
