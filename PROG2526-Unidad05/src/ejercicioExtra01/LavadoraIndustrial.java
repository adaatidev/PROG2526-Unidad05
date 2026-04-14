package ejercicioExtra01;

public class LavadoraIndustrial extends LavadoIndustrial implements Instalable {

	// Constructor con sus parámetros heredados
	public LavadoraIndustrial(int id, String marca, String modelo, double pb, double c, int g, boolean u, double p) {
		super(id, marca, modelo, pb, c, g, u, p);
	}

	/**
	 * Función que devuelve el coste del mantenimiento anual multiplicando el precio
	 * base en un 5%
	 */
	@Override
	public double calcularCosteMantenimientoAnual() {
		return precioBase * 0.05;
	}

	/**
	 * Función que devuelve el coste de instalación
	 */
	@Override
	public double calcularCosteInstalacion() {
		return 150.0;
	}

	/**
	 * Función que devuelve true al requerir un técnico especializado
	 */
	@Override
	public boolean requiereTecnicoEspecializado() {
		return true;
	}

}
