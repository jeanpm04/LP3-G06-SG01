
public class Edificio implements ImpactoEcologico {
	private double usoDeCalefaccion;
	private double poderCalorifico;
	private final double factorDeEmision = 0.5;

	public Edificio(double usoDeCalefaccion, double poderCalorifico) {
		this.usoDeCalefaccion = usoDeCalefaccion;
		this.poderCalorifico = poderCalorifico;
	}

	public double getUsoDeCalefaccion() {
		return usoDeCalefaccion;
	}

	public void setUsoDeCalefaccion(double usoDeCalefaccion) {
		this.usoDeCalefaccion = usoDeCalefaccion;
	}

	public double getPoderCalorifico() {
		return poderCalorifico;
	}

	public void setPoderCalorifico(double poderCalorifico) {
		this.poderCalorifico = poderCalorifico;
	}

	public double datoActividad() { 
		return getUsoDeCalefaccion()*getPoderCalorifico();
	}
	@Override
	public double obtenerlmpactoEcologico(){
		double impactoEcologico;
		impactoEcologico = datoActividad()*factorDeEmision;
		return impactoEcologico;
	}

	/*@Override
	public String toString() {
		return "Edificio [usoDeCalefaccion=" + usoDeCalefaccion + ", poderCalorifico=" + poderCalorifico
				+ ", factorDeEmision=" + factorDeEmision + "]";
	}*/
	
	@Override
	public String toString() {
	    return 
	        "-----------------------------------------------------------\n" +
	        "Datos del Edificio y su Impacto Ecologico:\n" +
	        "\n" +
	        "Uso de Calefaccion: " + this.usoDeCalefaccion + "\n" +
	        "Poder Calorifico: " + this.poderCalorifico + "\n" +
	        "Factor de Emision: " + this.factorDeEmision + "\n";
	        /*"-----------------------------------------------------------\n";*/
	}



}
