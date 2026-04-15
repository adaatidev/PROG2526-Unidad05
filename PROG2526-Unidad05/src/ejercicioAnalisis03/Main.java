package ejercicioAnalisis03;

public class Main {
	public static void main(String[] args) {

		Titular juan = new Titular("12345678A", "Juan", "García", "600111222");
		Titular maria = new Titular("87654321B", "Maria", "López", "611333444");
		Titular pedro = new Titular("11223344C", "Pedro", "Ruiz", "622555666");
		Titular ana = new Titular("44332211D", "Ana", "Sanz", "633777888");

		System.out.println("--- PRUEBA CUENTA DE AHORRO ---");
		CuentaAhorro ahorro = new CuentaAhorro("ES12345", 1000.0, juan, 10.0, 0.05);

		ahorro.ingresar(500);
		ahorro.aplicarInteres();
		ahorro.cobrarMantenimiento();

		System.out.println("Saldo Ahorro tras intereses y comisión: " + ahorro.getSaldo() + "€");

		System.out.println("--- PRUEBA GESTIÓN TITULARES ---");
		ahorro.añadirTitular(maria);
		ahorro.añadirTitular(pedro);

		boolean añadido = ahorro.añadirTitular(ana);
		System.out.println("¿Se pudo añadir a Ana (4º titular)?: " + (añadido ? "Sí" : "No (Límite 3)"));

		ahorro.borrarTitular(juan);
		ahorro.borrarTitular(maria);
		boolean borradoUltimo = ahorro.borrarTitular(pedro);
		System.out.println("¿Se pudo borrar al último titular?: " + (borradoUltimo ? "Sí" : "No (Mínimo 1)"));

		System.out.println("--- PRUEBA CUENTA CORRIENTE ---");
		CuentaCorriente corriente = new CuentaCorriente("ES67890", 2000.0, maria, 1.0);

		corriente.realizarTransaccion(15, 4, 2026, "Pago Alquiler", -500.0);
		corriente.realizarTransaccion(16, 4, 2026, "Nómina Abril", 1200.0);
		corriente.realizarTransaccion(17, 4, 2026, "Recibo Luz", -60.0);

		System.out.println("Saldo Corriente tras transacciones: " + corriente.getSaldo() + "€");
		System.out.println("Número total de movimientos: " + corriente.getNumeroTransacciones());

		corriente.retirar(100);
		System.out.println("Saldo final tras retiro manual: " + corriente.getSaldo() + "€");
	}
}
