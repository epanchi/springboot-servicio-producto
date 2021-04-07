package com.cladian.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cladian.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {
// Integration no required
}
