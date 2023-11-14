/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

/**
 * 
 */
public interface IPiezaService {

	/**
	 * Deveuelve todos los piezas
	 * 
	 * @return List<Pieza>
	 */
	public List<Pieza> getAll();

	/**
	 * Devuelve un pieza en especifico
	 * 
	 * @param id
	 * @return Pieza
	 */
	public Pieza getId(int id);

	/**
	 * Añade un pieza a la base de datos
	 * 
	 * @param pieza
	 * @return Pieza
	 */
	public Pieza add(Pieza pieza);

	/**
	 * Actualiza un pieza
	 * 
	 * @param pieza
	 * @return Pelicula
	 */
	public Pieza update(Pieza pieza);

	/**
	 * Elimina un pieza
	 * 
	 * @param id
	 */
	public void delete(int id);
}
