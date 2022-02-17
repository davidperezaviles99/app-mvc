package com.formacionspring.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.appwebmvc.dao.ProyectoDao;
import com.formacionspring.appwebmvc.entity.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService{
	
	@Autowired
	private ProyectoDao proyectoDao;

	@Override
	public List<Proyecto> listarTodosLosProyectos() {
		return proyectoDao.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return proyectoDao.save(proyecto);
	}

	@Override
	public Proyecto obtenerProyectoPorId(Long id) {
		return proyectoDao.findById(id).get();
	}

	@Override
	public void eliminarProyecto(Long id) {
		proyectoDao.deleteById(id);
	}

	

}
