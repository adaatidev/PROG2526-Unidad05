package ejercicioExtra02;

public class BarcoCerquero extends EmbarcacionPesquera {
	private double capacidadRed;
	private double volumenBancoDetectado;

	public BarcoCerquero(String mat, String nom, double cap, double comb, String zona, int trip, int aut, double red,
			double banco) {
		super(mat, nom, cap, comb, zona, trip, aut);
		this.capacidadRed = red;
		this.volumenBancoDetectado = banco;
	}

	@Override
	public double calcularCapturaMaximaDiaria() {
		// Lógica: capacidad red y volumen de banco
		return Math.min(capacidadRed, volumenBancoDetectado);
	}
}
