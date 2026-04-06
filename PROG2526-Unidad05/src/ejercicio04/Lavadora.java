package ejercicio04;

public class Lavadora extends Electrodomestico {
	private double carga;
	private final double CARGA_DEF = 5;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double plus = super.precioFinal();
		if (carga > 30) {
			plus += 50;
		}
		return plus;
	}
}
