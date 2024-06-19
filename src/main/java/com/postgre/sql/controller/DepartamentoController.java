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

import com.postgre.sql.entity.Departamento;
import com.postgre.sql.service.DepartamentoService;

@RestController
@RequestMapping("/api/v1/departamentos")
public class DepartamentoController {
	 @Autowired
	    private DepartamentoService departamentoService;

	    @GetMapping
	    public List<Departamento> getAllDepartamentos() {
	        return departamentoService.getAllDepartamentos();
	    }

	    @GetMapping("/{id}")
	    public Optional<Departamento> getDepartamentoById(@PathVariable("id") Long id) {
	        return departamentoService.getDepartamentoById(id);
	    }

	    @PostMapping
	    public Departamento createDepartamento(@RequestBody Departamento departamento) {
	        return departamentoService.saveDepartamento(departamento);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteDepartamento(@PathVariable("id") Long id) {
	        departamentoService.deleteDepartamento(id);
	    }
}
