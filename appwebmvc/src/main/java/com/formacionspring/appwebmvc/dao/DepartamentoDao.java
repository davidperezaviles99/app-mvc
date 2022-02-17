package com.formacionspring.appwebmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.appwebmvc.entity.Departamento;

@Repository
public interface DepartamentoDao extends JpaRepository<Departamento,Long> {

}
