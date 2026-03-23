package practicosClase;

import java.util.Scanner;

public class Practica17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int aux = 0;
		
		System.out.println("Introduce 50 numeros y mostrar el numero mas pequeño");
		for(int i = 0; i < 5; i++) {
			num = entrada.nextInt();
			if (num < aux)
				aux = num;
		}
		System.out.println("El numero mas pequeño que se ha introducido es: " + aux);
		entrada.close();
	}

}
