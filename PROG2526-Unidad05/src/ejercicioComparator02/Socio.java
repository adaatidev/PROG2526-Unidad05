package ejercicioComparator02;

public class Socio {
	private String nombre;
	private int edad;

	public Socio(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Edad: " + edad;
	}

}
