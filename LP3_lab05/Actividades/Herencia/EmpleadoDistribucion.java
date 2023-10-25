
public class EmpleadoDistribucion extends Asalariado {
	private String region;

	public EmpleadoDistribucion(String nombre, long dni,
			int diasVacaciones, String region, double sueldoBase) {
		super(nombre, dni, diasVacaciones, sueldoBase);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String nueva_region) {
		this.region = nueva_region;
	}
	
	@Override
    public double calcularNomina() {
        return super.calcularNomina() * 1.10;
    }
	
	@Override
    public String toString() {
        return "Empleado de Produccion\n" +
               "Dni       : " + getDni() + "\n" +
               "Nombre    : " + getNombre() + "\n" +
               "Vacaciones: " + getDiasVacaciones() + " dias\t" +
               "Region    : " + region + "\n" +
               "Salario   : " + String.format("%.2f", calcularNomina());
    }
}
