package objetos;

import objetos.inicio.Bycicle;

public class AppPrueba {

	public static void main(String[] args) {
		Bycicle bici = new Bycicle();
		Bycicle nave = new Bycicle(55, 200, 23);
		
		bici.mostrar_bici();
		nave.mostrar_bici();
		
	}

}
