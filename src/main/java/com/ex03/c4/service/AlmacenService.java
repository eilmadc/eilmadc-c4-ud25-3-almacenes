/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.Almacen;

/**
 * @author elena-01
 *
 */
public interface AlmacenService {

	public List<Almacen> listAlmacens(); 
	
	public Almacen saveAlmacen(Almacen almacen);
	
	public Almacen almacenXID(int id);
	
	public Almacen updateAlmacen(Almacen almacen); 
	
	public void deleteAlmacen(int id);
}
