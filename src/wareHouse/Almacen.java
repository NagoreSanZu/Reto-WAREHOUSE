package wareHouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	 ArrayList <Articulo>articulos = new ArrayList<Articulo>();

	public void cargarDatos() throws FileNotFoundException {
		File file = new File("datos/da.txt");
		Scanner scan = new Scanner(file);
		String linea;
		String[] partes;
		int i = 0;

		while (scan.hasNextLine()) {
			linea = scan.nextLine();
			partes = linea.split(";");

			if (partes[1].equals("refresco")) {
				Refresco refresco = new Refresco(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]),Integer.parseInt(partes[5]), partes[6],partes[7].equals("si") ? true : false,partes[8].equals("si") ? true : false,Integer.parseInt(partes[9]));
				articulos.add(refresco);
			}
			
			if (partes[1].equals("vino")) {
				Vino vino = new Vino(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]),Integer.parseInt(partes[5]),partes[6],partes[7],Integer.parseInt(partes[8]),partes[9],Double.parseDouble(partes[10]));
				articulos.add(vino);
			}
			
			if (partes[1].equals("cerveza")) {
				Cerveza cerveza = new Cerveza(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]),Integer.parseInt(partes[5]),partes[6],partes[7],Double.parseDouble(partes[8]));
				articulos.add(cerveza);
			}
			
		}
		
		
		

	}
	
	//buscador
	
	public Articulo articulo(String codigo) {
		for (Articulo articulo : articulos) {
			if(codigo.equals(articulo.getCode()))
				return articulo;
		}
		return null;
	}
	
	
	//metodo el mas caro
	
	public Articulo elMasCaro() {
		Articulo arti = null;
		double precMax=0;
		for (Articulo articulo : articulos) {
			if (articulo.getPrecio()>precMax) {
				precMax=articulo.getPrecio();
				arti=articulo;
			}
		}
		return arti;
	}
	
	//hay Stock
	
	public boolean hayStock(String codigoProducto) {
	
		Articulo art= articulo(codigoProducto);
		
		if(art!=null && art.getStock() >0) {
			return true;
		}
		
		
		return false;
	}
	
	
	//stock justo
	
	public ArrayList <Articulo> stockJusto(){
		ArrayList <Articulo> articulosStockJusto = new ArrayList<Articulo>();
		for (Articulo articulo : articulos) {
			if (articulo.getStock()<=10) {
				articulosStockJusto.add(articulo);
			}
		}
		
		return articulosStockJusto;
	}
	
	
	//disponibilidad
	
	public boolean disponibilidad(int cantidad, String codigoProducto) {
		Articulo art= articulo(codigoProducto);
		if (art!=null&& art.getStock()>cantidad) {
			return true;
		}
		return false;
	}
	
	//equvalentes
	
	public ArrayList<Articulo> equivalentes(Articulo articulo){
		ArrayList<Articulo> articuloEqui = new ArrayList <Articulo>();
		for (Articulo articulo2 : articuloEqui) {
			if (articulo instanceof Refresco && articulo.getPrecio() >= 0.20 ||articulo.getPrecio() <= 0.20 ) {
				articuloEqui.add(articulo);
			}
			
			else if (articulo instanceof Cerveza && articulo.getPrecio() >= 0.20 ||articulo.getPrecio() <= 0.20 ) {
				articuloEqui.add(articulo);
			}
			else if (articulo instanceof Vino && articulo.getPrecio() >= 0.20 ||articulo.getPrecio() <= 0.20 ) {
				articuloEqui.add(articulo);
			}
		}
		return articuloEqui;
	}
	
	public ArrayList <Articulo> ordenarPrecio(String orden){
		
		if (orden.equals("ASC") ) {
			articulos.sort(new CompararPrecASC()  );
			
		}
		else if (orden.equals("DESC")) {
			articulos.sort(new CompararPrescDESC() );
		}
		return articulos;
	}
	
	
	public void ordenarPorStock(String orden) {
		if (orden.equals("ASC") ) {
			articulos.sort(new CompararStockASC()  );
			
		}
		else if (orden.equals("DESC")) {
			articulos.sort(new CompararStockDESC() );
		}
		System.out.println(articulos);
	}
	
}//fin
