package ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Electrodomestico> electrodomesticos = crearListaElectrodomesticos();

		double totalGeneral = 0;
		double totalLavadoras = 0;
		double totalTelevision = 0;

		System.out.println("=== PRECIOS FINALES ===");
		for (Electrodomestico e : electrodomesticos) {
			double precio = e.precioFinal();
			System.out.printf("%-20s -> %.2f €%n", e.getClass().getSimpleName(), precio);

			totalGeneral += precio;
			if (e instanceof Lavadora) {
				totalLavadoras += precio;
			} else if (e instanceof Television) {
				totalTelevision += precio;
			}
		}

		System.out.println("\n=== TOTALES ===");
		System.out.printf("Total electrodomésticos : %.2f €%n", totalGeneral);
		System.out.printf("Total lavadoras         : %.2f €%n", totalLavadoras);
		System.out.printf("Total televisiones      : %.2f €%n", totalTelevision);
	}

	/**
	 * Crea y devuelve la lista de electrodomésticos de prueba.
	 *
	 * <p>
	 * Incluye instancias de {@link Electrodomestico}, {@link Lavadora} y
	 * {@link Television} con distintas configuraciones para cubrir los casos de
	 * prueba del ejercicio.
	 * </p>
	 *
	 * @return lista con los electrodomésticos creados
	 */
	private static List<Electrodomestico> crearListaElectrodomesticos() {
		List<Electrodomestico> lista = new ArrayList<>();

		// Electrodomesticos base
		lista.add(new Electrodomestico(100, 10)); // defecto
		lista.add(new Electrodomestico(200, "rojo", 'A', 25)); // consumo A, 25 kg

		// Lavadoras
		lista.add(new Lavadora(150, 8)); // defecto
		lista.add(new Lavadora(35, 180, "negro", 'B', 60)); // carga 35 kg → +50€

		// Televisiones
		lista.add(new Television(300, 15)); // defecto
		lista.add(new Television(55, true, 250, "azul", 'C', 20)); // res 55" + TDT

		return lista;
	}
}
