package objetos.pokemon;

public class Punto {
	private int x;
	private int y;
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String mostrarPunto() {
		return "Punto x: " + this.x + " Punto y: " + this.y;
	}
	
}
