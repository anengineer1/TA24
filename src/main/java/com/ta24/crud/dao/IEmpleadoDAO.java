/**
 * 
 */
package com.ta24.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta24.crud.dto.Empleado;
import com.ta24.crud.utils.Job;

/**
 * @author Francisco
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

	// Listar por nombre
	public List<Empleado> findByNombre(String nombre);
	
	// Listar por Trabajo
	public List<Empleado> findByTrabajo(Job trabajo);
	
}
