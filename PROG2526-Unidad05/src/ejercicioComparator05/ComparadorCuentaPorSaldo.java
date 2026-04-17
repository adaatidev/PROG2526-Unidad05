package ejercicioComparator05;

import java.util.Comparator;

public class ComparadorCuentaPorSaldo implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria c1, CuentaBancaria c2) {
		return compare(c1.getSaldo(), c2.getSaldo());

	}

}
