package ejercicio04;

public class Television extends Electrodomestico {
	private int resolucion;
	private boolean sintonizadorTDT;

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		double plus = super.precioFinal();
		if (resolucion > 40) {
			plus += precioBase * 0.30;
		}
		if (sintonizadorTDT) {
			plus += 50;
		}
		return plus;
	}
}
