package ejercicio03;

public class NoPerecedero extends Producto {
	private String tipo;

	// CONSTRUCTOR CON PARÁMETROS HEREDADOS Y ESPECÍFICOS
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	// GETTERS Y SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Realiza el mismo cálculo que la clase Producto
	 */
	@Override
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + " | Tipo: " + tipo;
	}
}
