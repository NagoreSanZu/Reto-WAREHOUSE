package wareHouse;

import java.util.Scanner;

public class Refresco extends Articulo{

	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	public Refresco() {
		
	}
	
	
	public Refresco(String name, String code, String mark, int capacidadBotella, double preciom, int stock,
			String sabor, boolean zumo, boolean gaseoso, int cantidadAzucar) {
		super(name, code, mark, capacidadBotella, preciom, stock);
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
		
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isZumo() {
		return zumo;
	}
	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}
	public boolean isGaseoso() {
		return gaseoso;
	}
	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}
	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	@Override
	public String toString() {
		return   sabor + ";" + zumo + ";"+ gaseoso+";" + gaseoso + ";"
				+ cantidadAzucar ;
	}
	
	//visualizar propiedades del refresco
	public void visualizarPropiedades() {
			System.out.println("Refresco" + sabor + ";" + zumo + ";" + gaseoso + ";"+ cantidadAzucar );
		
	}
	
	
	
//	public void agregarRefresco() {
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("INCREMENTAR REFRESCO");
//		System.out.println("Que sabor tiene");
//		String saborRefres=teclado.nextLine();
//		System.out.println("Es un zumo? si/no");
//		String zumRefres=teclado.nextLine();
//		boolean zumoRefresTF =false;
//		if(zumRefres=="si"||zumRefres=="Si") {
//			zumoRefresTF=true;
//		}
//		if (zumRefres=="no"||zumRefres=="No") {
//			zumoRefresTF=false;
//		}
//		System.out.println("Tiene gaseosa?si/no");
//		String gaseosaRefres=teclado.nextLine();
//		boolean gaseosaRefresTF=false;
//		if(gaseosaRefres=="si"||gaseosaRefres=="Si") {
//			gaseosaRefresTF=true;
//		}
//		if (gaseosaRefres=="no"||gaseosaRefres=="No") {
//			gaseosaRefresTF=false;
//		}
//		
//		System.out.println("Cuanta cantidad de azucar tiene?");
//		int cantidadRefresco=Integer.parseInt(teclado.nextLine());
//		
//		this.sabor=saborRefres;
//		this.zumo=zumoRefresTF;
//		this.gaseoso=gaseosaRefresTF;
//		this.cantidadAzucar=cantidadRefresco;
//	}
	

		
	@Override
	public boolean saludable() {
		boolean esSaludableR =false;
		if (this.cantidadAzucar <= 20) 
			esSaludableR =true;
			
		return esSaludableR;
	}

	
	
}
