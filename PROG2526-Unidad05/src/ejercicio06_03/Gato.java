package ejercicio06_03;

public class Gato extends AnimalDomestico {

	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;

	public Gato(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	@Override
	public void hacerRuido() {
		System.out.println(getNombre() + ": miau");
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

}
