package ejercicioExtra02;

public class BarcoArrastrero extends EmbarcacionPesquera {
	private double potenciaMotor;
	private int horasArrastre;

	public BarcoArrastrero(String mat, String nom, double cap, double comb, String zona, int trip, int aut, double pot,
			int horas) {
		super(mat, nom, cap, comb, zona, trip, aut);
		this.potenciaMotor = pot;
		this.horasArrastre = horas;
	}

	@Override
	public double calcularCapturaMaximaDiaria() {
		// Lógica: según potencia y horas de arrastre
		return (potenciaMotor * 0.05) * horasArrastre;
	}
}
