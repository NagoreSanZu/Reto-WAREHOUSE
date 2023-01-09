package wareHouse;

public class Cerveza extends Articulo implements Alcoholico {

	private String origen;
	private String cereales;
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
		return "Cerveza" + origen + ";" + cereales + ";" + gradosAlcohol;
	}

	@Override
	public boolean esFuerte() {
		// TODO Auto-generated method stub
		if (gradosAlcohol > 7) 
			return true;

		
		return false;

		
	}

	@Override
	public double calcularTasa() {
		double tasaPorL, totalC = 0;
		if (this.gradosAlcohol > 7) {
			tasaPorL = TASA_BEBIDAS_FUERTES / 100;
			totalC = getCapacidadBotella() * tasaPorL;

		} else if (this.gradosAlcohol < 7) {
			tasaPorL = TASA_BEBIDAS_SUAVES / 100;
			totalC = getCapacidadBotella() * tasaPorL;

		}
		return totalC;
	}

	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}
	
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

}
