package ejercicio03;

public class Perecedero extends Producto {
	private int diasACaducar;

	// CONSTRUCTOR CON PARÁMETROS HEREDADOS Y ESPECÍFICOS
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	// GETTERS Y SETTERS
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Calcula el precio aplicando reducciones según los días restantes
	 */
	@Override
	public double calcular(int cantidad) {
		double precioFinal = super.calcular(cantidad); // Obtiene el precio base

		// Reducción del precio según los días a caducar
		if (diasACaducar == 1) {
			precioFinal /= 4; // Reducción a la cuarta parte si queda 1 día
		} else if (diasACaducar == 2) {
			precioFinal /= 3; // Reducción a la tercera parte si quedan 2 días
		} else if (diasACaducar == 3) {
			precioFinal /= 2; // Reducción a la mitad si quedan 3 días
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return super.toString() + " | Días a caducar: " + diasACaducar;
	}
}
