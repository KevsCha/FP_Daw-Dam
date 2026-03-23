package ejemplo6;

import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un programa Java que permita calcular el precio de un billete de ida y vuelta  en avión, 
		//conociendo la DISTANCIA a recorrer, 
		//el NUMMERO DE DIAS de estancia 
		//y sabiendo que si la distancia es superior a 1000km  (CONDICION)
		//y el número de días de estancia es superior a 7, (CONDICION)
		//la línea aérea le hace un descuento del 30%. El precio por kilómetro recorrido es de 8.5 pts.
		
		Scanner entrada = new Scanner(System.in);
		double distanciaRec;
		double precioXkil;
		double descuento;
		int numDias;
		
		System.out.println("Introduce el recorrido del viaje en km");
		distanciaRec = entrada.nextDouble();
		System.out.println("Introduce la cantidad de dias de estancia");
		numDias = entrada.nextInt();
		precioXkil = distanciaRec * 8.5; 
		
		if (distanciaRec > 1000 && numDias > 7) {
			System.out.println("El precio del viaje:------ " + precioXkil);
			descuento = (precioXkil * 30) / 100;
			System.out.println("Se aplica descuento del 30%:----- " + descuento);
			precioXkil -= descuento;
			System.out.println("El precio final aplicando el descuento es:------ " + precioXkil);
		}
		System.out.println("El precio del viaje:----------- " + precioXkil);
		//System.out.println("El precio final aplicando el descuento es:------ " + precioXkil);

		entrada.close();
	}

}
