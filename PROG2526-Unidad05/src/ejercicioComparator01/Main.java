package ejercicioComparator01;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();

		Integer[] numeros = new Integer[20];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(1, 101);
		}

		System.out.println("Original: " + Arrays.toString(numeros));
		Arrays.sort(numeros, new Comparador());
		System.out.println("Decreciente: " + Arrays.toString(numeros));
	}

}
