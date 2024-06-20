package com.postgre.sql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_tipoPrueba")
public class TipoPrueba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tipoPruebaId;
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name = "departamentoId", nullable = false)
    private Departamento departamento;
}
