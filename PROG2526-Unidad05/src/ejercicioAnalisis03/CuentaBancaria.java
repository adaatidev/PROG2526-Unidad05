package ejercicioAnalisis03;

import java.util.ArrayList;

public abstract class CuentaBancaria {

	static final int MAX_TITULARES = 3;
	protected String numCuenta;
	protected double saldo;
	protected ArrayList<Titular> titulares;

	public CuentaBancaria(String numCuenta, double saldo, Titular titularInicial) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titulares = new ArrayList<>();
		this.titulares.add(titularInicial);
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0)
			this.saldo += cantidad;
	}

	public void retirar(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad)
			this.saldo -= cantidad;
	}

	public boolean añadirTitular(Titular t) {
		if (titulares.size() < MAX_TITULARES) {
			titulares.add(t);
			return true;
		}
		return false;
	}

	public boolean borrarTitular(Titular t) {
		if (titulares.size() > 1) {
			return titulares.remove(t);
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}
}
