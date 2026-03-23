package practicosClase;

import java.util.Scanner;

public class Practica18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//pedir un numero que quieres su tabla de multiplicar y sacar los anteriores
		// ejemplo 3 y tambien mostrar 2 y 1
		int num;
		num = scanner.nextInt();

		while (num < 0) {
			System.out.println("Numero menor a 0, introduce otro numero");
			num = scanner.nextInt();
		}
		for(int i = 1; i <= num ; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			if (i != num )
				System.out.println("-------------------\n");
		}
		scanner.close();
	}

}
