package com.postgre.sql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgre.sql.entity.TipoPrueba;
import com.postgre.sql.service.TipoPruebaService;

@RestController
@RequestMapping("/api/v1/tipo_prueba")
public class TipoPruebaController {

	@Autowired
	private TipoPruebaService tipoPruebaService;
	
	@GetMapping
	public List<TipoPrueba> getAllTipoPrueba(){
		return tipoPruebaService.getAllTipoPrueba();
	}
	
	@GetMapping("/{id}")
	public Optional<TipoPrueba> getTipoPruebaById(@PathVariable("id") Long id){
		return tipoPruebaService.getTipoPruebaById(id);
	}
	
	@PostMapping
	public TipoPrueba createTipoPrueba(@RequestBody TipoPrueba tipoPrueba) {
		return tipoPruebaService.saveTipoPrueba(tipoPrueba);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTipoPrueba(@PathVariable("id") Long id) {
		tipoPruebaService.deleteTipoPrueba(id);
	}
}
