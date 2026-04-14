package ejercicioExtra;

public abstract class LavadoIndustrial extends EquipoHosteleria {

	// Constructor con sus parámetros heredados
	public LavadoIndustrial(int id, String marca, String modelo, double precioBase, double consumo, int garantia,
			boolean intensivo, double potencia) {
		super(id, marca, modelo, precioBase, consumo, garantia, intensivo, potencia);
	}

}
