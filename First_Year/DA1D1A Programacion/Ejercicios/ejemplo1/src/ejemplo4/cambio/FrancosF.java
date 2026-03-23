package ejemplo4.cambio;

public class FrancosF extends Moneda{
	public FrancosF() {
		super("Francos Frances", 20.110);
	}
	public double convertirMoneda(double cambio) {
		return getValue() * cambio;
	}
}
