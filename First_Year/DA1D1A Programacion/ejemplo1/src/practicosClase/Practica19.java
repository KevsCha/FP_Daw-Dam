package practicosClase;

import java.util.Scanner;

public class Practica19 {
	public static void main(String[] args) {
		//numero saber si es primo o no
		Scanner scanner = new Scanner(System.in);
		int num;
		int i = 1;
		int aux = 0;
		System.out.println("Introduce un numero para saber si es primo");
		num = scanner.nextInt();
		
		while (i <= num && aux <= 2) {
			if (num % i == 0)
				aux++;
			i++;
		}
		System.out.println(aux);
		if (aux == 2)
			System.out.println("El numero es Primo y compa");
		else
			System.out.println("No es primo");
		
		
	}
}
