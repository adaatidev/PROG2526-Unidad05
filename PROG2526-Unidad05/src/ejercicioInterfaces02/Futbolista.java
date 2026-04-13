package ejercicioInterfaces02;

public class Futbolista implements Comparable {
	protected int nCamiseta;
	protected String nombre;
	protected int edad;
	protected int nGoles;

	public Futbolista(int nCamiseta, String nombre, int edad, int nGoles) {
		this.nCamiseta = nCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
	}

	public int getnCamiseta() {
		return nCamiseta;
	}

	public void setnCamiseta(int nCamiseta) {
		this.nCamiseta = nCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnGoles() {
		return nGoles;
	}

	public void setnGoles(int nGoles) {
		this.nGoles = nGoles;
	}

	/**
	 * Método toString que devuelve una cadena con los datos
	 */
	@Override
	public String toString() {
		return "Nº camiseta" + nCamiseta + ", Nombre: " + nombre + ", Edad: " + edad + ", Nº goles: " + nGoles;
	}

	/**
	 * Método equals que compara dos objetos
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean iguales = false;
		Futbolista futbolista = (Futbolista) objeto;
		if (this.nombre.equals(futbolista.nombre) && this.nCamiseta == futbolista.nCamiseta) {
			iguales = true;
		}
		return iguales;
	}

	/**
	 * Método compareTo que compara dos objetos de la clase Socio
	 */
	@Override
	public int compareTo(Object obj) {
		int res = 0;

		Futbolista futbolista = (Futbolista) obj;

		if (this.nCamiseta < futbolista.nCamiseta) {
			res = -1;
		} else if (this.nCamiseta > futbolista.nCamiseta) {
			res = 1;
		} else {
			res = this.nombre.compareToIgnoreCase(futbolista.nombre);
		}

		return res;
	}
}
