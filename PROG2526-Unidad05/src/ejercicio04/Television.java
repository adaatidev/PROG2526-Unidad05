package ejercicio04;

/**
 * Representa una televisión, subclase de {@link Electrodomestico}.
 *
 * <p>
 * Añade los atributos {@code resolucion} (pulgadas de pantalla) y
 * {@code sintonizadorTDT}, y aplica incrementos adicionales al precio final
 * según su resolución y si dispone de sintonizador TDT.
 * </p>
 */
public class Television extends Electrodomestico {

	/** Resolución de la pantalla en pulgadas. */
	private int resolucion;

	/** Indica si la televisión incluye sintonizador TDT. */
	private boolean sintonizadorTDT;

	/** Resolución asignada cuando no se especifica ninguna. */
	private static final int RESOLUCION_DEFAULT = 20;

	/**
	 * Valor de {@code sintonizadorTDT} asignado cuando no se especifica ninguno.
	 */
	private static final boolean SINTONIZADOR_DEFAULT = false;

	/**
	 * Umbral de resolución a partir del cual se aplica el incremento porcentual.
	 */
	private static final int LIMITE_RESOLUCION_ALTA = 40;

	/**
	 * Porcentaje de incremento (0.30 = 30 %) aplicado cuando la resolución supera
	 * el límite.
	 */
	private static final double INCREMENTO_PORC_RESOLUCION = 0.30;

	/**
	 * Incremento en euros que se aplica cuando la televisión tiene sintonizador
	 * TDT.
	 */
	private static final double INCREMENTO_SINTONIZADOR = 50.0;

	/**
	 * Constructor básico. Asigna los valores por defecto a {@code resolucion} y
	 * {@code sintonizadorTDT}, y delega en el constructor básico de
	 * {@link Electrodomestico}.
	 *
	 * @param precioBase precio base de la televisión en euros
	 * @param peso       peso de la televisión en kilogramos
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
	}

	/**
	 * Constructor completo. Permite especificar todos los atributos.
	 *
	 * @param resolucion        resolución de pantalla en pulgadas
	 * @param sintonizadorTDT   {@code true} si incluye sintonizador TDT
	 * @param precioBase        precio base en euros
	 * @param color             color de la televisión
	 * @param consumoEnergetico letra de eficiencia energética
	 *                          ({@code 'A'}–{@code 'F'})
	 * @param peso              peso de la televisión en kilogramos
	 */
	public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico,
			double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Calcula el precio final de la televisión.
	 *
	 * <p>
	 * Llama a {@link Electrodomestico#precioFinal()} y aplica los siguientes
	 * incrementos adicionales:
	 * <ul>
	 * <li>Si la resolución es mayor que {@value #LIMITE_RESOLUCION_ALTA} pulgadas,
	 * el precio se multiplica por {@code 1 + }{@value #INCREMENTO_PORC_RESOLUCION}
	 * (incremento del 30 %).</li>
	 * <li>Si dispone de sintonizador TDT, se suman
	 * {@value #INCREMENTO_SINTONIZADOR} €.</li>
	 * </ul>
	 * </p>
	 *
	 * @return precio final en euros
	 */
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		if (resolucion > LIMITE_RESOLUCION_ALTA) {
			precio *= (1 + INCREMENTO_PORC_RESOLUCION);
		}
		if (sintonizadorTDT) {
			precio += INCREMENTO_SINTONIZADOR;
		}
		return precio;
	}

	/**
	 * Devuelve la resolución de la pantalla.
	 *
	 * @return resolución en pulgadas
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Establece la resolución de la pantalla.
	 *
	 * @param r nueva resolución en pulgadas
	 */
	public void setResolucion(int r) {
		this.resolucion = r;
	}

	/**
	 * Indica si la televisión dispone de sintonizador TDT.
	 *
	 * @return {@code true} si tiene sintonizador TDT, {@code false} en caso
	 *         contrario
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Establece si la televisión dispone de sintonizador TDT.
	 *
	 * @param s {@code true} para activar el sintonizador TDT
	 */
	public void setSintonizadorTDT(boolean s) {
		this.sintonizadorTDT = s;
	}
}
