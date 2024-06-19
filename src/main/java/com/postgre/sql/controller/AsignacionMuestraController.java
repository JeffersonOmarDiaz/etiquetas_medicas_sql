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

import com.postgre.sql.entity.AsignacionMuestra;
import com.postgre.sql.service.AsignacionMuestraService;

@RestController
@RequestMapping("/api/v1/asignaciones")
public class AsignacionMuestraController {

	 @Autowired
	    private AsignacionMuestraService asignacionMuestraService;

	    @GetMapping
	    public List<AsignacionMuestra> getAllAsignaciones() {
	        return asignacionMuestraService.getAllAsignacionesMuestra();
	    }

	    @GetMapping("/{id}")
	    public Optional<AsignacionMuestra> getAsignacionById(@PathVariable("id") Long id) {
	        return asignacionMuestraService.getAsignacionMuestraById(id);
	    }

	    @PostMapping
	    public AsignacionMuestra createAsignacion(@RequestBody AsignacionMuestra asignacionMuestra) {
	        asignacionMuestraService.saveAsignacion(asignacionMuestra);
	        return asignacionMuestra;
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAsignacion(@PathVariable("id") Long id) {
	        asignacionMuestraService.deleteAsignacion(id);
	    }
}
