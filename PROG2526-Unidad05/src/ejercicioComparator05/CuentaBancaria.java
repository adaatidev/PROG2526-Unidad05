package ejercicioComparator05;

public class CuentaBancaria implements Comparable<CuentaBancaria> {

	private String numeroCuenta;
	private double saldo;

	public CuentaBancaria(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(CuentaBancaria otraCuenta) {
		return this.numeroCuenta.compareTo(otraCuenta.numeroCuenta);
	}

	public static final Comparator<CuentaBancaria> POR_SALDO_DESC = Comparator.comparingDouble(CuentaBanacaria: :getSaldo);

}
