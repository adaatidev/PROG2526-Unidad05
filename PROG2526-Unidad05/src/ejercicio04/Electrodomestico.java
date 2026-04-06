package ejercicio04;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Valores por defecto
	protected final String COLOR_DEF = "blanco";
	protected final char CONSUMO_DEF = 'F';
	protected final double PRECIO_BASE_DEF = 100;
	protected final double PESO_DEF = 5;

	// Constructor con precio y peso, resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_DEF;
	}

	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Getters necesarios
	public double getPrecioBase() {
		return precioBase;
	}

	// Métodos privados de comprobación
	private void comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CONSUMO_DEF;
		}
	}

	private void comprobarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean encontrado = false;
		for (String c : colores) {
			if (c.equalsIgnoreCase(color)) {
				encontrado = true;
				break;
			}
		}
		this.color = encontrado ? color.toLowerCase() : COLOR_DEF;
	}

	// Cálculo del precio final según consumo y peso
	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A' -> plus += 100;
		case 'B' -> plus += 80;
		case 'C' -> plus += 60;
		case 'D' -> plus += 50;
		case 'E' -> plus += 30;
		case 'F' -> plus += 10;
		}
		if (peso >= 0 && peso < 19) {
			plus += 10;
		} else if (peso >= 20 && peso < 49) {
			plus += 50;
		} else if (peso >= 50 && peso < 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}

		return precioBase + plus;
	}
}
