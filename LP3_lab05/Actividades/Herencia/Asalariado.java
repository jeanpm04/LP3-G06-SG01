
public class Asalariado {
	private String nombre;
	private long dni;
	private int diasVacaciones;
	private double sueldoBase;
	
	public Asalariado(String nombre, long dni, int diasVacaciones, double sueldoBase) {
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nuevo_nombre) {
		this.nombre = nuevo_nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long nuevo_dni) {
		this.dni = nuevo_dni;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int nuevo_diasVacaciones) {
		this.diasVacaciones = nuevo_diasVacaciones;
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	
	public void setSueldoBase(double nuevo_sueldoBase) {
		this.sueldoBase = nuevo_sueldoBase;
	}
	 
	public double calcularNomina() {
		return sueldoBase;
	}
	
	@Override
    public String toString() {
        return "Empleado Asalariado\n" +
               "Dni      : " + dni + "\n" +
               "Nombre   : " + nombre + "\n" +
               "Vacaciones: " + diasVacaciones + " dias\n" +
               "Salario  : " + String.format("%.2f", sueldoBase);
    }
}
