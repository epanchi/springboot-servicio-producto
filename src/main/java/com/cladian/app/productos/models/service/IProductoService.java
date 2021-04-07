package com.cladian.app.productos.models.service;

import java.util.List;

import com.cladian.app.productos.models.entity.Producto;

// I =>Interface
public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
}
