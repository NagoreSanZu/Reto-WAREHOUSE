package wareHouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	 static ArrayList <Articulo>articulos = new ArrayList<Articulo>();

	public void cargarAlmacen() throws FileNotFoundException {
		File file = new File("datos/da.txt");
		Scanner scan = new Scanner(file);
		String linea;
		String[] partes;
		int i = 0;

		while (scan.hasNextLine()) {
			linea = scan.nextLine();
			partes = linea.split(";");

			if (partes[1].equals("refresco")) {
				Refresco refresco = new Refresco(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]),Integer.parseInt(partes[5]), partes[6],Boolean.parseBoolean(partes[7]),Boolean.parseBoolean(partes[8]),Integer.parseInt(partes[9]));
				
			}
			
			if (partes[1].equals("vino")) {
				Vino vino = new Vino(partes[0], partes[1], partes[2], Integer.parseInt(partes[3]), Double.parseDouble(partes[4]),Integer.parseInt(partes[5]),partes[6],partes[7],Integer.parseInt(partes[8]),partes[9],Double.parseDouble(partes[10]));
			}
		}
		

	}
	
	public static Articulo articulo(String codigo) {
		for (Articulo articulo : articulos) {
			if(codigo.equals(articulo.getCode()))
				return articulo;
		}
		return null;
	}
	
}
