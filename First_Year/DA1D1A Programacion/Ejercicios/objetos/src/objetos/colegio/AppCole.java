package objetos.colegio;

public class AppCole {

	public static void main(String[] args) {
	
		Asignatura asignatura1 = new Asignatura(1);
		Asignatura asignatura2 = new Asignatura(2);
		Asignatura asignatura3 = new Asignatura(3);
		Alumno alumno = new Alumno(23, 12, 10);
		Profesor profesor = new Profesor();
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		profesor.ponerNota(alumno);
		
		nota1 = alumno.getAsignatura1().getCalificacion();
		nota2 = alumno.getAsignatura2().getCalificacion();
		nota3 = alumno.getAsignatura3().getCalificacion();
		System.out.println("Calificacion por asignatura");
		System.out.println("Asignatura 1: " + nota1);
		System.out.println("Asignatura 2: " + nota2);
		System.out.println("Asignatura 3: " + nota3);
		
		media = nota1 + nota2 + nota3;
		
		System.out.println("Media de las calificacion: " + media / 3);
		
	}

}
