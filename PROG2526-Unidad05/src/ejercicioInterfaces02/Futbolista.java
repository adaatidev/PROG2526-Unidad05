package ejercicioInterfaces02;

import java.lang.Comparable;

public class Futbolista implements Comparable<Futbolista> {
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

	/**
	 * Método toString que devuelve una cadena con los datos
	 */
	@Override
	public String toString() {
		return "Nº camiseta: " + nCamiseta + ", Nombre: " + nombre + ", Edad: " + edad + ", Nº goles: " + nGoles;
	}

	/**
	 * Método equals que compara dos objetos
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Futbolista))
			return false;
		Futbolista other = (Futbolista) obj;
		return this.nCamiseta == other.nCamiseta && this.nombre.equals(other.nombre);
	}

	/**
	 * Método compareTo que compara dos objetos de la clase Socio
	 */
	@Override
	public int compareTo(Futbolista other) {
		if (this.nCamiseta != other.nCamiseta) {
			return Integer.compare(this.nCamiseta, other.nCamiseta);
		}
		return this.nombre.compareTo(other.nombre);
	}
}
