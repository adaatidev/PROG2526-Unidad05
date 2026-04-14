package ejercicioExtra01;

public class HornoIndustrial extends CoccionIndustrial implements Instalable {

	// Constructor con sus parámetros heredados
	public HornoIndustrial(int id, String marca, String modelo, double pb, double c, int g, boolean u, double p) {
		super(id, marca, modelo, pb, c, g, u, p);
	}

	/**
	 * Función que devuelve el coste del mantenimiento anual según el consumoHora
	 */
	@Override
	public double calcularCosteMantenimientoAnual() {
		return 200.0 + (consumoHora * 10);
	}

	/**
	 * Función que devuelve el coste de instalación
	 */
	@Override
	public double calcularCosteInstalacion() {
		return 300.0;
	}

	/**
	 * Función que devuelve true al requerir un técnico especializado
	 */
	@Override
	public boolean requiereTecnicoEspecializado() {
		return true;
	}

}
