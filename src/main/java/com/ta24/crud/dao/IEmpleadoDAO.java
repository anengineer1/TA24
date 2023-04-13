/**
 * 
 */
package com.ta24.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta24.crud.dto.Empleado;

/**
 * @author Francisco
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

	// Listar por nombre
	public List<Empleado> findByNombre(String nombre);
	
	// Listar por Trabajo
	public List<Empleado> findByTrabajo(String trabajo);
	
}
