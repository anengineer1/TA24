package com.ta24.crud.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ta24.crud.utils.Job;

@Entity
@Table(name = "empleado")
public class Empleado {

	// Atributos entidad trabajador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "trabajo")
	@Enumerated(EnumType.STRING)
	private Job trabajo;

	@Column(name = "salario")
	private int salario;

	public Empleado() {
		this.setNombre("");
		this.setTrabajo(Job.COMERCIAL);
	}

	public Empleado(String nombre, Job trabajo) {
		this.setNombre(nombre);
		this.setTrabajo(trabajo);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTrabajo(Job trabajo) {
		this.trabajo = trabajo;
		if (this.trabajo == Job.COMERCIAL) {
			this.salario = 1400;
		} else if (this.trabajo == Job.TECNICO) {
			this.salario = 1200;
		} else if (this.trabajo == Job.OPERARIO) {
			this.salario = 1600;
		} else {
			this.salario = 0;
		}
	}
	
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Job getTrabajo() {
		return trabajo;
	}

	public int getSalario() {
		return salario;
	}

}
