package ejercicio03;

public class Producto {
	private String nombre;
	private double precio;

	// CONSTRUCTOR CON PARÁMETROS
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Calcula el precio total multiplicando el precio por la cantidad
	 * 
	 * @param cantidad Número de productos
	 * @return Resultado del cálculo
	 */
	public double calcular(int cantidad) {
		return precio * cantidad;
	}

	@Override
	public String toString() {
		String cad;
		cad = "Producto: " + nombre + " | Precio: " + precio;
		return cad;
	}
}
