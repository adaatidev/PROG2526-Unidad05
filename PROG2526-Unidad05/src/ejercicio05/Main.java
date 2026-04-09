package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Poligono> listaPoligonos = new ArrayList<>();
		int opcion = 0;

		do {
			System.out.println("MENÚ");
			System.out.println("1.	Introducir rectángulo");
			System.out.println("2.	Introducir triángulo");
			System.out.println("3.	Mostrar lista de polígonos");
			System.out.println("0.	Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				introducirRectangulo(listaPoligonos);
				break;
			case 2:
				introducirTriangulo(listaPoligonos);
				break;
			case 3:
				mostrarPoligonos(listaPoligonos);
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (opcion != 0);
		System.out.println("Has salido del programa");
	}

	/**
	 * Método para capturar datos y crear un Rectángulo
	 */
	public static void introducirRectangulo(ArrayList<Poligono> lista) {
		System.out.print("Introduce el lado 1: ");
		double l1 = sc.nextDouble();
		System.out.print("Introduce el lado 2: ");
		double l2 = sc.nextDouble();

		lista.add(new Rectangulo(l1, l2));
		System.out.println("Rectángulo añadido correctamente.");
	}

	/**
	 * Método para capturar datos y crear un Triángulo
	 */
	public static void introducirTriangulo(ArrayList<Poligono> lista) {
		System.out.print("Introduce el lado 1: ");
		double l1 = sc.nextDouble();
		System.out.print("Introduce el lado 2: ");
		double l2 = sc.nextDouble();
		System.out.print("Introduce el lado 3: ");
		double l3 = sc.nextDouble();

		lista.add(new Triangulo(l1, l2, l3));
		System.out.println("Triángulo añadido correctamente.");
	}

	/**
	 * Método para recorrer la lista y mostrar los datos
	 */
	public static void mostrarPoligonos(ArrayList<Poligono> lista) {
		if (lista.isEmpty()) {
			System.out.println("La lista está vacía.");
		} else {
			System.out.println("--- LISTADO DE POLÍGONOS ---");
			for (Poligono p : lista) {
				System.out.println(p.toString());
				System.out.printf("Área calculada: %.2f%n", p.area());
				System.out.println("----------------------------");
			}
		}
	}
}
