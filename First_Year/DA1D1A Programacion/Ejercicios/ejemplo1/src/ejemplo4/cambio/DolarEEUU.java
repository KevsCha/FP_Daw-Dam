package ejemplo4.cambio;

public class DolarEEUU extends Moneda{
	
	public DolarEEUU() {
		super("Dolar", 122.499);
	}
	public double convertirMoneda(double cambio) {
		return getValue() * cambio;
	}
}
