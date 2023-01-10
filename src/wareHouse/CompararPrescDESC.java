package wareHouse;

import java.util.Comparator;

public class CompararPrescDESC implements Comparator <Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
	if(o1.getPrecio() < o2.getPrecio()) return 1;
		
		return -1;			
	}
	
}
