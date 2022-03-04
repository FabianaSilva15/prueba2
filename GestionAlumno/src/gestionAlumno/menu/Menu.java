package gestionAlumno.menu;


import java.util.Scanner;

import gestionAlumno.alumno.Alumno;
import gestionAlumno.gestor.Gestor;

public class Menu {

	private Scanner teclado = null;
	private Gestor gestor = null;

	public Menu() {
		teclado = new Scanner(System.in);
		gestor = new Gestor();
	}

	public void iniciar() {
		int opcion = 0;
		do {
			opcion = opcionMenu();
			if (opcion != 0) {
				ejecutarOpcionMenu(opcion);
				System.out.println(" ");
			}
		} while (opcion != 0);
		System.out.print("Adios!!!");
	}
	
	private int opcionMenu() {
		int ret = 0;
		do {
			try {
				escribirMenu();
				System.out.print("Elija una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) && (ret > 3));
		return ret;
	}

	private void escribirMenu() {
		System.out.println("---- MENU ----");
		System.out.println("---- 0 - SALIR ");
		System.out.println("---- 1 - Añadir  un  Alumno ");
		System.out.println("---- 2 - Visualizar todos los Alumnos ");
		System.out.println("---- 3 - Visualizar un Alumno ");
		System.out.println("--------------");
	}

	private void ejecutarOpcionMenu(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Introduzca nuevo alumno...");
			Alumno alumno = introducirNuevoAlumno();
			gestor.anadirAlumno(alumno);
			System.out.println(alumno.getNombre() + " introducido...");
			break;
			
		case 2:
			System.out.println("Buscando todos los alumnos...");
			Alumno[] todosLosAlumnos = gestor.getTodosAlumnos();
			mostrarTodosLosAlumnos(todosLosAlumnos);
			break;
			
		case 3:
			System.out.println("Buscando por nombre...");
			System.out.print("Nombre: ");
			String nombre = leerOperandoText();
			Alumno miAlumno = gestor.getAlumno(nombre);
			mostrarAlumno(miAlumno);
			break;
		}
	}
	
	private int leerOperandoInt() {
		int ret = 0;
		do {
			try {
				System.out.print(" : ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while (ret < 0);
		return ret;
	}

	private String leerOperandoText() {
		String ret = null;
		try {
			System.out.print(" : ");
			ret = teclado.nextLine();
		} catch (Exception e) {
			teclado.nextLine();
		}
		return ret;
	}

	private Alumno introducirNuevoAlumno() {
		Alumno ret = new Alumno();
		System.out.println("-- Datos del Alumno --");
		System.out.print("Nombre - ");
		ret.setNombre(leerOperandoText());
		System.out.print("Apellido 1 - ");
		ret.setApellido1(leerOperandoText());
		System.out.print("Apellido 2 - ");
		ret.setApellido2(leerOperandoText());
		System.out.print("Fecha De Nacimiento - ");
		ret.setFechaDeNacimiento(leerOperandoText());
		System.out.print("Curso - ");
		ret.setCurso(leerOperandoInt());
		System.out.print("Clase - ");
		ret.setClase(leerOperandoInt());
		System.out.println("----------");
		return ret;
	}

	private void mostrarTodosLosAlumnos(Alumno[] todosLosAlumnos) {
		for (int i = 0; i < todosLosAlumnos.length; i++) {
			if (null != todosLosAlumnos[i]) {
				System.out.println("Alumno [" + i + "] ...");
				mostrarAlumno(todosLosAlumnos[i]);
			}
		}
	}
	
	private void mostrarAlumno(Alumno alumno) {
		System.out.println("----------");
		if (null != alumno) {
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellido 1: " + alumno.getApellido1());
			System.out.println("Apellido 2: " + alumno.getApellido2());
			System.out.println("Fecha De Nacimiento: " + alumno.getFechaDeNacimiento());
			System.out.println("Curso: " + alumno.getCurso());
			System.out.println("Clase: " + alumno.getClase());
		} else {
			System.out.println("Sin datos");
		}
		System.out.println("----------");
	}
}
