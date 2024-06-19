package com.postgre.sql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgre.sql.entity.Departamento;
import com.postgre.sql.repository.IDepartamentoRepository;

@Service
public class DepartamentoService {

	 @Autowired
	    private IDepartamentoRepository departamentoRepository;

	    public List<Departamento> getAllDepartamentos() {
	        return departamentoRepository.findAll();
	    }

	    public Optional<Departamento> getDepartamentoById(Long id) {
	        return departamentoRepository.findById(id);
	    }

	    public Departamento saveDepartamento(Departamento departamento) {
	        return departamentoRepository.save(departamento);
	    }

	    public void deleteDepartamento(Long id) {
	        departamentoRepository.deleteById(id);
	    }
}
