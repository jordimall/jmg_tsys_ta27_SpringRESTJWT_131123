/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedorDAO;
import com.example.demo.dto.Proveedor;

/**
 * 
 */
@Service
public class ProveedorServiceImp implements IProveedorService {

	@Autowired
	private IProveedorDAO daoIProveedorService;

	public List<Proveedor> getAll() {
		return daoIProveedorService.findAll();
	}

	public Proveedor getId(String id) {
		return daoIProveedorService.findById(id).get();
	}

	public Proveedor add(Proveedor proveedor) {
		return daoIProveedorService.save(proveedor);
	}

	public Proveedor update(Proveedor proveedor) {
		return daoIProveedorService.save(proveedor);
	}

	public void delete(String id) {
		daoIProveedorService.deleteById(id);
	}

}
