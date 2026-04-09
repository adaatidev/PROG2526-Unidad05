package ejercicio06_03;

public class Gato extends AnimalDomestico {

	// Constante auxiliar para la probabilidad
	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;

	// Constructor con parámetros
	public Gato(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	/**
	 * Método que imprime por consola el ruido del animal
	 */
	@Override
	public void hacerRuido() {
		System.out.println(getNombre() + ": miau");
	}

	/**
	 * Método booleano que devuelve true si hace caso, false si no
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

	/**
	 * Método que imprime por consola que el gato está tosiendo pelo
	 */
	public void toserBolaPelo() {
		System.out.println(getNombre() + " está tosiendo pelo.");
	}

}
