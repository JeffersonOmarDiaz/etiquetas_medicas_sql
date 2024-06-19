package com.postgre.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.sql.entity.Etiqueta;

@Repository
public interface IEtiquetaRepository extends JpaRepository<Etiqueta, Long>{

}
