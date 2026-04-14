package ejercicioInterfaces02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Creación de un array con 5 futbolistas
		Futbolista[] equipo = { 
				new Futbolista(10, "Messi", 36, 800), 
				new Futbolista(7, "Cristiano", 39, 850),
				new Futbolista(10, "Pelé", 82, 1281), 
				new Futbolista(1, "Casillas", 42, 0),
				new Futbolista(7, "Raúl", 46, 400) };

		// Se ordena el array
		Arrays.sort(equipo);

		// Se imprimen los futbolistas ordenados
		System.out.println("Lista de futbolistas ordenados:");
		for (Futbolista f : equipo) {
			System.out.println(f);
		}
	}

}
