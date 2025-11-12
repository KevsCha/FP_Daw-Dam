package practicosClase;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		if(num > 0 && num <=10 || num > 89 && num <= 100)
			System.out.println("El numero es " + num + " y es valido");
		else
			System.out.println("El numero es " + num + " y no es valido");
		entrada.close();

	}
//Pedir 2 numero por teclado y el programa muestra el 1ro es mayor que el 2do o si los 2 son iguales
	// inventar un enunciado donde tenga un condicional con && u || 
	// Ejercicio 6 
}
