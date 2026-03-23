package practicosClase;

import java.util.Scanner;

public class Practico9 {
	public static void main(String[] args) {
		//El programa generará un número aleatorio entre 1 y 100. 
		//El usuario debe adivinar dicho número. 
		//Después de cada intento, el programa indicará si el número ingresado es mayor o menor que el número objetivo, 
		//hasta que el usuario acierte. Se establecerá un máximo de 7 intentos. 
		//Si el usuario no logra adivinar el número después del séptimo intento, 
		//el programa le informará que ha agotado el número máximo de intentos y que no ha acertado. 
		//En ese momento, el juego finalizará y no podrá continuar intentando.
		
		Scanner entrada = new Scanner(System.in);
		int numRandom = (int)(Math.random() * 100 + 1);
		int numUser = 0;
		int contador = 7;
		System.out.println(numRandom);
		System.out.println("El programa genero un numero aleatorio entre 1 y 100, adivina cual es en 7 intentos.");
		System.out.println("Ingresa el numero que crees que genero la maquina");

		while (contador > 0) {
			numUser = entrada.nextInt();
			if (numUser == numRandom) {
				System.out.println("Felicidades, lograstes adivinar el numero aleatorio");
				contador = 0;
			}else if (numRandom > numUser) {
				System.out.println("El numero ingresado es menor al numero aleatorio");
				System.out.println("vuelve a intentarlo, te quedan  " + (contador - 1) + " intentos");
			}else{
				System.out.println("El numero ingresado es mayor al numero aleatorio");
				System.out.println("vuelve a intentarlo, te quedan  " + (contador - 1 )+ " intentos");
			}
			contador--;
		}
		//System.out.println("\n\n" + contador+"\n\n");
		if(numRandom != numUser && contador == 0)
			System.out.println("Se te acabaron los intentos y no encontraste el numero aleatorio");
		System.out.println("El numero aleatorio es: " + numRandom);
		entrada.close(); 
	}
}
