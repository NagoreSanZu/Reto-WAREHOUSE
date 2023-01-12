package wareHouse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;




public class Factura {

	static double IVA =1.21;
	private int numero;
	private  String nombreEmpresa;
	private Date fecha =new Date();
	private String concepto;
	private ArrayList <LineaFactura> lineas = new ArrayList<>();

	
	//getter and setters
	
	public double getIVA() {
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
	
	//pedir datos de la factura
	
	public void pedirDatos() throws ParseException {
		Factura factura = new Factura();
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat formatoLectura1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("DATOS DE LA FACTURA");
		System.out.println("Cual es el numero de la factura?");
		int numeroFact=Integer.parseInt(teclado.nextLine());
		System.out.println("Cual es el nombre de la Empresa?");
		String nombreEmpresaFact=teclado.nextLine();
		System.out.println("Cual es la fecha?? ");
		String fechaFact= teclado.nextLine();
		Date fechaLeida = formatoLectura1.parse(fechaFact);
		System.out.println("Indica cual es el concepto:");
		String conceptoFact=teclado.nextLine();
		
		factura.setNumero(numeroFact);
		factura.setNombreEmpresa(nombreEmpresaFact);
		factura.setFecha(fechaLeida);
		factura.setConcepto(conceptoFact);
		
		
	}
	
	//añadir una linea a la factura
	
	//mejorar
	public void addLinea(LineaFactura linea){
	
		lineas.add(linea);
	}
	
	
	//añadir una linea de articulo
	
	
	
		
	public double precioTotal() {
	
		double total=0;
		for (int i = 0; i < lineas.size(); i++) {
			total=total+lineas.get(i).precioTotal()*IVA;
		}
		
		return total;
	}

	
	
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
	
	
	//guardar el fichero
	
	public void guardarFichero(String nombreFichero) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(nombreFichero);
		writer.println("numero factura: "+this.numero+", Nombre de la empresa: "+this.nombreEmpresa+", Fecha: "+this.fecha+", Concepto: "+this.concepto);
		for (LineaFactura lineaFactura : lineas) {
			writer.println(lineaFactura.toString());
		}
		
		
		
		
		
	
	writer.close();
	}
//	//nombre fichero
	
	public String nombreFichero() {
	
		
		return "facturas/"+this.numero+"_"+this.fecha+".txt";
		
	}
	



	
	}
