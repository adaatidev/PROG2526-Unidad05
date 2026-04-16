package ejercicioComparator03;

public class Futbolista {
	private int edad;
	private int goles;

	public Futbolista(int edad, int goles) {
		this.edad = edad;
		this.goles = goles;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "Edad: " + edad + " | Goles: " + goles;
	}

}
