package ejercicioAnalisis04;

public abstract class Contacto {
	protected String nombre;
	protected int telefono;

	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public abstract String toString();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || !(obj instanceof Contacto))
			return false;
		Contacto otro = (Contacto) obj;
		return this.nombre.equalsIgnoreCase(otro.nombre);
	}

}
