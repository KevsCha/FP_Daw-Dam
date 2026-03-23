package ejemplo4.cambio;

public abstract class Moneda {
	
	private double value;
	private String name;
	
	public Moneda(String name, double value) {
		this.name = name;
		this.value = value;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;	
	}
	public void setValue(int value) {
		this.value = value;
	}
	public double getValue() {
		return value;
	}
	
	
	
}
