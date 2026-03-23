package practicosClase;

import java.util.Scanner;

public class Practica10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int aux = 0;
		int i = 10;
		System.out.println("Introduce N numero");
		while (i > 0) {
			num = entrada.nextInt();
			if(num > aux) {
				aux = num;
			}
			i--;
		}
		System.out.println("El numero mayor es de todos los que se ingresaron es: " + aux);
		entrada.close();
	}

}
