package ejercicioExcepciones01;

/**
 * Representa una hora en formato 24 horas
 * 
 * Responsabilidades: - Mantener una hora válida - Permitir incrementar segundos
 * controlando los límites
 */

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;

	// CONSTRUCTOR POR DEFECTO
	Hora() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	// CONSTRUCTOR CON PARÁMETROS
	Hora(int hora, int minutos, int segundos)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		setHora(hora);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	// GETTERS Y SETTERS
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) throws NegativeHourException {
		if (hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) throws NegativeMinuteException {
		if (minutos >= 0) {
			this.minutos = minutos;
		} else {
			throw new NegativeMinuteException();
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) throws NegativeSecondException {
		if (segundos >= 0) {
			this.segundos = segundos;
		} else {
			throw new NegativeSecondException();
		}
	}

	// MÉTODOS
	public void incrementarSegundo() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			minutos++;
			if (minutos == 60) {
				minutos = 0;
				hora++;
				if (hora == 24) {
					hora = 0;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}

}
