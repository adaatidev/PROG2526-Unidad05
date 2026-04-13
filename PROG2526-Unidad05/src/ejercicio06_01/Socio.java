package ejercicio06_01;

public class Socio implements Comparable {
	protected int id;
	protected String nombre;
	protected int edad;

	// Constructor con parámetros
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	/**
	 * Método toString que devuelve una cadena con los datos
	 */
	@Override
	public String toString() {
		return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
	}

	/**
	 * Método compareTo que compara dos objetos de la clase Socio
	 */
	@Override
	public int compareTo(Object obj) {
		int res = 0;

		Socio socio = (Socio) obj;

		if (this.id < socio.id) {
			res = -1;
		} else if (this.id > socio.id) {
			res = 1;
		}

		return res;
	}
}
