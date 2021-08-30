package com.curso.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.curso.colecciones.domain.Alumno;
import com.curso.colecciones.domain.ordenarAlumnoPorCursoNombre;

public class Application
{
	public static void main( String[] args )
	{
		
		//1.set - 3 tipos
		// colecciones de objeto alumno
		// recorrer para mostrar datos del alumno

		
		Alumno alumno1 = new Alumno(4, "Perry", 7);
		Alumno alumno2 = new Alumno(1, "Egoitz", 1 );
		Alumno alumno3 = new Alumno(2, "Fran", 3);
		Alumno alumno4 = new Alumno(3, "Julen", 2);
		
		System.out.println("1- recorrer en cualquier orden");
		System.out.println("-------------------------------");
		
		Set<Alumno> sinOrden = new HashSet<Alumno>();
		sinOrden.add(alumno1);
		sinOrden.add(alumno2);
		sinOrden.add(alumno3);
		sinOrden.add(alumno4);
		
	
		for (Alumno al : sinOrden) {
			System.out.println(al.toString());
		}
		System.out.println("");
		
		System.out.println("2- Recorrer en orden de insercion");
		System.out.println("---------------------------------");
		
		Set<Alumno> ordenInsercion = new LinkedHashSet<Alumno>();
		ordenInsercion.add(alumno1);
		ordenInsercion.add(alumno2);
		ordenInsercion.add(alumno3);
		ordenInsercion.add(alumno4);
		
		for (Alumno alInser : ordenInsercion) {
			System.out.println(alInser.toString());
		}
		System.out.println("");
		
		System.out.println("3- recorrer en orden de id");
		System.out.println("---------------------------");
		
		Set<Alumno> ordenId = new TreeSet<Alumno>();
		ordenId.add(alumno1);
		ordenId.add(alumno2);
		ordenId.add(alumno3);
		ordenId.add(alumno4);
		
		for (Alumno alId : ordenId) {
			System.out.println(alId.toString());
		}
		System.out.println("");
		
		System.out.println("4- recorrer en orden de curso, nombre");
		System.out.println("--------------------------------------");
		Set<Alumno> ordenCursoNombre = new TreeSet<Alumno>(new ordenarAlumnoPorCursoNombre());
		ordenCursoNombre.add(alumno1);
		ordenCursoNombre.add(alumno2);
		ordenCursoNombre.add(alumno3);
		ordenCursoNombre.add(alumno4);
		
		for (Alumno alCursoNom : ordenCursoNombre) {
			System.out.println(alCursoNom.toString());
		}
		System.out.println("");
		
	}
}