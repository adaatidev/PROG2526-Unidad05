package ejercicioComparator01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			numeros.add((int) (Math.random() * 100) + 1);
		}

		Collections.sort(numeros, new Comparador());

		System.out.println(numeros.toString());

	}

}
