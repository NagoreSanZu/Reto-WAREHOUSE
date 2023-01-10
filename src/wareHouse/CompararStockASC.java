package wareHouse;

import java.util.Comparator;

public class CompararStockASC implements Comparator <Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		return o1.getStock()-o2.getStock();
	}

	
}
