package gestionAlumnoNotas.alumno;

public class Notas {

	private String nombreAsignatura = null;
	private double notaEval1 = 0; 
	private double notaEval2 = 0;
	private double notaFinal = 0;
	
	private Alumno alumno = null;
		
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public double getNotaEval1() {
		return notaEval1;
	}
	public void setNotaEval1(double notaEval1) {
		this.notaEval1 = notaEval1;
	}
	public double getNotaEval2() {
		return notaEval2;
	}
	public void setNotaEval2(double notaEval2) {
		this.notaEval2 = notaEval2;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
}


