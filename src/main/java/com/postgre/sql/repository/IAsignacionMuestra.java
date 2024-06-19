package com.postgre.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.sql.entity.AsignacionMuestra;

@Repository
public interface IAsignacionMuestra extends JpaRepository<AsignacionMuestra, Long>{

}
