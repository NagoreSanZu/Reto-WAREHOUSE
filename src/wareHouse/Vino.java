package wareHouse;

public class Vino extends Articulo  implements Alcoholico{

	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
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
		return "Vino color=" + color + ", origen=" + origen + ", anio=" + anio + ", tipoDeUva=" + tipoDeUva
				+ ", gradosAlcohol=" + gradosAlcohol ;
	}
	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		if (this.gradosAlcohol > 13.5 ) {
			return true;

		}else {
			return false;

		}
		
	}
	@Override
	public double calcularTasa() {
		
		double tasaPorL, total;
		if (this.gradosAlcohol > 13.5 ) {
		tasaPorL=	TASA_BEBIDAS_FUERTES/100;
		total= getCapacidadBotella()*tasaPorL;

		}else if (this.gradosAlcohol < 13.5 ){
			tasaPorL=	TASA_BEBIDAS_SUAVES/100;
			total= getCapacidadBotella()*tasaPorL;

		}
		return 0;
	}
	
   
	
	
}
