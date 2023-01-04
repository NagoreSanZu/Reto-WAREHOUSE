package wareHouse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


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
	
	public LineaFactura preguntarDatosArt(Articulo art) {
		Scanner teclado = new Scanner(System.in);
		//parte del articulo
		System.out.println("Indica el numero del articulo");
		String articuloNum=teclado.nextLine();
		System.out.println("Indica el nombre del producto");
		String articuloNom=teclado.nextLine();
		System.out.println("Introduce la cantidad");
		System.out.println("Introduce la marca del producto");
		String articuloMarc=teclado.nextLine();
		System.out.println("Indica la capidad que tiene la botella");
		int articuloCap=Integer.parseInt(teclado.nextLine());
		System.out.println("Indica el precio del articulo");
		double articuloPrec=Double.parseDouble(teclado.nextLine());
		//
		
		art.setName(articuloMarc);
		art.setCode(articuloMarc);
		art.setMark(articuloMarc);
		art.setCapacidadBotella(articuloCap);
		art.setPrecio(articuloPrec);
		art.setStock(articuloCap);
		articulo.add(art);
		return art;
	}
	
	
}
