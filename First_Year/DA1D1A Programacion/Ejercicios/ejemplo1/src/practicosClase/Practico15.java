package practicosClase;

import java.util.Scanner;

public class Practico15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce el numero por el cual deseas multiplicar");
		num = entrada.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
		entrada.close();
	}

}
