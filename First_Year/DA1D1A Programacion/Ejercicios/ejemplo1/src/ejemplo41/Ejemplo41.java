package ejemplo41;

import java.util.Scanner;


public class Ejemplo41 {
//Realizar un programa Java que permita visualizar la suma de los múltiplos de 2 desde el 10 al 700.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 10; i <= 700; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		
		System.out.println("La suma de todos los multiplos de 2 desde el 10 hasta el 700 es:");
		System.out.println(sum);
		scanner.close();
		
	}

}
