package practicosClase;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double altura;
		double radio;
		double superficieLat;
		double superficieBas;
		double volumen;
		
		
		System.out.println("Introduce la altura del cilindro");
		altura = entrada.nextDouble();
		System.out.println("Introduce el radio del cilindro");
		radio = entrada.nextDouble();
		
		superficieLat = 2 * Math.PI * radio * altura;
		superficieBas = Math.PI * radio * radio; 
		volumen = Math.PI * radio * radio * altura;
		
		System.out.println("La superficie lateral es: " + superficieLat);
		System.out.println("La superficie base es: " + superficieBas);
		System.out.println("El volumen es: " + volumen);
		
		
		entrada.close();
	}

}
