package ejercicioAnalisis01;

public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean motorEncendido;
	protected int marchaActual;
	protected double velocidadActual;

	// Constructor con parámetros
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.motorEncendido = false;
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}

	/**
	 * Método que arrancar el vehículo
	 */
	public void arrancar() {
		this.motorEncendido = true;
		this.marchaActual = 1;
		System.out.println("Motor arrancado y en 1ª marcha");
	}

	/**
	 * Método que para el vehículo
	 */
	public void parar() {
		this.motorEncendido = false;
		this.marchaActual = 0;
		this.velocidadActual = 0;
		System.out.println("Motor apagado y vehículo detenido");
	}

	/*
	 * Método abstracto de esta clase
	 */
	public abstract boolean requiereCarnet();

	/**
	 * Método que actualiza la marcha según la velocidad introducida por el usuario
	 */
	protected void actualizarMarcha() {
		if (velocidadActual <= 30) {
			marchaActual = 1;
		} else if (velocidadActual <= 50) {
			marchaActual = 2;
		} else if (velocidadActual <= 70) {
			marchaActual = 3;
		} else if (velocidadActual <= 100) {
			marchaActual = 4;
		} else {
			marchaActual = 5;
		}
	}

	/**
	 * Método que imprime por consola la información del vehículo
	 */
	public void mostrarEstado() {
		System.out.println("Velocidad: " + velocidadActual + " km/h | Marcha: " + marchaActual + " | Motor: "
				+ (motorEncendido ? "encendido" : "apagado"));
	}
}
