/**
 * 
 */
package com.ta24.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta24.crud.dao.IEmpleadoDAO;
import com.ta24.crud.dto.Empleado;
import com.ta24.crud.utils.Job;

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
		Job trabajo_actual = Job.OPERARIO;
		switch (trabajo) {
		case "OPERARIO":
			trabajo_actual = Job.OPERARIO;
			break;
			
		case "COMERCIAL":
			trabajo_actual = Job.COMERCIAL;
			break;
			
		case "TECNICO":
			trabajo_actual = Job.TECNICO;
			break;

		default:
			break;
		}
		return iEmpleadoDAO.findByTrabajo(trabajo_actual);
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
