/**
 * 
 */
package com.ex03.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex03.c4.dto.Caja;
import com.ex03.c4.service.CajaServiceImpl;

import jakarta.transaction.Transactional;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class CajaController {


	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listCajas(){
		return cajaServiceImpl.listCajas();
	}
	
	
	@PostMapping("/cajas")
	public Caja saveCaja(@RequestBody Caja caja) {
		System.out.println("****** Este caja :"+caja);
		return cajaServiceImpl.saveCaja(caja);
	}
	
	@GetMapping("/cajas/{numreferencia}")
	public Caja cajaByDni(@PathVariable(name="numreferencia") String numreferencia) {

		return cajaServiceImpl.cajaByNumreferencia(numreferencia);
	}
	
	@PutMapping("/cajas/{numreferencia}")
	public Caja updateCaja(@PathVariable(name="numreferencia")String numreferencia,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServiceImpl.cajaByNumreferencia(numreferencia);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServiceImpl.updateCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@Transactional
	@DeleteMapping("/cajas/{numreferencia}")
	public void deleteCajaByDni(@PathVariable(name="numreferencia")String numreferencia) {
		cajaServiceImpl.deleteCajaByNumreferencia(numreferencia);
	}
	
	
	
}
