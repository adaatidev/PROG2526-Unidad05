package ejercicio05;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;

	// Constructor con parámetros
	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	// Getters y setters
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = "Tipo: rectángulo, " + super.toString() + "Lado 1: " + lado1 + "Lado 2: " + lado2;
		return cadena;
	}

}
