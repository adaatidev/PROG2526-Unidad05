package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Poligono> listaPoligonos = new ArrayList<>();
		int opcion = 0;

		do {
			System.out.println("MENÚ");
			System.out.println("1.	Introducir rectángulo");
			System.out.println("2.	Introducir triángulo");
			System.out.println("3.	Mostrar lista de polígonos");
			System.out.println("0.	Salir");
			opcion = sc.nextInt();

		} while (opcion != 0);

		sc.close();
	}

}
