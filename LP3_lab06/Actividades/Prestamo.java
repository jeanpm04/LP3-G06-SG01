
public class Prestamo implements PorPagar {
	private int numeroDeCuotas;
	private double montoDeCuota;
	
	public Prestamo(int numCuotas, double montoCuota) {
		setNumeroDeCuotas(numCuotas);
		setMontoDeCuota(montoCuota);
		//this.numeroDeCuotas = numCuotas;
		//this.montoDeCuota = montoCuota;
	}

	public int getNumeroDeCuotas() {
		return numeroDeCuotas;
	}
	public void setNumeroDeCuotas(int numeroDeCuotas) {
		this.numeroDeCuotas = numeroDeCuotas;
	}
	public double getMontoDeCuota() {
		return montoDeCuota;
	}
	public void setMontoDeCuota(double montoDeCuota) {
		this.montoDeCuota = montoDeCuota;
	}
	
	// metodo de la interfaz PorPagar
	@Override
	public double obtenerMontoPagado() {
		return getNumeroDeCuotas()*getMontoDeCuota();
	}
	
	@Override
	public String toString() {
		return "Prestamo:\n" + "numero de cuotas: " + 
				numeroDeCuotas + "\nmonto de cuota: " + montoDeCuota;
	}
	
}
