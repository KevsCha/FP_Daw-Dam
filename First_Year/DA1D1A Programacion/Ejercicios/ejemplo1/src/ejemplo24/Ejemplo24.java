package ejemplo24;

import java.util.Scanner;

public class Ejemplo24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resultado = 0;
		int a;
		int b;
		int i = 0;
		
		System.out.println("Introducir 2 numeros para ver el producto");
		System.out.println("Primer Numero");
		a = entrada.nextInt();
		System.out.println("Segundo Numero");
		b = entrada.nextInt();
		
			
		if (b < 0) {
			b = b * (-1);
		}
		while(i < b) {
			resultado = resultado + a;
			i++;
		}
		//Ver la manera de multiplicar solo los signos y colocarlo al resultado final 
		//if (a < 0 && b < 0)
		//	resultado = resultado * (-1);
		System.out.println("El producto de " + a + " x " + b + " = " + resultado);
		entrada.close();
	}

}
