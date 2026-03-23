package ejemplo54;

import java.util.Scanner;

public class Ejemplo54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int j;
		int aux;
		
		System.out.println("Introduce 10 parejas de numeros (4-5,7-2... etc) y te dire el producto de ellas");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Pareja " + i + 1);
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			
			j = 0;
			aux = 0;
			while (j < num2) {
				aux += num1;
				j++;
			}
			
		}
		scanner.close();
	}

}
