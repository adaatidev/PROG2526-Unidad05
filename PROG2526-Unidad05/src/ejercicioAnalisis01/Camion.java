package ejercicioAnalisis01;

public class Camion extends Vehiculo {
	private double pesoMaximoAutorizado;
	private boolean mercanciaPeligrosa;

	// Constructor con sus parámetros + heredados
	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximo, boolean esPeligrosa) {
		super(marca, modelo, color, matricula);
		this.pesoMaximoAutorizado = pesoMaximo;
		this.mercanciaPeligrosa = esPeligrosa;
	}

	// Getters y setters
	public double getPesoMaximoAutorizado() {
		return pesoMaximoAutorizado;
	}

	public void setPesoMaximoAutorizado(double pesoMaximoAutorizado) {
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	/**
	 * Método que requiere carnet para conducir el camión
	 */
	@Override
	public boolean requiereCarnet() {
		return true;
	}

	/**
	 * Método que devuelve los datos por consola
	 */
	@Override
	public void mostrarEstado() {
		super.mostrarEstado();
		System.out.println("Carga: " + (mercanciaPeligrosa ? "Es peligrosa" : "Mercancia segura") + " | PMA: "
				+ pesoMaximoAutorizado + " kg");
	}

}
