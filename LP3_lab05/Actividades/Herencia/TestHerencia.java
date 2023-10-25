
public abstract class TestHerencia {

	public static void main(String[] args) {
		Asalariado emplead1 = new Asalariado("Manuel Cortina", 12345678, 28, 2000.0);
		EmpleadoProduccion emplead2 = new EmpleadoProduccion("Juan Mota", 55333222, 30,
		"Noche", 4000.0);
		EmpleadoDistribucion emplead3 = new EmpleadoDistribucion("Antonio Camino",
		55333666, 35, "Granada", 3500.0);
		
		/*
		System.out.println("El nombre del emplead1 es " + emplead1.getNombre());
		System.out.println("El nombre del emplead2 es " + emplead2.getNombre());
		System.out.println("El turno del emplead2 es " + emplead2.getTurno());
		System.out.println("El nombre del emplead3 es " + emplead3.getNombre());
		System.out.println("La region del emplead3 es " + emplead3.getRegion());
		
		
		// Nomina de los empleados
		System.out.printf("Nomina del empleado1: $%.2f%n", emplead1.calcularNomina());
        System.out.printf("Nomina del empleado2: $%.2f%n", emplead2.calcularNomina());
        System.out.printf("Nomina del empleado3: $%.2f%n", emplead3.calcularNomina());
        */
        System.out.println(emplead1);
        System.out.println("\n");
        System.out.println(emplead2);
        System.out.println("\n");
        System.out.println(emplead3);
	}
	
}
