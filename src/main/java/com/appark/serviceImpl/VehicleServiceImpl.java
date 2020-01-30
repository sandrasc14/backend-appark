package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appark.model.Vehicle;
import com.appark.repo.IVehicleRepo;
import com.appark.service.IVehicleService;

@Service
public class VehicleServiceImpl implements IVehicleService{

	@Autowired
	private IVehicleRepo repo;
	
	@Override
	public Vehicle registrar(Vehicle obj) {
		return repo.save(obj);
	}

	@Override
	public Vehicle modificar(Vehicle obj) {
		return repo.save(obj);
	}

	@Override
	public List<Vehicle> listar() {
		return repo.findAll();
	}

	@Override
	public Vehicle listarPorId(Integer id) {
		Optional<Vehicle> op= repo.findById(id);
		return op.isPresent()? op.get() : new Vehicle();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
