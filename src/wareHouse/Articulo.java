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
		
		//poner punto y coma
		
		return "Articulo code=" + code + ", name=" + name + ", mark=" + mark + ", capacidadBotella=" + capacidadBotella
				+ ", precio=" + precio + ", stock=" + stock ;
	}
	
	public void incrementarStock(int cantidad) {
	this.stock=this.stock+cantidad;
		
	}
	
	
	
	//neceista mejoras 

	public void disminuirStock(int cantidad) {
	Scanner teclado = new Scanner(System.in);
	
		if (cantidad>stock) {
			System.out.println("ERROR No queda stock");
			do {
				System.out.println("Intoduce una cantidad");
				cantidad=teclado.nextInt();

			}while(cantidad>stock);
				
		}
		
		this.stock= stock-cantidad;
		
		
		
	}	
	
	//visualizar
	public void visualizarArticulo() {
		
			System.out.println("Articulo code=" + code + ", name=" + name + ", mark=" + mark + ", capacidadBotella=" + capacidadBotella
					+ ", precio=" + precio + ", stock=" + stock );
		
	}
	
	//saludable
	
	public abstract boolean saludable();
	
	//precio total
	
	public void precioTotalArt() {
		double total=0;
			total=precio*stock;
			System.out.println("El precio total es "+total);
		
	}
	
	
}
