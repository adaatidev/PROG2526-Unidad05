package ejercicio01;

public class Hora {
	private int hora;
	private int minuto;

	// CONSTRUCTOR POR DEFECTO
	Hora() {
		this.hora = 0;
		this.minuto = 0;
	}

	// CONSTRUCTOR CON PARÁMETROS
	Hora(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);
	}

	// GETTERS Y SETTERS
	public void setHora(int hora) {
		this.hora = (hora >= 0 && hora < 24) ? hora : 0;
	}

	public void setMinuto(int minuto) {
		this.minuto = (minuto >= 0 && minuto < 60 ? minuto : 0);
	}

	// MÉTODOS
	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	public boolean setMinutos(int valor) {
		boolean valido = false;
		if (valor >= 0 && valor <= 59) {
			valido = true;
		}
		return valido;
	}

	public boolean setHoraV(int valor) {
		boolean valido = false;
		if (valor >= 0 && valor <= 23) {
			valido = true;
		}
		return valido;
	}

	public String toString() {
		return String.format("%s:%s", hora, minuto);
	}
}
