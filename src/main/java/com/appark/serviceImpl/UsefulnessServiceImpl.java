package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appark.model.Usefulness;
import com.appark.repo.IUsefulnessRepo;
import com.appark.service.IUsefulnessService;

@Service
public class UsefulnessServiceImpl implements IUsefulnessService{

	@Autowired
	private IUsefulnessRepo repo;
	
	@Override
	public Usefulness registrar(Usefulness obj) {
		return repo.save(obj);
	}

	@Override
	public Usefulness modificar(Usefulness obj) {
		return repo.save(obj);
	}

	@Override
	public List<Usefulness> listar() {
		return repo.findAll();
	}

	@Override
	public Usefulness listarPorId(Integer id) {
		Optional<Usefulness> op= repo.findById(id);
		return op.isPresent()? op.get() : new Usefulness();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
