package com.formacionspring.appwebmvc.service;

import java.util.List;

import com.formacionspring.appwebmvc.entity.Departamento;

public interface DepartamentoService {
	
	public List<Departamento> listarTodosLosDepartamentos();
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento obtenerDepartamentoPorId(Long id);
	
	public void eliminarDepartamento(Long id);

}
