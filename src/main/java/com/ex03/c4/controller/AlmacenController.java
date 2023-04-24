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

import com.ex03.c4.dto.Almacen;
import com.ex03.c4.service.AlmacenServiceImpl;


/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class AlmacenController {


	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listDepartmentos(){
		return almacenServiceImpl.listAlmacens();
	}
	
	@PostMapping("/almacenes")
	public Almacen saveAlmacen(@RequestBody Almacen almacen) {
		
		return almacenServiceImpl.saveAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenXID(@PathVariable(name="codigo") int codigo) {
		
		return almacenServiceImpl.almacenXID(codigo);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen updateAlmacen(@PathVariable(name="codigo")int codigo,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(codigo);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.updateAlmacen(almacen_seleccionado);
		
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void deleteAlmacen(@PathVariable(name="codigo")int codigo) {
		almacenServiceImpl.deleteAlmacen(codigo);
	}
	
	
	
}
