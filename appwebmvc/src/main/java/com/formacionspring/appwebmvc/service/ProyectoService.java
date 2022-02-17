package com.formacionspring.appwebmvc.service;

import java.util.List;

import com.formacionspring.appwebmvc.entity.Proyecto;

public interface ProyectoService {
	
public List<Proyecto> listarTodosLosProyectos();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto obtenerProyectoPorId(Long id);
	
	public void eliminarProyecto(Long id);

}
