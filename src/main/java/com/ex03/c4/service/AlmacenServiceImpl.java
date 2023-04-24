/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.IAlmacenDAO;
import com.ex03.c4.dto.Almacen;

/**
 * @author elena-01
 *
 */

@Service
public class AlmacenServiceImpl implements AlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listAlmacens() {

		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen saveAlmacen(Almacen almacen) {

		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(int id) {

		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen updateAlmacen(Almacen almacen) {

		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void deleteAlmacen(int id) {

		iAlmacenDAO.deleteById(id);

	}

}
