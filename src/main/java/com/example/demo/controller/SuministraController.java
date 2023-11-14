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

import com.example.demo.dto.Suministra;
import com.example.demo.service.SuministraServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/suministrar")
public class SuministraController {

	@Autowired
	private SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/all")
	public List<Suministra> all() {
		return suministraServiceImpl.getAll();
	}

	@GetMapping("/{id}")
	public Suministra show(@PathVariable(name = "id") int id) {
		Suministra suministra = new Suministra();
		suministra = suministraServiceImpl.getId(id);
		return suministra;
	}

	@PostMapping("/new")
	public Suministra create(@RequestBody Suministra suministra) {
		return suministraServiceImpl.add(suministra);
	}

	@PutMapping("/{id}")
	public Suministra update(@PathVariable(name = "id") int id, @RequestBody Suministra suministra) {

		Suministra suministraAntiguo = new Suministra();
		Suministra suministraNuevo = new Suministra();
		suministraAntiguo = suministraServiceImpl.getId(id);
		suministraAntiguo.setPrecio(suministra.getPrecio());
		suministraNuevo = suministraServiceImpl.update(suministraAntiguo);
		return suministraNuevo;

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		suministraServiceImpl.delete(id);
	}

}
