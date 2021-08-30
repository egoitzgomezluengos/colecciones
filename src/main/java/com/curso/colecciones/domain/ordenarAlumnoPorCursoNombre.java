package com.curso.colecciones.domain;

import java.util.Comparator;

public class ordenarAlumnoPorCursoNombre implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		int r = 0;
		
		int cursoComparar = o1.getCurso() - o2.getCurso();
		int nombreComparar = o1.getNombre().compareTo(o2.getNombre());
		
		if(cursoComparar == 0 && nombreComparar == 0) {
			r = 0;
		}else if (cursoComparar != 0) {
			r= cursoComparar;
		}else {
			r= nombreComparar;
		}
		
		return r;
	}

}
