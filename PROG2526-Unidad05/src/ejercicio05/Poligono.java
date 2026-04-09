package ejercicio05;

public abstract class Poligono {
	protected int numeroLados;

	// Constructor con parámetros
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	// Getter
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método abstracto para las clases
	 * 
	 * @return
	 */
	public abstract double area();

	/**
	 * Método string que devuelve una cadena con el número de lados
	 */
	public String toString() {
		String cadena = "";
		cadena = "Numero de lados: " + numeroLados;
		return cadena;
	}

}
