package practicosClase;

import java.util.Scanner;

public class Practica3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int num2;
		
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		System.out.println("Introduce otro numero");
		num2 = entrada.nextInt();
		
		if(num > num2)
			System.out.println("El primer numero " + num + " es mayor que el segundo numero " + num2);
		else if(num == num2)
			System.out.println("Ambos numeros son iguales");
		else
			System.out.println("El segundo numero " + num2 + " es mayor que el primer numero " + num);
		entrada.close();

	}
//Pedir 2 numero por teclado y el programa muestra el 1ro es mayor que el 2do o si los 2 son iguales
}
