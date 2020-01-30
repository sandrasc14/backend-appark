package com.appark.service;

import java.util.List;

public interface ICRUD <T,V>{
	T registrar(T obj);
    T modificar(T obj);
    List<T> listar();
	T listarPorId(V id);
	void eliminar(V id);
}
