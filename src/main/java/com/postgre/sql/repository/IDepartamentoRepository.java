package com.postgre.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.sql.entity.Departamento;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Long>{

}
