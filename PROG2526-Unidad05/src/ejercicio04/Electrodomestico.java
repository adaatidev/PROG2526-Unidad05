package ejercicio04;

public class Electrodomestico {
	enum consumoEnergetico {
		A, B, C, D, E, F
	}

	enum colores {
		blanco, negro, rojo, azul, gris
	}

	protected double precioBase;
	protected colores color;
	protected double peso;
	protected consumoEnergetico consumo;

	Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		setColor(color);
		this.peso = peso;
		setConsumo(consumo);
	}

	Electrodomestico(double precioBase, colores color, double peso, consumoEnergetico consumo) {
		this.precioBase = precioBase;
		this.color = color;
		this.peso = peso;
		this.consumo = consumo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = 100;
	}

	public colores getColor() {
		return color;
	}

	public void setColor(colores color) {
		this.color = colores.blanco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = 5;
	}

	public consumoEnergetico getConsumo() {
		return consumo;
	}

	public void setConsumo(consumoEnergetico consumo) {
		this.consumo = consumoEnergetico.F;
	}

	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A' -> setConsumo(consumoEnergetico.A);
		case 'B' -> setConsumo(consumoEnergetico.B);
		case 'C' -> setConsumo(consumoEnergetico.C);
		case 'D' -> setConsumo(consumoEnergetico.D);
		case 'E' -> setConsumo(consumoEnergetico.E);
		case 'F' -> setConsumo(consumoEnergetico.F);
		default -> setConsumo(consumoEnergetico.F);
		}
	}

	private void comprobarColor(String color) {
		switch (color) {
		case "blanco" -> setColor(colores.blanco);
		case "negro" -> setColor(colores.negro);
		case "rojo" -> setColor(colores.rojo);
		case "azul" -> setColor(colores.azul);
		case "gris" -> setColor(colores.gris);
		default -> setColor(colores.blanco);
		}
	}

	private void precioFinal() {

	}

}