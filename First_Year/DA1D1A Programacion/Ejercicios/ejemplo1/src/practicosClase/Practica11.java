package practicosClase;

import java.util.Scanner;

public class Practica11 {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		int num;
		int i= 1;
		String aux = "";
		
		System.out.println("Introduce un numero para ver una piramide");
		num = entrada.nextInt();
		while (i <= num) {
			aux = aux + i;
			System.out.println(aux);
			i++;
		}
		
		entrada.close();
	}

}
