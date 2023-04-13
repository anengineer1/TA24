package com.ta24.crud.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
	private String trabajo;

	@Column(name = "salario")
	private int salario;

	public Empleado() {
		this.setNombre("");
		this.setTrabajo("Operario");
	}

	public Empleado(String nombre, String trabajo) {
		this.setNombre(nombre);
		this.setTrabajo(trabajo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		switch (this.trabajo) {
		case "Comercial":
			this.salario = 1300;
			break;

		case "Tecnico":
			this.salario = 1400;
			break;

		case "Operario":
			this.salario = 1200;
			break;

		default:
			break;
		}
	}

}
