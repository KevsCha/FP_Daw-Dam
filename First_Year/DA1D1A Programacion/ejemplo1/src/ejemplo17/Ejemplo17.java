package ejemplo17;

import java.util.Scanner;

public class Ejemplo17 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int num;
		int numSumados = 0; 
		int i = 0;
		
		System.out.println("Introduce 50 numeros");
		while(i < 50) {
			num = entrada.nextInt();
			numSumados = num + numSumados;
			i++;
		}
		
		System.out.println("La suma total es: " + numSumados + "\nY la media es: " + numSumados / 50);
		entrada.close();
	}

}
