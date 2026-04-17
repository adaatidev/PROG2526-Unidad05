package ejercicioExcepciones01;

public class Main {

	public static void main(String[] args)
			throws NegativeHourException, NegativeMinuteException, NegativeSecondException {

		Hora miHora = new Hora(23, 59, 58);
		System.out.println("Hora inicial: " + miHora);

		miHora.incrementarSegundo();
		System.out.println("Después de 1 segundo: " + miHora);

		miHora.incrementarSegundo();
		System.out.println("Después de otro segundo (Medianoche): " + miHora);

		Hora horaErronea = new Hora(25, 70, -99);
		System.out.println("Hora con valores inválidos (25:70:99): " + horaErronea);

		try {
			horaErronea.setHora(12);
		} catch (NegativeHourException e) {
			System.out.println(e.getMessage());
		}
		try {
			horaErronea.setMinutos(30);
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hora modificada manualmente: " + horaErronea);

	}

}
