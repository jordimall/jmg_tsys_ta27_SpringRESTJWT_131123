/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezaDAO;
import com.example.demo.dto.Pieza;
/**
 * 
 */
@Service
public class PiezaServiceImpl implements IPiezaService{
	
	@Autowired
	private IPiezaDAO daoPieza;

	public List<Pieza> getAll() {
		return daoPieza.findAll();
	}

	public Pieza getId(int id) {
		return daoPieza.findById(id).get();
	}

	public Pieza add(Pieza pieza) {
		return daoPieza.save(pieza);
	}

	public Pieza update(Pieza pieza) {
		return daoPieza.save(pieza);
	}

	public void delete(int id) {
		daoPieza.deleteById(id);
	}

}
