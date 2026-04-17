package ejercicioExcepciones01;

public class NegativeHourException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "ERROR: No se puede introducir una hora negativo";
	}

}
