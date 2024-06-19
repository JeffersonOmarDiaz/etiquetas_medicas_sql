package com.postgre.sql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgre.sql.entity.TipoPrueba;
import com.postgre.sql.repository.ITipoPruebaRepository;

@Service
public class TipoPruebaService {

	@Autowired
	private ITipoPruebaRepository tipoPruebaRepo;
	
	public List<TipoPrueba> getAllTipoPrueba() {
		return tipoPruebaRepo.findAll();
	}
	
	public Optional<TipoPrueba> getTipoPruebaById(Long id){
		return tipoPruebaRepo.findById(id);
	}
	
	public TipoPrueba saveTipoPrueba(TipoPrueba tipoPrueba) {
		return tipoPruebaRepo.save(tipoPrueba);
	}
	
	public void deleteTipoPrueba(Long id) {
		tipoPruebaRepo.deleteById(id);
	}
}
