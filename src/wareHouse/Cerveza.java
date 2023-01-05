package wareHouse;

public class Cerveza extends Articulo implements Alcoholico{
	
	private String origen;
	private  String cereales;
	private double gradosAlcohol;
	
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	@Override
	public String toString() {
		return "Cerveza origen=" + origen + ", cereales=" + cereales + ", gradosAlcohol=" + gradosAlcohol;
	}
	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		if (gradosAlcohol > 7 ) {
			return true;

		}else {
			return false;

		}
	}
	@Override
	public double calcularTasa() {
		double tasaPorL, totalC=0;
		if (this.gradosAlcohol > 7 ) {
		tasaPorL=	TASA_BEBIDAS_FUERTES/100;
		totalC= getCapacidadBotella()*tasaPorL;

		}else if (this.gradosAlcohol < 7 ){
			tasaPorL=	TASA_BEBIDAS_SUAVES/100;
			totalC= getCapacidadBotella()*tasaPorL;

		}		return totalC;
	}
	
	
	
}
