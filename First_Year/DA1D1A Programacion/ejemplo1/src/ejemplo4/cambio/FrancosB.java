package ejemplo4.cambio;

public class FrancosB extends Moneda{
	public FrancosB() {
		super("Francos Belgas", 3.23728);
	}
	public double convertirMoneda(double cambio) {
		return getValue() * cambio;
	}
}
