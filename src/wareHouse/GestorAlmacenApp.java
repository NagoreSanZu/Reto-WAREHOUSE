package wareHouse;

import java.util.Scanner;

public class GestorAlmacenApp {

	public void run() {
		
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
				System.out.println("primera opcion seleccionada\n");
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
