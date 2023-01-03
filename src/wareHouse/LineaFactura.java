package wareHouse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class LineaFactura extends Factura {
 
	private int numero;
	 ArrayList <Articulo>articulo = new ArrayList<Articulo>();
	private int cantidad;

	
	//getters and setters
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList getArticulo() {
		return articulo;
	}
	public void setArticulo(String articuloNum, String articuloNom, String articuloMarc, int articuloCap, double articuloPrec) {
		articuloNum = articuloNum;
		articuloNom=articuloNom;
		articuloMarc=articuloMarc;
		articuloCap=articuloCap;
		articuloPrec=articuloPrec;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public LineaFactura() {
		
	}
	
	public LineaFactura(int numero, ArrayList<Articulo> articulo, int cantidad) {
		this.numero=numero;
		this.articulo=articulo;
		this.cantidad=cantidad;
	}
	@Override
	public String toString() {
		

		return "LineaFactura numero=" + numero +  ", cantidad=" + cantidad ;
	}

	public double precioTotal(ArrayList<Articulo> articulo, double articuloPrec) {
		
		return articuloPrec *cantidad;
	}
	
	public void imprimirArticulo() throws FileNotFoundException {
		Factura fichero = new Factura();
		PrintWriter writer = new PrintWriter(fichero.nombreFichero());
		for (Articulo articulo2 : articulo) {
			writer.println(articulo2.toString());
	
		}
		writer.close();
	}
	
	
}
