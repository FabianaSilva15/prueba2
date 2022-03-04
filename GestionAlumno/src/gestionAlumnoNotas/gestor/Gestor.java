package gestionAlumnoNotas.gestor;

import java.util.ArrayList;
import gestionAlumnoNotas.alumno.Alumno;
import gestionAlumnoNotas.alumno.Notas;

public class Gestor {

	private ArrayList <Alumno> alumnos = null;

	public Gestor() {
		alumnos = new ArrayList <Alumno> ();
	}

	public void anadirAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}

	public ArrayList <Alumno> getTodosAlumnos() {
		return alumnos;
	}

	public Alumno getAlumno(String nombre) {
		Alumno ret = null;
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno temp = alumnos.get(i);
			if (temp.getNombre().equalsIgnoreCase(nombre)) {
				ret = temp;
				break;
			}
		}
		return ret;
	}
	
	public void modificarAlumno(Alumno alumno) {			
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno temp = alumnos.get(i);
			if (temp.getNombre().equalsIgnoreCase(alumno.getNombre())) {
				alumnos.remove(i);
				alumnos.add(alumno);
				break;
			}
		}
	}
	
	public void borrarAlumno(String nombre) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno temp = alumnos.get(i);
			if (temp.getNombre().equalsIgnoreCase(nombre)) {
				alumnos.remove(i);
				break;
			}
		}
	}
	
	public ArrayList <Notas> getTodasNotasAlumno(Alumno alumno) {
		return alumno.getNotas();
	}
	
	public void anadirNotaAAlumno(Alumno alumno, Notas nota) {
		
		nota.setAlumno(alumno);
		
		ArrayList <Notas> notas = alumno.getNotas();
		if (null == notas)
			notas = new ArrayList <Notas>();
		notas.add(nota);
		alumno.setNotas(notas);
	}

}
