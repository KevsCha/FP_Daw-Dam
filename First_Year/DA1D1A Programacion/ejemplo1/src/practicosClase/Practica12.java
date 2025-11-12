package practicosClase;

import java.util.Scanner;

public class Practica12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int aux;
		int j;
		int i = 1;
		
		
		num = entrada.nextInt();
		while (i <= num) {
			j = 1;
			aux = 1;
			while (j <= num) {
				if(j < num - i + 1)
					System.out.print(" ");
				else {
					System.out.print(aux++);
				}
				j++;
			}
			System.out.println("");
			i++;
		}
		entrada.close();
	}
}
