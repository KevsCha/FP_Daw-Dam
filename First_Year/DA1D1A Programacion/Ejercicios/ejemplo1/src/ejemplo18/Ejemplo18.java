package ejemplo18;

import java.util.Scanner;

public class Ejemplo18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int num = 2;
		int total = 0;
		
		System.out.println("Suma de los primero 10 numeros pares\nEl numero inicia con: " + num);
		while (i < 10) {
			if(num % 2 == 0) {
				total += num;
				System.out.println("Suma: " + total);
			}
			else
				num += 2;
			i++;
		}
		System.out.println("La suma de los 10 primeros numeros es: " + total);
		entrada.close();
	}

}
