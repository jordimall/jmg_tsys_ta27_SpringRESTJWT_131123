/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */
@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id_proveedor")
	private List<Suministra> suministra;

	/**
	 * 
	 */
	public Proveedor() {
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Proveedor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the suministra
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_proveedor")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param suministra the suministra to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_proveedor")
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

}
