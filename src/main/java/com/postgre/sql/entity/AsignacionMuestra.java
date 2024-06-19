package com.postgre.sql.entity;

import jakarta.persistence.Column;
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
@Table(name = "tbl_asignacionMuestra")
public class AsignacionMuestra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long asignacionID;
	private String MuestraID;
	
	/*@ManyToOne
	@JoinColumn(name = "departamentoId", referencedColumnName = "departamentoId", nullable = false)
    private Departamento departamento;*/
	@Column(name = "departamentoId", nullable = false)
    private Long departamentoId;
}
