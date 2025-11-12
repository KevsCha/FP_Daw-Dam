package ejemplo13;

import java.util.Scanner;

public class Ejemplo13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		int num;
		int resultado;
		
		System.out.println("Introduce un numero del 1 al 9");
		num = entrada.nextInt();
		while (!(num >= 1 && num <= 10)) {
			System.out.println("El numero no esta en el rango, vuelve a introducir el numero");
			num = entrada.nextInt();
		}		
		System.out.println("Tabla de multiplicar del " + num);
		while (contador <= 10) {
			resultado = num * contador;
			System.out.println("Multiplicacion: " + num + " X " + contador + " = " + resultado);
			contador++;
		}
		entrada.close();
	}
}
