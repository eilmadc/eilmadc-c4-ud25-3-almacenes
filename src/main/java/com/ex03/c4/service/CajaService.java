/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.Caja;


/**
 * @author elena-01
 *
 */
public interface CajaService {

	public List<Caja> listCajas();

	public Caja saveCaja(Caja caja);

	public Caja updateCaja(Caja caja);

	public void deleteCajaByNumreferencia(String numreferencia);

	public Caja cajaByNumreferencia(String numreferencia);
}
