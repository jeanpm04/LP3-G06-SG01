
public class EmpleadoProduccion extends Asalariado {
	private String turno;

	public EmpleadoProduccion(String nombre, long dni,
			int diasVacaciones, String turno, double sueldoBase) {
		super(nombre, dni, diasVacaciones, sueldoBase);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String nuevo_turno) {
		this.turno = nuevo_turno;
	}
	
	public double calcularNomina() {
        return super.calcularNomina() * 1.15;
    }
	
	@Override
    public String toString() {
        return "Empleado de Produccion\n" +
               "Dni       : " + getDni() + "\n" +
               "Nombre    : " + getNombre() + "\n" +
               "Vacaciones: " + getDiasVacaciones() + " dias\t" +
               "Turno    : " + turno + "\n" +
               "Salario   : " + String.format("%.2f", calcularNomina());
    }
}
