package wareHouse;

import java.util.Comparator;

public class CompararStockDESC implements Comparator <Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		return o2.getStock()-o1.getStock();
		
	}

	
}
