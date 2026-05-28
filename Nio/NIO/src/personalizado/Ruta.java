package personalizado;

public class Ruta {
	private String nombre;
	private String provincia;
	private String dificultad;
	private double distancia;
	private int desnivel;
	
	public Ruta(String nombre, String provincia, String dificultad, double distancia, int desnivel) {
		super();
		this.nombre = nombre;
		this.provincia = provincia;
		this.dificultad = dificultad;
		this.distancia = distancia;
		this.desnivel = desnivel;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getDesnivel() {
		return desnivel;
	}
	public void setDesnivel(int desnivel) {
		this.desnivel = desnivel;
	}
	
	public boolean esAltaLarga(){
		return this.dificultad.equalsIgnoreCase("alta") && this.distancia > 15.0;
	} 

	@Override
	public String toString() {
		return "Ruta [nombre=" + nombre + ", provincia=" + provincia + ", dificultad=" + dificultad + ", distancia="
				+ distancia + ", desnivel=" + desnivel + "]";
	}
	
}
