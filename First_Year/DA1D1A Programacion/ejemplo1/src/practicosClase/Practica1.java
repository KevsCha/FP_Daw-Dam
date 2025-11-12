package practicosClase;

import java.util.Scanner;

public class Practica1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();
		if (num > 10) {			
			System.out.println("el numero es mayor a 10 el numero es " + num);
			if (num % 2 == 0)
				System.out.println("es par");
			else
				System.out.println("es impar");
		}else
			System.out.println("No es mayor a 10");

		entrada.close();
	}
}
