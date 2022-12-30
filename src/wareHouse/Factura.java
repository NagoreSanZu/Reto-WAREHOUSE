package wareHouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;



public class Factura {

	private int IVA =21;
	private int numero;
	private  String nombreEmpresa;
	private Date fecha =new Date();
	private String concepto;
	private ArrayList <LineaFactura> lineas = new ArrayList<>();
	
	//getter and setters
	
	public int getIVA() {
		return IVA;
	}
	public void setIVA(int iVA) {
		IVA = iVA;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	//añadir una linea a la factura
	public void addLinea(LineaFactura linea, Articulo articulo ){
		Scanner teclado = new Scanner(System.in);
		System.out.println("DATOS DE LINEAFACTURA");
		System.out.println("Indica el numero de la linea");
		int numeroFactLin= Integer.parseInt(teclado.nextLine());
		//parte del articulo
		System.out.println("Indica el numero del articulo");
		String articuloNum=teclado.nextLine();
		System.out.println("Indica el nombre del producto");
		String articuloNom=teclado.nextLine();
		System.out.println("Introduce la cantidad");
		System.out.println("Introduce la marca del producto");
		String articuloMarc=teclado.nextLine();
		System.out.println("Indica la capidad que tiene la botella");
		int articuloCap=Integer.parseInt(teclado.nextLine());
		System.out.println("Indica el precio del articulo");
		double articuloPrec=Double.parseDouble(teclado.nextLine());
		//
		System.out.println("Introduce la cantidad");
		int cantidadFacLin= Integer.parseInt(teclado.nextLine());
		linea.setNumero(numeroFactLin);
		linea.setArticulo(articuloNum,articuloNom,articuloMarc, articuloCap,articuloPrec);
	
		linea.setCantidad(cantidadFacLin);
		lineas.add(linea);
	}
		/*
	public double precioTotal() {
		double total=0;
		for (int i = 0; i < lineas.size(); i++) {
			total=total+lineas.get(i).precioTotal();
		}
		
		return total;
	}
*/
	//hacer un iterator para borrar linea

	public void elimLinea (int  linea) {
		Iterator<LineaFactura> iter = lineas.iterator();
		while(iter.hasNext()) {
			int numLinea=iter.next().getNumero();
			if(numLinea==linea) {
				iter.remove();
			}
		}
	}

	
	
	/*
	public void imprimir() {
		System.out.println("DATOS DE LA FACTURA");
		System.out.println("El numero de la linea es:  "+this.numero);
		System.out.println("El nombre de la empresa es: "+this.nombreEmpresa);
		System.out.println("La fecha es: "+this.fecha);
		System.out.println("El concepto es: "+this.concepto);
		System.out.println("-----------------------------------");
		
		for (LineaFactura lineaFactura : lineas) {
			System.out.println("DATOS DE LA LINEA");
			System.out.println(lineaFactura);
		}
	}
	
	*/



	
}
