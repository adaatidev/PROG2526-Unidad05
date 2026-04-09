package ejercicio06_03;

public class Main {

	public static void main(String[] args) {

		// Creación de objetos
		Perro perro = new Perro("Rex", "Pastor alemán", "marrón", 30.5);
		Gato gato = new Gato("Ulises", "Siamés", "Blanco", 4.5);

		// Llamado de funciones
		mostrarPerro(perro);
		mostrarGato(gato);
		demostrarPolimorfismoVivir(new Vivir[] { perro, gato });
		demostrarPolimorfismoAnimalDomestico(new AnimalDomestico[] { perro, gato });

	}

	/**
	 * Función que recibe el objeto perro e imprime toda su información
	 * 
	 * @param perro Objeto introducido
	 */
	private static void mostrarPerro(Perro perro) {
		System.out.println("===PERRO===");
		System.out.println(perro);
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		imprimirObediencia(perro.getNombre(), perro.hacerCaso());
		perro.vacunar();
		perro.sacaPaseo();
		System.out.println();
	}

	/**
	 * Función que recibe el objeto gato e imprime toda su información
	 * 
	 * @param gato Objeto introducido
	 */
	private static void mostrarGato(Gato gato) {
		System.out.println("===GATO===");
		System.out.println(gato);
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		imprimirObediencia(gato.getNombre(), gato.hacerCaso());
		gato.vacunar();
		gato.toserBolaPelo();
		System.out.println();
	}

	/**
	 * Función que imprime si el animal obedece o no
	 * 
	 * @param nombre  Nombre del animal
	 * @param obedece Boolean para saber si obedece o no
	 */
	private static void imprimirObediencia(String nombre, boolean obedece) {
		System.out.println(nombre + (obedece ? " hace caso." : " no hace caso."));
	}

	/**
	 * Función que demuestra el polimorfismo de Vivir que imprime los ruidos de los
	 * animales contenidos en el array
	 * 
	 * @param animales Array que contiene los animales
	 */
	private static void demostrarPolimorfismoVivir(Vivir[] animales) {
		System.out.println("----POLIMORFISMO Vivir[]----");
		for (Vivir animal : animales) {
			animal.hacerRuido();
		}
		System.out.println();
	}

	/**
	 * Función que demuestra el polimorfismo de AnimalDomestico que imprime la
	 * obediencia y si hace caso cada animal contenido en el array
	 * 
	 * @param animales Array que contiene los animales
	 */
	private static void demostrarPolimorfismoAnimalDomestico(AnimalDomestico[] animales) {
		System.out.println("----POLIMORFISMO AnimalDomestico[]----");
		for (AnimalDomestico animal : animales) {
			imprimirObediencia(animal.getNombre(), animal.hacerCaso());
		}
		System.out.println();
	}

}
