package objetos.colegio;

public class Profesor {
	private Alumno alumno;
	private Asignatura asignatura1, asignatura2, asignatura3;
	private double media;
	
	public void ponerNota(Alumno alumno) {
		alumno.getAsignatura1().setCalificacion(Math.random() * 10);;
		alumno.getAsignatura2().setCalificacion(Math.random() * 10);;
		alumno.getAsignatura3().setCalificacion(Math.random() * 10);;
	}
	public void ponerNotas(Alumno idAlumno) {
		this.alumno = idAlumno;
		this.asignatura1.setCalificacion(Math.random() * 10);
		this.asignatura2.setCalificacion(Math.random() * 10);
		this.asignatura3.setCalificacion(Math.random() * 10);
	}
}
