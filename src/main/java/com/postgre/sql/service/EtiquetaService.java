package com.postgre.sql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgre.sql.entity.Etiqueta;
import com.postgre.sql.repository.IEtiquetaRepository;

@Service
public class EtiquetaService {
	@Autowired
	private IEtiquetaRepository etiquetaRepository;
	
	public List<Etiqueta>getAllEtiquetas(){
		return etiquetaRepository.findAll();
	}
	
	public Optional<Etiqueta> getEtiquetaById(Long id){
		return etiquetaRepository.findById(id);
	}
	
	public Etiqueta saveEtiqueta(Etiqueta etiqueta) {
		return etiquetaRepository.save(etiqueta);
	}
	
	public void deleteEtiqueta(Long id) {
		etiquetaRepository.deleteById(id);
	}
}
