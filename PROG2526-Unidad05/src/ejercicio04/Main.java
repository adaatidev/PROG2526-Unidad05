package ejercicio04;

public class Main {

	public static void main(String[] args) {

		// Lista de tipo Electrodomestico que puede contener hijos
		Electrodomestico[] lista = new Electrodomestico[5];

		lista[0] = new Lavadora(200, 50);
		lista[1] = new Television(500, "negro", 'A', 10, 50, true);
		lista[2] = new Electrodomestico(150, "rojo", 'B', 20);
		lista[3] = new Lavadora(300, "azul", 'C', 40, 35);
		lista[4] = new Television(250, 15);

		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisiones = 0;

		for (Electrodomestico e : lista) {
			double precio = e.precioFinal(); // Selección dinámica de métodos
			totalElectrodomesticos += precio;

			if (e instanceof Lavadora) { // Comprueba tipo
				totalLavadoras += precio;
			} else if (e instanceof Television) {
				totalTelevisiones += precio;
			}

			System.out.println("Precio final del artículo: " + precio + "€");
		}

		System.out.println("\n--- TOTALES ---");
		System.out.println("Suma Lavadoras: " + totalLavadoras + "€");
		System.out.println("Suma Televisiones: " + totalTelevisiones + "€");
		System.out.println("Suma Total Electrodomésticos: " + totalElectrodomesticos + "€");
	}

}
