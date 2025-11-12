package objetos.Ejemplo1;

public class Main {
	public static void main(String[] args) {
		Point punto;

		Rectangle rectangle = new Rectangle(new Point(3,4), 6, 7);
		punto = new Point(5,6);
		Rectangle rectangle1 = new Rectangle(punto, 6, 7);
		rectangle.move(10, 15);
		punto = rectangle.getOrigin();
		
		System.out.println(punto.toString());
		//System.out.println(punto.getX());

	}
}
