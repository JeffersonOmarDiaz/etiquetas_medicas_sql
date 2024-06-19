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

import com.postgre.sql.entity.Etiqueta;
import com.postgre.sql.service.EtiquetaService;

@RestController
@RequestMapping("/api/v1/etiquetas")
public class EtiquetaController {

	@Autowired
	private EtiquetaService etiquetaService;
	
	@GetMapping
	public List<Etiqueta> getAllEtiquetas(){
		return etiquetaService.getAllEtiquetas();
	}
	
	@GetMapping("/{id}")
	public Optional<Etiqueta> getEtiquetaById(@PathVariable("id") Long id){
		return etiquetaService.getEtiquetaById(id);
	}
	
	@PostMapping
	public Etiqueta createEtiqueta(@RequestBody Etiqueta etiqueta) {
		return etiquetaService.saveEtiqueta(etiqueta);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEtiqueta(@PathVariable("id") Long id) {
		etiquetaService.deleteEtiqueta(id);
	}
}
