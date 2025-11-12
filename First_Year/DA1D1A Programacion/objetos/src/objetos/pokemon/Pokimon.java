package objetos.pokemon;

public class Pokimon {
	private int puntosVida;
	private double defensa;
	private double ataque;
	private Punto ubicacion;
	private char puntoCardinal;
	
	public Pokimon(int puntosVida, double defensa, double ataque, Punto ubicacion) {
		
		this.puntosVida = puntosVida;
		this.defensa = defensa;
		this.ataque = ataque;
		this.ubicacion = ubicacion;
		this.puntoCardinal = 'N';
	}
	public void mostrarDato() {
		System.out.println("Puntos de vida: " + this.puntosVida);
		System.out.println("Puntos de ataque: " + this.ataque);
		System.out.println("Puntos de defensa: " + this.defensa);
		System.out.println("Ubicacion: " + this.puntoCardinal);
		System.out.println("Punto: " + this.ubicacion.mostrarPunto() );
	}
	public char girarDerecha() {
        
        switch (this.puntoCardinal) {
        
        case 'N' : this.puntoCardinal = 'E';
                    break;
        case 'E' : this.puntoCardinal = 'S';
                    break;
        case 'S' : this.puntoCardinal = 'O';
                    break;
        case 'O' : this.puntoCardinal = 'N';
                    break;
        }
        return this.puntoCardinal;   
    }
    public char girarIzquierda() {
        
        switch (this.puntoCardinal) {
        
        case 'N' : this.puntoCardinal = 'O';
                    break;
        case 'O' : this.puntoCardinal = 'S';
                    break;
        case 'S' : this.puntoCardinal = 'E';
                    break;
        case 'E' : this.puntoCardinal = 'N';
                    break;
        }
        return this.puntoCardinal;   
    }
    
    public void avanzar() {
    	this.ubicacion.setY(this.ubicacion.getY() + 1);;
    }
    public void metodoPrueba() {
    	int numero = 1;
    	while (numero >= 0) {
    		numero--;
    	}
    }
}
