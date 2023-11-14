/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedor;

/**
 * 
 */
public interface IProveedorService {

	/**
	 * Recupera todos los proveedores
	 * 
	 * @return List<Proveedor>
	 */
	public List<Proveedor> getAll();

	/**
	 * Recupera un proveedor en función de su id
	 * 
	 * @param id
	 * @return Proveedor
	 */
	public Proveedor getId(String id);

	/**
	 * Crea un proveedor
	 * 
	 * @param proveedor
	 * @return Proveedor
	 */
	public Proveedor add(Proveedor proveedor);

	/**
	 * Actualiza a un proveedor
	 * 
	 * @param proveedor
	 * @return Proveedor
	 */
	public Proveedor update(Proveedor proveedor);

	/**
	 * Elimina a un proveedor
	 * 
	 * @param id
	 */
	public void delete(String id);

}
