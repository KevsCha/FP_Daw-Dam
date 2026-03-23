package ejemplo4.cambio;

public class Dracmas extends Moneda{
	public Dracmas() {
		super("Dracmas Griegas", 0.88607);
	}
	public double convertirMoneda(double cambio) {
		return getValue() * cambio;
	}
}
