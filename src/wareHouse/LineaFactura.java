package wareHouse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class LineaFactura  {
 
	private int numero;
	private int cantidad;
	private Articulo articulo;

	
	//getters and setters
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Articulo getArticulo() {
		return articulo;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public LineaFactura() {
		
	}
	
	public LineaFactura(int numero, Articulo articulo, int cantidad) {
		this.numero=numero;
		this.articulo=articulo;
		this.cantidad=cantidad;
	}
	@Override
	public String toString() {
		

		return "LineaFactura --> El numero de la linea es " + numero +  "; La cantidad es: " + cantidad ;
	}

	public double precioTotal() {
		
		return articulo.getPrecio() *cantidad;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	
	


	
	
}
