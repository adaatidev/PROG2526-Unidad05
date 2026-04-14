package ejercicioComparator01;

import java.util.Comparator;

public class Comparador implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.compareTo(n1);
	}

}
