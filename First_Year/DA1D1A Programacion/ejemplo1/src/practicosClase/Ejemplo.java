package practicosClase;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double pulgadas;
		double conversion;
		
		System.out.println("Introduce la medida en pulgadas");
		pulgadas = entrada.nextFloat();
		conversion = pulgadas * 2.54;
		System.out.println("La medida de " + pulgadas + " pulgadas es " + conversion);
		
		entrada.close();
		
		
	}

}
