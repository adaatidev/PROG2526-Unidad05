package ejercicioAnalisis04;

public class ContactoPersona extends Contacto {
	private String cumpleanos;

	public ContactoPersona(String nombre, int telefono, String cumpleanos) {
		super(nombre, telefono);
		this.cumpleanos = cumpleanos;
	}

	public String getCumpleanos() {
		return cumpleanos;
	}

	public void setCumpleanos(String cumpleanos) {
		this.cumpleanos = cumpleanos;
	}

	@Override
	public String toString() {
		return "[Persona] Nombre: " + nombre + " | Teléfono: " + telefono + " | Cumpleaños: " + cumpleanos;
	}

}
