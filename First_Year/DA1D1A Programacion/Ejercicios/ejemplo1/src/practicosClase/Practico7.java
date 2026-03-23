package practicosClase;

import java.util.Scanner;

public class Practico7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 1;
		
		System.out.println("Numero del 1 al 10");
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		num--;
		System.out.println("Numero del 10 al 1");
		while(num > 0) {
			System.out.println(num);
			num--;
		}
		entrada.close();
	}
}
