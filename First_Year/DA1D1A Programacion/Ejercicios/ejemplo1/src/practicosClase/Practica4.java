package practicosClase;

import java.util.Scanner;

public class Practica4 {
	public static void main(String[] args) {
		// Introduce los datos del cliente (nombre, si es socio)
		//Un cliente recibe descuento si es socio del club o si realiza una compra mayor a 100 euros.
		Scanner entrada = new Scanner(System.in);
		String name;
		String valSocio;
		Boolean socio;
		double compra;
		
		System.out.println("Introduce el nombre de cliente");
		name = entrada.nextLine();
		System.out.println("Es socio, [SI] o [NO]");
		valSocio = entrada.nextLine();
		socio = false;
		if (valSocio == "SI" || valSocio == "si" || valSocio == "Si")
			socio = true;
		System.out.println("Introduce la compra del cliente");
		compra = entrada.nextInt();
		System.out.println("El cliente " + name + " es socio del club o realizo un compra mayor a 100??");
		
		if (socio || compra > 100)
			System.out.println("El cliente recibe el descuento");
		else
			System.out.println("El cliente no obtiene el descuento por que no hizo una compra superior a 100 o no es socio");
			
		entrada.close();
	}

}
