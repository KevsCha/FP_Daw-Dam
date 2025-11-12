package ejemplo10;

import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un programa Java que permita resolver una ecuación de segundo grado.
				Scanner entrada = new Scanner(System.in);
				double a;
				double b;
				double c;
				double resultadoPositivo;
				double resultadoNegativo;
				double raizCuadrada;
				
				System.out.println("Ecucion de 2do grado, forma base =>> ax^2 + bx + c = 0");
				System.out.println("Para resolver la ecuacion de segundo grado, introduce los valores de los coeficientes a, b y c");
				a = entrada.nextInt();
				b = entrada.nextInt();
				c = entrada.nextInt();
				
				System.out.println("formula: " + a + "x^2 + "+ b + "x + "+ c+ " = 0");
				
				raizCuadrada = (b * b) - (4 * a * c);
				if (raizCuadrada > 0) {
					System.out.println("Existen 2 posibles soluciones: ");
					resultadoPositivo = (-b + Math.sqrt((b*b) - (4 * a * c))) / 2 * a;
					resultadoNegativo = (-b - Math.sqrt((b*b) - 4 * a * c)) / 2 * a;
					
					System.out.println("El resultado 1 es: " + resultadoPositivo);
					System.out.println("El resultado 2 es: " + resultadoNegativo);
				}else if (raizCuadrada == 0) {
					System.out.println("Existe una solucion posible: ");
					resultadoPositivo = -b /(2 * a);
					System.out.println("El resultado es: " + resultadoPositivo);
				}else
					System.out.println("La discriminante de la formula da menor a 0, no existe ninguna solucion");
				
				entrada.close();
	}

}
