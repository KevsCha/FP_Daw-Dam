package ejemplo11;

import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce 3 valores consecutivos");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if(num1 < num2 && num2 < num3)
			System.out.println("Se introducieron por orden: " + num1 + ", " + num2 +", "+ num3 );
		else if(num1 >= num2){
			System.out.println("El primer numero es mayor o igual al segundo, no esta en orden");
		}else if (num2 >= num3) {
			System.out.println("El segundo numero es mayor o igual  al tercero, no esta en orden");
		}
		entrada.close();
	}

}
