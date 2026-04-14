package ejercicioExtra;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<EquipoHosteleria> inventario = new ArrayList<>();

		// Añadimos equipos variados
		inventario.add(new LavadoraIndustrial(01, "Samsung", "ProWash", 1200, 2.5, 3, true, 3000));
		inventario.add(new HornoIndustrial(01, "Rational", "iCombi", 5000, 5.0, 5, true, 8000));

		// Un equipo que no sea instalable (ejemplo rápido: una Plancha)
		inventario.add(new CoccionIndustrial(01, "Mainho", "Eco", 400, 1.2, 2, false, 1500) {
			@Override
			public double calcularCosteMantenimientoAnual() {
				return 50.0;
			}
		});

		double totalInstalacion = 0;

		System.out.println("--- LISTADO DE EQUIPOS ---");
		for (EquipoHosteleria e : inventario) {
			System.out.println("Equipo: " + e);
			System.out.println(" > Precio Final: " + e.calcularPrecioFinal() + "€");
			System.out.println(" > Mantenimiento Anual: " + e.calcularCosteMantenimientoAnual() + "€");

			// Verificamos si es Instalable usando polimorfismo e instanceof
			if (e instanceof Instalable) {
				Instalable inst = (Instalable) e;
				totalInstalacion += inst.calcularCosteInstalacion();

				if (inst.requiereTecnicoEspecializado()) {
					System.out.println(" [!] REQUIERE TÉCNICO ESPECIALIZADO");
				}
			}
			System.out.println("---------------------------");
		}

		System.out.println("SUMA TOTAL COSTES INSTALACIÓN: " + totalInstalacion + "€");
	}
}
