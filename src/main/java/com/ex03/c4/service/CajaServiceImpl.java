/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.ICajaDAO;
import com.ex03.c4.dto.Caja;


/**
 * @author elena-01
 *
 */

@Service
public class CajaServiceImpl implements CajaService{
	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja saveCaja(Caja caja) {
		System.out.println("***** Este caja : "+caja);
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaByNumreferencia(String numreferencia) {
		
		return iCajaDAO.findById(numreferencia).get();
	}

	@Override
	public Caja updateCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void deleteCajaByNumreferencia(String numreferencia) {
		
		iCajaDAO.deleteById(numreferencia);
	}

}
