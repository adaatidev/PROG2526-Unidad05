package ejercicio06_03;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	@Override
	public void hacerRuido() {
		System.out.println(getNombre() + ": miau");
	}

	
	
}
