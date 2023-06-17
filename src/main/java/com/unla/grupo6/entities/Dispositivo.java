package com.unla.grupo6.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) // See more in https://www.baeldung.com/hibernate-inheritance

@Table(name = "dispositivo")
public class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idDispositivo;

	@Column(name = "nombre")
	protected String nombre;

	@Column(name = "descripcion")
	protected String descripcion;

	@Column(name = "enFuncionamiento")
	protected boolean enFuncionamiento;

	public Dispositivo(String nombre, String descripcion, boolean enFuncionamiento) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.enFuncionamiento = enFuncionamiento;
	}

	public Dispositivo(String nombre) {
		this.nombre = nombre;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEnFuncionamiento() {
		return enFuncionamiento;
	}

	public void setEnFuncionamiento(boolean enFuncionamiento) {
		this.enFuncionamiento = enFuncionamiento;
	}

}
