
public class Auto implements ImpactoEcologico{
	private String marca;
	private String modelo;
	private double precio;
	private double kilometraje;
	private double gasolina;
	private final double factorDeEmision = 0.3;
	
	public Auto(String marca, String modelo, double precio, double kilometraje, double gasolina) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometraje = kilometraje;
		this.gasolina = gasolina;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	public double getGasolina() {
		return gasolina;
	}
	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public double datoActividad() {
		return getKilometraje()/getGasolina();
	}
	@Override
	public double obtenerlmpactoEcologico(){
		double impactoEcologico;
		impactoEcologico = datoActividad()*factorDeEmision;
		return impactoEcologico;
	}

	/*@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", kilometraje=" + kilometraje
				+ ", gasolina=" + gasolina + ", factorDeEmision=" + factorDeEmision + "]";
	}*/
	@Override
	public String toString() {
	    return 
	        "-----------------------------------------------------------\n" +
	        "Datos del Auto y su Impacto Ecologico:\n" +
	        "\n" +
	        "Marca: " + this.marca + "\n" +
	        "Modelo: " + this.modelo + "\n" +
	        "Precio: " + this.precio + "\n" +
	        "Kilometraje: " + this.kilometraje + "\n" +
	        "Gasolina: " + this.gasolina + "\n" +
	        "Factor de Emision: " + this.factorDeEmision + "\n";
	        /*"-----------------------------------------------------------\n";*/
	}


	
}
