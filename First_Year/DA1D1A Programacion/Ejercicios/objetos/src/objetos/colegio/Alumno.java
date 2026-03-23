package objetos.colegio;

public class Alumno {
	private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;
	
	public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {

		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.asignatura3 = asignatura3;
	}
	
	public Alumno(int asignaturaId1, int asignaturaId2, int asignaturaId3) {
		this.asignatura1 = new Asignatura(asignaturaId1);
		this.asignatura2 = new Asignatura(asignaturaId2);
		this.asignatura3 = new Asignatura(asignaturaId3);		
	}
	public Asignatura getAsignatura1() {
		return asignatura1;
	}
	public void setAsignatura1(Asignatura asignatura1) {
		this.asignatura1 = asignatura1;
	}
	public Asignatura getAsignatura2() {
		return asignatura2;
	}
	public void setAsignatura2(Asignatura asignatura2) {
		this.asignatura2 = asignatura2;
	}
	public Asignatura getAsignatura3() {
		return asignatura3;
	}
	public void setAsignatura3(Asignatura asignatura3) {
		this.asignatura3 = asignatura3;
	}
	// 10 de noviembre pa adelante(lo decidimos nosotros) TEMA 1, TEMA 2 y TEMA 3
}
