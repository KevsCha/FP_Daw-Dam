package ejemplo12;

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num; 
		
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		if (num >= 10 && num <= 100)
			System.out.println("El numero " + num + " esta entre 10 y 100");
		else
			System.out.println("El numero no esta en el rango de 10 y 100");
		
		entrada.close();
	}

}
