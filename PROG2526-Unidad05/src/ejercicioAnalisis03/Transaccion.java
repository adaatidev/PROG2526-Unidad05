package ejercicioAnalisis03;

public class Transaccion {
	private int dia;
	private int mes;
	private int anio;
	private String concepto;
	private double importe;

	public Transaccion(int dia, int mes, int anio, String concepto, double importe) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.concepto = concepto;
		this.importe = importe;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%d | %s | %.2f€", dia, mes, anio, concepto, importe);
	}

}
