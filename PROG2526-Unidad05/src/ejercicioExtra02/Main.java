package ejercicioExtra02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Colección heterogénea
		List<EmbarcacionPesquera> flota = new ArrayList<>();

		flota.add(new BarcoArrastrero("ARR-001", "Titán del Mar", 100, 5000, "Atlántico", 12, 15, 2000, 10));
		flota.add(new BarcoCerquero("CER-002", "Red Veloz", 50, 3000, "Mediterráneo", 8, 7, 40, 35));
		flota.add(new BarcoPalangrero("PAL-003", "Anzuelo de Oro", 30, 2000, "Cantábrico", 6, 10, 5000, 0.005));

		double capturaTotalFlota = 0;
		double maxEficiencia = -1;
		EmbarcacionPesquera barcoMasEficiente = null;

		// Variables para ver qué subtipo aporta más captura
		double capArrastreros = 0, capCerqueros = 0, capPalangreros = 0;

		for (EmbarcacionPesquera b : flota) {
			double capturaDiaria = b.calcularCapturaMaximaDiaria(); //
			capturaTotalFlota += capturaDiaria;

			// Mostrar ficha de cada uno
			b.mostrarFicha();

			// Sumar por tipos para el requisito 79
			if (b instanceof BarcoArrastrero)
				capArrastreros += capturaDiaria;
			else if (b instanceof BarcoCerquero)
				capCerqueros += capturaDiaria;
			else if (b instanceof BarcoPalangrero)
				capPalangreros += capturaDiaria;

			// Cálculo de eficiencia (Captura / Combustible)
			double eficiencia = capturaDiaria / b.getCombustibleDisponible();
			if (eficiencia > maxEficiencia) {
				maxEficiencia = eficiencia;
				barcoMasEficiente = b;
			}
			System.out.println("---------------------------------");
		}

		// Resultados finales
		System.out.println("CAPTURA TOTAL ESTIMADA DE LA FLOTA: " + capturaTotalFlota + " toneladas");

		System.out.print("SUBTIPO QUE MÁS APORTA: ");
		if (capArrastreros > capCerqueros && capArrastreros > capPalangreros)
			System.out.println("Arrastreros");
		else if (capCerqueros > capPalangreros)
			System.out.println("Cerqueros");
		else
			System.out.println("Palangreros");

		if (barcoMasEficiente != null) {
			System.out.println("EMBARCACIÓN MÁS EFICIENTE: " + barcoMasEficiente.getNombre());
		}
	}
}
