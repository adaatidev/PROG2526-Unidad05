package ejercicioComparator02;

import java.util.Comparator;

public class ComparadorNombres implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o2.getNombre().compareTo(o1.getNombre());
	}

}
