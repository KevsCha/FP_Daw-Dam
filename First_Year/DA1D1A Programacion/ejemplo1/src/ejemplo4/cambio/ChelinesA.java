package ejemplo4.cambio;

public class ChelinesA extends Moneda{

	public ChelinesA() {
		super("Chelines austriacos", 9.56871);
	}
	
	public double converirMoneda(double cambio) {
		return getValue() * cambio;
	}

}
