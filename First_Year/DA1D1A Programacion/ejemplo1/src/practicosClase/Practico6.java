package practicosClase;

import java.util.Scanner;

public class Practico6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int option;
		int num;
		int resultado;
		
		System.out.println("Introduce un valor");
		num = entrada.nextInt();
		
		System.out.println("-----Introduce una opcion-----");
		System.out.println("1.- Cuadrado de un numero");
		System.out.println("2.- Raiz cuadrada");
		System.out.println("3.- Valor absoluto");
		System.out.println("4.- Multiplo de 3");
		System.out.println("5.- Salir");
		
		option = entrada.nextInt();
		
		switch (option) {
		case 1: resultado = num * num;
				System.out.println("El cuadrado de un numero es: " + resultado);
				break;
		case 2: resultado = (int)Math.sqrt(num);
				System.out.println("La raiz cuadrada es: " + resultado);
				break;
		case 3: resultado = num; 
			if (num < 0) 
				resultado = num * -1;
			System.out.println("El valor absoluto es: " + resultado);
			break;
		case 4: if (num % 3 == 0)
					System.out.println("El numero es multiplo de 3");
				else
					System.out.println("El numero no es multiplo de 3");
				break;
		case 5: System.out.println("Hasta luego!!!");
			break; 
		default:
			System.out.println("Opcion no valida");
		}
		entrada.close();
	}
}
