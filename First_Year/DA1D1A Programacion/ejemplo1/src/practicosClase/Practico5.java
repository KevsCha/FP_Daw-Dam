package practicosClase;

import java.util.Scanner;

public class Practico5 {
	public static void main(String[] args) {
		//Una discoteca tiene las siguientes reglas para permitir la entrada:
			//La persona debe tener 18 años o más.
			//Pueden entrar a la discoteca personas de 17 años, solo si es viernes y vienen acompañado de un adulto.
			// Como segurata, usa el programa para saber si las personas pueden entrar o no.
		Scanner entrada = new Scanner(System.in);
		int edad;
		String dia;
		
		System.out.println("Introduce la edad");
		edad = entrada.nextInt();
		
		if (edad >= 18)
			System.out.println("Es mayor, puede entrar a la discoteca");
		else if(edad == 17) {
			System.out.println("Que dia de la semana es??");
			dia = entrada.next().toLowerCase();
			System.out.println(dia);
			if(dia.equals("viernes")) {
				System.out.println("La persona viene acompañado de un adulto? [SI] o [NO]");
				Boolean adulto = entrada.next().toLowerCase().equals("si") ? true : false;
				if(adulto)
					System.out.println("Adulto prensente, puede ingresar");
				else
					System.out.println("Sin adulto, no entras");
				
			}else {
				System.out.println("No es viernes, no entras");
			}
		}else {
			System.out.println("No puede entrar, la persona es menor de edad");
		}
		entrada.close();
	}
}
