package wareHouse;

import java.util.Scanner;

public class Vino extends Articulo implements Alcoholico {

	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
	
	public Vino() {
		
	}
	
	public Vino(String name, String code, String mark, int capacidadBotella, double preciom, int stock,
			String color, String origen,int anio,String tipoDeUva, double gradosAlcohol ) {
		super(name, code, mark, capacidadBotella, preciom, stock);
		this.color=color;
		this.origen=origen;
		this.anio=anio;
		this.tipoDeUva=tipoDeUva;
		this.gradosAlcohol=gradosAlcohol;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getTipoDeUva() {
		return tipoDeUva;
	}

	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	@Override
	public String toString() {
		return "Vino" + color + ";" + origen + ";" + anio + ";" + tipoDeUva
				+ ";" + gradosAlcohol;
	}

	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		if (this.gradosAlcohol > 13.5)
			return true;

		return false;

	}

	@Override
	public double calcularTasa() {

		double tasaPorL, totalV = 0;
		if (this.gradosAlcohol > 13.5) {
			tasaPorL = TASA_BEBIDAS_FUERTES / 100;
			totalV = getCapacidadBotella() * tasaPorL;

		} else if (this.gradosAlcohol < 13.5) {
			tasaPorL = TASA_BEBIDAS_SUAVES / 100;
			totalV = getCapacidadBotella() * tasaPorL;

		}
		return totalV;
	}
//	public void agregarVino() {
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("INCREMENTAR VINO");
//		System.out.println("De que color es el vino?");
//		String colorVino=teclado.nextLine();
//		System.out.println("De que origen es el vino?");
//		String origenVino=teclado.nextLine();
//		System.out.println("De que ali es el vino?");
//		int anoVino =Integer.parseInt(teclado.nextLine());
//		System.out.println("Que tipo de uva tiene?");
//		String tipoUva =teclado.nextLine();
//		System.out.println("Cuantos grados tine el alchol?");
//		double gradosVino =Double.parseDouble(teclado.nextLine());
//		this.color=colorVino;
//		this.origen=origenVino;
//		this.anio=anoVino;
//		this.tipoDeUva=tipoUva;
//		this.gradosAlcohol=gradosVino;
//	}

	@Override
	public boolean saludable() {
		boolean esSaludableV =false;
		if (this.origen.equals("Navarra")) 
			esSaludableV =true;
			
		return esSaludableV;
	}
}
