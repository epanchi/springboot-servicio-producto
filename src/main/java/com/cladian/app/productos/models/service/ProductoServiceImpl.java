package com.cladian.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cladian.app.productos.models.dao.ProductoDao;
import com.cladian.app.productos.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductoDao productoDao;

	// Anotaciones
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}
