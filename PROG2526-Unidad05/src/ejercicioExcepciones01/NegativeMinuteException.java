package ejercicioExcepciones01;

public class NegativeMinuteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "ERROR: No se puede introducir un minuto negativo";
	}

}
