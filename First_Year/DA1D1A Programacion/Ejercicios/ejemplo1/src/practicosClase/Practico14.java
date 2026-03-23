package practicosClase;

import java.util.Scanner;

public class Practico14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		long factorial = 1;
		
		num = entrada.nextInt();
		System.out.println("El factorial de " + num + " es:");
		if (num == 0)
			System.out.print(1);
		for(int i = 0; i < num && num != 0; i++) {
			System.out.print(num - i);
			factorial = (num - i) * factorial;
			if (i != num - 1) {				
				System.out.print(" * ");
			}
			//if (i != 0)
		}
		System.out.println("");
		System.out.println(factorial);
		entrada.close();
	}

}
