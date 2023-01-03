package wareHouse;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class  Articulo  extends LineaFactura{
 
	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;
	ArrayList <Cerveza>cerveza=new ArrayList<Cerveza>();
	ArrayList <Vino> vino = new ArrayList <Vino>();
	ArrayList <Refresco>refresco =new ArrayList<Refresco>();
	
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public int getCapacidadBotella() {
		return capacidadBotella;
	}
	public void setCapacidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Articulo() {
		
	}
	
	public Articulo(String name, String code, String mark, int capacidadBotella, double preciom, int stock) {
		this.name=name;
		this.code=code;
		this.mark=mark;
		this.capacidadBotella=capacidadBotella;
		this.precio=precio;
		this.stock=stock;
	}
	@Override
	public String toString() {
		
		
		return "Articulo code=" + code + ", name=" + name + ", mark=" + mark + ", capacidadBotella=" + capacidadBotella
				+ ", precio=" + precio + ", stock=" + stock ;
	}
	
	public void incrementarStock(Vino bino, Cerveza cerv) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("De que articulo quieres incrementar el stock? ");
		System.out.println("1- Vino 2-Cerveza 3-Refresco");
		int numInc = Integer.parseInt(teclado.nextLine());
		
		if (numInc==1) {
			System.out.println("INCREMENTAR VINO");
			System.out.println("De que color es el vino?");
			String colorVino=teclado.nextLine();
			System.out.println("De que origen es el vino?");
			String origenVino=teclado.nextLine();
			System.out.println("De que ali es el vino?");
			int anoVino =Integer.parseInt(teclado.nextLine());
			System.out.println("Que tipo de uva tiene?");
			String tipoUva =teclado.nextLine();
			System.out.println("Cuantos grados tine el alchol?");
			double gradosVino =Double.parseDouble(teclado.nextLine());
			bino.setColor(colorVino);
			bino.setOrigen(origenVino);
			bino.setAnio(anoVino);
			bino.setTipoDeUva(tipoUva);
			bino.setGradosAlcohol(gradosVino);
			vino.add(bino);
			
			
			for (Articulo articulo2 : articulo) {
				if (this.name == "Vino"|| this.name=="vino") {
					stock = stock +1;
				}
		
			}
			
		if (numInc ==2) {
			System.out.println("INCREMENTAR CERVEZA");
			System.out.println("Cual es su origen");
			String origenCerveza=teclado.nextLine();
			System.out.println("Cual son sus cereales??");
			String cerealesCerveza=teclado.nextLine();
			System.out.println("Cuantos grados de alcohol?");
			double gradosAlcoholCerveza = Double.parseDouble(teclado.nextLine());
			cerv.setOrigen(origenCerveza);
			cerv.setCereales(cerealesCerveza);
			cerv.setGradosAlcohol(gradosAlcoholCerveza);
			cerveza.add(cerv);
			
			for (Articulo articulo2 : articulo) {
				if (this.name == "cerveza"|| this.name=="Cerveza") {
					stock = stock +1;
				}
			
		}
			
		
			
			
			
		}
	}
	
	
}
}
