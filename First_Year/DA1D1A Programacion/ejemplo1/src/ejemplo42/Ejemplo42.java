package ejemplo42;

import java.util.Scanner;

public class Ejemplo42 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int positivos = 0;
		int contPos = 0;
		int negativos = 0;
		int contNega = 0;
		int resultado = 0;
		
		System.out.println("Introduce valores para obtener la media aritmetica, si pulsas algun 0 el programa se cerrara");
		while ((num = entrada.nextInt())  != 0) {
			if (num > 0) {
				positivos = positivos + num;
				contPos++;
			}
			if (num < 0) {
				negativos = negativos + num;
				contNega++;
			}
		}
		resultado = positivos + negativos;
		if (contPos != 0) {
			System.out.println("Numeros introducidos en positivos: " + contPos + "\nNumeros positivos: " + positivos + "\nMedia aritmetica de positivos: " + positivos / contPos);
			System.out.println("\n----------------------------------\n");
		}
		if (contNega != 0 ) {
			System.out.println("Numeros introducidos en negativos: " + contNega + "\nNumeros negativos: " + negativos + "\nMedia aritmetica de negativos: " + negativos / contNega);
			System.out.println("\n----------------------------------\n");
		}
		System.out.println("La media aritmetica total es: " + resultado / (contNega + contPos));
		System.out.println("Se cerro el programa");
		entrada.close();
	}

}
