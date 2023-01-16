package wareHouse;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorAlmacenApp {
	

	public void run() throws ParseException, FileNotFoundException {
		Almacen almacen = new Almacen();
		almacen.cargarDatos();
		
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int OPCION_CUATRO = 4;
		final int OPCION_CINCO = 5;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Realizar venta");
			System.out.println(OPCION_DOS + ". Realizar compra");
			System.out.println(OPCION_TRES + ". Ver articulos saludables");
			System.out.println(OPCION_CUATRO + ". Ver el articulo mas caro");
			System.out.println(OPCION_CINCO + ". Ver los articulos con menos stock que x");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case OPCION_UNO:
				realizarVenta(SALIR, scan, opcion_menu);
				break;
			case OPCION_DOS:
				realizarCompra(almacen, scan);
				
				break;
			case OPCION_TRES:
				
				for (Articulo art : almacen.getArticulos()) {
			
					if(art.saludable()) {
					art.visualizarArticulo();
					}
					
					
				}
				break;
			case OPCION_CUATRO:
				Articulo ar=almacen.elMasCaro();
				System.out.println(ar);
				break;
			case OPCION_CINCO:
				Almacen artiAlma = new Almacen();
				Articulo arti = null;
				System.out.println("Introduce un numero de stock");
				int cantidadStock=Integer.parseInt(scan.nextLine());
				for (Articulo articulo : artiAlma.getArticulos() ) {
					if (articulo.getStock()<=cantidadStock) {
						arti.visualizarArticulo();
					}
				}
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();
	}

	public void realizarCompra(Almacen almacen, Scanner scan) {
		String comprarArticulo;
		Articulo articuloCompra = null;
		do {
			System.out.println("Indica el codigo del aritculo que quieres comprar?");
			comprarArticulo = scan.nextLine();
			articuloCompra= almacen.articulo(comprarArticulo);
		}while(articuloCompra == null);
		System.out.println("Indica la cantidad que quieras comprar");
		int cantidadCompArt= Integer.parseInt(scan.nextLine());
		
		articuloCompra.incrementarStock(cantidadCompArt);
	}

	public void realizarVenta(final int SALIR, Scanner scan, int opcion_menu)
			throws ParseException, FileNotFoundException {
		Factura pedirFactura = new Factura();
		pedirFactura.pedirDatos();
		
		final int OPCION_BAT = 1;
		final int OPCION_BI = 2;
		final int OPCION_HIRU = 3;
		final int OPCION_LAU = 4;
		final int AGUR = 0;

		
		int opcion_factura;

		do {
			System.out.println("------MENU-------");
			System.out.println(OPCION_BAT + ". Añadir una line a la factura");
			System.out.println(OPCION_BI + ". Eliminar linea");
			System.out.println(OPCION_HIRU + ". Guardar factura");
			System.out.println(OPCION_LAU + ". Mostrar factura");
			System.out.println(AGUR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_factura = Integer.parseInt(scan.nextLine());
			Scanner teclado = new Scanner(System.in);

			switch (opcion_factura) {
			case OPCION_BAT:
				LineaFactura linea = new LineaFactura();
				
				
				System.out.println("DATOS DE LINEAFACTURA");
				System.out.println("Indica el numero de la linea");
				int numeroFactLin= Integer.parseInt(teclado.nextLine());
				System.out.println("Introduce la cantidad");
				int cantidadFacLin= Integer.parseInt(teclado.nextLine());
				
				linea.setNumero(numeroFactLin);
				linea.setCantidad(cantidadFacLin);
				
				Articulo art1 = null;
				do {
					System.out.println("Indica el codigo del articulo");
					String codigo=teclado.nextLine();
					Almacen a = new Almacen();
					art1 = a.articulo(codigo);
				}while(art1==null);
				linea.setArticulo(art1);
				pedirFactura.addLinea(linea);
				break;
			case OPCION_BI:
				
				System.out.println("Escribe el numero de la linea que quieres borrar");
				int lineaBorra= Integer.parseInt(teclado.nextLine());
			
				pedirFactura.elimLinea(lineaBorra);
				break;
			case OPCION_HIRU:
				pedirFactura.guardarFichero(pedirFactura.nombreFichero());
				break;
			case OPCION_LAU:
				pedirFactura.imprimir();
				break;
			case AGUR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		
		for (LineaFactura linea : pedirFactura.getLineas()) {
			linea.getArticulo().disminuirStock(linea.getCantidad());
		}
		
	}//fin de realizar venta
}
