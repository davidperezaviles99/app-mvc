package com.formacionspring.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.appwebmvc.dao.EmpleadoDao;
import com.formacionspring.appwebmvc.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public List<Empleado> listarTodosLosEmpleados() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return empleadoDao.findById(id).get();
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		empleadoDao.deleteById(id);
		
	}
}
