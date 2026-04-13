package ejercicio06_01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Socio socio1 = new Socio(1, "Rei", 19);
		Socio socio2 = new Socio(2, "Jaime", 19);
		Socio socio3 = new Socio(3, "Christian", 20);

		int resultado = socio1.compareTo(socio3);
		System.out.println(resultado);
		resultado = socio2.compareTo(socio1);
		System.out.println(resultado);
		resultado = socio3.compareTo(socio2);
		System.out.println(resultado);

		Socio arraySocios[] = new Socio[] { new Socio(1, "Rei", 19), new Socio(2, "Jaime", 19),
				new Socio(3, "Christian", 20) };
		Arrays.sort(arraySocios);
		System.out.println(Arrays.deepToString(arraySocios));
		// deepToString es para tablas de objetos

	}

}
