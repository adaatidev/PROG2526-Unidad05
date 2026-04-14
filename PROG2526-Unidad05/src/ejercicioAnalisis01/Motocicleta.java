package ejercicioAnalisis01;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	// Constructor con su parámetro + los heredados
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada = cilindrada;
	}

	/**
	 * Método que devuelve si requiere carnet según las cilindradas
	 */
	@Override
	public boolean requiereCarnet() {
		return this.cilindrada >= 125;
	}

}
