package wareHouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	 static ArrayList <Articulo>articulos = new ArrayList<Articulo>();

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
	
	public static Articulo articulo(String codigo) {
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
	
	
	
}
