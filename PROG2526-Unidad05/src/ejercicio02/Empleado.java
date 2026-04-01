package ejercicio02;

public class Empleado {
	private String nombre;

	// CONSTRUCTOR CON PARÁMETROS
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		String cad;
		cad = "Empleado: " + nombre;
		return cad;
	}

}
