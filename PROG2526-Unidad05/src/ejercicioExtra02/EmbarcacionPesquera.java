package ejercicioExtra02;

public abstract class EmbarcacionPesquera {
	private String matricula;
	private String nombre;
	private double capacidadCarga;
	private double combustibleDisponible;
	private String zonaOperacion;
	private int numTripulantes;
	private int diasAutonomia;

	// Constructor con parámetros
	public EmbarcacionPesquera(String matricula, String nombre, double capacidadCarga, double combustible, String zona,
			int tripulantes, int autonomia) {
		setMatricula(matricula);
		setNombre(nombre);
		setCapacidadCarga(capacidadCarga);
		setCombustibleDisponible(combustible);
		this.zonaOperacion = zona;
		setNumTripulantes(tripulantes);
		this.diasAutonomia = autonomia;
	}

	// Getters y Setters con validaciones
	public void setCapacidadCarga(double capacidad) {
		if (capacidad > 0)
			this.capacidadCarga = capacidad;
		else
			throw new IllegalArgumentException("La capacidad debe ser positiva");
	}

	public void setCombustibleDisponible(double combustible) {
		if (combustible >= 0)
			this.combustibleDisponible = combustible;
	}

	public void setNumTripulantes(int tripulantes) {
		if (tripulantes > 0)
			this.numTripulantes = tripulantes;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public double getCombustibleDisponible() {
		return combustibleDisponible;
	}

	// Métodos requeridos
	public abstract double calcularCapturaMaximaDiaria();

	public double calcularConsumoEstimado() {
		// Ejemplo: consumo base por tripulante y autonomía
		return (numTripulantes * 1.5) + (capacidadCarga * 0.5);
	}

	public void mostrarFicha() {
		System.out.println("--- FICHA DE EMBARCACIÓN ---");
		System.out.println("Nombre: " + nombre + " [" + matricula + "]");
		System.out.println("Carga Máx: " + capacidadCarga + "t | Tripulantes: " + numTripulantes);
		System.out.println("Captura Diaria: " + calcularCapturaMaximaDiaria() + "t");
	}
}
