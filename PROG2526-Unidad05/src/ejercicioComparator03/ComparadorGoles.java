
package ejercicioComparator03;

import java.util.Comparator;

public class ComparadorGoles implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getEdad() - (o1.getEdad());
	}
}
