package ejercicioAnalisis01;

public class Turismo extends Vehiculo {
	private int numPlazas;
	private String tipoUso;

	// Constructor con sus parámetros + los heredados
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		this.numPlazas = numPlazas;
		this.tipoUso = tipoUso;
	}

	/**
	 * Método que devuelve que necesita carnet
	 */
	@Override
	public boolean requiereCarnet() {
		return true;
	}

}
