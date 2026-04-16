package ejercicioComparator02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Socio> socios = new ArrayList<>();

		socios.add(new Socio("María Raquel Nkwar", 19));
		socios.add(new Socio("Qiaolin Rocío Ye", 18));
		socios.add(new Socio("Jade Belloso", 18));
		socios.add(new Socio("Fátima Román", 18));
		socios.add(new Socio("Christian García", 20));

		System.out.println("Socios sin ordenar: ");

		for (Socio s : socios) {
			System.out.println(s);
		}

		System.out.println("Socios ordenador por nombre: ");
		Collections.sort(socios, new ComparadorNombres());
		for (Socio s : socios) {
			System.out.println(s);
		}

		System.out.println("Socios ordenador por edad: ");
		Collections.sort(socios, new ComparadorEdad());
		for (Socio s : socios) {
			System.out.println(s);
		}

	}

}
