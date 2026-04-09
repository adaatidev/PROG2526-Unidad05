package ejercicio05;

public class Triangulo extends Poligono {
	private double lado1;
	private double lado2;
	private double lado3;

	// Constructor con parámetros
	Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Método area que devuelve el área del triángulo
	 */
	@Override
	public double area() {
		double auxiliar;
		double resultado;
		auxiliar = (lado1 + lado2 + lado3) / 2;
		resultado = Math.sqrt(auxiliar * (auxiliar - lado1) * (auxiliar - lado2) * (auxiliar - lado3));
		return resultado;
	}

	/**
	 * Método string que devuelve una cadena con el tipo de polígono y el el número
	 * de lados
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena = "Tipo: triángulo, " + super.toString() + "Lado 1: " + lado1 + "Lado 2: " + lado2 + "Lado 3: " + lado3;
		return cadena;
	}

}
