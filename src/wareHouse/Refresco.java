package wareHouse;

public class Refresco extends Articulo{

	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	
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
			System.out.println("Refresco sabor=" + sabor + ", zumo=" + zumo + ", gaseoso=" + gaseoso + ", cantidadAzucar="
					+ cantidadAzucar );
		
	}
	
	
	//es saludable?
	
	
	
			
		
	@Override
	public boolean saludable() {
		boolean esSaludableR =false;
		if (this.cantidadAzucar <= 20) 
			esSaludableR =true;
			
		return esSaludableR;
	}

	
	
}
