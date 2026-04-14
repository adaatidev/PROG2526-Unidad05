package ejercicioExtra02;

public class BarcoPalangrero extends EmbarcacionPesquera {
	private int numAnzuelos;
	private double rendimientoMedio;

	public BarcoPalangrero(String mat, String nom, double cap, double comb, String zona, int trip, int aut,
			int anzuelos, double rend) {
		super(mat, nom, cap, comb, zona, trip, aut);
		this.numAnzuelos = anzuelos;
		this.rendimientoMedio = rend;
	}

	@Override
	public double calcularCapturaMaximaDiaria() {
		// Lógica: número de anzuelos y rendimiento
		return numAnzuelos * rendimientoMedio;
	}
}
