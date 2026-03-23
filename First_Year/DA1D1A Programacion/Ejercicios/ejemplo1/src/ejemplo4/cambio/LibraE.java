package ejemplo4.cambio;

public class LibraE extends Moneda{
	public LibraE() {
		super("Libra Esterlina", 178.938);
	}
	public double convertirMoneda(double cambio) {
		return getValue() * cambio;
	}
}
