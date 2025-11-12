package objetos.Ejemplo1;

public class Rectangle {
	public int width;
	public int height;
	public Point origin;
	
	public Rectangle() {
		origin = new Point(0, 0);
	}
	public Rectangle(Point p) {
		origin = p;
	}
	public Rectangle(int w, int h) {
		origin = new Point(0,0);
		this.width = w;
		this.height = h;
	}
	public Rectangle(Point p, int w, int h) {
		this.origin  = p;
		this.height = h;
		this.width = w;
	}
	public void move(int x, int y) {
		this.origin.move(x, y);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getOrigin() {
		return origin;
	}
	public void setOrigin(Point origin) {
		this.origin = origin;
	}

}
