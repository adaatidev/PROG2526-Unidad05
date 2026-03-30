package ejercicio01;

public class HoraExacta extends Hora {
	private int segundo;

	HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		setSegundo(segundo);
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = (segundo >= 0 && segundo < 60 ? segundo : 0);
	}

	public boolean setSegundos(int segundo) {
		return (segundo <= 59 && segundo >= 0);
	}

	@Override
	public void inc() {
		super.inc();
		++this.segundo;
		if (segundo == 60) {
			this.segundo = 0;
			++this.minuto;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":" + String.format("%02d", segundo);
	}
}
