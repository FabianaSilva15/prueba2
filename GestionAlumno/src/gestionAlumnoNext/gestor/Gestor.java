package gestionAlumnoNext.gestor;

import gestionAlumnoNext.alumno.Alumno;

public class Gestor {

	private Alumno[] alumnos = null;

	public Gestor() {
		alumnos = new Alumno[20];
	}

	public void anadirAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				alumnos[i] = alumno;
			}
		}
	}

	public Alumno[] getTodosAlumnos() {
		return alumnos;
	}

	public Alumno getAlumno(String nombre) {
		Alumno ret = null;
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				continue;
			} else if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
				ret = alumnos[i];
			} 
		}
		return ret;
	}
	
	public void modificarAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				continue;
			} else if (alumnos[i].getNombre().equalsIgnoreCase(alumno.getNombre())) {
				alumnos[i] = alumno;
			} 
		}
	}
	
	public void borrarAlumno(String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				continue;
			} else if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
				alumnos[i] = null;
			} 
		}
	}

}