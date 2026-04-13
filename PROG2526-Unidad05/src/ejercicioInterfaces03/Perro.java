package ejercicioInterfaces03;

public class Perro extends AnimalDomestico {

	// Constante auxiliar para la probabilidad
	private static final double PROBABILIDAD_OBEDIENCIA = 0.9;

	// Constructor con parámetro
	public Perro(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	/**
	 * Método que imprime por consola el ruido del animal
	 */
	@Override
	public void hacerRuido() {
		System.out.println(getNombre() + ": guau");
	}

	/**
	 * Método booleano que devuelve true si hace caso, false si no
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

	/**
	 * Método que imprime que el perro está dando un paseo
	 */
	public void sacaPaseo() {
		System.out.println(getNombre() + " está dando un paseo.");
	}

}
