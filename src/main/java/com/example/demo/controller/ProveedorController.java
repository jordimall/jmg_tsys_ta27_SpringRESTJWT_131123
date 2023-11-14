/**
 * 
 */
package com.example.demo.controller;

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

import com.example.demo.dto.Proveedor;
import com.example.demo.service.ProveedorServiceImp;

/**
 * 
 */
@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

	@Autowired
	private ProveedorServiceImp proveedorServiceImpl;

	@GetMapping("/all")
	public List<Proveedor> all() {
		return proveedorServiceImpl.getAll();
	}

	@GetMapping("/{id}")
	public Proveedor show(@PathVariable(name = "id") String id) {
		Proveedor proveedor = new Proveedor();
		proveedor = proveedorServiceImpl.getId(id);
		return proveedor;
	}

	@PostMapping("/new")
	public Proveedor create(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.add(proveedor);
	}

	@PutMapping("/{id}")
	public Proveedor update(@PathVariable(name = "id") String id,
			@RequestBody Proveedor proveedor) {

		Proveedor proveedor_viejo = new Proveedor();
		Proveedor proveedor_nuevo = new Proveedor();
		proveedor_viejo = proveedorServiceImpl.getId(id);
		proveedor_viejo.setNombre(proveedor.getNombre());
		proveedor_nuevo = proveedorServiceImpl.update(proveedor_viejo);
		return proveedor_nuevo;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		proveedorServiceImpl.delete(id);
	}

}
