package ejercicio01;

public class Hora {
	private int hora;
	protected int minuto;

	// CONSTRUCTOR CON PARÁMETROS
	Hora(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);
	}

	// GETTERS Y SETTERS
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setHora(int hora) {
		this.hora = (hora >= 0 && hora < 24) ? hora : 0;
	}

	public void setMinuto(int minuto) {
		this.minuto = (minuto >= 0 && minuto < 60 ? minuto : 0);
	}

	// MÉTODOS
	/**
	 * Incrementa la hora en un minuto
	 */
	public void inc() {
		this.minuto++;
		if (minuto == 60) {
			this.minuto = 0;
			++this.hora;
		} else if (hora == 24) {
			this.hora = 0;
		}
	}

	/**
	 * Comprueba si los minutos introducidos son validos
	 * 
	 * @param minuto
	 * @return True si el minuto es valido, false si no
	 */
	public boolean setMinutos(int minuto) {
		return (minuto <= 59 && minuto >= 0);
	}

	/**
	 * Comprueba si la hora introducida es valida
	 * 
	 * @param hora
	 * @return True si la hora es valida, false si no
	 */
	public boolean setHoras(int hora) {
		return (hora <= 23 && hora >= 0);
	}

	public String toString() {
		return String.format("%s:%s", hora, minuto);
	}
}
