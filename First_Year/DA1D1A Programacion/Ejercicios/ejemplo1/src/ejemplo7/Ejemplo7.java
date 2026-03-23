package ejemplo7;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// Realizar un programa Java que convierta kilómetros en millas. Recordar que:
		// 1 milla marina = 1852 metros 
		// 1 milla terrestre = 1609 metros
		
		Scanner entrada = new Scanner(System.in);
		float distanciaK;
		final float millaM = 1852;
		final float millaT = 1609;
		float conversionMM;
		float conversionMT;
		
		System.out.println("Introduce la cantidad en Km para convertirla en millas");
		distanciaK = entrada.nextFloat();
		System.out.println("|- La conversion de " + distanciaK +" KM a Millas es:");
		distanciaK = distanciaK * 1000;
		
		conversionMM = distanciaK * 1 / millaM;
		conversionMT = distanciaK * 1 / millaT;
		System.out.println("| " + conversionMM + " Millas Marinas ----");
		System.out.println("| " + conversionMT+ " Millas Terrestres ----");
		entrada.close();
	}

}
