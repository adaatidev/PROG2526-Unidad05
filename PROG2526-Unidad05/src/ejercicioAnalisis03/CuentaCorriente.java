package ejercicioAnalisis03;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria {
	private double porcentajeComision;
	private List<Transaccion> historial;

	public CuentaCorriente(String num, double saldo, Titular t, double comision) {
		super(num, saldo, t);
		this.porcentajeComision = comision;
		this.historial = new ArrayList<>();
	}

	public void realizarTransaccion(int d, int m, int a, String concepto, double importe) {
		double comision = Math.abs(importe) * (porcentajeComision / 100);
		this.saldo += (importe - comision);
		historial.add(new Transaccion(d, m, a, concepto, importe));
	}

	public int getNumeroTransacciones() {
		return historial.size();
	}
}
