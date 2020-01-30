package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appark.model.User;
import com.appark.repo.IUserRepo;
import com.appark.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepo repo;
	
	@Override
	public User registrar(User obj) {
		return repo.save(obj);
	}

	@Override
	public User modificar(User obj) {
		return repo.save(obj);
	}

	@Override
	public List<User> listar() {
		return repo.findAll();
	}

	@Override
	public User listarPorId(Integer id) {
		Optional<User> op= repo.findById(id);
		return op.isPresent()? op.get() : new User();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
