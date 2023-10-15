
public class Bicicleta implements ImpactoEcologico {
	private double tiempoDeUso;
	private double tiempoDeVida;
	private final double factorDeEmision = 0.05;
	
	public Bicicleta(double tiempoDeUso, double estado, double tiempoDeVida) {
		this.tiempoDeUso = tiempoDeUso;
		this.tiempoDeVida = tiempoDeVida;
	}
	
	public double getTiempoDeUso() {
		return tiempoDeUso;
	}

	public void setTiempoDeUso(double tiempoDeUso) {
		this.tiempoDeUso = tiempoDeUso;
	}

	public double getTiempoDeVida() {
		return tiempoDeVida;
	}

	public void setTiempoDeVida(double tiempoDeVida) {
		this.tiempoDeVida = tiempoDeVida;
	}

	public double datoActividad() { 
		return getTiempoDeVida()-getTiempoDeUso();
	}
	@Override
	public double obtenerlmpactoEcologico(){
		double impactoEcologico;
		impactoEcologico = datoActividad()*factorDeEmision;
		return impactoEcologico;
	}

	/*@Override
	public String toString() {
		return "Bicicleta [tiempoDeUso=" + tiempoDeUso + ", tiempoDeVida=" + tiempoDeVida + ", factorDeEmision="
				+ factorDeEmision + "]";
	}*/
	
	@Override
	public String toString() {
	    return 
	        "-----------------------------------------------------------\n" +
	        "Datos de la Bicicleta y su Impacto Ecologico:\n" +
	        "\n" +
	        "Tiempo de Uso (Horas): " + this.tiempoDeUso + "\n" +
	        "Tiempo de Vida (Anios): " + this.tiempoDeVida + "\n" +
	        "Factor de Emision: " + this.factorDeEmision + "\n";
	        /*"-----------------------------------------------------------\n";*/
	}


}
