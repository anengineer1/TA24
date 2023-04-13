package com.ta24.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta24.crud.dto.Empleado;
import com.ta24.crud.service.EmpleadoServiceImpl;
import com.ta24.crud.utils.Job;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listEmpleados() {
		return empleadoServiceImpl.listEmpleados();
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listEmpleadosNombre(@PathVariable(name="nombre") String nombre) {
		return empleadoServiceImpl.listEmpleadoByName(nombre);
	}
	
	@GetMapping("/empleados/trabajo/{nombre}")
	public List<Empleado> listEmpleadosJob(@PathVariable(name="nombre") String nombre) {
		return empleadoServiceImpl.listEmpleadoByJob(nombre);
	}
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.saveEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Long id) {
		
		Empleado empleado_xid= new Empleado();
		
		empleado_xid= empleadoServiceImpl.getEmpleadoById(id);
		
		System.out.println("Empleado XID: "+ empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado updateEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.getEmpleadoById(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		
		empleado_actualizado = empleadoServiceImpl.updateEmpleado(empleado_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.deleteEmpleado(id);
	}
}
