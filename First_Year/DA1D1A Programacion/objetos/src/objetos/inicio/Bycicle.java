package objetos.inicio;

public class Bycicle {

	int speed;
	int gear;
	int cadence;
	
	public Bycicle(int speed, int gear, int cadence) {
		this.speed = speed;
		this.gear = gear;
		this.cadence = cadence;
	}
	
	public Bycicle() {
		speed = 0;
		gear = 10;
		cadence = 100;
	}
	public void mostrar_bici() {
		System.out.println("Speed: " + speed + "\nGear: " + gear + "\nCadence: " + cadence);
	}
}
