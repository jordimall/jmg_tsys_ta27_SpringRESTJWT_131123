/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

/**
 * 
 */
public interface ISuministraService {
	/**
	 * Deveuelve todos los suministras
	 * 
	 * @return List<Suministra>
	 */
	public List<Suministra> getAll();

	/**
	 * Devuelve un suministra en especifico
	 * 
	 * @param id
	 * @return Suministra
	 */
	public Suministra getId(int id);

	/**
	 * Añade un suministra a la base de datos
	 * 
	 * @param suministra
	 * @return Suministra
	 */
	public Suministra add(Suministra suministra);

	/**
	 * Actualiza un suministra
	 * 
	 * @param suministra
	 * @return Suministra
	 */
	public Suministra update(Suministra suministra);

	/**
	 * Elimina un suministra
	 * 
	 * @param id
	 */
	public void delete(int id);
}
