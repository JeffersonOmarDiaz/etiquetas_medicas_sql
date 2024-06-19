package com.postgre.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.sql.entity.TipoPrueba;

@Repository
public interface ITipoPruebaRepository extends JpaRepository<TipoPrueba, Long>{

}
