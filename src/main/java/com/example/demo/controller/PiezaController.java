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

import com.example.demo.dto.Pieza;
import com.example.demo.service.PiezaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/piezas")
public class PiezaController {

	@Autowired
	private PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/all")
	public List<Pieza> all() {
		return piezaServiceImpl.getAll();
	}

	@GetMapping("/{id}")
	public Pieza show(@PathVariable(name = "id") int id) {
		Pieza pieza_xid = new Pieza();
		pieza_xid = piezaServiceImpl.getId(id);
		return pieza_xid;
	}

	@PostMapping("/new")
	public Pieza create(@RequestBody Pieza pieza) {
		return piezaServiceImpl.add(pieza);
	}

	@PutMapping("/{id}")
	public Pieza update(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {

		Pieza pieza_antiguo = new Pieza();
		Pieza pieza_nueva = new Pieza();
		pieza_antiguo = piezaServiceImpl.getId(id);
		pieza_antiguo.setNombre(pieza.getNombre());
		pieza_nueva = piezaServiceImpl.update(pieza_antiguo);
		return pieza_nueva;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		piezaServiceImpl.delete(id);
	}

}
