package wareHouse;

import java.text.ParseException;
import java.util.Scanner;

public class GestorAlmacenApp {

	public void run() throws ParseException {
		
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
					System.out.println(OPCION_HIRU + ". Guardar linea");
					System.out.println(OPCION_LAU + ". Mostrar factura");
					System.out.println(AGUR + ". Salir");
					System.out.println("Elije una de las opciones");
					opcion_factura = Integer.parseInt(scan.nextLine());

					switch (opcion_factura) {
					case OPCION_BAT:
						System.out.println("primera opcion seleccionada\n");
						break;
					case OPCION_BI:
						System.out.println("segunda opcion seleccionada\n");
						break;
					case OPCION_HIRU:
						System.out.println("tercera opcion seleccionada\n");
						break;
					case OPCION_LAU:
						System.out.println("tercera opcion seleccionada\n");
						break;
					case AGUR:
						System.out.println("ADIOS");
						break;
					default:
						System.out.println("Opcion incorrecta!");
					}

				} while (opcion_menu != SALIR);
				
				break;
				
				
				
				
				
			case OPCION_DOS:
				System.out.println("segunda opcion seleccionada\n");
				break;
			case OPCION_TRES:
				System.out.println("tercera opcion seleccionada\n");
				break;
			case OPCION_CUATRO:
				System.out.println("tercera opcion seleccionada\n");
				break;
			case OPCION_CINCO:
				System.out.println("tercera opcion seleccionada\n");
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
}
