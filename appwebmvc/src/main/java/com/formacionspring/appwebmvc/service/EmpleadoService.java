package com.formacionspring.appwebmvc.service;

import java.util.List;

import com.formacionspring.appwebmvc.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> listarTodosLosEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleadoPorId(Long id);
	
	public void eliminarEmpleado(Long id);
}
