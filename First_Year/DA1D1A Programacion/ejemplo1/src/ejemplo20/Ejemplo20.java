package ejemplo20;

import java.util.Scanner;

public class Ejemplo20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int multiplo = 0;
		int i = 0;
		
		System.out.println("Introduce la cantidad de veces que quieres visualiza el multiplo de 4");
		num = entrada.nextInt();
		
		while(i < num) {
			System.out.println("Multiplo de 4 es: " + multiplo);
			multiplo += 4;
			i++;
		}
		
		entrada.close();
	}

}
