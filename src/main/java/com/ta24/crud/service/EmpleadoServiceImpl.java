/**
 * 
 */
package com.ta24.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta24.crud.dao.IEmpleadoDAO;
import com.ta24.crud.dto.Empleado;

/**
 * @author yamir
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado getEmpleadoById(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listEmpleadoByName(String nombre) {
		return iEmpleadoDAO.findByNombre(nombre);
	}

	@Override
	public List<Empleado> listEmpleadoByJob(String trabajo) {
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void deleteEmpleado(long id) {
		iEmpleadoDAO.deleteById(id);
		
	}
	
}
