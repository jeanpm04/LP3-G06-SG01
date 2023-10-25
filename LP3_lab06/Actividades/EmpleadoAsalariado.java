
public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;

	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
		super(nombre, apellido, nss);
		// TODO Auto-generated constructor stub
		setSalarioSemanal(salario);
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double obtenerMontoPagado() {
		return getSalarioSemanal();
	}

	@Override
	 public String toString() {
	return super.toString() + "\nsalario semanal: $" + 
	salarioSemanal;
	 }

}
