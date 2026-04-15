package ejercicioAnalisis02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Ficha> biblioteca = new ArrayList<>();

		biblioteca.add(new Libro(101, "El Quijote", "Miguel de Cervantes", "Castalia"));

		biblioteca.add(new Revista(201, "National Geographic", 345, 2023));

		biblioteca.add(new Dvd(301, "Origen", "Christopher Nolan", 2010, Dvd.tipos.pelicula));

		System.out.println("--- ESTADO DE LA BIBLIOTECA ---");

		for (Ficha f : biblioteca) {
			System.out.println("------------------------------------");
			System.out.println(f.toString());
			System.out.println("Tiempo de préstamo permitido: " + f.diasPrestamo() + " días.");
		}

		System.out.println("\n--- PRUEBA DE MODIFICACIÓN ---");
		Dvd dvdMod = (Dvd) biblioteca.get(2);
		dvdMod.setTipo(Dvd.tipos.documental);
		System.out.println("Nuevo tipo de DVD: " + dvdMod.getTipo());
	}
}
