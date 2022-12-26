package wareHouse;

import java.util.ArrayList;

public class LineaFactura {
 
	private int numero;
	private ArrayList Articulo = new ArrayList();
	private int cantidad;

	
	//getters and setters
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList getArticulo() {
		return Articulo;
	}
	public void setArticulo(ArrayList articulo) {
		Articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
