package objetos.jugador;

public class AppJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador player1 = new Jugador();
		Jugador player2 = new Jugador(1.95, 50, 10);
		int canastaDosj1 = 0;
		int canastaTresj1 = 0;
		int canastaDosj2 = 0;
		int canastaTresj2 = 0;
		

		
		System.out.println(player1.getTiro_x2() + " Porcentaje de tiros 2 de player 1");
		System.out.println(player1.getTiro_x3() + " Porcentaje de tiros 3 de player 1\n");
		System.out.println(player2.getTiro_x2() + " Porcentaje de tiros 2 de player 2");
		System.out.println(player2.getTiro_x3() + " Porcentaje de tiros 3 de player 2\n\n-----------------");
		
		//Training players,  teen days
		player1.entrenar_dos(10);
		player1.entrenar_tres(10);
		player2.entrenar_dos(10);
		player2.entrenar_tres(10);
	
		subirPocentajex2(player1);
		subirPocentajex2(player2);
	
		System.out.println(player1.getTiro_x2() + " Porcentaje de tiros 2 de player 1");
		System.out.println(player1.getTiro_x3() + " Porcentaje de tiros 3 de player 1\n");
		System.out.println(player2.getTiro_x2() + " Porcentaje de tiros 2 de player 2");
		System.out.println(player2.getTiro_x3() + " Porcentaje de tiros 3 de player 2\n\n-----------------");
		
		canastaDosj1 = subirCanasta(player1, 10);
		canastaTresj1 = subirCanasta(player1, 4);
		canastaDosj2 = subirCanasta(player2, 10);
		canastaTresj2 = subirCanasta(player2, 4);
		
		System.out.println("Jugador1:\nCanastas dobles "  + canastaDosj1 + "\nCanastas triples " + canastaTresj1);
		System.out.println("Jugador2:\nCanastas dobles "  + canastaDosj2 + "\nCanastas triples " + canastaTresj2);
		
	
	}
	public static void subirPocentajex2(Jugador player) {
		while ((player.getTiro_x2() <= 65 || player.getTiro_x3() <= 65) && player.getTiro_x2() < 100 && player.getTiro_x3() < 100) { 
			player.entrenar_dos();
			player.entrenar_tres();
		}
	}
	public static int subirCanasta(Jugador player,int limite) {
		int canasta = 0;
		
		while (canasta < limite) {
			if (player.lanzar_de_dos())
				canasta++;
		}
		return canasta;
	}
}
