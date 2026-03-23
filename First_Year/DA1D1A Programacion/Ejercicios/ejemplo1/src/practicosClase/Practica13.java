package practicosClase;

import java.util.Scanner;

public class Practica13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int aux;
		int rightChar;
		int num;
		
		num = entrada.nextInt();
		
		while (row < num) {
			col = 0;
			rightChar = row;
			while (col < num + num - 1) {
				if (col < num - row - 1) {
					System.out.print("_");
				}else {
					aux = num - col;
					if(aux <= 0) {
						if (rightChar > 0) {	
							System.out.print(rightChar + 1);
							rightChar--;
						}
					}
					else {
						
					//Crear una auxiliar y una condicional que avise que si se paso de 0 crear espacios y un contador que diga cuantas
					//columnas no rellenas hay y restar - 1 para crear una mas a partir de la ultima
						System.out.print(num - col);
					}
				}
				col++;
			}
			System.out.println();
			row++;
		}
		entrada.close();
	}

}
