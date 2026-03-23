package ejemplo3;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double catetoA;
		double catetoB;
		double hipotenusa;
		
		System.out.println("Introduce el cateto A de un triangulo");
		catetoA = entrada.nextDouble();
		System.out.println("Introduce el cateto B de un triangulo");
		catetoB = entrada.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + catetoB * catetoB);
		System.out.println("La hipotenusa es: " + hipotenusa);
		entrada.close();
	}
	

}
