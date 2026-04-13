package ejercicio04;

/**
 * Superclase que representa un electrodoméstico genérico.
 *
 * Almacena los atributos comunes (precio base, color, consumo energético y
 * peso) y calcula el precio final aplicando incrementos según el consumo
 * energético y el peso del aparato
 */
public class Electrodomestico {

	/** Precio base del electrodoméstico en euros. */
	protected double precioBase;

	/** Color del electrodoméstico. */
	protected String color;

	/**
	 * Letra que indica la eficiencia energética del electrodoméstico. Valores
	 * válidos: {@code 'A'} (más eficiente) a {@code 'F'} (menos eficiente).
	 */
	protected char consumoEnergetico;

	/** Peso del electrodoméstico en kilogramos. */
	protected double peso;

	/** Color asignado cuando el color indicado no es válido. */
	private static final String COLOR_DEFAULT = "blanco";

	/** Consumo energético asignado cuando el valor indicado no es válido. */
	private static final char CONSUMO_DEFAULT = 'F';

	/** Lista de colores aceptados (comparación insensible a mayúsculas). */
	private static final String[] COLORES_VALIDOS = { "blanco", "negro", "rojo", "azul", "gris" };

	/**
	 * Constructor básico. Asigna los valores por defecto a {@code color} y
	 * {@code consumoEnergetico}.
	 *
	 * @param precioBase precio base del electrodoméstico en euros
	 * @param peso       peso del electrodoméstico en kilogramos
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
	}

	/**
	 * Constructor completo. Valida el color y el consumo energético; si no son
	 * válidos aplica los valores por defecto.
	 *
	 * @param precioBase        precio base del electrodoméstico en euros
	 * @param color             color deseado; debe pertenecer a los colores válidos
	 * @param consumoEnergetico letra de eficiencia energética
	 *                          ({@code 'A'}–{@code 'F'})
	 * @param peso              peso del electrodoméstico en kilogramos
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}

	/**
	 * Valida y normaliza la letra de consumo energético.
	 *
	 * @param letra letra a validar
	 * @return la letra en mayúsculas si está entre {@code 'A'} y {@code 'F'}, o
	 *         {@link #CONSUMO_DEFAULT} en caso contrario
	 */
	private char comprobarConsumoEnergetico(char letra) {
		char letraUpper = Character.toUpperCase(letra);
		if (letraUpper >= 'A' && letraUpper <= 'F') {
			return letraUpper;
		}
		return CONSUMO_DEFAULT;
	}

	/**
	 * Valida y normaliza el color.
	 *
	 * @param color color a validar (insensible a mayúsculas)
	 * @return el color en minúsculas si pertenece a los colores válidos, o
	 *         {@link #COLOR_DEFAULT} en caso contrario o si es {@code null}
	 */
	private String comprobarColor(String color) {
		if (color == null) {
			return COLOR_DEFAULT;
		}
		String colorNormalizado = color.toLowerCase();
		for (String colorValido : COLORES_VALIDOS) {
			if (colorValido.equals(colorNormalizado)) {
				return colorNormalizado;
			}
		}
		return COLOR_DEFAULT;
	}

	/**
	 * Calcula el precio final del electrodoméstico sumando al precio base los
	 * incrementos por consumo energético y por peso.
	 *
	 * @return precio final en euros
	 */
	public double precioFinal() {
		return precioBase + incrementoPorConsumo() + incrementoPorPeso();
	}

	/**
	 * Devuelve el incremento en euros correspondiente al consumo energético.
	 *
	 * <ul>
	 * <li>A -> +100 €</li>
	 * <li>B -> +80 €</li>
	 * <li>C -> +60 €</li>
	 * <li>D -> +50 €</li>
	 * <li>E -> +30 €</li>
	 * <li>F -> +10 €</li>
	 * </ul>
	 *
	 * @return incremento en euros según el consumo energético
	 */
	private double incrementoPorConsumo() {
		switch (consumoEnergetico) {
		case 'A':
			return 100;
		case 'B':
			return 80;
		case 'C':
			return 60;
		case 'D':
			return 50;
		case 'E':
			return 30;
		default:
			return 10;
		}
	}

	/**
	 * Devuelve el incremento en euros correspondiente al peso.
	 *
	 * <ul>
	 * <li>0–19 kg -> +10 €</li>
	 * <li>20–49 kg -> +50 €</li>
	 * <li>50–79 kg -> +80 €</li>
	 * <li>≥ 80 kg -> +100 €</li>
	 * </ul>
	 *
	 * @return incremento en euros según el peso
	 */
	private double incrementoPorPeso() {
		if (peso < 20)
			return 10;
		if (peso < 50)
			return 50;
		if (peso < 80)
			return 80;
		return 100;
	}

	/**
	 * Devuelve el precio base.
	 *
	 * @return precio base en euros
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Establece el precio base.
	 *
	 * @param precio nuevo precio base en euros
	 */
	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}

	/**
	 * Devuelve el color del electrodoméstico.
	 *
	 * @return color actual
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color, validándolo contra los colores permitidos.
	 *
	 * @param color nuevo color deseado
	 */
	public void setColor(String color) {
		this.color = comprobarColor(color);
	}

	/**
	 * Devuelve la letra de consumo energético.
	 *
	 * @return letra de consumo energético ({@code 'A'}–{@code 'F'})
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Establece el consumo energético, validando que sea una letra entre
	 * {@code 'A'} y {@code 'F'}.
	 *
	 * @param c nueva letra de consumo energético
	 */
	public void setConsumoEnergetico(char c) {
		this.consumoEnergetico = comprobarConsumoEnergetico(c);
	}

	/**
	 * Devuelve el peso del electrodoméstico.
	 *
	 * @return peso en kilogramos
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establece el peso del electrodoméstico.
	 *
	 * @param peso nuevo peso en kilogramos
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
