package ejemplo28;

import java.util.Scanner;

public class Ejemplo28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dividendo;
		int divisor;
		int aux = 0;
		int cociente = 0;
		int resto = 0;
		
		System.out.println("Introduce 2 numeros para sacar el resto y el cociente");
		System.out.println("Introduce dividendo");
		dividendo = entrada.nextInt();
		System.out.println("Introduce divisor");
		divisor = entrada.nextInt();
		
		while ((cociente * divisor) < dividendo) 
			cociente++;
		
		if ((cociente * divisor) > dividendo)
			cociente--;
		
		aux = cociente * divisor;
		
		while (aux <= dividendo){
			aux++;
			resto++;
		}
		System.out.println("Cociente es igual a: " + cociente);
		System.out.println("Resto es igual a: " + resto);
		entrada.close();
	}
}