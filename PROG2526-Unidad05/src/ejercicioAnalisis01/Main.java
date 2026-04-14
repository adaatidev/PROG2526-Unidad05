package ejercicioAnalisis01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creación de los distintos tipos de vehículos
		Turismo miCoche = new Turismo("Seat", "Ibiza", "Blanco", "1234-ABC", 5, "Particular");
		Camion miCamion = new Camion("Volvo", "FH", "Azul", "5678-DEF", 18000, false);
		Motocicleta miMoto = new Motocicleta("Honda", "CB500", "Negro", "9012-GHI", 500);

		// Comprobación de requisitos de carnet
		System.out.println("--- REQUISITOS DE CARNET ---");
		System.out.println("Turismo: " + (miCoche.requiereCarnet() ? "Sí" : "No"));
		System.out.println("Camión: " + (miCamion.requiereCarnet() ? "Sí" : "No"));
		// Las motos >= 125 CC requieren carnet
		System.out.println("Motocicleta (500cc): " + (miMoto.requiereCarnet() ? "Sí" : "No"));
		System.out.println("----------------------------\n");

		// 3. Inicio de la Simulación
		// Pedimos datos al usuario por teclado
		System.out.print("¿A qué velocidad quieres circular (km/h)?: ");
		double vUsuario = sc.nextDouble();
		System.out.print("¿Cuántos segundos quieres mantener esa velocidad?: ");
		int tUsuario = sc.nextInt();

		// Ejecutamos la secuencia para el Turismo (podría hacerse con cualquier otro)
		ejecutarSimulacion(miCoche, vUsuario, tUsuario);

		sc.close();
	}

	/**
	 * Método que realiza la secuencia lógica solicitada en el boletín
	 */
	public static void ejecutarSimulacion(Vehiculo v, double velocidadObjetivo, int tiempo) {
		System.out.println(">>> INICIANDO SIMULACIÓN CON: " + v.marca + " " + v.modelo);

		// A. Reposo
		v.mostrarEstado();

		// B. Arrancar
		v.arrancar();
		v.mostrarEstado();

		// C. Acelerar y subir marchas
		System.out.println("Acelerando...");
		while (v.velocidadActual < velocidadObjetivo) {
			v.velocidadActual += 10; // Aceleración progresiva
			if (v.velocidadActual > velocidadObjetivo)
				v.velocidadActual = velocidadObjetivo;

			v.actualizarMarcha(); // Aplica los rangos del enunciado
			v.mostrarEstado();
		}

		// D. Mantener velocidad
		System.out.println("Manteniendo " + v.velocidadActual + " km/h durante " + tiempo + " segundos...");

		// E. Desacelerar y bajar marchas hasta parar
		System.out.println("Frenando...");
		while (v.velocidadActual > 0) {
			v.velocidadActual -= 10;
			if (v.velocidadActual < 0)
				v.velocidadActual = 0;

			v.actualizarMarcha();
			v.mostrarEstado();
		}

		// F. Punto muerto y parar motor
		v.parar();
		v.mostrarEstado();
		System.out.println(">>> SIMULACIÓN FINALIZADA.");
	}

}
