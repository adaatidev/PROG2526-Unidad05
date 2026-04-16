package ejercicioComparator03;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Futbolista> futbolistas = new ArrayList<>();

		futbolistas.add(new Futbolista(1, 2));
		futbolistas.add(new Futbolista(3, 4));
		futbolistas.add(new Futbolista(5, 6));
		futbolistas.add(new Futbolista(7, 8));
		futbolistas.add(new Futbolista(9, 0));

		System.out.println("Futbolistas sin ordenar: ");

		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		System.out.println("Futbolistas ordenador por edad: ");
		Collections.sort(futbolistas, new ComparadorEdad());
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		System.out.println("Futbolistas ordenador por goles: ");
		Collections.sort(futbolistas, new ComparadorGoles());
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

	}

}
