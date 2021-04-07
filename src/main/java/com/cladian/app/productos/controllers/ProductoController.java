package com.cladian.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cladian.app.productos.models.entity.Producto;
import com.cladian.app.productos.models.service.IProductoService;

@RestController  //Convertir a JSON
public class ProductoController {
	
	@Autowired  // Injeccion de autodependencia
	private IProductoService productoService;
	
	@GetMapping("/listar")  //Mapear a una ruta URL
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
}
