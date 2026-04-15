package ejercicioAnalisis03;

public class CuentaAhorro extends CuentaBancaria {
	private double cuotaMantenimiento;
	private double interesAnual;

	public CuentaAhorro(String numCuenta, double saldo, Titular titularInicial, double cuotaMantenimiento,
			double interesAnual) {
		super(numCuenta, saldo, titularInicial);
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	public void aplicarInteres() {
		this.saldo += (this.saldo * interesAnual);
	}

	public void cobrarMantenimiento() {
		this.saldo -= cuotaMantenimiento;
	}

}
