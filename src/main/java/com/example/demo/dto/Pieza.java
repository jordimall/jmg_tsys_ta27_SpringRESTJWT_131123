/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */
@Entity
@Table(name = "piezas")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int codigo;

	@Column(name = "Nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "codigo_pieza")
	private List<Suministra> suministra;

	/**
	 * 
	 */
	public Pieza() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Pieza(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
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


	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "codigoPieza")
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

}
