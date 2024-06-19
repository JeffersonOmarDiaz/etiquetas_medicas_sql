package com.postgre.sql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgre.sql.entity.AsignacionMuestra;
import com.postgre.sql.repository.IAsignacionMuestra;

@Service
public class AsignacionMuestraService {
	
	@Autowired
	private IAsignacionMuestra asignacionMuestraR;
	
	//lista de asignaciones de muestra
	public List<AsignacionMuestra> getAllAsignacionesMuestra(){
		return asignacionMuestraR.findAll();
	}
	
	//
	public Optional<AsignacionMuestra> getAsignacionMuestraById(Long id){
		return asignacionMuestraR.findById(id);
	}
	
	public void saveAsignacion(AsignacionMuestra asignacionMuestra) {
         asignacionMuestraR.save(asignacionMuestra);
    }

    public void deleteAsignacion(Long id) {
    	asignacionMuestraR.deleteById(id);
    }
}
