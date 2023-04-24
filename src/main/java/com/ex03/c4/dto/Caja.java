/**
 * 
 */
package com.ex03.c4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	@Column(name = "numreferencia")
	private String numreferencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	public Caja() {

	}

	/**
	 * @param num_referencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		this.numreferencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the num_referencia
	 */
	public String getNumreferencia() {
		return numreferencia;
	}

	/**
	 * @param num_referencia the num_referencia to set
	 */
	public void setNumreferencia(String num_referencia) {
		this.numreferencia = num_referencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

}
