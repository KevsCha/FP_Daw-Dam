package practicosClase;

import java.util.Scanner;

public class Practico16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("Introduce la cantidad de veces que quieres visualizar el multiplo de 4");
		num = entrada.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(sum);
			sum += 4;
		}
		entrada.close();
	}

}
