package com.curso.colecciones.domain;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

	//variables
	private int id;
	private String nombre;
	private int curso;
	
	//constructores
	public Alumno(String nombre, int curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}
	
	public Alumno(int id, String nombre, int curso) {
		this(nombre,curso);
		this.id = id;
	}



	//metodos getter y setters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCurso() {
		return curso;
	}
	
	//otros metodos
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", curso=" + curso + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.id - o.getId();
	}
	
	
	
	
}
