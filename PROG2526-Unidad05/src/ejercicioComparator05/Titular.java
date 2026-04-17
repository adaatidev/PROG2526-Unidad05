package ejercicioComparator05;

public class Titular implements Comparable<Titular> {

	private String dni;

	@Override
	public int compareTo(Titular otroTitular) {
		return this.dni.compareTo(otroTitular.dni);
	}

}
