/**
 * 
 */
package com.ta24.crud.service;

import java.util.List;

import com.ta24.crud.dto.Empleado;

/**
 * @author Francisco
 *
 */
public interface IEmpleadoService  {

	public List<Empleado> listEmpleados(); // List everything in the db;
	
	public Empleado saveEmpleado(Empleado empleado); // save Empleado into db; Create
	
	public Empleado getEmpleadoById(Long id); // get an Empleado giving its ID; Read
	
	public List<Empleado> listEmpleadoByName(String nombre);
	
	public List<Empleado> listEmpleadoByJob(String trabajo);
	
	public Empleado updateEmpleado(Empleado empleado); // UPDATE data
	
	public void deleteEmpleado(long id); // DELETE data
}
