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
		return "Refresco sabor=" + sabor + ", zumo=" + zumo + ", gaseoso=" + gaseoso + ", cantidadAzucar="
				+ cantidadAzucar ;
	}
	
	//visualizar propiedades del refresco
	public void visualizarPropiedades() {
		for (Refresco Refres : refresco) {
			System.out.println(Refres);
		}
	}
	
	
	//es saludable?
	
	public void esSaludable() {
		boolean esSaludableR =false;
		for (Refresco Refres : refresco) {
			if (Refres.getCantidadAzucar() <= 20) {
				esSaludableR =true;
				System.out.println(Refres);
			}else {
				esSaludableR=false;
			}
			
		}
	}
	
}
