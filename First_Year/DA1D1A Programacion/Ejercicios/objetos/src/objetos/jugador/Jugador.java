package objetos.jugador;

public class Jugador {
	private double altura;
	private double tiro_x2;
	private double tiro_x3;
	
	public Jugador() {
		this.altura = 1.85;
		this.tiro_x2 = 40;
		this.tiro_x3 = 25;
	}
	public Jugador(double altura, double tiro_x2, double tiro_x3) {
		this.altura = altura;
		this.tiro_x2 = tiro_x2;
		this.tiro_x3 = tiro_x3;
	}
	
	public boolean lanzar_de_dos() {
		if (Math.random() * 100 < this.tiro_x2)
			return true;
		return false;
	}
	public boolean lanzar_de_tres() {
		if (Math.random() * 100 < this.tiro_x3)
			return true;
		return false;
	}
	public void entrenar_dos() {
		if (Math.random() < 0.5)
			this.tiro_x2 += 0.5;
	}
	public void entrenar_dos(int dias_entrenados) {
		if (Math.random() < 0.5)
			this.tiro_x2 += (0.5 * dias_entrenados);
	}
	public void entrenar_tres() {
		if (Math.random() < 0.5)
			this.tiro_x3 += 0.5;
	}
	public void entrenar_tres(int dias_entrenados) {
		if (Math.random() < 0.5)
			this.tiro_x3 += (0.5 * dias_entrenados);
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getTiro_x2() {
		return tiro_x2;
	}
	public void setTiro_x2(double tiro_x2) {
		this.tiro_x2 = tiro_x2;
	}
	public double getTiro_x3() {
		return tiro_x3;
	}
	public void setTiro_x3(double tiro_x3) {
		this.tiro_x3 = tiro_x3;
	}
}
