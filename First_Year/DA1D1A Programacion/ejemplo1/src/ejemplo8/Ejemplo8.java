package ejemplo8;

import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// Realizar un programa Java que calcule la cantidad total a pagar por una llamada telefónica de acuerdo a las siguientes premisas:
			 //a.-  Toda llamada que dure menos de tres minutos tiene un  coste de diez pesetas.
			 //b.-  Cada minuto adicional a partir de los tres primeros es un paso de contador y cuesta 5 pesetas
		Scanner entrada = new Scanner(System.in);
		
		double mnsSimulacro; 
		System.out.println("Simulacro de tiempo estimado de lladadas, introduce los minutos de llamada telefonica");
		
		mnsSimulacro = entrada.nextDouble();
		if (mnsSimulacro < 3) {
			System.out.println("Tu lladama duro menos de 3mns, total a pagar 10pst");
		}else if((mnsSimulacro = mnsSimulacro - 3) > 0){
			System.out.println("Tu llamada sobrepasa los 3mns, deberas pagar 5pst extra por minuto");
			int extra = (int)mnsSimulacro * 5;
			System.out.println("Tu llamada tiene un coste de: " + 3 + extra);
		}
	}

}
