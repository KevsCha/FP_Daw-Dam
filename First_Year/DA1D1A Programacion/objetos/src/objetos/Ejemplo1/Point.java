package objetos.Ejemplo1;

public class Point {
	public int x;
	public int y;
	
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public void move(int x, int y) {
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
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
