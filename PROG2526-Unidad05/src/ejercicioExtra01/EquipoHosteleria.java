package ejercicioExtra01;

public abstract class EquipoHosteleria {
	protected int id;
	protected String marca;
	protected String modelo;
	protected double precioBase;
	protected double consumoHora;
	protected int aniosGarantia;
	protected boolean usoIntensivo;
	protected double potencia;

	// Constructor con parámetros
	public EquipoHosteleria(int id, String marca, String modelo, double precioBase, double consumoHora,
			int aniosGarantia, boolean usoIntensivo, double potencia) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.consumoHora = consumoHora;
		this.aniosGarantia = aniosGarantia;
		this.usoIntensivo = usoIntensivo;
		this.potencia = potencia;
	}

	/**
	 * Función que calcula el precio final, se consigue sumando el precioBase con la
	 * potencia * 10, si tiene un uso intensivo sumar 15% al precio de recargo
	 * 
	 * @return precio final
	 */
	public double calcularPrecioFinal() {
		double precio = precioBase + (potencia * 10);
		if (usoIntensivo) {
			precio *= 1.15;
		}
		return precio;
	}

	public abstract double calcularCosteMantenimientoAnual();

	/**
	 * Función toString que devuelve una cadena con los datos
	 */
	@Override
	public String toString() {
		return "Marca: " + marca + ", modelo: " + modelo + ", ID: " + id;
	}

}
