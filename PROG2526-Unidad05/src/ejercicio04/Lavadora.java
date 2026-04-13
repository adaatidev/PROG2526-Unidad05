package ejercicio04;

/**
 * Representa una lavadora, subclase de {@link Electrodomestico}.
 *
 * <p>
 * Añade el atributo {@code carga} (capacidad de carga en kilogramos) y aplica
 * un incremento adicional al precio final cuando la carga supera el límite
 * establecido.
 * </p>
 */
public class Lavadora extends Electrodomestico {

	/** Capacidad de carga de la lavadora en kilogramos. */
	private double carga;

	/** Carga asignada cuando no se especifica ninguna. */
	private static final double CARGA_DEFAULT = 5.0;

	/** Umbral de carga a partir del cual se aplica el incremento adicional. */
	private static final double LIMITE_CARGA_ALTA = 30.0;

	/**
	 * Incremento en euros que se aplica cuando la carga supera
	 * {@link #LIMITE_CARGA_ALTA}.
	 */
	private static final double INCREMENTO_CARGA_ALTA = 50.0;

	/**
	 * Constructor básico. Asigna el valor por defecto a {@code carga}, y delega en
	 * el constructor básico de {@link Electrodomestico}.
	 *
	 * @param precioBase precio base de la lavadora en euros
	 * @param peso       peso de la lavadora en kilogramos
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFAULT;
	}

	/**
	 * Constructor completo. Permite especificar todos los atributos.
	 *
	 * @param carga             capacidad de carga en kilogramos
	 * @param precioBase        precio base en euros
	 * @param color             color de la lavadora
	 * @param consumoEnergetico letra de eficiencia energética
	 *                          ({@code 'A'}–{@code 'F'})
	 * @param peso              peso de la lavadora en kilogramos
	 */
	public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	/**
	 * Calcula el precio final de la lavadora.
	 *
	 * <p>
	 * Llama a {@link Electrodomestico#precioFinal()} y añade
	 * {@value #INCREMENTO_CARGA_ALTA} € si la carga es mayor que
	 * {@value #LIMITE_CARGA_ALTA} kg.
	 * </p>
	 *
	 * @return precio final en euros
	 */
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		if (carga > LIMITE_CARGA_ALTA) {
			precio += INCREMENTO_CARGA_ALTA;
		}
		return precio;
	}

	/**
	 * Devuelve la capacidad de carga de la lavadora.
	 *
	 * @return carga en kilogramos
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Establece la capacidad de carga de la lavadora.
	 *
	 * @param c nueva carga en kilogramos
	 */
	public void setCarga(double c) {
		this.carga = c;
	}
}
