package ejercicioInterfaces03;

public abstract class AnimalDomestico implements Vivir {

	// Atributos
	protected String nombre;
	protected String raza;
	protected String color;
	protected double peso;

	// Constructor con parámetros
	public AnimalDomestico(String nombre, String raza, String color, double peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.peso = peso;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Método que devuelve por consola el nombre del animal que está comiendo
	 */
	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}

	/**
	 * Método que devuelve por consola el nombre del animal que está durmiendo
	 */
	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo.");
	}

	/**
	 * Método que devuelve por consola el nombre del animal que ha sido vacunado
	 */
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado/a.");
	}

	public abstract boolean hacerCaso();

	@Override
	public abstract void hacerRuido();

	@Override
	public String toString() {
		return "AnimalDomestico [nombre=" + nombre + ", raza=" + raza + "color =" + color + "peso=" + peso + "]";
	}

}
