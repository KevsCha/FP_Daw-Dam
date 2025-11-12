package ejemplo16; 

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int sum = 0;
		int contador = 1;
		while(contador <= 1000) {
			System.out.println("Suma de " + sum + " + " + contador + " = " + (sum + contador));
			sum = sum + contador;
			contador++;
		}
		//System.out.println("Suma de " + sum + " + " + contador + " = " + (sum + contador));
		
		System.out.println(1001 * (1000/2));
		entrada.close();
	}

}
